package typings.chartJs.distChunksHelpersDotcoreMod

import typings.chartJs.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<chart.js.chart.js/dist/chunks/helpers.core.CommonElementOptions, 'borderWidth'> */
trait BarOptions extends StObject {
  
  var backgroundColor: Color
  
  /**
    * The base value for the bar in data units along the value axis.
    */
  var base: Double
  
  var borderColor: Color
  
  /**
    * Border radius
    * @default 0
    */
  var borderRadius: Double | BorderRadius
  
  /**
    * Skipped (excluded) border: 'start', 'end', 'left',  'right', 'bottom', 'top', 'middle', false (none) or true (all).
    * @default 'start'
    */
  var borderSkipped: "start" | "end" | "left" | "right" | "bottom" | "top" | "middle" | Boolean
  
  /**
    * Width of the border, number for all sides, object to specify width for each side specifically
    * @default 0
    */
  var borderWidth: Double | Bottom
  
  /**
    * Amount to inflate the rectangle(s). This can be used to hide artifacts between bars.
    * Unit is pixels. 'auto' translates to 0.33 pixels when barPercentage * categoryPercentage is 1, else 0.
    * @default 'auto'
    */
  var inflateAmount: Double | "auto"
}
object BarOptions {
  
  inline def apply(
    backgroundColor: Color,
    base: Double,
    borderColor: Color,
    borderRadius: Double | BorderRadius,
    borderSkipped: "start" | "end" | "left" | "right" | "bottom" | "top" | "middle" | Boolean,
    borderWidth: Double | Bottom,
    inflateAmount: Double | "auto"
  ): BarOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderSkipped = borderSkipped.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], inflateAmount = inflateAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarOptions]
  }
  
  extension [Self <: BarOptions](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderRadius(value: Double | BorderRadius): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderSkipped(value: "start" | "end" | "left" | "right" | "bottom" | "top" | "middle" | Boolean): Self = StObject.set(x, "borderSkipped", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double | Bottom): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setInflateAmount(value: Double | "auto"): Self = StObject.set(x, "inflateAmount", value.asInstanceOf[js.Any])
  }
}
