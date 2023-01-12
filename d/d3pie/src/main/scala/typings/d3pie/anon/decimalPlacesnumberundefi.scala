package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  decimalPlaces :number | undefined} & d3pie.d3pie.ID3PieStyleOptions */
trait decimalPlacesnumberundefi extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
}
object decimalPlacesnumberundefi {
  
  inline def apply(): decimalPlacesnumberundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[decimalPlacesnumberundefi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: decimalPlacesnumberundefi] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
