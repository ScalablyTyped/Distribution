package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfacePrivateIpAddress extends js.Object {
  /**
    * The association information for an Elastic IP address (IPv4) associated with the network interface.
    */
  var Association: js.UndefOr[NetworkInterfaceAssociation] = js.native
  /**
    * Indicates whether this IPv4 address is the primary private IPv4 address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object NetworkInterfacePrivateIpAddress {
  @scala.inline
  def apply(): NetworkInterfacePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePrivateIpAddress]
  }
  @scala.inline
  implicit class NetworkInterfacePrivateIpAddressOps[Self <: NetworkInterfacePrivateIpAddress] (val x: Self) extends AnyVal {
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
    def setAssociation(value: NetworkInterfaceAssociation): Self = this.set("Association", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociation: Self = this.set("Association", js.undefined)
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("Primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("Primary", js.undefined)
    @scala.inline
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
  }
  
}

