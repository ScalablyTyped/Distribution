package typings.cloudflareApps.CloudflareApps

import typings.cloudflareApps.cloudflareAppsStrings.http
import typings.cloudflareApps.cloudflareAppsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalURLParsed extends js.Object {
  var fragment: String = js.native
  var host: String = js.native
  var path: String = js.native
  var query: URLQuery = js.native
  var scheme: https | http = js.native
}

object OriginalURLParsed {
  @scala.inline
  def apply(fragment: String, host: String, path: String, query: URLQuery, scheme: https | http): OriginalURLParsed = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalURLParsed]
  }
  @scala.inline
  implicit class OriginalURLParsedOps[Self <: OriginalURLParsed] (val x: Self) extends AnyVal {
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
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: URLQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: https | http): Self = this.set("scheme", value.asInstanceOf[js.Any])
  }
  
}

