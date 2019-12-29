package typings.atBlueprintjsCore

import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`bottom-left`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`bottom-right`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`left-bottom`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`left-top`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`right-bottom`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`right-top`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`top-left`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`top-right`
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
import typings.atBlueprintjsCore.atBlueprintjsCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/position", JSImport.Namespace)
@js.native
object libEsmCommonPositionMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`top-right`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.bottom
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`right-bottom`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.left
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`top-left`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`bottom-left`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.right
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.top
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`left-top`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`left-bottom`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`bottom-right`
    - typings.atBlueprintjsCore.atBlueprintjsCoreStrings.`right-top`
  */
  trait Position extends js.Object
  
  def getPositionIgnoreAngles(position: Position): left | right | bottom | top = js.native
  def isPositionHorizontal(position: Position): Boolean = js.native
  def isPositionVertical(position: Position): Boolean = js.native
  @js.native
  object Position extends js.Object {
    var BOTTOM: bottom = js.native
    var BOTTOM_LEFT: `bottom-left` = js.native
    var BOTTOM_RIGHT: `bottom-right` = js.native
    var LEFT: left = js.native
    var LEFT_BOTTOM: `left-bottom` = js.native
    var LEFT_TOP: `left-top` = js.native
    var RIGHT: right = js.native
    var RIGHT_BOTTOM: `right-bottom` = js.native
    var RIGHT_TOP: `right-top` = js.native
    var TOP: top = js.native
    var TOP_LEFT: `top-left` = js.native
    var TOP_RIGHT: `top-right` = js.native
  }
  
}

