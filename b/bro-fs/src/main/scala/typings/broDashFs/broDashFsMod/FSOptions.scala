package typings.broDashFs.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSOptions extends js.Object {
  var bytes: js.UndefOr[Double] = js.undefined
  /**
    * show request quota popup for PERSISTENT type
    * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
    */
  var requestQuota: js.UndefOr[Boolean] = js.undefined
  /** `window.PERSISTENT` | `window.TEMPORARY` */
  var `type`: js.UndefOr[Double] = js.undefined
}

object FSOptions {
  @scala.inline
  def apply(
    bytes: Int | Double = null,
    requestQuota: js.UndefOr[Boolean] = js.undefined,
    `type`: Int | Double = null
  ): FSOptions = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (!js.isUndefined(requestQuota)) __obj.updateDynamic("requestQuota")(requestQuota)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSOptions]
  }
}

