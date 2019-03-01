package typings
package cloudflareDashAppsLib.CloudflareAppsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginalURLParsed extends js.Object {
  var fragment: java.lang.String
  var host: java.lang.String
  var path: java.lang.String
  var query: URLQuery
  var scheme: cloudflareDashAppsLib.cloudflareDashAppsLibStrings.https | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.http
}

object OriginalURLParsed {
  @scala.inline
  def apply(
    fragment: java.lang.String,
    host: java.lang.String,
    path: java.lang.String,
    query: URLQuery,
    scheme: cloudflareDashAppsLib.cloudflareDashAppsLibStrings.https | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.http
  ): OriginalURLParsed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fragment")(fragment)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalURLParsed]
  }
}

