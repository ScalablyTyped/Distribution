package typings.ckeditor.CKEDITOR.plugins.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait updateOptions extends optionsBase {
  var important: js.UndefOr[Boolean] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object updateOptions {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    important: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    progress: js.UndefOr[Double] = js.undefined,
    `type`: `type` = null
  ): updateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(important)) __obj.updateDynamic("important")(important.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[updateOptions]
  }
}

