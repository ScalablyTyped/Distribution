package typings.blueprintjsSelect

import typings.blueprintjsPopover2.mod.Popover2
import typings.blueprintjsSelect.anon.PartialOmitPopover2PropsH
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonSelectPopoverPropsMod {
  
  trait SelectPopoverProps extends StObject {
    
    /** Props to spread to `Popover2` content wrapper eleemnt. */
    var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Props to spread to `Popover2`.
      * Note that `content` cannot be changed aside from utilizing `popoverContentProps`.
      */
    var popoverProps: js.UndefOr[PartialOmitPopover2PropsH] = js.undefined
    
    /**
      * Optional ref for the Popover2 component instance.
      * This is sometimes useful to reposition the popover.
      */
    var popoverRef: js.UndefOr[RefObject[Popover2[HTMLProps[HTMLDivElement]]]] = js.undefined
  }
  object SelectPopoverProps {
    
    inline def apply(): SelectPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectPopoverProps]
    }
    
    extension [Self <: SelectPopoverProps](x: Self) {
      
      inline def setPopoverContentProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "popoverContentProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverContentPropsUndefined: Self = StObject.set(x, "popoverContentProps", js.undefined)
      
      inline def setPopoverProps(value: PartialOmitPopover2PropsH): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPopoverRef(value: RefObject[Popover2[HTMLProps[HTMLDivElement]]]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
    }
  }
}
