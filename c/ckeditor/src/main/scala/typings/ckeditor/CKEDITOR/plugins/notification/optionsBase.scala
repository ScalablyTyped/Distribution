package typings.ckeditor.CKEDITOR.plugins.notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait optionsBase extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var progress: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[typings.ckeditor.CKEDITOR.plugins.notification.`type`] = js.undefined
}

object optionsBase {
  @scala.inline
  def apply(duration: Int | Double = null, progress: Int | Double = null, `type`: `type` = null): optionsBase = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsBase]
  }
}

