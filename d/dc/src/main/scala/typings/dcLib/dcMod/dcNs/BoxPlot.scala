package typings
package dcLib.dcMod.dcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxPlot extends CoordinateGridMixin[BoxPlot] {
  @JSName("boxPadding")
  var boxPadding_Original: IGetSet[scala.Double, BoxPlot] = js.native
  @JSName("boxWidth")
  var boxWidth_Original: IGetSet[scala.Double, BoxPlot] = js.native
  @JSName("outerPadding")
  var outerPadding_Original: IGetSet[scala.Double, BoxPlot] = js.native
  @JSName("tickFormat")
  var tickFormat_Original: IGetSet[Accessor[scala.Double, java.lang.String], BoxPlot] = js.native
  def boxPadding(): scala.Double = js.native
  def boxPadding(t: scala.Double): BoxPlot = js.native
  def boxWidth(): scala.Double = js.native
  def boxWidth(t: scala.Double): BoxPlot = js.native
  def outerPadding(): scala.Double = js.native
  def outerPadding(t: scala.Double): BoxPlot = js.native
  def tickFormat(): Accessor[scala.Double, java.lang.String] = js.native
  def tickFormat(t: Accessor[scala.Double, java.lang.String]): BoxPlot = js.native
}

