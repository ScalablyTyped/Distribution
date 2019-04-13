package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineChart
  extends CoordinateGridMixin[LineChart]
     with StackMixin[LineChart] {
  @JSName("dashStyle")
  var dashStyle_Original: IGetSet[js.Array[scala.Double], LineChart] = js.native
  @JSName("defined")
  var defined_Original: IGetSet[Accessor[_, scala.Boolean], LineChart] = js.native
  @JSName("dotRadius")
  var dotRadius_Original: IGetSet[scala.Double, LineChart] = js.native
  @JSName("interpolate")
  var interpolate_Original: IGetSet[java.lang.String, LineChart] = js.native
  @JSName("renderArea")
  var renderArea_Original: IGetSet[scala.Boolean, LineChart] = js.native
  @JSName("renderDataPoints")
  var renderDataPoints_Original: IGetSet[RenderDataPointOptions | _, LineChart] = js.native
  @JSName("tension")
  var tension_Original: IGetSet[scala.Double, LineChart] = js.native
  def dashStyle(): js.Array[scala.Double] = js.native
  def dashStyle(t: js.Array[scala.Double]): LineChart = js.native
  def defined(): Accessor[_, scala.Boolean] = js.native
  def defined(t: Accessor[_, scala.Boolean]): LineChart = js.native
  def dotRadius(): scala.Double = js.native
  def dotRadius(t: scala.Double): LineChart = js.native
  def interpolate(): java.lang.String = js.native
  def interpolate(t: java.lang.String): LineChart = js.native
  def renderArea(): scala.Boolean = js.native
  def renderArea(t: scala.Boolean): LineChart = js.native
  def renderDataPoints(): RenderDataPointOptions | js.Any = js.native
  def renderDataPoints(t: RenderDataPointOptions): LineChart = js.native
  def renderDataPoints(t: js.Any): LineChart = js.native
  def tension(): scala.Double = js.native
  def tension(t: scala.Double): LineChart = js.native
}

