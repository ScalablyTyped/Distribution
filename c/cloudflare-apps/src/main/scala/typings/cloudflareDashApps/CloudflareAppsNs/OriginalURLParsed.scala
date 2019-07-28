package typings.cloudflareDashApps.CloudflareAppsNs

import typings.cloudflareDashApps.cloudflareDashAppsStrings.http
import typings.cloudflareDashApps.cloudflareDashAppsStrings.https
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
    val __obj = js.Dynamic.literal(fragment = fragment, host = host, path = path, query = query, scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OriginalURLParsed]
  }
}

