package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerTlsCertificateResult extends js.Object {
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request. These SSL/TLS certificates are only usable by Lightsail load balancers. You can't get the certificate and use it for another purpose.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object AttachLoadBalancerTlsCertificateResult {
  @scala.inline
  def apply(): AttachLoadBalancerTlsCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachLoadBalancerTlsCertificateResult]
  }
  @scala.inline
  implicit class AttachLoadBalancerTlsCertificateResultOps[Self <: AttachLoadBalancerTlsCertificateResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: OperationList): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperations: Self = this.set("operations", js.undefined)
  }
  
}

