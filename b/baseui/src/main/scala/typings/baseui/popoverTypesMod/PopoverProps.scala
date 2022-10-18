package typings.baseui.popoverTypesMod

import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverProps
  extends StObject
     with BasePopoverProps {
  
  /** Content that should trigger the popover to be shown (also acts as the anchor against
    * which the popover will be positioned).
    */
  var children: ReactNode
  
  /** Content to render within the popover when it's shown. */
  var content: ReactNode | ContentRenderProp
  
  /** Whether or not to show the popover. */
  var isOpen: Boolean
  
  /** Handler for clicks outside the anchor/popover elements. */
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, Any]] = js.undefined
  
  /** Handler for click events on trigger element. */
  var onEsc: js.UndefOr[js.Function0[Any]] = js.undefined
}
object PopoverProps {
  
  inline def apply(isOpen: Boolean): PopoverProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
  
  extension [Self <: PopoverProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContent(value: ReactNode | ContentRenderProp): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction0(value: () => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOnClickOutside(value: /* event */ MouseEvent => Any): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
    
    inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
    
    inline def setOnEsc(value: () => Any): Self = StObject.set(x, "onEsc", js.Any.fromFunction0(value))
    
    inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
  }
}
