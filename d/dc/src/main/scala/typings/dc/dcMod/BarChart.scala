package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarChart
  extends CoordinateGridMixin[BarChart]
     with StackMixin[BarChart] {
  @JSName("alwaysUseRounding")
  var alwaysUseRounding_Original: IGetSet[Boolean, BarChart] = js.native
  @JSName("barPadding")
  var barPadding_Original: IGetSet[Double, BarChart] = js.native
  @JSName("centerBar")
  var centerBar_Original: IGetSet[Boolean, BarChart] = js.native
  @JSName("gap")
  var gap_Original: IGetSet[Double, BarChart] = js.native
  @JSName("outerPadding")
  var outerPadding_Original: IGetSet[Double, BarChart] = js.native
  def alwaysUseRounding(): Boolean = js.native
  def alwaysUseRounding(t: Boolean): BarChart = js.native
  def barPadding(): Double = js.native
  def barPadding(t: Double): BarChart = js.native
  def centerBar(): Boolean = js.native
  def centerBar(t: Boolean): BarChart = js.native
  def gap(): Double = js.native
  def gap(t: Double): BarChart = js.native
  def outerPadding(): Double = js.native
  def outerPadding(t: Double): BarChart = js.native
}

