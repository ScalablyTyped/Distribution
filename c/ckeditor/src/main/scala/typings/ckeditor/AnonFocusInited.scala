package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusInited extends js.Object {
  var focusInited: js.UndefOr[Boolean] = js.undefined
  var initOnlyNew: js.UndefOr[Boolean] = js.undefined
}

object AnonFocusInited {
  @scala.inline
  def apply(focusInited: js.UndefOr[Boolean] = js.undefined, initOnlyNew: js.UndefOr[Boolean] = js.undefined): AnonFocusInited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusInited)) __obj.updateDynamic("focusInited")(focusInited.asInstanceOf[js.Any])
    if (!js.isUndefined(initOnlyNew)) __obj.updateDynamic("initOnlyNew")(initOnlyNew.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusInited]
  }
}

