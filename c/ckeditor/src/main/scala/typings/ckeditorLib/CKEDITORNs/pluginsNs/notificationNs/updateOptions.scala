package typings
package ckeditorLib.CKEDITORNs.pluginsNs.notificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait updateOptions extends optionsBase {
  var important: js.UndefOr[scala.Boolean] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object updateOptions {
  @scala.inline
  def apply(
    duration: scala.Int | scala.Double = null,
    important: js.UndefOr[scala.Boolean] = js.undefined,
    message: java.lang.String = null,
    progress: scala.Int | scala.Double = null,
    `type`: `type` = null
  ): updateOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important)
    if (message != null) __obj.updateDynamic("message")(message)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[updateOptions]
  }
}

