package typings.ckeditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var noSnapshot: js.UndefOr[Boolean] = js.undefined
}

object Callback {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    noSnapshot: js.UndefOr[Boolean] = js.undefined
  ): Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noSnapshot)) __obj.updateDynamic("noSnapshot")(noSnapshot.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

