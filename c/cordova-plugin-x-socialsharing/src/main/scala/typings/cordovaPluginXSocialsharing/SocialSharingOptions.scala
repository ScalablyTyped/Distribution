package typings.cordovaPluginXSocialsharing

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
    if (appPackageName != null) __obj.updateDynamic("appPackageName")(appPackageName.asInstanceOf[js.Any])
    if (chooserTitle != null) __obj.updateDynamic("chooserTitle")(chooserTitle.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSharingOptions]
  }
}

