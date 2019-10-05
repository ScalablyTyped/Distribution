package typings.chromeDashApps

import typings.chromeDashApps.chrome.dns.ResolveCallbackResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdns extends js.Object {
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit
}

object Typeofdns {
  @scala.inline
  def apply(resolve: (String, js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]) => Unit): Typeofdns = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
  
    __obj.asInstanceOf[Typeofdns]
  }
}

