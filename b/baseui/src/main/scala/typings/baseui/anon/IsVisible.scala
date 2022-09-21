package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVisible extends StObject {
  
  var isFocusVisible: Boolean
  
  var isVisible: Boolean
  
  var mounted: Boolean
}
object IsVisible {
  
  inline def apply(isFocusVisible: Boolean, isVisible: Boolean, mounted: Boolean): IsVisible = {
    val __obj = js.Dynamic.literal(isFocusVisible = isFocusVisible.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], mounted = mounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVisible]
  }
  
  extension [Self <: IsVisible](x: Self) {
    
    inline def setIsFocusVisible(value: Boolean): Self = StObject.set(x, "isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setMounted(value: Boolean): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
  }
}
