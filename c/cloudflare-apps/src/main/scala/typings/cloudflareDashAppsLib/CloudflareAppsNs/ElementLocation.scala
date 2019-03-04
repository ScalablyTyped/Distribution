package typings
package cloudflareDashAppsLib.CloudflareAppsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends js.Object {
  var method: cloudflareDashAppsLib.cloudflareDashAppsLibStrings.before | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.prepend | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.append | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.after | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.replace
  var selector: java.lang.String
}

object ElementLocation {
  @scala.inline
  def apply(
    method: cloudflareDashAppsLib.cloudflareDashAppsLibStrings.before | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.prepend | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.append | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.after | cloudflareDashAppsLib.cloudflareDashAppsLibStrings.replace,
    selector: java.lang.String
  ): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector)
  
    __obj.asInstanceOf[ElementLocation]
  }
}

