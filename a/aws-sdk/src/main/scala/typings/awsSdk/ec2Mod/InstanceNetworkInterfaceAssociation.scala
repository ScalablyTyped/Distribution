package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceNetworkInterfaceAssociation extends js.Object {
  
  /**
    * The carrier IP address associated with the network interface.
    */
  var CarrierIp: js.UndefOr[String] = js.native
  
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}
object InstanceNetworkInterfaceAssociation {
  
  @scala.inline
  def apply(): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
  
  @scala.inline
  implicit class InstanceNetworkInterfaceAssociationOps[Self <: InstanceNetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    
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
    def setCarrierIp(value: String): Self = this.set("CarrierIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarrierIp: Self = this.set("CarrierIp", js.undefined)
    
    @scala.inline
    def setIpOwnerId(value: String): Self = this.set("IpOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpOwnerId: Self = this.set("IpOwnerId", js.undefined)
    
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("PublicDnsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDnsName: Self = this.set("PublicDnsName", js.undefined)
    
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
  }
}
