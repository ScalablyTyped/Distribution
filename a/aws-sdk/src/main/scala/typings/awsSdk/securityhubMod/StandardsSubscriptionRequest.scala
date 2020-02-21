package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardsSubscriptionRequest extends js.Object {
  /**
    * The ARN of the standard that you want to enable. To view the list of available standards and their ARNs, use the  DescribeStandards  operation.
    */
  var StandardsArn: NonEmptyString = js.native
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.native
}

object StandardsSubscriptionRequest {
  @scala.inline
  def apply(StandardsArn: NonEmptyString, StandardsInput: StandardsInputParameterMap = null): StandardsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any])
    if (StandardsInput != null) __obj.updateDynamic("StandardsInput")(StandardsInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscriptionRequest]
  }
}

