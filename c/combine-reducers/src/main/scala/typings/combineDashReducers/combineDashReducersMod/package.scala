package typings.combineDashReducers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object combineDashReducersMod {
  type Reducer[S, A /* <: Action[_] */] = js.Function2[/* state */ js.UndefOr[S], /* action */ A, S]
  type ReducersMapObject[S, A /* <: Action[_] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof S ]: combine-reducers.combine-reducers.Reducer<S[K], A>}
    */ typings.combineDashReducers.combineDashReducersStrings.ReducersMapObject with S
}
