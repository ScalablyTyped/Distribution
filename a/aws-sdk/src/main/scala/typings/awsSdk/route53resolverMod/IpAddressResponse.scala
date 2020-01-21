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
  def apply(
    CreationTime: Rfc3339TimeString = null,
    Ip: Ip = null,
    IpId: ResourceId = null,
    ModificationTime: Rfc3339TimeString = null,
    Status: IpAddressStatus = null,
    StatusMessage: StatusMessage = null,
    SubnetId: SubnetId = null
  ): IpAddressResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Ip != null) __obj.updateDynamic("Ip")(Ip.asInstanceOf[js.Any])
    if (IpId != null) __obj.updateDynamic("IpId")(IpId.asInstanceOf[js.Any])
    if (ModificationTime != null) __obj.updateDynamic("ModificationTime")(ModificationTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddressResponse]
  }
}

