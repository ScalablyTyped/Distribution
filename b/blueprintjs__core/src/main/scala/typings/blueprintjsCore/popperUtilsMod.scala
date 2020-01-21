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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
@js.native
object popperUtilsMod extends js.Object {
  val arrowOffsetModifier: ModifierFn = js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  def getTransformOrigin(data: Data): String = js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}

