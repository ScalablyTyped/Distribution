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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popperUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "arrowOffsetModifier")
  @js.native
  val arrowOffsetModifier: ModifierFn = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getAlignment")
  @js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getOppositePosition")
  @js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getPosition")
  @js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "getTransformOrigin")
  @js.native
  def getTransformOrigin(data: Data): String = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", "isVerticalPosition")
  @js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}
