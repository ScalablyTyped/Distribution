package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatMap
  extends ColorMixin[HeatMap]
     with MarginMixin[HeatMap]
     with BaseMixin[HeatMap] {
  @JSName("boxOnClick")
  var boxOnClick_Original: IGetSet[js.Function1[/* d */ _, scala.Unit], HeatMap] = js.native
  @JSName("colsLabel")
  var colsLabel_Original: IGetSet[Accessor[_, java.lang.String], HeatMap] = js.native
  @JSName("cols")
  var cols_Original: IGetSet[js.Array[_], HeatMap] = js.native
  @JSName("rowsLabel")
  var rowsLabel_Original: IGetSet[Accessor[_, java.lang.String], HeatMap] = js.native
  @JSName("rows")
  var rows_Original: IGetSet[js.Array[_], HeatMap] = js.native
  @JSName("xAxisOnClick")
  var xAxisOnClick_Original: IGetSet[js.Function1[/* d */ _, scala.Unit], HeatMap] = js.native
  @JSName("yAxisOnClick")
  var yAxisOnClick_Original: IGetSet[js.Function1[/* d */ _, scala.Unit], HeatMap] = js.native
  def boxOnClick(): js.Function1[/* d */ js.Any, scala.Unit] = js.native
  def boxOnClick(t: js.Function1[/* d */ js.Any, scala.Unit]): HeatMap = js.native
  def cols(): js.Array[_] = js.native
  def cols(t: js.Array[_]): HeatMap = js.native
  def colsLabel(): Accessor[_, java.lang.String] = js.native
  def colsLabel(t: Accessor[_, java.lang.String]): HeatMap = js.native
  def rows(): js.Array[_] = js.native
  def rows(t: js.Array[_]): HeatMap = js.native
  def rowsLabel(): Accessor[_, java.lang.String] = js.native
  def rowsLabel(t: Accessor[_, java.lang.String]): HeatMap = js.native
  def xAxisOnClick(): js.Function1[/* d */ js.Any, scala.Unit] = js.native
  def xAxisOnClick(t: js.Function1[/* d */ js.Any, scala.Unit]): HeatMap = js.native
  def yAxisOnClick(): js.Function1[/* d */ js.Any, scala.Unit] = js.native
  def yAxisOnClick(t: js.Function1[/* d */ js.Any, scala.Unit]): HeatMap = js.native
}

