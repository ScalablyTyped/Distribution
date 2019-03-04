package typings
package cloudflareDashAppsLib.CloudflareAppsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudflareAppsProxy extends js.Object {
  var embedSiteId: java.lang.String
  var hasRocketEmbed: scala.Boolean
  var originalURL: OriginalURL
}

object CloudflareAppsProxy {
  @scala.inline
  def apply(embedSiteId: java.lang.String, hasRocketEmbed: scala.Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
    val __obj = js.Dynamic.literal(embedSiteId = embedSiteId, hasRocketEmbed = hasRocketEmbed, originalURL = originalURL)
  
    __obj.asInstanceOf[CloudflareAppsProxy]
  }
}

