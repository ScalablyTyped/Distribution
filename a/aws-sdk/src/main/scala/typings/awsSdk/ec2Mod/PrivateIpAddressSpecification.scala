package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateIpAddressSpecification extends js.Object {
  /**
    * Indicates whether the private IPv4 address is the primary private IPv4 address. Only one IPv4 address can be designated as primary.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object PrivateIpAddressSpecification {
  @scala.inline
  def apply(): PrivateIpAddressSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIpAddressSpecification]
  }
  @scala.inline
  implicit class PrivateIpAddressSpecificationOps[Self <: PrivateIpAddressSpecification] (val x: Self) extends AnyVal {
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
    def setPrimary(value: Boolean): Self = this.set("Primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("Primary", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
  }
  
}

