package typings.cloudflareDashApps.CloudflareAppsNs

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
    val __obj = js.Dynamic.literal(embedSiteId = embedSiteId, hasRocketEmbed = hasRocketEmbed, originalURL = originalURL)
  
    __obj.asInstanceOf[CloudflareAppsProxy]
  }
}

