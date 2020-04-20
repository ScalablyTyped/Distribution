package typings.cloudflareApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudflareAppsProxy extends js.Object {
  var embedSiteId: String
  var hasRocketEmbed: Boolean
  var originalURL: OriginalURL
}

object CloudflareAppsProxy {
  @scala.inline
  def apply(embedSiteId: String, hasRocketEmbed: Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
    val __obj = js.Dynamic.literal(embedSiteId = embedSiteId.asInstanceOf[js.Any], hasRocketEmbed = hasRocketEmbed.asInstanceOf[js.Any], originalURL = originalURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudflareAppsProxy]
  }
}

