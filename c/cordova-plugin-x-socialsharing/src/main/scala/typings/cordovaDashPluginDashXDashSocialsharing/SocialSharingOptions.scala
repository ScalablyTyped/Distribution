package typings.cordovaDashPluginDashXDashSocialsharing

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialSharingOptions extends js.Object {
  var appPackageName: js.UndefOr[String] = js.undefined
  var chooserTitle: js.UndefOr[String] = js.undefined
  var files: js.UndefOr[ArrayLike[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object SocialSharingOptions {
  @scala.inline
  def apply(
    appPackageName: String = null,
    chooserTitle: String = null,
    files: ArrayLike[String] = null,
    message: String = null,
    subject: String = null,
    url: String = null
  ): SocialSharingOptions = {
    val __obj = js.Dynamic.literal()
    if (appPackageName != null) __obj.updateDynamic("appPackageName")(appPackageName)
    if (chooserTitle != null) __obj.updateDynamic("chooserTitle")(chooserTitle)
    if (files != null) __obj.updateDynamic("files")(files)
    if (message != null) __obj.updateDynamic("message")(message)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SocialSharingOptions]
  }
}

