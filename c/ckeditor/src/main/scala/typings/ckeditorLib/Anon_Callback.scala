package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var internal: js.UndefOr[scala.Boolean] = js.undefined
  var noSnapshot: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: () => scala.Unit = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    noSnapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (!js.isUndefined(noSnapshot)) __obj.updateDynamic("noSnapshot")(noSnapshot)
    __obj.asInstanceOf[Anon_Callback]
  }
}

