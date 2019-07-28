package typings.d3kit.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3kit", "Base")
@js.native
class Base () extends js.Object {
  def this(options: ChartOptions) = this()
  def copyDimension(another: Base): this.type = js.native
  def dimension(): js.Tuple2[Double, Double] = js.native
  def dimension(dimensions: js.Tuple2[Double, Double]): this.type = js.native
  def height(): Double = js.native
  def height(value: Double): this.type = js.native
  def margin(): ChartMargin = js.native
  def margin(margins: ChartMargin): this.type = js.native
  def offset(): js.Tuple2[Double, Double] = js.native
  def offset(offset: js.Tuple2[Double, Double]): this.type = js.native
  def pixelRatio(): Double = js.native
  def pixelRatio(value: Double): this.type = js.native
  def updateDimensionNow(): this.type = js.native
  def width(): Double = js.native
  def width(value: Double): this.type = js.native
}

/* static members */
@JSImport("d3kit", "Base")
@js.native
object Base extends js.Object {
  def getDefaultOptions(): ChartOptions = js.native
  def getDefaultOptions(options: ChartOptions): ChartOptions = js.native
}

