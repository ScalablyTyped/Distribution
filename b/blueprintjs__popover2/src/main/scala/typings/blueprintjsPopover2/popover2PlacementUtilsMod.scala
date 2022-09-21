package typings.blueprintjsPopover2

import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.popperjsCore.enumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popover2PlacementUtilsMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/popover2PlacementUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionToPlacement(position: PopoverPosition): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("positionToPlacement")(position.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
