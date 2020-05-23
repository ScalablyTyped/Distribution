package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusInited extends js.Object {
  var focusInited: js.UndefOr[Boolean] = js.undefined
  var initOnlyNew: js.UndefOr[Boolean] = js.undefined
}

object FocusInited {
  @scala.inline
  def apply(focusInited: js.UndefOr[Boolean] = js.undefined, initOnlyNew: js.UndefOr[Boolean] = js.undefined): FocusInited = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusInited)) __obj.updateDynamic("focusInited")(focusInited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initOnlyNew)) __obj.updateDynamic("initOnlyNew")(initOnlyNew.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusInited]
  }
}

