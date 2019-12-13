package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMap
  extends ColorMixin[HeatMap]
     with MarginMixin[HeatMap]
     with BaseMixin[HeatMap] {
  @JSName("boxOnClick")
  var boxOnClick_Original: IGetSet[js.Function1[/* d */ _, Unit], HeatMap] = js.native
  @JSName("colOrdering")
  var colOrdering_Original: IGetSet[Accessor[_, String], HeatMap] = js.native
  @JSName("colsLabel")
  var colsLabel_Original: IGetSet[Accessor[_, String], HeatMap] = js.native
  @JSName("cols")
  var cols_Original: IGetSet[js.Array[String | Double], HeatMap] = js.native
  @JSName("rowOrdering")
  var rowOrdering_Original: IGetSet[Accessor[_, String], HeatMap] = js.native
  @JSName("rowsLabel")
  var rowsLabel_Original: IGetSet[Accessor[_, String], HeatMap] = js.native
  @JSName("rows")
  var rows_Original: IGetSet[js.Array[String | Double], HeatMap] = js.native
  @JSName("xAxisOnClick")
  var xAxisOnClick_Original: IGetSet[js.Function1[/* d */ _, Unit], HeatMap] = js.native
  @JSName("xBorderRadius")
  var xBorderRadius_Original: IGetSet[Double, HeatMap] = js.native
  @JSName("yAxisOnClick")
  var yAxisOnClick_Original: IGetSet[js.Function1[/* d */ _, Unit], HeatMap] = js.native
  @JSName("yBorderRadius")
  var yBorderRadius_Original: IGetSet[Double, HeatMap] = js.native
  def boxOnClick(): js.Function1[/* d */ js.Any, Unit] = js.native
  def boxOnClick(t: js.Function1[/* d */ js.Any, Unit]): HeatMap = js.native
  def colOrdering(): Accessor[_, String] = js.native
  def colOrdering(t: Accessor[_, String]): HeatMap = js.native
  def cols(): js.Array[String | Double] = js.native
  def cols(t: js.Array[String | Double]): HeatMap = js.native
  def colsLabel(): Accessor[_, String] = js.native
  def colsLabel(t: Accessor[_, String]): HeatMap = js.native
  def rowOrdering(): Accessor[_, String] = js.native
  def rowOrdering(t: Accessor[_, String]): HeatMap = js.native
  def rows(): js.Array[String | Double] = js.native
  def rows(t: js.Array[String | Double]): HeatMap = js.native
  def rowsLabel(): Accessor[_, String] = js.native
  def rowsLabel(t: Accessor[_, String]): HeatMap = js.native
  def xAxisOnClick(): js.Function1[/* d */ js.Any, Unit] = js.native
  def xAxisOnClick(t: js.Function1[/* d */ js.Any, Unit]): HeatMap = js.native
  def xBorderRadius(): Double = js.native
  def xBorderRadius(t: Double): HeatMap = js.native
  def yAxisOnClick(): js.Function1[/* d */ js.Any, Unit] = js.native
  def yAxisOnClick(t: js.Function1[/* d */ js.Any, Unit]): HeatMap = js.native
  def yBorderRadius(): Double = js.native
  def yBorderRadius(t: Double): HeatMap = js.native
}

