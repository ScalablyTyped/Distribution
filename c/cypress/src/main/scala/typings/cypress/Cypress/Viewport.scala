package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var viewportHeight: Double
  
  var viewportWidth: Double
}
object Viewport {
  
  inline def apply(viewportHeight: Double, viewportWidth: Double): Viewport = {
    val __obj = js.Dynamic.literal(viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  extension [Self <: Viewport](x: Self) {
    
    inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
  }
}
