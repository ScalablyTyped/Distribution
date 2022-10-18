package typings.chartJs.mod

import typings.chartJs.anon.Max
import typings.chartJs.anon.MaxDefined
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import typings.chartJs.typesGeometricMod.ChartArea
import typings.chartJs.typesLayoutMod.LayoutItem
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("chart.js", "Scale")
@js.native
open class Scale[O /* <: CoreScaleOptions */] protected ()
  extends StObject
     with Element[Any, O]
     with LayoutItem {
  def this(cfg: typings.chartJs.anon.Chart) = this()
  
  def afterBuildTicks(): Unit = js.native
  
  def afterCalculateLabelRotation(): Unit = js.native
  
  def afterDataLimits(): Unit = js.native
  
  def afterFit(): Unit = js.native
  
  def afterSetDimensions(): Unit = js.native
  
  def afterTickToLabelConversion(): Unit = js.native
  
  def afterUpdate(): Unit = js.native
  
  var axis: String = js.native
  
  def beforeBuildTicks(): Unit = js.native
  
  def beforeCalculateLabelRotation(): Unit = js.native
  
  def beforeDataLimits(): Unit = js.native
  
  def beforeFit(): Unit = js.native
  
  def beforeSetDimensions(): Unit = js.native
  
  def beforeTickToLabelConversion(): Unit = js.native
  
  def beforeUpdate(): Unit = js.native
  
  def buildTicks(): js.Array[Tick] = js.native
  
  def calculateLabelRotation(): Unit = js.native
  
  val chart: Chart[ChartType, DefaultDataPoint[ChartType], Any] = js.native
  
  def configure(): Unit = js.native
  
  val ctx: CanvasRenderingContext2D = js.native
  
  def determineDataLimits(): Unit = js.native
  
  def drawGrid(chartArea: ChartArea): Unit = js.native
  
  def drawLabels(chartArea: ChartArea): Unit = js.native
  
  def drawTitle(chartArea: ChartArea): Unit = js.native
  
  def fit(): Unit = js.native
  
  def generateTickLabels(ticks: js.Array[Tick]): Unit = js.native
  
  /**
    * Returns the pixel for the minimum chart value
    * The coordinate (0, 0) is at the upper-left corner of the canvas
    * @return {number}
    */
  def getBasePixel(): Double = js.native
  
  def getBaseValue(): Double = js.native
  
  /**
    * @param {number} pixel
    * @return {number}
    */
  def getDecimalForPixel(pixel: Double): Double = js.native
  
  /**
    * Used to get the label to display in the tooltip for the given value
    * @param {*} value
    * @return {string}
    */
  def getLabelForValue(value: Double): String = js.native
  
  def getLabels(): js.Array[String] = js.native
  
  /**
    * Returns the grid line width at given value
    */
  def getLineWidthForValue(value: Double): Double = js.native
  
  def getMatchingVisibleMetas(): js.Array[
    ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  ] = js.native
  def getMatchingVisibleMetas(`type`: String): js.Array[
    ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  ] = js.native
  
  def getMinMax(canStack: Boolean): Max = js.native
  
  /**
    * Utility for getting the pixel location of a percentage of scale
    * The coordinate (0, 0) is at the upper-left corner of the canvas
    * @param {number} decimal
    * @return {number}
    */
  def getPixelForDecimal(decimal: Double): Double = js.native
  
  /**
    * Returns the location of the tick at the given index
    * The coordinate (0, 0) is at the upper-left corner of the canvas
    * @param {number} index
    * @return {number}
    */
  def getPixelForTick(index: Double): Double = js.native
  
  /**
    * Returns the location of the given data point. Value can either be an index or a numerical value
    * The coordinate (0, 0) is at the upper-left corner of the canvas
    * @param {*} value
    * @param {number} [index]
    * @return {number}
    */
  def getPixelForValue(value: Double): Double = js.native
  def getPixelForValue(value: Double, index: Double): Double = js.native
  
  def getTicks(): js.Array[Tick] = js.native
  
  def getUserBounds(): MaxDefined = js.native
  
  /**
    * Used to get the data value from a given pixel. This is the inverse of getPixelForValue
    * The coordinate (0, 0) is at the upper-left corner of the canvas
    * @param {number} pixel
    * @return {*}
    */
  def getValueForPixel(pixel: Double): js.UndefOr[Double] = js.native
  
  val id: String = js.native
  
  def init(options: O): Unit = js.native
  
  def isFullSize(): Boolean = js.native
  
  var labelRotation: Double = js.native
  
  var max: Double = js.native
  
  var maxHeight: Double = js.native
  
  var maxWidth: Double = js.native
  
  var min: Double = js.native
  
  var paddingBottom: Double = js.native
  
  var paddingLeft: Double = js.native
  
  var paddingRight: Double = js.native
  
  var paddingTop: Double = js.native
  
  def parse(raw: Any, index: Double): Any = js.native
  
  def setDimensions(): Unit = js.native
  
  var ticks: js.Array[Tick] = js.native
  
  val `type`: String = js.native
}
