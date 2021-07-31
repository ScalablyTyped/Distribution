package typings.blueprintjsCore

import typings.blueprintjsCore.popoverSharedPropsMod.PopoverPosition
import typings.popperJs.mod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMigrationUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popoverMigrationUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def positionToPlacement(position: PopoverPosition): Placement = ^.asInstanceOf[js.Dynamic].applyDynamic("positionToPlacement")(position.asInstanceOf[js.Any]).asInstanceOf[Placement]
}
