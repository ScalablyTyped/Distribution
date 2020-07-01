package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CapacityProvider extends js.Object {
  /**
    * The Auto Scaling group settings for the capacity provider.
    */
  var autoScalingGroupProvider: js.UndefOr[AutoScalingGroupProvider] = js.native
  /**
    * The Amazon Resource Name (ARN) that identifies the capacity provider.
    */
  var capacityProviderArn: js.UndefOr[String] = js.native
  /**
    * The name of the capacity provider.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The current status of the capacity provider. Only capacity providers in an ACTIVE state can be used in a cluster. When a capacity provider is successfully deleted, it will have an INACTIVE status.
    */
  var status: js.UndefOr[CapacityProviderStatus] = js.native
  /**
    * The metadata that you apply to the capacity provider to help you categorize and organize it. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The update status of the capacity provider. The following are the possible states that will be returned.  DELETE_IN_PROGRESS  The capacity provider is in the process of being deleted.  DELETE_COMPLETE  The capacity provider has been successfully deleted and will have an INACTIVE status.  DELETE_FAILED  The capacity provider was unable to be deleted. The update status reason will provide further details about why the delete failed.  
    */
  var updateStatus: js.UndefOr[CapacityProviderUpdateStatus] = js.native
  /**
    * The update status reason. This provides further details about the update status for the capacity provider.
    */
  var updateStatusReason: js.UndefOr[String] = js.native
}

object CapacityProvider {
  @scala.inline
  def apply(
    autoScalingGroupProvider: AutoScalingGroupProvider = null,
    capacityProviderArn: String = null,
    name: String = null,
    status: CapacityProviderStatus = null,
    tags: Tags = null,
    updateStatus: CapacityProviderUpdateStatus = null,
    updateStatusReason: String = null
  ): CapacityProvider = {
    val __obj = js.Dynamic.literal()
    if (autoScalingGroupProvider != null) __obj.updateDynamic("autoScalingGroupProvider")(autoScalingGroupProvider.asInstanceOf[js.Any])
    if (capacityProviderArn != null) __obj.updateDynamic("capacityProviderArn")(capacityProviderArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (updateStatus != null) __obj.updateDynamic("updateStatus")(updateStatus.asInstanceOf[js.Any])
    if (updateStatusReason != null) __obj.updateDynamic("updateStatusReason")(updateStatusReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacityProvider]
  }
}

