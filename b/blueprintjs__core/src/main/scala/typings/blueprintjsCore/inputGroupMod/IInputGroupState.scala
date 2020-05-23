package typings.blueprintjsCore.inputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputGroupState extends js.Object {
  var leftElementWidth: js.UndefOr[Double] = js.undefined
  var rightElementWidth: js.UndefOr[Double] = js.undefined
}

object IInputGroupState {
  @scala.inline
  def apply(
    leftElementWidth: js.UndefOr[Double] = js.undefined,
    rightElementWidth: js.UndefOr[Double] = js.undefined
  ): IInputGroupState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leftElementWidth)) __obj.updateDynamic("leftElementWidth")(leftElementWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightElementWidth)) __obj.updateDynamic("rightElementWidth")(rightElementWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputGroupState]
  }
}

