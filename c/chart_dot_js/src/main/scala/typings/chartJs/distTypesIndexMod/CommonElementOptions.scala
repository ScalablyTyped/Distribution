package typings.chartJs.distTypesIndexMod

import typings.chartJs.distTypesColorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonElementOptions extends StObject {
  
  var backgroundColor: Color
  
  var borderColor: Color
  
  var borderWidth: Double
}
object CommonElementOptions {
  
  inline def apply(backgroundColor: Color, borderColor: Color, borderWidth: Double): CommonElementOptions = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonElementOptions] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
  }
}
