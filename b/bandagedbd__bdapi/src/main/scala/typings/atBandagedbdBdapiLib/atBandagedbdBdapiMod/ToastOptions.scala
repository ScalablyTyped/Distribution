package typings
package atBandagedbdBdapiLib.atBandagedbdBdapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends js.Object {
  var icon: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ToastOptions {
  @scala.inline
  def apply(
    icon: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ToastOptions]
  }
}

