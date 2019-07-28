package typings.ckeditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var noSnapshot: js.UndefOr[Boolean] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: () => Unit = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    noSnapshot: js.UndefOr[Boolean] = js.undefined
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (!js.isUndefined(noSnapshot)) __obj.updateDynamic("noSnapshot")(noSnapshot)
    __obj.asInstanceOf[Anon_Callback]
  }
}

