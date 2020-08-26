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
  def apply(StandardsArn: NonEmptyString): StandardsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscriptionRequest]
  }
  @scala.inline
  implicit class StandardsSubscriptionRequestOps[Self <: StandardsSubscriptionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStandardsArn(value: NonEmptyString): Self = this.set("StandardsArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandardsInput(value: StandardsInputParameterMap): Self = this.set("StandardsInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardsInput: Self = this.set("StandardsInput", js.undefined)
  }
  
}

