package typings.combineDashReducers.combineDashReducersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("combine-reducers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  @JSName("default")
  def default_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
}

