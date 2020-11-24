package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KubernetesNetworkConfigRequest extends js.Object {
  
  /**
    * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet the following requirements:   Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.   Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.   Between /24 and /12.    You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster is created. 
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.native
}
object KubernetesNetworkConfigRequest {
  
  @scala.inline
  def apply(): KubernetesNetworkConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigRequest]
  }
  
  @scala.inline
  implicit class KubernetesNetworkConfigRequestOps[Self <: KubernetesNetworkConfigRequest] (val x: Self) extends AnyVal {
    
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
