package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxPlot extends CoordinateGridMixin[BoxPlot] {
  @JSName("boxPadding")
  var boxPadding_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("boxWidth")
  var boxWidth_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("outerPadding")
  var outerPadding_Original: IGetSet[Double, BoxPlot] = js.native
  @JSName("tickFormat")
  var tickFormat_Original: IGetSet[Accessor[Double, String], BoxPlot] = js.native
  def boxPadding(): Double = js.native
  def boxPadding(t: Double): BoxPlot = js.native
  def boxWidth(): Double = js.native
  def boxWidth(t: Double): BoxPlot = js.native
  def outerPadding(): Double = js.native
  def outerPadding(t: Double): BoxPlot = js.native
  def tickFormat(): Accessor[Double, String] = js.native
  def tickFormat(t: Accessor[Double, String]): BoxPlot = js.native
}

