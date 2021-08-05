package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.bottom
import typings.blueprintjsCore.blueprintjsCoreStrings.center
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.blueprintjsCoreStrings.top
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Placement
import typings.popperJs.mod.Popper.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "arrowOffsetModifier")
  @js.native
  val arrowOffsetModifier: ModifierFn = js.native
  
  inline def getAlignment(placement: Placement): center | left | right = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlignment")(placement.asInstanceOf[js.Any]).asInstanceOf[center | left | right]
  
  inline def getOppositePosition(side: Position): left | right | bottom | top = ^.asInstanceOf[js.Dynamic].applyDynamic("getOppositePosition")(side.asInstanceOf[js.Any]).asInstanceOf[left | right | bottom | top]
  
  inline def getPosition(placement: Placement): left | right | bottom | top = ^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(placement.asInstanceOf[js.Any]).asInstanceOf[left | right | bottom | top]
  
  inline def getTransformOrigin(data: Data): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransformOrigin")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isVerticalPosition(side: Position): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerticalPosition")(side.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
