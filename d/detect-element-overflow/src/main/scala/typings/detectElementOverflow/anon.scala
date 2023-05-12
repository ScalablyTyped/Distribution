package typings.detectElementOverflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CollidedBottom extends StObject {
    
    val collidedBottom: Boolean
    
    val collidedLeft: Boolean
    
    val collidedRight: Boolean
    
    val collidedTop: Boolean
    
    val overflowBottom: Double
    
    val overflowLeft: Double
    
    val overflowRight: Double
    
    val overflowTop: Double
  }
  object CollidedBottom {
    
    inline def apply(
      collidedBottom: Boolean,
      collidedLeft: Boolean,
      collidedRight: Boolean,
      collidedTop: Boolean,
      overflowBottom: Double,
      overflowLeft: Double,
      overflowRight: Double,
      overflowTop: Double
    ): CollidedBottom = {
      val __obj = js.Dynamic.literal(collidedBottom = collidedBottom.asInstanceOf[js.Any], collidedLeft = collidedLeft.asInstanceOf[js.Any], collidedRight = collidedRight.asInstanceOf[js.Any], collidedTop = collidedTop.asInstanceOf[js.Any], overflowBottom = overflowBottom.asInstanceOf[js.Any], overflowLeft = overflowLeft.asInstanceOf[js.Any], overflowRight = overflowRight.asInstanceOf[js.Any], overflowTop = overflowTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollidedBottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollidedBottom] (val x: Self) extends AnyVal {
      
      inline def setCollidedBottom(value: Boolean): Self = StObject.set(x, "collidedBottom", value.asInstanceOf[js.Any])
      
      inline def setCollidedLeft(value: Boolean): Self = StObject.set(x, "collidedLeft", value.asInstanceOf[js.Any])
      
      inline def setCollidedRight(value: Boolean): Self = StObject.set(x, "collidedRight", value.asInstanceOf[js.Any])
      
      inline def setCollidedTop(value: Boolean): Self = StObject.set(x, "collidedTop", value.asInstanceOf[js.Any])
      
      inline def setOverflowBottom(value: Double): Self = StObject.set(x, "overflowBottom", value.asInstanceOf[js.Any])
      
      inline def setOverflowLeft(value: Double): Self = StObject.set(x, "overflowLeft", value.asInstanceOf[js.Any])
      
      inline def setOverflowRight(value: Double): Self = StObject.set(x, "overflowRight", value.asInstanceOf[js.Any])
      
      inline def setOverflowTop(value: Double): Self = StObject.set(x, "overflowTop", value.asInstanceOf[js.Any])
    }
  }
}
