package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.basicMod.AnyObject
import typings.chartJs.chartJsStrings.dataset
import typings.chartJs.elementMod.Element
import typings.chartJs.geometricMod.ChartArea
import typings.chartJs.geometricMod.Point
import typings.chartJs.layoutMod.LayoutItem
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", "Chart")
@js.native
open class Chart[TType /* <: ChartType */, TData, TLabel] protected () extends StObject {
  def this(item: ChartItem, config: ChartConfiguration[TType, TData, TLabel]) = this()
  def this(item: ChartItem, config: ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel]) = this()
  
  val aspectRatio: Double = js.native
  
  val attached: Boolean = js.native
  
  def bindEvents(): Unit = js.native
  
  val boxes: js.Array[LayoutItem] = js.native
  
  def buildOrUpdateControllers(): Unit = js.native
  
  def buildOrUpdateScales(): Unit = js.native
  
  val canvas: HTMLCanvasElement = js.native
  
  val chartArea: ChartArea = js.native
  
  def clear(): this.type = js.native
  
  val config: (ChartConfiguration[TType, TData, TLabel]) | (ChartConfigurationCustomTypesPerDataset[TType, TData, TLabel]) = js.native
  
  val ctx: CanvasRenderingContext2D = js.native
  
  val currentDevicePixelRatio: Double = js.native
  
  // Only available if tooltip plugin is registered and enabled
  var data: ChartData[TType, TData, TLabel] = js.native
  
  def destroy(): Unit = js.native
  
  def draw(): Unit = js.native
  
  def ensureScalesHaveIDs(): Unit = js.native
  
  def getActiveElements(): js.Array[ActiveElement] = js.native
  
  def getDataVisibility(index: Double): Boolean = js.native
  
  def getDatasetMeta(datasetIndex: Double): ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType] = js.native
  
  def getElementsAtEventForMode(e: Event, mode: String, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = js.native
  
  def getSortedVisibleDatasetMetas(): js.Array[
    ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  ] = js.native
  
  def getVisibleDatasetCount(): Double = js.native
  
  val height: Double = js.native
  
  def hide(datasetIndex: Double): Unit = js.native
  def hide(datasetIndex: Double, dataIndex: Double): Unit = js.native
  
  val id: String = js.native
  
  def isDatasetVisible(datasetIndex: Double): Boolean = js.native
  
  def isPointInArea(point: Point): Boolean = js.native
  
  val legend: js.UndefOr[LegendElement[TType]] = js.native
  
  def notifyPlugins(hook: String): Boolean | Unit = js.native
  def notifyPlugins(hook: String, args: AnyObject): Boolean | Unit = js.native
  
  var options: ChartOptions[TType] = js.native
  
  val platform: BasePlatform = js.native
  
  def render(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resize(): Unit = js.native
  def resize(width: Double): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def resize(width: Unit, height: Double): Unit = js.native
  
  val scales: StringDictionary[Scale[CoreScaleOptions]] = js.native
  
  def setActiveElements(active: js.Array[ActiveDataPoint]): Unit = js.native
  
  def setDatasetVisibility(datasetIndex: Double, visible: Boolean): Unit = js.native
  
  def show(datasetIndex: Double): Unit = js.native
  def show(datasetIndex: Double, dataIndex: Double): Unit = js.native
  
  def stop(): this.type = js.native
  
  def toBase64Image(): String = js.native
  def toBase64Image(`type`: String): String = js.native
  def toBase64Image(`type`: String, quality: Any): String = js.native
  def toBase64Image(`type`: Unit, quality: Any): String = js.native
  
  def toggleDataVisibility(index: Double): Unit = js.native
  
  // Only available if legend plugin is registered and enabled
  val tooltip: js.UndefOr[TooltipModel[TType]] = js.native
  
  def unbindEvents(): Unit = js.native
  
  def update(): Unit = js.native
  def update(mode: UpdateMode): Unit = js.native
  
  @JSName("updateHoverStyle")
  def updateHoverStyle_dataset(items: js.Array[InteractionItem], mode: dataset, enabled: Boolean): Unit = js.native
  
  val width: Double = js.native
}
/* static members */
object Chart {
  
  @JSImport("chart.js", "Chart")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chart.js", "Chart.defaults")
  @js.native
  val defaults: Defaults_ = js.native
  
  inline def getChart(key: String): js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]]]
  inline def getChart(key: CanvasRenderingContext2D): js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]]]
  inline def getChart(key: HTMLCanvasElement): js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChart")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Chart[ChartType, DefaultDataPoint[ChartType], Any]]]
  
  @JSImport("chart.js", "Chart.instances")
  @js.native
  val instances: StringDictionary[Chart[ChartType, DefaultDataPoint[ChartType], Any]] = js.native
  
  @JSImport("chart.js", "Chart.overrides")
  @js.native
  val overrides: Overrides = js.native
  
  inline def register(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("chart.js", "Chart.registry")
  @js.native
  val registry: Registry_ = js.native
  
  inline def unregister(items: ChartComponentLike*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(items.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("chart.js", "Chart.version")
  @js.native
  val version: String = js.native
}
