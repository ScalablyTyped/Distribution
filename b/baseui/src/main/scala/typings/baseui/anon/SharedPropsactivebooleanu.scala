package typings.baseui.anon

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/tabs.SharedProps & {  $active :boolean | undefined} */
trait SharedPropsactivebooleanu extends StObject {
  
  @JSName("$active")
  var $active: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$orientation")
  var $orientation: js.UndefOr[horizontal | vertical] = js.undefined
}
object SharedPropsactivebooleanu {
  
  inline def apply(): SharedPropsactivebooleanu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPropsactivebooleanu]
  }
  
  extension [Self <: SharedPropsactivebooleanu](x: Self) {
    
    inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    inline def set$activeUndefined: Self = StObject.set(x, "$active", js.undefined)
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$orientation(value: horizontal | vertical): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
    
    inline def set$orientationUndefined: Self = StObject.set(x, "$orientation", js.undefined)
  }
}
