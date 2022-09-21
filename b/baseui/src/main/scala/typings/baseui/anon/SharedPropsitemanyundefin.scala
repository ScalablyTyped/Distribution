package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/side-navigation/types.SharedProps & {  item :any | undefined} */
trait SharedPropsitemanyundefin extends StObject {
  
  /** Defines if the nav item is currently selected */
  @JSName("$active")
  var $active: Boolean
  
  /** Defines if the nav item is disabled */
  @JSName("$disabled")
  var $disabled: Boolean
  
  /** Defines the nesting level of the rendered nav item */
  @JSName("$level")
  var $level: Double
  
  /** Defines if the nav item is selectable/clickable */
  @JSName("$selectable")
  var $selectable: Boolean
  
  var item: js.UndefOr[Any] = js.undefined
}
object SharedPropsitemanyundefin {
  
  inline def apply($active: Boolean, $disabled: Boolean, $level: Double, $selectable: Boolean): SharedPropsitemanyundefin = {
    val __obj = js.Dynamic.literal($active = $active.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $level = $level.asInstanceOf[js.Any], $selectable = $selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedPropsitemanyundefin]
  }
  
  extension [Self <: SharedPropsitemanyundefin](x: Self) {
    
    inline def set$active(value: Boolean): Self = StObject.set(x, "$active", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$level(value: Double): Self = StObject.set(x, "$level", value.asInstanceOf[js.Any])
    
    inline def set$selectable(value: Boolean): Self = StObject.set(x, "$selectable", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
