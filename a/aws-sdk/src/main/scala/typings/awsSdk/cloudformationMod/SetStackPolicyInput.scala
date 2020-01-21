package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetStackPolicyInput extends js.Object {
  /**
    * The name or unique stack ID that you want to associate a policy with.
    */
  var StackName: typings.awsSdk.cloudformationMod.StackName = js.native
  /**
    * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyBody: js.UndefOr[typings.awsSdk.cloudformationMod.StackPolicyBody] = js.native
  /**
    * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyURL: js.UndefOr[typings.awsSdk.cloudformationMod.StackPolicyURL] = js.native
}

object SetStackPolicyInput {
  @scala.inline
  def apply(
    StackName: StackName,
    StackPolicyBody: StackPolicyBody = null,
    StackPolicyURL: StackPolicyURL = null
  ): SetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    if (StackPolicyBody != null) __obj.updateDynamic("StackPolicyBody")(StackPolicyBody.asInstanceOf[js.Any])
    if (StackPolicyURL != null) __obj.updateDynamic("StackPolicyURL")(StackPolicyURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStackPolicyInput]
  }
}

