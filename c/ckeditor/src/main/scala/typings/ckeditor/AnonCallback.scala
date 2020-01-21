package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var noSnapshot: js.UndefOr[Boolean] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    noSnapshot: js.UndefOr[Boolean] = js.undefined
  ): AnonCallback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (!js.isUndefined(noSnapshot)) __obj.updateDynamic("noSnapshot")(noSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

