package typings.blueprintjsCore.textAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextAreaState extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
}

object ITextAreaState {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined): ITextAreaState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextAreaState]
  }
}

