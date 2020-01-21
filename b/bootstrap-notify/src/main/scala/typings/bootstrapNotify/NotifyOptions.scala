package typings.bootstrapNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var message: String
  var target: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    message: String,
    icon: String = null,
    target: String = null,
    title: String = null,
    url: String = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyOptions]
  }
}

