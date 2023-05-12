package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.chartJsStrings.x
import typings.chartJs.chartJsStrings.y
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesGeometricMod.Point
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineElement[T /* <: LineProps */, O /* <: LineOptions */]
  extends default[T, O]
     with VisualElement {
  
  def first(): Point | `false` = js.native
  
  def interpolate(point: Point, property: x | y): js.UndefOr[Point | js.Array[Point]] = js.native
  
  def last(): Point | `false` = js.native
  
  def path(ctx: CanvasRenderingContext2D): Boolean = js.native
  
  def pathSegment(ctx: CanvasRenderingContext2D, segment: Segment, params: AnyObject): js.UndefOr[Boolean] = js.native
  
  var points: js.Array[Point] = js.native
  
  val segments: js.Array[Segment] = js.native
  
  def updateControlPoints(chartArea: ChartArea): Unit = js.native
  def updateControlPoints(chartArea: ChartArea, indexAxis: x | y): Unit = js.native
}
/* Inlined chart.js.chart.js/dist/types/index.ChartComponent & {  prototype :chart.js.chart.js/dist/types/index.LineElement<chart.js.chart.js/dist/types/index.LineProps, chart.js.chart.js/dist/types/index.LineOptions>, new (cfg : chart.js.chart.js/dist/types/basic.AnyObject): chart.js.chart.js/dist/types/index.LineElement<chart.js.chart.js/dist/types/index.LineProps, chart.js.chart.js/dist/types/index.LineOptions>} */
object LineElement {
  
  @JSImport("chart.js/dist/types/index", "LineElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js/dist/types/index", "LineElement.afterRegister")
  @js.native
  def afterRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.afterUnregister")
  @js.native
  def afterUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def afterUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("afterUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.beforeRegister")
  @js.native
  def beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeRegister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.beforeUnregister")
  @js.native
  def beforeUnregister: js.UndefOr[js.Function0[Unit]] = js.native
  inline def beforeUnregister_=(x: js.UndefOr[js.Function0[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beforeUnregister")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.defaultRoutes")
  @js.native
  def defaultRoutes: js.UndefOr[StringDictionary[String]] = js.native
  inline def defaultRoutes_=(x: js.UndefOr[StringDictionary[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultRoutes")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.defaults")
  @js.native
  def defaults: js.UndefOr[AnyObject] = js.native
  inline def defaults_=(x: js.UndefOr[AnyObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("chart.js/dist/types/index", "LineElement.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
}
