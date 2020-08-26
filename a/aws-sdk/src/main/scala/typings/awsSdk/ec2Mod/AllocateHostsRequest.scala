package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateHostsRequest extends js.Object {
  /**
    * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see  Understanding Instance Placement and Host Affinity in the Amazon EC2 User Guide for Linux Instances. Default: on 
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.ec2Mod.AutoPlacement] = js.native
  /**
    * The Availability Zone in which to allocate the Dedicated Host.
    */
  var AvailabilityZone: String = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide. Default: off 
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.ec2Mod.HostRecovery] = js.native
  /**
    * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The number of Dedicated Hosts to allocate to your account with these parameters.
    */
  var Quantity: Integer = js.native
  /**
    * The tags to apply to the Dedicated Host during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object AllocateHostsRequest {
  @scala.inline
  def apply(AvailabilityZone: String, Quantity: Integer): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostsRequest]
  }
  @scala.inline
  implicit class AllocateHostsRequestOps[Self <: AllocateHostsRequest] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantity(value: Integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPlacement(value: AutoPlacement): Self = this.set("AutoPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlacement: Self = this.set("AutoPlacement", js.undefined)
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setHostRecovery(value: HostRecovery): Self = this.set("HostRecovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostRecovery: Self = this.set("HostRecovery", js.undefined)
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

