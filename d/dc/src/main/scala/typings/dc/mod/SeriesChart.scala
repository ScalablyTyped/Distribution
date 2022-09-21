package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesChart
  extends StObject
     with ICompositeChart[SeriesChart] {
  
  def chart(): js.Function1[/* c */ Any, BaseMixin[Any]] = js.native
  def chart(t: js.Function1[/* c */ Any, BaseMixin[Any]]): SeriesChart = js.native
  @JSName("chart")
  var chart_Original: IGetSet[js.Function1[/* c */ Any, BaseMixin[Any]], SeriesChart] = js.native
  
  def seriesAccessor(): Accessor[Any, Any] = js.native
  def seriesAccessor(t: Accessor[Any, Any]): SeriesChart = js.native
  @JSName("seriesAccessor")
  var seriesAccessor_Original: IGetSet[Accessor[Any, Any], SeriesChart] = js.native
  
  def seriesSort(): js.Function2[/* a */ Any, /* b */ Any, Double] = js.native
  def seriesSort(t: js.Function2[/* a */ Any, /* b */ Any, Double]): SeriesChart = js.native
  @JSName("seriesSort")
  var seriesSort_Original: IGetSet[js.Function2[/* a */ Any, /* b */ Any, Double], SeriesChart] = js.native
  
  def valueSort(): js.Function2[/* a */ Any, /* b */ Any, Double] = js.native
  def valueSort(t: js.Function2[/* a */ Any, /* b */ Any, Double]): SeriesChart = js.native
  @JSName("valueSort")
  var valueSort_Original: IGetSet[js.Function2[/* a */ Any, /* b */ Any, Double], SeriesChart] = js.native
}
