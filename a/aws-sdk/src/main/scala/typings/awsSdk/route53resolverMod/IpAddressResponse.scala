package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpAddressResponse extends js.Object {
  /**
    * The date and time that the IP address was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * One IP address that the resolver endpoint uses for DNS queries.
    */
  var Ip: js.UndefOr[typings.awsSdk.route53resolverMod.Ip] = js.native
  /**
    * The ID of one IP address.
    */
  var IpId: js.UndefOr[ResourceId] = js.native
  /**
    * The date and time that the IP address was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * A status code that gives the current status of the request.
    */
  var Status: js.UndefOr[IpAddressStatus] = js.native
  /**
    * A message that provides additional information about the status of the request.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.route53resolverMod.StatusMessage] = js.native
  /**
    * The ID of one subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.route53resolverMod.SubnetId] = js.native
}

object IpAddressResponse {
  @scala.inline
  def apply(): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressResponse]
  }
  @scala.inline
  implicit class IpAddressResponseOps[Self <: IpAddressResponse] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Rfc3339TimeString): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setIp(value: Ip): Self = this.set("Ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("Ip", js.undefined)
    @scala.inline
    def setIpId(value: ResourceId): Self = this.set("IpId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpId: Self = this.set("IpId", js.undefined)
    @scala.inline
    def setModificationTime(value: Rfc3339TimeString): Self = this.set("ModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModificationTime: Self = this.set("ModificationTime", js.undefined)
    @scala.inline
    def setStatus(value: IpAddressStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

