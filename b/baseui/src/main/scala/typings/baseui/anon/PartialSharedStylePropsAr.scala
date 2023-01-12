package typings.baseui.anon

import typings.baseui.toastTypesMod.KindType
import typings.baseui.toastTypesMod.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/toast/types.SharedStylePropsArg> */
trait PartialSharedStylePropsAr extends StObject {
  
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$kind")
  var $kind: js.UndefOr[KindType] = js.undefined
  
  @JSName("$type")
  var $type: js.UndefOr[NotificationType] = js.undefined
}
object PartialSharedStylePropsAr {
  
  inline def apply(): PartialSharedStylePropsAr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSharedStylePropsAr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSharedStylePropsAr] (val x: Self) extends AnyVal {
    
    inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    inline def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
    
    inline def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
    
    inline def set$isRenderedUndefined: Self = StObject.set(x, "$isRendered", js.undefined)
    
    inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    inline def set$isVisibleUndefined: Self = StObject.set(x, "$isVisible", js.undefined)
    
    inline def set$kind(value: KindType): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
    
    inline def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
    
    inline def set$type(value: NotificationType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    inline def set$typeUndefined: Self = StObject.set(x, "$type", js.undefined)
  }
}
