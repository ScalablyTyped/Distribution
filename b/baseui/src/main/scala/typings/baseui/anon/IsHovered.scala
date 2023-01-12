package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsHovered extends StObject {
  
  var isFocusVisible: Boolean
  
  var isHovered: Boolean
}
object IsHovered {
  
  inline def apply(isFocusVisible: Boolean, isHovered: Boolean): IsHovered = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHovered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsHovered] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
  }
}
