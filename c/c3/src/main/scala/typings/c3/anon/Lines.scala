package typings.c3.anon

import typings.c3.c3Strings.pow10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lines extends StObject {
  
  /**
    * Set the color interpolator for stanford color scale. This option is a
    * `d3.interpolate*` object or any function you definethat receives a
    * value between `0` and `1`, and returns a color as string.
    */
  var colors: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  
  /** Show lines anywhere in the chart. */
  var lines: js.UndefOr[js.Array[Class]] = js.undefined
  
  /**
    * Set the padding for the Stanford color scale.
    */
  var padding: js.UndefOr[typings.c3.mod.Padding] = js.undefined
  
  /** Add regions to the chart. */
  var regions: js.UndefOr[js.Array[Opacity]] = js.undefined
  
  /**
    * Set formatter for stanford color scale axis tick text.
    * This option accepts the string 'pow10', a d3.format object and any function you define.
    * Defauls to `d3.format("d")`.
    */
  var scaleFormat: js.UndefOr[pow10 | (js.Function1[/* arg0 */ Double, String])] = js.undefined
  
  /** Change the maximum value of the stanford color scale. */
  var scaleMax: js.UndefOr[Double] = js.undefined
  
  /** Change the minimum value of the stanford color scale. */
  var scaleMin: js.UndefOr[Double] = js.undefined
  
  /**
    * Set the values for stanford color scale axis tick text. This option accepts a function that returns an array of numbers.
    */
  var scaleValues: js.UndefOr[js.Function2[/* minValue */ Double, /* maxValue */ Double, js.Array[Double]]] = js.undefined
  
  /**
    * Change the width of the stanford color scale.
    * Defaults to `20`.
    */
  var scaleWidth: js.UndefOr[Double] = js.undefined
  
  /** Show text anywhere inside the chart. */
  var texts: js.UndefOr[js.Array[Content]] = js.undefined
}
object Lines {
  
  inline def apply(): Lines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lines]
  }
  
  extension [Self <: Lines](x: Self) {
    
    inline def setColors(value: /* value */ Double => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setLines(value: js.Array[Class]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLinesVarargs(value: Class*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setPadding(value: typings.c3.mod.Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRegions(value: js.Array[Opacity]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: Opacity*): Self = StObject.set(x, "regions", js.Array(value*))
    
    inline def setScaleFormat(value: pow10 | (js.Function1[/* arg0 */ Double, String])): Self = StObject.set(x, "scaleFormat", value.asInstanceOf[js.Any])
    
    inline def setScaleFormatFunction1(value: /* arg0 */ Double => String): Self = StObject.set(x, "scaleFormat", js.Any.fromFunction1(value))
    
    inline def setScaleFormatUndefined: Self = StObject.set(x, "scaleFormat", js.undefined)
    
    inline def setScaleMax(value: Double): Self = StObject.set(x, "scaleMax", value.asInstanceOf[js.Any])
    
    inline def setScaleMaxUndefined: Self = StObject.set(x, "scaleMax", js.undefined)
    
    inline def setScaleMin(value: Double): Self = StObject.set(x, "scaleMin", value.asInstanceOf[js.Any])
    
    inline def setScaleMinUndefined: Self = StObject.set(x, "scaleMin", js.undefined)
    
    inline def setScaleValues(value: (/* minValue */ Double, /* maxValue */ Double) => js.Array[Double]): Self = StObject.set(x, "scaleValues", js.Any.fromFunction2(value))
    
    inline def setScaleValuesUndefined: Self = StObject.set(x, "scaleValues", js.undefined)
    
    inline def setScaleWidth(value: Double): Self = StObject.set(x, "scaleWidth", value.asInstanceOf[js.Any])
    
    inline def setScaleWidthUndefined: Self = StObject.set(x, "scaleWidth", js.undefined)
    
    inline def setTexts(value: js.Array[Content]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setTextsVarargs(value: Content*): Self = StObject.set(x, "texts", js.Array(value*))
  }
}
