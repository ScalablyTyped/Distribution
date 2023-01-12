package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAnimateUnderline extends StObject {
  
  @JSName("$isAnimateUnderline")
  var $isAnimateUnderline: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
}
object IsAnimateUnderline {
  
  inline def apply(): IsAnimateUnderline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsAnimateUnderline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsAnimateUnderline] (val x: Self) extends AnyVal {
    
    inline def set$isAnimateUnderline(value: Boolean): Self = StObject.set(x, "$isAnimateUnderline", value.asInstanceOf[js.Any])
    
    inline def set$isAnimateUnderlineUndefined: Self = StObject.set(x, "$isAnimateUnderline", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
  }
}
