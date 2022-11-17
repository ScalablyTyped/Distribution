package typings.chartJs.distChunksHelpersDotcoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CanvasRenderingContext2D
import typings.std.Event
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart4[TType /* <: ChartType */, TData, TLabel] extends StObject {
  
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
  
  def getDatasetMeta(datasetIndex: Double): ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]] = js.native
  
  def getElementsAtEventForMode(e: Event, mode: String, options: InteractionOptions, useFinalPosition: Boolean): js.Array[InteractionItem] = js.native
  
  def getSortedVisibleDatasetMetas(): js.Array[
    ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]
  ] = js.native
  
  def getVisibleDatasetCount(): Double = js.native
  
  val height: Double = js.native
  
  def hide(datasetIndex: Double): Unit = js.native
  def hide(datasetIndex: Double, dataIndex: Double): Unit = js.native
  
  val id: String = js.native
  
  def isDatasetVisible(datasetIndex: Double): Boolean = js.native
  
  def isPluginEnabled(pluginId: String): Boolean = js.native
  
  def isPointInArea(point: Point1): Boolean = js.native
  
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
  
  val scales: StringDictionary[Scale2[CoreScaleOptions]] = js.native
  
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
  @scala.annotation.targetName("updateHoverStyle_dataset")
  def updateHoverStyle(items: js.Array[InteractionItem], mode: "dataset", enabled: Boolean): Unit = js.native
  
  val width: Double = js.native
}
