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
  def apply(
    ClusterId: ClusterId,
    AddressId: AddressId = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null
  ): UpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterRequest]
  }
}

