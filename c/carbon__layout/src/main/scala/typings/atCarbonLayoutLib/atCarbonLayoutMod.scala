package typings
package atCarbonLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@carbon/layout", JSImport.Namespace)
@js.native
object atCarbonLayoutMod extends js.Object {
  val baseFontSize: scala.Double = js.native
  val miniUnit: scala.Double = js.native
  val spacing: js.Array[scala.Double] = js.native
  def breakpoint(args: js.Any*): java.lang.String = js.native
  def breakpointDown(name: java.lang.String): java.lang.String = js.native
  def breakpointUp(name: java.lang.String): java.lang.String = js.native
  def em(px: scala.Double): java.lang.String = js.native
  def miniUnits(count: scala.Double): java.lang.String = js.native
  def px(value: scala.Double): java.lang.String = js.native
  def rem(px: scala.Double): java.lang.String = js.native
  @js.native
  object breakpoints extends js.Object {
    var lg: atCarbonLayoutLib.Anon_Columns = js.native
    var max: atCarbonLayoutLib.Anon_Columns = js.native
    var md: atCarbonLayoutLib.Anon_Columns = js.native
    var sm: atCarbonLayoutLib.Anon_Columns = js.native
    var xlg: atCarbonLayoutLib.Anon_Columns = js.native
  }
  
}

