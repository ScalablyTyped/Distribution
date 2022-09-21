package typings.chartJs.mod

import typings.chartJs.anon.Label
import typings.chartJs.anon.Max
import typings.chartJs.basicMod.AnyObject
import typings.chartJs.elementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", "DatasetController")
@js.native
open class DatasetController[TType /* <: ChartType */, TElement /* <: Element[AnyObject, AnyObject] */, TDatasetElement /* <: Element[AnyObject, AnyObject] */, TParsedData] protected () extends StObject {
  def this(chart: Chart[ChartType, DefaultDataPoint[ChartType], Any], datasetIndex: Double) = this()
  
  val _cachedMeta: ChartMeta[TElement, TDatasetElement, TType] = js.native
  
  def addElements(): Unit = js.native
  
  /* protected */ def applyStack(scale: Scale[CoreScaleOptions], parsed: js.Array[Any]): Double = js.native
  
  def buildOrUpdateElements(): Unit = js.native
  def buildOrUpdateElements(resetNewElements: Boolean): Unit = js.native
  
  val chart: Chart[ChartType, DefaultDataPoint[ChartType], Any] = js.native
  
  def configure(): Unit = js.native
  
  def draw(): Unit = js.native
  
  var enableOptionSharing: Boolean = js.native
  
  def getAllParsedValues(scale: Scale[CoreScaleOptions]): js.Array[Double] = js.native
  
  def getDataset(): ChartDataset[ChartType, DefaultDataPoint[ChartType]] = js.native
  
  /* protected */ def getLabelAndValue(index: Double): Label = js.native
  
  /* protected */ def getMaxOverflow(): Boolean | Double = js.native
  
  def getMeta(): ChartMeta[TElement, TDatasetElement, TType] = js.native
  
  /* protected */ def getMinMax(scale: Scale[CoreScaleOptions]): Max = js.native
  /* protected */ def getMinMax(scale: Scale[CoreScaleOptions], canStack: Boolean): Max = js.native
  
  /* protected */ def getParsed(index: Double): TParsedData = js.native
  
  def getScaleForId(scaleID: String): js.UndefOr[Scale[CoreScaleOptions]] = js.native
  
  /**
    * Utility for checking if the options are shared and should be animated separately.
    * @protected
    */
  /* protected */ def getSharedOptions(options: AnyObject): js.UndefOr[AnyObject] = js.native
  
  def getStyle(index: Double, active: Boolean): AnyObject = js.native
  
  /**
    * Utility for determining if `options` should be included in the updated properties
    * @protected
    */
  /* protected */ def includeOptions(mode: UpdateMode, sharedOptions: AnyObject): Boolean = js.native
  
  val index: Double = js.native
  
  def initialize(): Unit = js.native
  
  def linkScales(): Unit = js.native
  
  def parse(start: Double, count: Double): Unit = js.native
  
  /* protected */ def parseArrayData(
    meta: ChartMeta[TElement, TDatasetElement, TType],
    data: js.Array[AnyObject],
    start: Double,
    count: Double
  ): js.Array[AnyObject] = js.native
  
  /* protected */ def parseObjectData(
    meta: ChartMeta[TElement, TDatasetElement, TType],
    data: js.Array[AnyObject],
    start: Double,
    count: Double
  ): js.Array[AnyObject] = js.native
  
  /* protected */ def parsePrimitiveData(
    meta: ChartMeta[TElement, TDatasetElement, TType],
    data: js.Array[AnyObject],
    start: Double,
    count: Double
  ): js.Array[AnyObject] = js.native
  
  def removeHoverStyle(element: TElement, datasetIndex: Double, index: Double): Unit = js.native
  
  def reset(): Unit = js.native
  
  /* protected */ def resolveDataElementOptions(index: Double, mode: UpdateMode): AnyObject = js.native
  
  /* protected */ def resolveDatasetElementOptions(mode: UpdateMode): AnyObject = js.native
  
  def setHoverStyle(element: TElement, datasetIndex: Double, index: Double): Unit = js.native
  
  // If true, the controller supports the decimation
  // plugin. Defaults to `false` for all controllers
  // except the LineController
  var supportsDecimation: Boolean = js.native
  
  def update(mode: UpdateMode): Unit = js.native
  
  /**
    * Utility for updating an element with new properties, using animations when appropriate.
    * @protected
    */
  /* protected */ def updateElement(element: TDatasetElement | TElement, index: Double, properties: AnyObject, mode: UpdateMode): Unit = js.native
  /* protected */ def updateElement(element: TDatasetElement | TElement, index: Unit, properties: AnyObject, mode: UpdateMode): Unit = js.native
  
  def updateElements(elements: js.Array[TElement], start: Double, count: Double, mode: UpdateMode): Unit = js.native
  
  def updateIndex(datasetIndex: Double): Unit = js.native
  
  /* protected */ def updateRangeFromParsed(range: Max, scale: Scale[CoreScaleOptions], parsed: js.Array[Any], stack: String): Unit = js.native
  /* protected */ def updateRangeFromParsed(range: Max, scale: Scale[CoreScaleOptions], parsed: js.Array[Any], stack: Boolean): Unit = js.native
  
  /**
    * Utility to animate the shared options, that are potentially affecting multiple elements.
    * @protected
    */
  /* protected */ def updateSharedOptions(sharedOptions: AnyObject, mode: UpdateMode, newOptions: AnyObject): Unit = js.native
}
