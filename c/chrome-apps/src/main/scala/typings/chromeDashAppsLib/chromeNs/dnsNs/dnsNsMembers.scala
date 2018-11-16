package typings
package chromeDashAppsLib.chromeNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.dns")
@js.native
object dnsNsMembers extends js.Object {
  /**
           * Resolves the given hostname or IP address literal.
           * @param hostname The hostname to resolve.
           * @param callback Called when the resolution operation completes.
           */
  def resolve(
    hostname: java.lang.String,
    callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, scala.Unit]
  ): scala.Unit = js.native
}

