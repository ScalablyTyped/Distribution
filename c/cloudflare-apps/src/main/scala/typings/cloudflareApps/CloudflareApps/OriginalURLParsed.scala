package typings.cloudflareApps.CloudflareApps

import typings.cloudflareApps.cloudflareAppsStrings.http
import typings.cloudflareApps.cloudflareAppsStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalURLParsed extends js.Object {
  var fragment: String
  var host: String
  var path: String
  var query: URLQuery
  var scheme: https | http
}

object OriginalURLParsed {
  @scala.inline
  def apply(fragment: String, host: String, path: String, query: URLQuery, scheme: https | http): OriginalURLParsed = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginalURLParsed]
  }
}

