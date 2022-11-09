package typings.blueprintjsSelect

import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.DefaultPopover2TargetHTMLProps
import typings.blueprintjsPopover2.mod.Popover2
import typings.blueprintjsSelect.anon.PartialOmitPopover2PropsD
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonSelectPopoverPropsMod {
  
  trait SelectPopoverProps extends StObject {
    
    /**
      * HTML attributes to spread to the popover content container element.
      */
    var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Props to spread to Popover2.
      *
      * Note that `content` cannot be changed, but you may apply some props to the content wrapper element
      * with `popoverContentProps`. Likewise, `targetProps` is no longer supported as it was in Blueprint v4, but you
      * may use `popoverTargetProps` instead.
      */
    var popoverProps: js.UndefOr[PartialOmitPopover2PropsD] = js.undefined
    
    /**
      * Optional ref for the Popover2 component instance.
      * This is sometimes useful to reposition the popover.
      *
      * Note that this is defined as a specific kind of Popover2 which should be compatible with
      * most use cases, since it uses the default target props interface.
      */
    var popoverRef: js.UndefOr[RefObject[Popover2[DefaultPopover2TargetHTMLProps]]] = js.undefined
    
    /**
      * HTML attributes to add to the popover target element.
      */
    var popoverTargetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
  }
  object SelectPopoverProps {
    
    inline def apply(): SelectPopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectPopoverProps]
    }
    
    extension [Self <: SelectPopoverProps](x: Self) {
      
      inline def setPopoverContentProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "popoverContentProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverContentPropsUndefined: Self = StObject.set(x, "popoverContentProps", js.undefined)
      
      inline def setPopoverProps(value: PartialOmitPopover2PropsD): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPopoverRef(value: RefObject[Popover2[DefaultPopover2TargetHTMLProps]]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setPopoverTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "popoverTargetProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverTargetPropsUndefined: Self = StObject.set(x, "popoverTargetProps", js.undefined)
    }
  }
}
