package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectAllRequestsTo extends js.Object {
  /**
    * Name of the host where requests are redirected.
    */
  var HostName: typings.awsSdk.s3Mod.HostName = js.native
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[typings.awsSdk.s3Mod.Protocol] = js.native
}

object RedirectAllRequestsTo {
  @scala.inline
  def apply(HostName: HostName, Protocol: Protocol = null): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName.asInstanceOf[js.Any])
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
}

