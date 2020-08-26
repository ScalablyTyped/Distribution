package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIpAddressDetails extends js.Object {
  /**
    * The private DNS name of the EC2 instance.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IP address of the EC2 instance.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object PrivateIpAddressDetails {
  @scala.inline
  def apply(): PrivateIpAddressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIpAddressDetails]
  }
  @scala.inline
  implicit class PrivateIpAddressDetailsOps[Self <: PrivateIpAddressDetails] (val x: Self) extends AnyVal {
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
    def setPrivateDnsName(value: String): Self = this.set("PrivateDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateDnsName: Self = this.set("PrivateDnsName", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
  }
  
}

