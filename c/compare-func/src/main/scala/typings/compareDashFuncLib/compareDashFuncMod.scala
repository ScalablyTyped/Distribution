package typings
package compareDashFuncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compare-func", JSImport.Namespace)
@js.native
object compareDashFuncMod extends js.Object {
  def apply[T](): js.Function2[/* e1 */ T, /* e2 */ T, scala.Double] = js.native
  def apply[T](
    prop: (js.Array[java.lang.String | compareDashFuncLib.extractFunc[T]]) | java.lang.String | compareDashFuncLib.extractFunc[T]
  ): js.Function2[/* e1 */ T, /* e2 */ T, scala.Double] = js.native
}

