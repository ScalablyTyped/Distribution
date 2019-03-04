package typings
package cordovaDashPluginDashXDashSocialsharingLib.SocialSharingPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOptions extends js.Object {
  var chooserTitle: js.UndefOr[java.lang.String] = js.undefined
  var files: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var message: java.lang.String
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ShareOptions {
  @scala.inline
  def apply(
    message: java.lang.String,
    chooserTitle: java.lang.String = null,
    files: java.lang.String | js.Array[java.lang.String] = null,
    subject: java.lang.String = null,
    url: java.lang.String = null
  ): ShareOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (chooserTitle != null) __obj.updateDynamic("chooserTitle")(chooserTitle)
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ShareOptions]
  }
}

