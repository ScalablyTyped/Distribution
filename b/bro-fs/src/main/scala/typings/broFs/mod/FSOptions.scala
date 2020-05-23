package typings.broFs.mod

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
    bytes: js.UndefOr[Double] = js.undefined,
    requestQuota: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Double] = js.undefined
  ): FSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bytes)) __obj.updateDynamic("bytes")(bytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestQuota)) __obj.updateDynamic("requestQuota")(requestQuota.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSOptions]
  }
}

