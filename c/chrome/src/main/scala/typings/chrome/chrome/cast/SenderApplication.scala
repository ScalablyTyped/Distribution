package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SenderApplication extends js.Object {
  var packageId: js.UndefOr[String] = js.undefined
  var platform: SenderPlatform
  var url: js.UndefOr[String] = js.undefined
}

object SenderApplication {
  @scala.inline
  def apply(platform: SenderPlatform, packageId: String = null, url: String = null): SenderApplication = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderApplication]
  }
}

