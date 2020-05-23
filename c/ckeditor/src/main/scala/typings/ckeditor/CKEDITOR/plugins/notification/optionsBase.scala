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
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    progress: js.UndefOr[Double] = js.undefined,
    `type`: `type` = null
  ): optionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[optionsBase]
  }
}

