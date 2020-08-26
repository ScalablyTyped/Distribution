package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
import typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
import typings.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
import typings.blueprintjsCore.blueprintjsCoreStrings.`left-top`
import typings.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
import typings.blueprintjsCore.blueprintjsCoreStrings.`right-top`
import typings.blueprintjsCore.blueprintjsCoreStrings.`top-left`
import typings.blueprintjsCore.blueprintjsCoreStrings.`top-right`
import typings.blueprintjsCore.blueprintjsCoreStrings.bottom
import typings.blueprintjsCore.blueprintjsCoreStrings.left
import typings.blueprintjsCore.blueprintjsCoreStrings.right
import typings.blueprintjsCore.blueprintjsCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/position", JSImport.Namespace)
@js.native
object positionMod extends js.Object {
  /* Inlined {  BOTTOM :'bottom',   BOTTOM_LEFT :'bottom-left',   BOTTOM_RIGHT :'bottom-right',   LEFT :'left',   LEFT_BOTTOM :'left-bottom',   LEFT_TOP :'left-top',   RIGHT :'right',   RIGHT_BOTTOM :'right-bottom',   RIGHT_TOP :'right-top',   TOP :'top',   TOP_LEFT :'top-left',   TOP_RIGHT :'top-right'}[keyof {  BOTTOM :'bottom',   BOTTOM_LEFT :'bottom-left',   BOTTOM_RIGHT :'bottom-right',   LEFT :'left',   LEFT_BOTTOM :'left-bottom',   LEFT_TOP :'left-top',   RIGHT :'right',   RIGHT_BOTTOM :'right-bottom',   RIGHT_TOP :'right-top',   TOP :'top',   TOP_LEFT :'top-left',   TOP_RIGHT :'top-right'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsCore.blueprintjsCoreStrings.`right-top`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-left`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`left-top`
    - typings.blueprintjsCore.blueprintjsCoreStrings.right
    - typings.blueprintjsCore.blueprintjsCoreStrings.`left-bottom`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`top-right`
    - typings.blueprintjsCore.blueprintjsCoreStrings.`top-left`
    - typings.blueprintjsCore.blueprintjsCoreStrings.left
    - typings.blueprintjsCore.blueprintjsCoreStrings.bottom
    - typings.blueprintjsCore.blueprintjsCoreStrings.`bottom-right`
    - typings.blueprintjsCore.blueprintjsCoreStrings.top
    - typings.blueprintjsCore.blueprintjsCoreStrings.`right-bottom`
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

