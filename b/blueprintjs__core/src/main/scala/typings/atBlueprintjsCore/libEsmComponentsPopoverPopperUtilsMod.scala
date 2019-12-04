package typings.atBlueprintjsCore

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.center
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.top
import typings.popperDotJs.popperDotJsMod.Popper.Data
import typings.popperDotJs.popperDotJsMod.Popper.ModifierFn
import typings.popperDotJs.popperDotJsMod.Popper.Placement
import typings.popperDotJs.popperDotJsMod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
@js.native
object libEsmComponentsPopoverPopperUtilsMod extends js.Object {
  val arrowOffsetModifier: ModifierFn = js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  def getTransformOrigin(data: Data): String = js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}

