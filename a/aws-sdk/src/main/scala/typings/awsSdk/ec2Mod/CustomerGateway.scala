package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerGateway extends js.Object {
  
  /**
    * The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
    */
  var BgpAsn: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the customer gateway certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the customer gateway.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.native
  
  /**
    * The name of customer gateway device.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * The Internet-routable IP address of the customer gateway's outside interface.
    */
  var IpAddress: js.UndefOr[String] = js.native
  
  /**
    * The current state of the customer gateway (pending | available | deleting | deleted).
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * Any tags assigned to the customer gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of VPN connection the customer gateway supports (ipsec.1).
    */
  var Type: js.UndefOr[String] = js.native
}
object CustomerGateway {
  
  @scala.inline
  def apply(): CustomerGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerGateway]
  }
  
  @scala.inline
  implicit class CustomerGatewayOps[Self <: CustomerGateway] (val x: Self) extends AnyVal {
    
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
    def setBgpAsn(value: String): Self = this.set("BgpAsn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgpAsn: Self = this.set("BgpAsn", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: String): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setCustomerGatewayId(value: String): Self = this.set("CustomerGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerGatewayId: Self = this.set("CustomerGatewayId", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("DeviceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
