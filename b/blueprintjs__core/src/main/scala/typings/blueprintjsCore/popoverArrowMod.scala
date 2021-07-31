package typings.blueprintjsCore

import typings.popperJs.mod.Placement
import typings.react.mod.FunctionComponent
import typings.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverArrowMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverArrow", "PopoverArrow")
  @js.native
  val PopoverArrow: FunctionComponent[IPopoverArrowProps] = js.native
  
  trait IPopoverArrowProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    var placement: Placement
  }
  object IPopoverArrowProps {
    
    @scala.inline
    def apply(arrowProps: PopperArrowProps, placement: Placement): IPopoverArrowProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverArrowProps]
    }
    
    @scala.inline
    implicit class IPopoverArrowPropsMutableBuilder[Self <: IPopoverArrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
}
