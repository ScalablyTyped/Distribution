package typings
package bootstrapDashNotifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyOptions extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var target: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object NotifyOptions {
  @scala.inline
  def apply(
    message: java.lang.String,
    icon: java.lang.String = null,
    target: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NotifyOptions]
  }
}

