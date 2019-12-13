package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChart
  extends CoordinateGridMixin[LineChart]
     with StackMixin[LineChart] {
  @JSName("dashStyle")
  var dashStyle_Original: IGetSet[js.Array[Double], LineChart] = js.native
  @JSName("defined")
  var defined_Original: IGetSet[Accessor[_, Boolean], LineChart] = js.native
  @JSName("dotRadius")
  var dotRadius_Original: IGetSet[Double, LineChart] = js.native
  @JSName("interpolate")
  var interpolate_Original: IGetSet[String, LineChart] = js.native
  @JSName("renderArea")
  var renderArea_Original: IGetSet[Boolean, LineChart] = js.native
  @JSName("renderDataPoints")
  var renderDataPoints_Original: IGetSet[RenderDataPointOptions, LineChart] = js.native
  @JSName("tension")
  var tension_Original: IGetSet[Double, LineChart] = js.native
  @JSName("xyTipsOn")
  var xyTipsOn_Original: IGetSet[Boolean, LineChart] = js.native
  def dashStyle(): js.Array[Double] = js.native
  def dashStyle(t: js.Array[Double]): LineChart = js.native
  def defined(): Accessor[_, Boolean] = js.native
  def defined(t: Accessor[_, Boolean]): LineChart = js.native
  def dotRadius(): Double = js.native
  def dotRadius(t: Double): LineChart = js.native
  def interpolate(): String = js.native
  def interpolate(t: String): LineChart = js.native
  def renderArea(): Boolean = js.native
  def renderArea(t: Boolean): LineChart = js.native
  def renderDataPoints(): RenderDataPointOptions = js.native
  def renderDataPoints(t: RenderDataPointOptions): LineChart = js.native
  def tension(): Double = js.native
  def tension(t: Double): LineChart = js.native
  def xyTipsOn(): Boolean = js.native
  def xyTipsOn(t: Boolean): LineChart = js.native
}

