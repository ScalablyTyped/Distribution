package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cypress.Cypress.ViewportPosition & {  x :number,   y :number} */
trait ViewportPositionxnumberyn extends StObject {
  
  var bottom: Double
  
  var left: Double
  
  var leftCenter: Double
  
  var right: Double
  
  var top: Double
  
  var topCenter: Double
  
  var x: Double
  
  var y: Double
}
object ViewportPositionxnumberyn {
  
  inline def apply(
    bottom: Double,
    left: Double,
    leftCenter: Double,
    right: Double,
    top: Double,
    topCenter: Double,
    x: Double,
    y: Double
  ): ViewportPositionxnumberyn = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPositionxnumberyn]
  }
  
  extension [Self <: ViewportPositionxnumberyn](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftCenter(value: Double): Self = StObject.set(x, "leftCenter", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopCenter(value: Double): Self = StObject.set(x, "topCenter", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
