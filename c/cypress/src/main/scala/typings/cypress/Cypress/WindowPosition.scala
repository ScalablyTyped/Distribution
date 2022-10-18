package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowPosition extends StObject {
  
  var left: Double
  
  var leftCenter: Double
  
  var top: Double
  
  var topCenter: Double
}
object WindowPosition {
  
  inline def apply(left: Double, leftCenter: Double, top: Double, topCenter: Double): WindowPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPosition]
  }
  
  extension [Self <: WindowPosition](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftCenter(value: Double): Self = StObject.set(x, "leftCenter", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopCenter(value: Double): Self = StObject.set(x, "topCenter", value.asInstanceOf[js.Any])
  }
}
