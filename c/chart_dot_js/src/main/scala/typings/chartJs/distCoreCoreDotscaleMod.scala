package typings.chartJs

import typings.chartJs.anon.Bottom
import typings.chartJs.anon.Left
import typings.chartJs.anon.Max
import typings.chartJs.anon.MaxDefined
import typings.chartJs.anon.TextAlign
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesGeometricMod.ChartArea
import typings.chartJs.distTypesIndexMod.ChartType
import typings.chartJs.distTypesIndexMod.DefaultDataPoint
import typings.chartJs.distTypesIndexMod.LabelItem
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreCoreDotscaleMod {
  
  @JSImport("chart.js/dist/core/core.scale", JSImport.Default)
  @js.native
  open class default protected () extends Scale {
    def this(cfg: Any) = this()
  }
  
  type Chart = typings.chartJs.distTypesIndexMod.Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  @js.native
  trait Scale
    extends typings.chartJs.distCoreCoreDotelementMod.default[AnyObject, AnyObject] {
    
    @JSName("$context")
    var $context: Any = js.native
    
    var _alignToPixels: Any = js.native
    
    var _borderValue: Double = js.native
    
    def _calculatePadding(first: Any, last: Any, sin: Any, cos: Any): Unit = js.native
    
    def _callHooks(name: Any): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var _computeGridLineItems: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _computeLabelArea: Any = js.native
    
    /**
      * @private
      */
    /* private */ var _computeLabelItems: Any = js.native
    
    /**
      * Returns {width, height, offset} objects for the first, last, widest, highest tick
      * labels where offset indicates the anchor point offset from the top in pixels.
      * @return {{ first: object, last: object, widest: object, highest: object, widths: Array, heights: array }}
      * @private
      */
    /* private */ var _computeLabelSizes: Any = js.native
    
    /**
      * @param {Tick[]} ticks
      * @private
      */
    /* private */ var _convertTicksToLabels: Any = js.native
    
    var _dataLimitsCached: Boolean = js.native
    
    /** @type {number} */
    var _endPixel: Double = js.native
    
    /**
      * @return {{ first: object, last: object, widest: object, highest: object, widths: Array, heights: array }}
      * @private
      */
    /* private */ var _getLabelSizes: Any = js.native
    
    def _getXAxisLabelAlignment(): String = js.native
    
    def _getYAxisLabelAlignment(tl: Any): TextAlign = js.native
    
    /** @type {object[]|null} */
    var _gridLineItems: js.Array[js.Object] | Null = js.native
    
    /**
      * Handle margins and padding interactions
      * @private
      */
    /* private */ var _handleMargins: Any = js.native
    
    /**
      * @return {boolean}
      * @private
      */
    /* private */ var _isVisible: Any = js.native
    
    /** @type {object[]|null} */
    var _labelItems: js.Array[js.Object] | Null = js.native
    
    /** @type {object|null} */
    var _labelSizes: js.Object | Null = js.native
    
    /**
      * @return {object[]}
      * @private
      */
    /* private */ var _layers: Any = js.native
    
    var _length: Double = js.native
    
    var _margins: Bottom = js.native
    
    /**
      * @protected
      */
    /* protected */ def _maxDigits(): Double = js.native
    
    var _maxLength: Double = js.native
    
    var _range: Max = js.native
    
    /**
      * @param {number} index
      * @return {object}
      * @protected
      */
    /* protected */ def _resolveTickFontOptions(index: Double): js.Object = js.native
    
    var _reversePixels: Boolean = js.native
    
    /** @type {number} */
    var _startPixel: Double = js.native
    
    var _suggestedMax: Any = js.native
    
    var _suggestedMin: Any = js.native
    
    /**
      * @return {number}
      * @private
      */
    /* private */ var _tickSize: Any = js.native
    
    var _ticksLength: Double = js.native
    
    var _userMax: Any = js.native
    
    var _userMin: Any = js.native
    
    def afterAutoSkip(): Unit = js.native
    
    def afterBuildTicks(): Unit = js.native
    
    def afterCalculateLabelRotation(): Unit = js.native
    
    def afterDataLimits(): Unit = js.native
    
    def afterFit(): Unit = js.native
    
    def afterSetDimensions(): Unit = js.native
    
    def afterTickToLabelConversion(): Unit = js.native
    
    def afterUpdate(): Unit = js.native
    
    /** @type {string=} */
    var axis: js.UndefOr[String] = js.native
    
    def beforeBuildTicks(): Unit = js.native
    
    def beforeCalculateLabelRotation(): Unit = js.native
    
    def beforeDataLimits(): Unit = js.native
    
    def beforeFit(): Unit = js.native
    
    def beforeLayout(): Unit = js.native
    
    def beforeSetDimensions(): Unit = js.native
    
    def beforeTickToLabelConversion(): Unit = js.native
    
    def beforeUpdate(): Unit = js.native
    
    /** @type {number} */
    var bottom: Double = js.native
    
    /**
      * @return {object[]} the ticks
      */
    def buildTicks(): js.Array[js.Object] = js.native
    
    def calculateLabelRotation(): Unit = js.native
    
    /** @type {Chart} */
    var chart: Chart = js.native
    
    /**
      * @protected
      */
    /* protected */ def configure(): Unit = js.native
    
    /** @type {CanvasRenderingContext2D} */
    var ctx: CanvasRenderingContext2D = js.native
    
    def determineDataLimits(): Unit = js.native
    
    def draw(chartArea: Any): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawBackground(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawBorder(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawGrid(chartArea: Any): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawLabels(chartArea: Any): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def drawTitle(): Unit = js.native
    
    def fit(): Unit = js.native
    
    /**
      * Convert ticks to label strings
      * @param {Tick[]} ticks
      */
    def generateTickLabels(ticks: js.Array[Tick]): Unit = js.native
    
    /**
      * Returns the pixel for the minimum chart value
      * The coordinate (0, 0) is at the upper-left corner of the canvas
      * @return {number}
      */
    def getBasePixel(): Double = js.native
    
    /**
      * @return {number}
      */
    def getBaseValue(): Double = js.native
    
    /**
      * @protected
      */
    /* protected */ def getContext(index: Any): Any = js.native
    
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
    def getLabelForValue(value: Any): String = js.native
    
    /**
      * @return {import('../types.js').LabelItem[]}
      */
    def getLabelItems(): js.Array[LabelItem] = js.native
    def getLabelItems(chartArea: ChartArea): js.Array[LabelItem] = js.native
    
    /**
      * @return {string[]}
      */
    def getLabels(): js.Array[String] = js.native
    
    def getLineWidthForValue(value: Any): Any = js.native
    
    /**
      * Returns visible dataset metas that are attached to this scale
      * @param {string} [type] - if specified, also filter by dataset type
      * @return {object[]}
      */
    def getMatchingVisibleMetas(): js.Array[js.Object] = js.native
    def getMatchingVisibleMetas(`type`: String): js.Array[js.Object] = js.native
    
    /**
      * @param {boolean} canStack
      * @return {{min: number, max: number}}
      * @protected
      * @since 3.0
      */
    /* protected */ def getMinMax(canStack: Boolean): Max = js.native
    
    /**
      * Get the padding needed for the scale
      * @return {{top: number, left: number, bottom: number, right: number}} the necessary padding
      * @private
      */
    /* private */ var getPadding: Any = js.native
    
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
    def getPixelForValue(value: Any): Double = js.native
    def getPixelForValue(value: Any, index: Double): Double = js.native
    
    /**
      * Returns the scale tick objects
      * @return {Tick[]}
      * @since 2.7
      */
    def getTicks(): js.Array[Tick] = js.native
    
    /**
      * @return {{min: number, max: number, minDefined: boolean, maxDefined: boolean}}
      * @protected
      * @since 3.0
      */
    /* protected */ def getUserBounds(): MaxDefined = js.native
    
    /**
      * Used to get the data value from a given pixel. This is the inverse of getPixelForValue
      * The coordinate (0, 0) is at the upper-left corner of the canvas
      * @param {number} pixel
      * @return {*}
      */
    def getValueForPixel(pixel: Double): Any = js.native
    
    /** @type {number} */
    var height: Double = js.native
    
    /** @type {string} */
    var id: String = js.native
    
    /**
      * @param {any} options
      * @since 3.0
      */
    def init(options: Any): Unit = js.native
    
    /**
      * @return {boolean}
      */
    def isFullSize(): Boolean = js.native
    
    /**
      * @return {boolean}
      */
    def isHorizontal(): Boolean = js.native
    
    /** @type {number=} */
    var labelRotation: js.UndefOr[Double] = js.native
    
    /** @type {number} */
    var left: Double = js.native
    
    var max: Any = js.native
    
    /** @type {number} */
    var maxHeight: Double = js.native
    
    /** @type {number} */
    var maxWidth: Double = js.native
    
    var min: Any = js.native
    
    /** @type {number} */
    var paddingBottom: Double = js.native
    
    /** @type {number} */
    var paddingLeft: Double = js.native
    
    /** @type {number} */
    var paddingRight: Double = js.native
    
    /** @type {number} */
    var paddingTop: Double = js.native
    
    /**
      * Parse a supported input value to internal representation.
      * @param {*} raw
      * @param {number} [index]
      * @since 3.0
      */
    def parse(raw: Any): Any = js.native
    def parse(raw: Any, index: Double): Any = js.native
    
    /** @type {number} */
    var right: Double = js.native
    
    def setDimensions(): Unit = js.native
    
    /** @type {Tick[]} */
    var ticks: js.Array[Tick] = js.native
    
    /** @type {number} */
    var top: Double = js.native
    
    /** @type {string} */
    var `type`: String = js.native
    
    /**
      * @param {number} maxWidth - the max width in pixels
      * @param {number} maxHeight - the max height in pixels
      * @param {{top: number, left: number, bottom: number, right: number}} margins - the space between the edge of the other scales and edge of the chart
      *   This space comes from two sources:
      *     - padding - space that's required to show the labels at the edges of the scale
      *     - thickness of scales or legends in another orientation
      */
    def update(maxWidth: Double, maxHeight: Double, margins: Left): Unit = js.native
    
    /** @type {number} */
    var width: Double = js.native
  }
  
  trait Tick extends StObject {
    
    @JSName("$context")
    var $context: js.UndefOr[Any] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var major: js.UndefOr[Boolean] = js.undefined
    
    var value: Double | String
  }
  object Tick {
    
    inline def apply(value: Double | String): Tick = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tick]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tick] (val x: Self) extends AnyVal {
      
      inline def set$context(value: Any): Self = StObject.set(x, "$context", value.asInstanceOf[js.Any])
      
      inline def set$contextUndefined: Self = StObject.set(x, "$context", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMajor(value: Boolean): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
