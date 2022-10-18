package typings.blueprintjsCore

import typings.popperJs.mod.Placement
import typings.react.mod.FC
import typings.reactPopper.mod.PopperArrowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPopoverPopoverArrowMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverArrow", "PopoverArrow")
  @js.native
  val PopoverArrow: FC[IPopoverArrowProps] = js.native
  
  trait IPopoverArrowProps extends StObject {
    
    var arrowProps: PopperArrowProps
    
    var placement: Placement
  }
  object IPopoverArrowProps {
    
    inline def apply(arrowProps: PopperArrowProps, placement: Placement): IPopoverArrowProps = {
      val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverArrowProps]
    }
    
    extension [Self <: IPopoverArrowProps](x: Self) {
      
      inline def setArrowProps(value: PopperArrowProps): Self = StObject.set(x, "arrowProps", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
}
