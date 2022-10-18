package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.WindowPosition & {  x :number,   y :number} */
trait WindowPositionxnumberynum extends StObject {
  
  var left: Double
  
  var leftCenter: Double
  
  var top: Double
  
  var topCenter: Double
  
  var x: Double
  
  var y: Double
}
object WindowPositionxnumberynum {
  
  inline def apply(left: Double, leftCenter: Double, top: Double, topCenter: Double, x: Double, y: Double): WindowPositionxnumberynum = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPositionxnumberynum]
  }
  
  extension [Self <: WindowPositionxnumberynum](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftCenter(value: Double): Self = StObject.set(x, "leftCenter", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopCenter(value: Double): Self = StObject.set(x, "topCenter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
