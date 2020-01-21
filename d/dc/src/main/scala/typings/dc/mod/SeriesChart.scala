package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesChart extends ICompositeChart[SeriesChart] {
  @JSName("chart")
  var chart_Original: IGetSet[js.Function1[/* c */ _, BaseMixin[_]], SeriesChart] = js.native
  @JSName("seriesAccessor")
  var seriesAccessor_Original: IGetSet[Accessor[_, _], SeriesChart] = js.native
  @JSName("seriesSort")
  var seriesSort_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, Double], SeriesChart] = js.native
  @JSName("valueSort")
  var valueSort_Original: IGetSet[js.Function2[/* a */ _, /* b */ _, Double], SeriesChart] = js.native
  def chart(): js.Function1[/* c */ js.Any, BaseMixin[_]] = js.native
  def chart(t: js.Function1[/* c */ js.Any, BaseMixin[_]]): SeriesChart = js.native
  def seriesAccessor(): Accessor[_, _] = js.native
  def seriesAccessor(t: Accessor[_, _]): SeriesChart = js.native
  def seriesSort(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def seriesSort(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): SeriesChart = js.native
  def valueSort(): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def valueSort(t: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): SeriesChart = js.native
}

