package typings.atCarbonLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@carbon/layout", JSImport.Namespace)
@js.native
object atCarbonLayoutMod extends js.Object {
  val baseFontSize: Double = js.native
  val miniUnit: Double = js.native
  val spacing: js.Array[Double] = js.native
  def breakpoint(args: js.Any*): String = js.native
  def breakpointDown(name: String): String = js.native
  def breakpointUp(name: String): String = js.native
  def em(px: Double): String = js.native
  def miniUnits(count: Double): String = js.native
  def px(value: Double): String = js.native
  def rem(px: Double): String = js.native
  @js.native
  object breakpoints extends js.Object {
    var lg: Anon_Columns = js.native
    var max: Anon_Columns = js.native
    var md: Anon_Columns = js.native
    var sm: Anon_Columns = js.native
    var xlg: Anon_Columns = js.native
  }
  
}

