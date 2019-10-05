package typings.cordovaDashPluginDashXDashSocialsharing.SocialSharingPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
  var chooserTitle: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[String | js.Array[String]] = js.undefined
  var message: String
  var subject: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ShareOptions {
  @scala.inline
  def apply(
    message: String,
    chooserTitle: String = null,
    files: String | js.Array[String] = null,
    subject: String = null,
    url: String = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (chooserTitle != null) __obj.updateDynamic("chooserTitle")(chooserTitle)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ShareOptions]
  }
}

