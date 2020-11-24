package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KubernetesNetworkConfigResponse extends js.Object {
  
  /**
    * The CIDR block that Kubernetes service IP addresses are assigned from. If you didn't specify a CIDR block, then Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. If this was specified, then it was specified when the cluster was created and it cannot be changed.
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.native
}
object KubernetesNetworkConfigResponse {
  
  @scala.inline
  def apply(): KubernetesNetworkConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigResponse]
  }
  
  @scala.inline
  implicit class KubernetesNetworkConfigResponseOps[Self <: KubernetesNetworkConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setServiceIpv4Cidr(value: String): Self = this.set("serviceIpv4Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIpv4Cidr: Self = this.set("serviceIpv4Cidr", js.undefined)
  }
}
