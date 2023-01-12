package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportPosition
  extends StObject
     with WindowPosition {
  
  var bottom: Double
  
  var right: Double
}
object ViewportPosition {
  
  inline def apply(bottom: Double, left: Double, leftCenter: Double, right: Double, top: Double, topCenter: Double): ViewportPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], leftCenter = leftCenter.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topCenter = topCenter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewportPosition] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
