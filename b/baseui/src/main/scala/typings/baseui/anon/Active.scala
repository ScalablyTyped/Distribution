package typings.baseui.anon

import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$kind")
  var $kind: primary | secondary
}
object Active {
  
  inline def apply($isFocusVisible: Boolean, $kind: primary | secondary): Active = {
    val __obj = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $kind = $kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    inline def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$kind(value: primary | secondary): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
  }
}
