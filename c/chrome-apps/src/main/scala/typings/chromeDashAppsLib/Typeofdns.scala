package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdns extends js.Object {
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

object Typeofdns {
  @scala.inline
  def apply(
    resolve: (java.lang.String, js.Function1[
      /* resolveInfo */ chromeDashAppsLib.chromeNs.dnsNs.ResolveCallbackResolveInfo, 
      scala.Unit
    ]) => scala.Unit
  ): Typeofdns = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
  
    __obj.asInstanceOf[Typeofdns]
  }
}

