package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackHostname extends js.Object {
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
  ): scala.Unit
}

object Anon_CallbackHostname {
  @scala.inline
  def apply(
    resolve: js.Function2[
      java.lang.String, 
      js.Function1[
        /* resolveInfo */ chromeDashAppsLib.chromeNs.dnsNs.ResolveCallbackResolveInfo, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): Anon_CallbackHostname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Anon_CallbackHostname]
  }
}

