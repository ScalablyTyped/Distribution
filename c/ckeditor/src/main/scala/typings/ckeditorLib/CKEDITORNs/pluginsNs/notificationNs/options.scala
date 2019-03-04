package typings
package ckeditorLib.CKEDITORNs.pluginsNs.notificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends optionsBase {
  var message: java.lang.String
}

object options {
  @scala.inline
  def apply(
    message: java.lang.String,
    duration: scala.Int | scala.Double = null,
    progress: scala.Int | scala.Double = null,
    `type`: `type` = null
  ): options = {
    val __obj = js.Dynamic.literal(message = message)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[options]
  }
}

