package typings.chartJs.mod

import typings.chartJs.chartJsStrings.auto
import typings.chartJs.chartJsStrings.data
import typings.chartJs.chartJsStrings.labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedTickOptions extends StObject {
  
  var autoSkip: js.UndefOr[Boolean] = js.undefined
  
  var autoSkipPadding: js.UndefOr[Double] = js.undefined
  
  var backdropColor: js.UndefOr[ChartColor] = js.undefined
  
  var backdropPaddingX: js.UndefOr[Double] = js.undefined
  
  var backdropPaddingY: js.UndefOr[Double] = js.undefined
  
  var beginAtZero: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the callback returns null or undefined the associated grid line will be hidden.
    */
  var callback: js.UndefOr[
    js.Function3[
      /* value */ Double | String, 
      /* index */ Double, 
      /* values */ js.Array[Double | String], 
      js.UndefOr[String | Double | Null]
    ]
  ] = js.undefined
  
  var display: js.UndefOr[Boolean] = js.undefined
  
  var fontColor: js.UndefOr[ChartColor] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[String] = js.undefined
  
  var labelOffset: js.UndefOr[Double] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[js.Any] = js.undefined
  
  var maxRotation: js.UndefOr[Double] = js.undefined
  
  var maxTicksLimit: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[js.Any] = js.undefined
  
  var minRotation: js.UndefOr[Double] = js.undefined
  
  var mirror: js.UndefOr[Boolean] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of ticks to examine when deciding how many labels will fit.
    * Setting a smaller value will be faster, but may be less accurate
    * when there is large variability in label length.
    * Deault: `ticks.length`
    */
  var sampleSize: js.UndefOr[Double] = js.undefined
  
  var showLabelBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[auto | data | labels] = js.undefined
  
  var stepSize: js.UndefOr[Double] = js.undefined
  
  var suggestedMax: js.UndefOr[Double] = js.undefined
  
  var suggestedMin: js.UndefOr[Double] = js.undefined
}
object NestedTickOptions {
  
  inline def apply(): NestedTickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestedTickOptions]
  }
  
  extension [Self <: NestedTickOptions](x: Self) {
    
    inline def setAutoSkip(value: Boolean): Self = StObject.set(x, "autoSkip", value.asInstanceOf[js.Any])
    
    inline def setAutoSkipPadding(value: Double): Self = StObject.set(x, "autoSkipPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoSkipPaddingUndefined: Self = StObject.set(x, "autoSkipPadding", js.undefined)
    
    inline def setAutoSkipUndefined: Self = StObject.set(x, "autoSkip", js.undefined)
    
    inline def setBackdropColor(value: ChartColor): Self = StObject.set(x, "backdropColor", value.asInstanceOf[js.Any])
    
    inline def setBackdropColorUndefined: Self = StObject.set(x, "backdropColor", js.undefined)
    
    inline def setBackdropColorVarargs(value: String*): Self = StObject.set(x, "backdropColor", js.Array(value :_*))
    
    inline def setBackdropPaddingX(value: Double): Self = StObject.set(x, "backdropPaddingX", value.asInstanceOf[js.Any])
    
    inline def setBackdropPaddingXUndefined: Self = StObject.set(x, "backdropPaddingX", js.undefined)
    
    inline def setBackdropPaddingY(value: Double): Self = StObject.set(x, "backdropPaddingY", value.asInstanceOf[js.Any])
    
    inline def setBackdropPaddingYUndefined: Self = StObject.set(x, "backdropPaddingY", js.undefined)
    
    inline def setBeginAtZero(value: Boolean): Self = StObject.set(x, "beginAtZero", value.asInstanceOf[js.Any])
    
    inline def setBeginAtZeroUndefined: Self = StObject.set(x, "beginAtZero", js.undefined)
    
    inline def setCallback(
      value: (/* value */ Double | String, /* index */ Double, /* values */ js.Array[Double | String]) => js.UndefOr[String | Double | Null]
    ): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setFontColor(value: ChartColor): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontColorVarargs(value: String*): Self = StObject.set(x, "fontColor", js.Array(value :_*))
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setLabelOffset(value: Double): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setMax(value: js.Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxRotation(value: Double): Self = StObject.set(x, "maxRotation", value.asInstanceOf[js.Any])
    
    inline def setMaxRotationUndefined: Self = StObject.set(x, "maxRotation", js.undefined)
    
    inline def setMaxTicksLimit(value: Double): Self = StObject.set(x, "maxTicksLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxTicksLimitUndefined: Self = StObject.set(x, "maxTicksLimit", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinRotation(value: Double): Self = StObject.set(x, "minRotation", value.asInstanceOf[js.Any])
    
    inline def setMinRotationUndefined: Self = StObject.set(x, "minRotation", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setShowLabelBackdrop(value: Boolean): Self = StObject.set(x, "showLabelBackdrop", value.asInstanceOf[js.Any])
    
    inline def setShowLabelBackdropUndefined: Self = StObject.set(x, "showLabelBackdrop", js.undefined)
    
    inline def setSource(value: auto | data | labels): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStepSize(value: Double): Self = StObject.set(x, "stepSize", value.asInstanceOf[js.Any])
    
    inline def setStepSizeUndefined: Self = StObject.set(x, "stepSize", js.undefined)
    
    inline def setSuggestedMax(value: Double): Self = StObject.set(x, "suggestedMax", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMaxUndefined: Self = StObject.set(x, "suggestedMax", js.undefined)
    
    inline def setSuggestedMin(value: Double): Self = StObject.set(x, "suggestedMin", value.asInstanceOf[js.Any])
    
    inline def setSuggestedMinUndefined: Self = StObject.set(x, "suggestedMin", js.undefined)
  }
}
