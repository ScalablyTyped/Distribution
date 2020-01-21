package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLifecyclePolicyRequest extends js.Object {
  /**
    * A description of the lifecycle policy. The characters ^[0-9A-Za-z _-]+$ are supported.
    */
  var Description: PolicyDescription = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used to run the operations specified by the lifecycle policy.
    */
  var ExecutionRoleArn: typings.awsSdk.dlmMod.ExecutionRoleArn = js.native
  /**
    * The configuration details of the lifecycle policy.
    */
  var PolicyDetails: typings.awsSdk.dlmMod.PolicyDetails = js.native
  /**
    * The desired activation state of the lifecycle policy after creation.
    */
  var State: SettablePolicyStateValues = js.native
  /**
    * The tags to apply to the lifecycle policy during creation.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateLifecyclePolicyRequest {
  @scala.inline
  def apply(
    Description: PolicyDescription,
    ExecutionRoleArn: ExecutionRoleArn,
    PolicyDetails: PolicyDetails,
    State: SettablePolicyStateValues,
    Tags: TagMap = null
  ): CreateLifecyclePolicyRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], PolicyDetails = PolicyDetails.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyRequest]
  }
}

