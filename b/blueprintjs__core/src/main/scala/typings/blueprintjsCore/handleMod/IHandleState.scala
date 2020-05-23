package typings.blueprintjsCore.handleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandleState extends js.Object {
  /** whether slider handle is currently being dragged */
  var isMoving: js.UndefOr[Boolean] = js.undefined
}

object IHandleState {
  @scala.inline
  def apply(isMoving: js.UndefOr[Boolean] = js.undefined): IHandleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMoving)) __obj.updateDynamic("isMoving")(isMoving.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandleState]
  }
}

