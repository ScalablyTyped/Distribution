package typings.d3DashSelectionDashMulti

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object d3DashSelectionDashMultiMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.d3DashSelection.d3DashSelectionMod.BaseType
  import typings.d3DashSelection.d3DashSelectionMod.ValueFn

  type ValueMap[T /* <: BaseType */, Datum] = StringDictionary[
    Double | String | Boolean | Null | (ValueFn[T, Datum, Double | String | Boolean | Null])
  ]
}
