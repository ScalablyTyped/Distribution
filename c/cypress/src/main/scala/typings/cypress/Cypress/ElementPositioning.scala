package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementPositioning extends StObject {
  
  var fromAutWindow: WindowPosition
  
  var fromElViewport: ViewportPosition
  
  var fromElWindow: WindowPosition
  
  var height: Double
  
  var scrollLeft: Double
  
  var scrollTop: Double
  
  var width: Double
}
object ElementPositioning {
  
  inline def apply(
    fromAutWindow: WindowPosition,
    fromElViewport: ViewportPosition,
    fromElWindow: WindowPosition,
    height: Double,
    scrollLeft: Double,
    scrollTop: Double,
    width: Double
  ): ElementPositioning = {
    val __obj = js.Dynamic.literal(fromAutWindow = fromAutWindow.asInstanceOf[js.Any], fromElViewport = fromElViewport.asInstanceOf[js.Any], fromElWindow = fromElWindow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPositioning]
  }
  
  extension [Self <: ElementPositioning](x: Self) {
    
    inline def setFromAutWindow(value: WindowPosition): Self = StObject.set(x, "fromAutWindow", value.asInstanceOf[js.Any])
    
    inline def setFromElViewport(value: ViewportPosition): Self = StObject.set(x, "fromElViewport", value.asInstanceOf[js.Any])
    
    inline def setFromElWindow(value: WindowPosition): Self = StObject.set(x, "fromElWindow", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
