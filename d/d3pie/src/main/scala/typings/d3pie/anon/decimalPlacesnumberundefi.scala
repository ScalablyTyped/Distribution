package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  decimalPlaces :number | undefined} & d3pie.d3pie.ID3PieStyleOptions */
@js.native
trait decimalPlacesnumberundefi extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var decimalPlaces: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
}
object decimalPlacesnumberundefi {
  
  @scala.inline
  def apply(): decimalPlacesnumberundefi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[decimalPlacesnumberundefi]
  }
  
  @scala.inline
  implicit class decimalPlacesnumberundefiMutableBuilder[Self <: decimalPlacesnumberundefi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
