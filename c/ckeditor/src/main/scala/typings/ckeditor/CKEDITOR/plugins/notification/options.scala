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
    duration: js.UndefOr[Double] = js.undefined,
    progress: js.UndefOr[Double] = js.undefined,
    `type`: `type` = null
  ): options = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[options]
  }
}

