package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieChart
  extends CapMixin[PieChart]
     with ColorMixin[PieChart]
     with BaseMixin[PieChart] {
  @JSName("cx")
  var cx_Original: IGetSet[Double, PieChart] = js.native
  @JSName("cy")
  var cy_Original: IGetSet[Double, PieChart] = js.native
  @JSName("innerRadius")
  var innerRadius_Original: IGetSet[Double, PieChart] = js.native
  @JSName("minAngleForLabel")
  var minAngleForLabel_Original: IGetSet[Double, PieChart] = js.native
  @JSName("radius")
  var radius_Original: IGetSet[Double, PieChart] = js.native
  @JSName("slicesCap")
  var slicesCap_Original: IGetSet[Double, PieChart] = js.native
  def cx(): Double = js.native
  def cx(t: Double): PieChart = js.native
  def cy(): Double = js.native
  def cy(t: Double): PieChart = js.native
  def innerRadius(): Double = js.native
  def innerRadius(t: Double): PieChart = js.native
  def minAngleForLabel(): Double = js.native
  def minAngleForLabel(t: Double): PieChart = js.native
  def radius(): Double = js.native
  def radius(t: Double): PieChart = js.native
  def slicesCap(): Double = js.native
  def slicesCap(t: Double): PieChart = js.native
}

