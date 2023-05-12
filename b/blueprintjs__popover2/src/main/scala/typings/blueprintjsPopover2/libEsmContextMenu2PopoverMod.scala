package typings.blueprintjsPopover2

import typings.blueprintjsPopover2.libEsmContextMenu2SharedMod.ContextMenu2PopoverOptions
import typings.blueprintjsPopover2.libEsmContextMenu2SharedMod.Offset
import typings.react.mod.NamedExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmContextMenu2PopoverMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/contextMenu2Popover", "ContextMenu2Popover")
  @js.native
  val ContextMenu2Popover: NamedExoticComponent[ContextMenu2PopoverProps] = js.native
  
  trait ContextMenu2PopoverProps
    extends StObject
       with ContextMenu2PopoverOptions {
    
    var content: Element
    
    var isDarkTheme: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: Boolean
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var targetOffset: js.UndefOr[Offset] = js.undefined
  }
  object ContextMenu2PopoverProps {
    
    inline def apply(content: Element, isOpen: Boolean): ContextMenu2PopoverProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenu2PopoverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenu2PopoverProps] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIsDarkTheme(value: Boolean): Self = StObject.set(x, "isDarkTheme", value.asInstanceOf[js.Any])
      
      inline def setIsDarkThemeUndefined: Self = StObject.set(x, "isDarkTheme", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setTargetOffset(value: Offset): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
    }
  }
}
