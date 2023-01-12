package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRendered extends StObject {
  
  var isFocusVisible: Boolean
  
  var isRendered: Boolean
  
  var isVisible: Boolean
}
object IsRendered {
  
  inline def apply(isFocusVisible: Boolean, isRendered: Boolean, isVisible: Boolean): IsRendered = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRendered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsRendered] (val x: Self) extends AnyVal {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
  }
}
