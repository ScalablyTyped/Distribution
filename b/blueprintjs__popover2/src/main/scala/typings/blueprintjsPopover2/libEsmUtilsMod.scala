package typings.blueprintjsPopover2

import typings.blueprintjsPopover2.anon.Left
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.bottom
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.center
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.left
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.right
import typings.blueprintjsPopover2.blueprintjsPopover2Strings.top
import typings.popperjsCore.libEnumsMod.BasePlacement
import typings.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmUtilsMod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAlignment(placement: Placement): right | left | center = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignment")(placement.asInstanceOf[js.Any]).asInstanceOf[right | left | center]
  
  inline def getBasePlacement(placement: Placement): BasePlacement = ^.asInstanceOf[js.Dynamic].applyDynamic("getBasePlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[BasePlacement]
  
  inline def getOppositePlacement(side: BasePlacement): top | bottom | right | left = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositePlacement")(side.asInstanceOf[js.Any]).asInstanceOf[top | bottom | right | left]
  
  inline def getTransformOrigin(placement: Placement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformOrigin")(placement.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTransformOrigin(placement: Placement, arrowStyles: Left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransformOrigin")(placement.asInstanceOf[js.Any], arrowStyles.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isVerticalPlacement(side: BasePlacement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalPlacement")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
