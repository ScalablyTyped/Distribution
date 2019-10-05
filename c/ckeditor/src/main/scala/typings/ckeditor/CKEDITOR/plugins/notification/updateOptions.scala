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
    duration: Int | Double = null,
    important: js.UndefOr[Boolean] = js.undefined,
    message: String = null,
    progress: Int | Double = null,
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

