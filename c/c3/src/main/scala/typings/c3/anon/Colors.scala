package typings.c3.anon

import typings.c3.c3Strings.pow10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
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
object Colors {
  
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: /* value */ Double => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setLines(value: js.Array[Class]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    @scala.inline
    def setLinesVarargs(value: Class*): Self = StObject.set(x, "lines", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: typings.c3.mod.Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRegions(value: js.Array[Opacity]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Opacity*): Self = StObject.set(x, "regions", js.Array(value :_*))
    
    @scala.inline
    def setScaleFormat(value: pow10 | (js.Function1[/* arg0 */ Double, String])): Self = StObject.set(x, "scaleFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFormatFunction1(value: /* arg0 */ Double => String): Self = StObject.set(x, "scaleFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleFormatUndefined: Self = StObject.set(x, "scaleFormat", js.undefined)
    
    @scala.inline
    def setScaleMax(value: Double): Self = StObject.set(x, "scaleMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMaxUndefined: Self = StObject.set(x, "scaleMax", js.undefined)
    
    @scala.inline
    def setScaleMin(value: Double): Self = StObject.set(x, "scaleMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMinUndefined: Self = StObject.set(x, "scaleMin", js.undefined)
    
    @scala.inline
    def setScaleValues(value: (/* minValue */ Double, /* maxValue */ Double) => js.Array[Double]): Self = StObject.set(x, "scaleValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScaleValuesUndefined: Self = StObject.set(x, "scaleValues", js.undefined)
    
    @scala.inline
    def setScaleWidth(value: Double): Self = StObject.set(x, "scaleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleWidthUndefined: Self = StObject.set(x, "scaleWidth", js.undefined)
    
    @scala.inline
    def setTexts(value: js.Array[Content]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setTextsVarargs(value: Content*): Self = StObject.set(x, "texts", js.Array(value :_*))
  }
}
