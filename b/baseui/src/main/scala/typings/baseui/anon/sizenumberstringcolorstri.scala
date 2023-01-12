package typings.baseui.anon

import typings.baseui.toastTypesMod.KindType
import typings.baseui.toastTypesMod.NotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  $size :number | string,   $color :string} & baseui.baseui/toast/types.SharedStylePropsArg */
trait sizenumberstringcolorstri extends StObject {
  
  @JSName("$closeable")
  var $closeable: Boolean
  
  @JSName("$color")
  var $color: String
  
  @JSName("$isFocusVisible")
  var $isFocusVisible: Boolean
  
  @JSName("$isRendered")
  var $isRendered: Boolean
  
  @JSName("$isVisible")
  var $isVisible: Boolean
  
  @JSName("$kind")
  var $kind: KindType
  
  @JSName("$size")
  var $size: Double | String
  
  @JSName("$type")
  var $type: NotificationType
}
object sizenumberstringcolorstri {
  
  inline def apply(
    $closeable: Boolean,
    $color: String,
    $isFocusVisible: Boolean,
    $isRendered: Boolean,
    $isVisible: Boolean,
    $kind: KindType,
    $size: Double | String,
    $type: NotificationType
  ): sizenumberstringcolorstri = {
    val __obj = js.Dynamic.literal($closeable = $closeable.asInstanceOf[js.Any], $color = $color.asInstanceOf[js.Any], $isFocusVisible = $isFocusVisible.asInstanceOf[js.Any], $isRendered = $isRendered.asInstanceOf[js.Any], $isVisible = $isVisible.asInstanceOf[js.Any], $kind = $kind.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizenumberstringcolorstri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: sizenumberstringcolorstri] (val x: Self) extends AnyVal {
    
    inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def set$isRendered(value: Boolean): Self = StObject.set(x, "$isRendered", value.asInstanceOf[js.Any])
    
    inline def set$isVisible(value: Boolean): Self = StObject.set(x, "$isVisible", value.asInstanceOf[js.Any])
    
    inline def set$kind(value: KindType): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
    
    inline def set$size(value: Double | String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$type(value: NotificationType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
