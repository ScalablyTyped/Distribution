package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTlsCertificateResult extends js.Object {
  /**
    * An object representing the API operations. These SSL/TLS certificates are only usable by Lightsail load balancers. You can't get the certificate and use it for another purpose.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object AttachLoadBalancerTlsCertificateResult {
  @scala.inline
  def apply(operations: OperationList = null): AttachLoadBalancerTlsCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateResult]
  }
}

