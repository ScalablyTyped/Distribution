package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterRequest extends js.Object {
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The cluster ID of the cluster that you want to update, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId = js.native
  /**
    * The updated description of this cluster.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The updated ID for the forwarding address for a cluster. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * The updated arrays of JobResource objects that can include updated S3Resource objects or LambdaResource objects.
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this cluster. To create a role ARN, use the CreateRole API action in AWS Identity and Access Management (IAM).
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The updated shipping option value of this cluster's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
}

object UpdateClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
  @scala.inline
  implicit class UpdateClusterRequestOps[Self <: UpdateClusterRequest] (val x: Self) extends AnyVal {
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
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressId(value: AddressId): Self = this.set("AddressId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressId: Self = this.set("AddressId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setForwardingAddressId(value: AddressId): Self = this.set("ForwardingAddressId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingAddressId: Self = this.set("ForwardingAddressId", js.undefined)
    @scala.inline
    def setNotification(value: Notification): Self = this.set("Notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("Notification", js.undefined)
    @scala.inline
    def setResources(value: JobResource): Self = this.set("Resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("Resources", js.undefined)
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("ShippingOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShippingOption: Self = this.set("ShippingOption", js.undefined)
  }
  
}

