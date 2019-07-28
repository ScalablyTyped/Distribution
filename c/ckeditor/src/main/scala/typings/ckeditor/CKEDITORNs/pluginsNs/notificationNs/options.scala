package typings.ckeditor.CKEDITORNs.pluginsNs.notificationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait options extends optionsBase {
  var message: String
}

object options {
  @scala.inline
  def apply(
    message: String,
    duration: Int | Double = null,
    progress: Int | Double = null,
    `type`: `type` = null
  ): options = {
    val __obj = js.Dynamic.literal(message = message)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[options]
  }
}

