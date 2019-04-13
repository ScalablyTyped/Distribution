package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChart
  extends CoordinateGridMixin[BarChart]
     with StackMixin[BarChart] {
  @JSName("alwaysUseRounding")
  var alwaysUseRounding_Original: IGetSet[scala.Boolean, BarChart] = js.native
  @JSName("barPadding")
  var barPadding_Original: IGetSet[scala.Double, BarChart] = js.native
  @JSName("centerBar")
  var centerBar_Original: IGetSet[scala.Boolean, BarChart] = js.native
  @JSName("gap")
  var gap_Original: IGetSet[scala.Double, BarChart] = js.native
  @JSName("outerPadding")
  var outerPadding_Original: IGetSet[scala.Double, BarChart] = js.native
  def alwaysUseRounding(): scala.Boolean = js.native
  def alwaysUseRounding(t: scala.Boolean): BarChart = js.native
  def barPadding(): scala.Double = js.native
  def barPadding(t: scala.Double): BarChart = js.native
  def centerBar(): scala.Boolean = js.native
  def centerBar(t: scala.Boolean): BarChart = js.native
  def gap(): scala.Double = js.native
  def gap(t: scala.Double): BarChart = js.native
  def outerPadding(): scala.Double = js.native
  def outerPadding(t: scala.Double): BarChart = js.native
}

