package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxPlot extends CoordinateGridMixin[BoxPlot] {
  @JSName("boldOutliers")
  var boldOutliers_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("boxPadding")
  var boxPadding_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("boxWidth")
  var boxWidth_Original: IGetSet[Double | js.Function, BoxPlot] = js.native
  @JSName("dataOpacity")
  var dataOpacity_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("dataWidthPortion")
  var dataWidthPortion_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("outerPadding")
  var outerPadding_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("renderDataPoints")
  var renderDataPoints_Original: IGetSet[Boolean, BoxPlot] = js.native
  @JSName("showOutliers")
  var showOutliers_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("tickFormat")
  var tickFormat_Original: IGetSet[Accessor[Double, String], BoxPlot] = js.native
  @JSName("yRangePadding")
  var yRangePadding_Original: IGetSet[Double | js.Function, BoxPlot] = js.native
  def boldOutliers(): Double = js.native
  def boldOutliers(t: Double): BoxPlot = js.native
  def boxPadding(): Double = js.native
  def boxPadding(t: Double): BoxPlot = js.native
  def boxWidth(): Double | js.Function = js.native
  def boxWidth(t: js.Function): BoxPlot = js.native
  def boxWidth(t: Double): BoxPlot = js.native
  def dataOpacity(): Double = js.native
  def dataOpacity(t: Double): BoxPlot = js.native
  def dataWidthPortion(): Double = js.native
  def dataWidthPortion(t: Double): BoxPlot = js.native
  def outerPadding(): Double = js.native
  def outerPadding(t: Double): BoxPlot = js.native
  def renderDataPoints(): Boolean = js.native
  def renderDataPoints(t: Boolean): BoxPlot = js.native
  def showOutliers(): Double = js.native
  def showOutliers(t: Double): BoxPlot = js.native
  def tickFormat(): Accessor[Double, String] = js.native
  def tickFormat(t: Accessor[Double, String]): BoxPlot = js.native
  def yRangePadding(): Double | js.Function = js.native
  def yRangePadding(t: js.Function): BoxPlot = js.native
  def yRangePadding(t: Double): BoxPlot = js.native
}

