package typings
package chromeDashAppsLib.chromeNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.dns")
@js.native
object ^ extends js.Object {
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(
    hostname: java.lang.String,
    callback: js.Function1[
      /* resolveInfo */ chromeDashAppsLib.chromeNs.dnsNs.ResolveCallbackResolveInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

