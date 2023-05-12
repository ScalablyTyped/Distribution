package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipLabelStyle extends StObject {
  
  var backgroundColor: Color
  
  var borderColor: Color
  
  /**
    * Border dash
    * @since 3.1.0
    */
  var borderDash: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  /**
    * Border dash offset
    * @since 3.1.0
    */
  var borderDashOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * borderRadius
    * @since 3.1.0
    */
  var borderRadius: js.UndefOr[Double | BorderRadius] = js.undefined
  
  /**
    * Width of border line
    * @since 3.1.0
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
}
object TooltipLabelStyle {
  
  inline def apply(backgroundColor: Color, borderColor: Color): TooltipLabelStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLabelStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipLabelStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderDash(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffset(value: Double): Self = StObject.set(x, "borderDashOffset", value.asInstanceOf[js.Any])
    
    inline def setBorderDashOffsetUndefined: Self = StObject.set(x, "borderDashOffset", js.undefined)
    
    inline def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
    
    inline def setBorderRadius(value: Double | BorderRadius): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
  }
}
