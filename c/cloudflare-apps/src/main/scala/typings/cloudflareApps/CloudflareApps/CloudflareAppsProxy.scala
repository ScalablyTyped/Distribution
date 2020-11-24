package typings.cloudflareApps.CloudflareApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudflareAppsProxy extends js.Object {
  
  var embedSiteId: String = js.native
  
  var hasRocketEmbed: Boolean = js.native
  
  var originalURL: OriginalURL = js.native
}
object CloudflareAppsProxy {
  
  @scala.inline
  def apply(embedSiteId: String, hasRocketEmbed: Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
    val __obj = js.Dynamic.literal(embedSiteId = embedSiteId.asInstanceOf[js.Any], hasRocketEmbed = hasRocketEmbed.asInstanceOf[js.Any], originalURL = originalURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudflareAppsProxy]
  }
  
  @scala.inline
  implicit class CloudflareAppsProxyOps[Self <: CloudflareAppsProxy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmbedSiteId(value: String): Self = this.set("embedSiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRocketEmbed(value: Boolean): Self = this.set("hasRocketEmbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalURL(value: OriginalURL): Self = this.set("originalURL", value.asInstanceOf[js.Any])
  }
}
