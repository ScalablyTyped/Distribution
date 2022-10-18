package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import typings.chartJs.typesGeometricMod.ChartArea
import typings.chartJs.typesGeometricMod.Point
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineElement[T /* <: LineProps */, O /* <: LineOptions */]
  extends StObject
     with Element[T, O]
     with VisualElement {
  
  def first(): Point | `false` = js.native
  
  def interpolate(point: Point, property: typings.chartJs.chartJsStrings.x | typings.chartJs.chartJsStrings.y): js.UndefOr[Point | js.Array[Point]] = js.native
  
  def last(): Point | `false` = js.native
  
  def path(ctx: CanvasRenderingContext2D): Boolean = js.native
  
  def pathSegment(ctx: CanvasRenderingContext2D, segment: Segment, params: AnyObject): js.UndefOr[Boolean] = js.native
  
  var points: js.Array[Point] = js.native
  
  val segments: js.Array[Segment] = js.native
  
  def updateControlPoints(chartArea: ChartArea): Unit = js.native
  def updateControlPoints(
    chartArea: ChartArea,
    indexAxis: typings.chartJs.chartJsStrings.x | typings.chartJs.chartJsStrings.y
  ): Unit = js.native
}
/* Inlined chart.js.chart.js.ChartComponent & {  prototype :chart.js.chart.js.LineElement<chart.js.chart.js.LineProps, chart.js.chart.js.LineOptions>, new (cfg : chart.js.chart.js/types/basic.AnyObject): chart.js.chart.js.LineElement<chart.js.chart.js.LineProps, chart.js.chart.js.LineOptions>} */
object LineElement {
  
  @JSImport("chart.js", "LineElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "LineElement.afterRegister")
  @js.native
  def afterRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.afterUnregister")
  @js.native
  def afterUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.beforeRegister")
  @js.native
  def beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.beforeUnregister")
  @js.native
  def beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.defaultRoutes")
  @js.native
  def defaultRoutes: js.UndefOr[StringDictionary[String]] = js.native
  inline def defaultRoutes_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.defaults")
  @js.native
  def defaults: js.UndefOr[AnyObject] = js.native
  inline def defaults_=(x: js.UndefOr[AnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js", "LineElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
