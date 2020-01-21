package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: BillingGroupProperties = js.native
  /**
    * The expected version of the billing group. If the version of the billing group does not match the expected version specified in the request, the UpdateBillingGroup request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
}

object UpdateBillingGroupRequest {
  @scala.inline
  def apply(
    billingGroupName: BillingGroupName,
    billingGroupProperties: BillingGroupProperties,
    expectedVersion: Int | Double = null
  ): UpdateBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any], billingGroupProperties = billingGroupProperties.asInstanceOf[js.Any])
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBillingGroupRequest]
  }
}

