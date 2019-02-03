package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "Base")
@js.native
class Base () extends js.Object {
  def this(options: ChartOptions) = this()
  def copyDimension(another: Base): this.type = js.native
  def dimension(): js.Tuple2[scala.Double, scala.Double] = js.native
  def dimension(dimensions: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  def height(): scala.Double = js.native
  def height(value: scala.Double): this.type = js.native
  def margin(): ChartMargin = js.native
  def margin(margins: ChartMargin): this.type = js.native
  def offset(): js.Tuple2[scala.Double, scala.Double] = js.native
  def offset(offset: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  def pixelRatio(): scala.Double = js.native
  def pixelRatio(value: scala.Double): this.type = js.native
  def updateDimensionNow(): this.type = js.native
  def width(): scala.Double = js.native
  def width(value: scala.Double): this.type = js.native
}

/* static members */
@JSImport("d3kit", "Base")
@js.native
object Base extends js.Object {
  def getDefaultOptions(): d3kitLib.d3kitMod.ChartOptions = js.native
  def getDefaultOptions(options: d3kitLib.d3kitMod.ChartOptions): d3kitLib.d3kitMod.ChartOptions = js.native
}

