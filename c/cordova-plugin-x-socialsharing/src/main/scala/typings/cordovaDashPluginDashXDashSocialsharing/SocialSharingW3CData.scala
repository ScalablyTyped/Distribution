package typings.cordovaDashPluginDashXDashSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialSharingW3CData extends js.Object {
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object SocialSharingW3CData {
  @scala.inline
  def apply(text: String = null, title: String = null, url: String = null): SocialSharingW3CData = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SocialSharingW3CData]
  }
}

