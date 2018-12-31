package typings
package broDashFsLib.broDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSOptions extends js.Object {
  var bytes: js.UndefOr[scala.Double] = js.undefined
  /**
    * show request quota popup for PERSISTENT type
    * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
    */
  var requestQuota: js.UndefOr[scala.Boolean] = js.undefined
  /** `window.PERSISTENT` | `window.TEMPORARY` */
  var `type`: js.UndefOr[scala.Double] = js.undefined
}

