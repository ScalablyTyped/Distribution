package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SunburstChart
  extends CapMixin[SunburstChart]
     with ColorMixin[SunburstChart]
     with BaseMixin[SunburstChart] {
  @JSName("cx")
  var cx_Original: IGetSet[Double, SunburstChart] = js.native
  @JSName("cy")
  var cy_Original: IGetSet[Double, SunburstChart] = js.native
  @JSName("emptyTitle")
  var emptyTitle_Original: IGetSet[String, SunburstChart] = js.native
  @JSName("externalLabels")
  var externalLabels_Original: IGetSet[Double, SunburstChart] = js.native
  @JSName("innerRadius")
  var innerRadius_Original: IGetSet[Double, SunburstChart] = js.native
  @JSName("minAngleForLabel")
  var minAngleForLabel_Original: IGetSet[Double, SunburstChart] = js.native
  @JSName("radius")
  var radius_Original: IGetSet[Double, SunburstChart] = js.native
  def cx(): Double = js.native
  def cx(t: Double): SunburstChart = js.native
  def cy(): Double = js.native
  def cy(t: Double): SunburstChart = js.native
  def emptyTitle(): String = js.native
  def emptyTitle(t: String): SunburstChart = js.native
  def externalLabels(): Double = js.native
  def externalLabels(t: Double): SunburstChart = js.native
  def innerRadius(): Double = js.native
  def innerRadius(t: Double): SunburstChart = js.native
  def minAngleForLabel(): Double = js.native
  def minAngleForLabel(t: Double): SunburstChart = js.native
  def radius(): Double = js.native
  def radius(t: Double): SunburstChart = js.native
}

