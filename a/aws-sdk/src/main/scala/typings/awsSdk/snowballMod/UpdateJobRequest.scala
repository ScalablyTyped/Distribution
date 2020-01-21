package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobRequest extends js.Object {
  /**
    * The ID of the updated Address object.
    */
  var AddressId: js.UndefOr[typings.awsSdk.snowballMod.AddressId] = js.native
  /**
    * The updated description of this job's JobMetadata object.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The updated ID for the forwarding address for a job. This field is not supported in most regions.
    */
  var ForwardingAddressId: js.UndefOr[AddressId] = js.native
  /**
    * The job ID of the job that you want to update, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
  /**
    * The new or updated Notification object.
    */
  var Notification: js.UndefOr[typings.awsSdk.snowballMod.Notification] = js.native
  /**
    * The updated JobResource object, or the updated JobResource object. 
    */
  var Resources: js.UndefOr[JobResource] = js.native
  /**
    * The new role Amazon Resource Name (ARN) that you want to associate with this job. To create a role ARN, use the CreateRoleAWS Identity and Access Management (IAM) API action.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.snowballMod.RoleARN] = js.native
  /**
    * The updated shipping option value of this job's ShippingDetails object.
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
  /**
    * The updated SnowballCapacityPreference of this job's JobMetadata object. The 50 TB Snowballs are only available in the US regions.
    */
  var SnowballCapacityPreference: js.UndefOr[SnowballCapacity] = js.native
}

object UpdateJobRequest {
  @scala.inline
  def apply(
    JobId: JobId,
    AddressId: AddressId = null,
    Description: String = null,
    ForwardingAddressId: AddressId = null,
    Notification: Notification = null,
    Resources: JobResource = null,
    RoleARN: RoleARN = null,
    ShippingOption: ShippingOption = null,
    SnowballCapacityPreference: SnowballCapacity = null
  ): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    if (AddressId != null) __obj.updateDynamic("AddressId")(AddressId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ForwardingAddressId != null) __obj.updateDynamic("ForwardingAddressId")(ForwardingAddressId.asInstanceOf[js.Any])
    if (Notification != null) __obj.updateDynamic("Notification")(Notification.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    if (ShippingOption != null) __obj.updateDynamic("ShippingOption")(ShippingOption.asInstanceOf[js.Any])
    if (SnowballCapacityPreference != null) __obj.updateDynamic("SnowballCapacityPreference")(SnowballCapacityPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
}

