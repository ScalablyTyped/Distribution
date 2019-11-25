package typings.ckeditor.CKEDITOR.plugins.notification

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

