package typings.cypress.Cypress

import typings.cypress.anon.ViewportPositionxnumberyn
import typings.cypress.anon.WindowPositionxnumberynum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementCoordinates extends StObject {
  
  var fromAutWindow: WindowPositionxnumberynum
  
  var fromElViewport: ViewportPositionxnumberyn
  
  var fromElWindow: WindowPositionxnumberynum
  
  var height: Double
  
  var width: Double
}
object ElementCoordinates {
  
  inline def apply(
    fromAutWindow: WindowPositionxnumberynum,
    fromElViewport: ViewportPositionxnumberyn,
    fromElWindow: WindowPositionxnumberynum,
    height: Double,
    width: Double
  ): ElementCoordinates = {
    val __obj = js.Dynamic.literal(fromAutWindow = fromAutWindow.asInstanceOf[js.Any], fromElViewport = fromElViewport.asInstanceOf[js.Any], fromElWindow = fromElWindow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementCoordinates]
  }
  
  extension [Self <: ElementCoordinates](x: Self) {
    
    inline def setFromAutWindow(value: WindowPositionxnumberynum): Self = StObject.set(x, "fromAutWindow", value.asInstanceOf[js.Any])
    
    inline def setFromElViewport(value: ViewportPositionxnumberyn): Self = StObject.set(x, "fromElViewport", value.asInstanceOf[js.Any])
    
    inline def setFromElWindow(value: WindowPositionxnumberynum): Self = StObject.set(x, "fromElWindow", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
