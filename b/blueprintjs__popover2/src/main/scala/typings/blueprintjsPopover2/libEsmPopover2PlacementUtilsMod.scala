package typings.blueprintjsPopover2

import typings.blueprintjsCore.libEsmComponentsPopoverPopoverSharedPropsMod.PopoverPosition
import typings.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPopover2PlacementUtilsMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2PlacementUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionToPlacement(position: PopoverPosition): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("positionToPlacement")(position.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
