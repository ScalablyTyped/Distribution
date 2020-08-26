package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActionTargetsRequest extends js.Object {
  /**
    * A list of custom action target ARNs for the custom action targets to retrieve.
    */
  var ActionTargetArns: js.UndefOr[ArnList] = js.native
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the DescribeActionTargets operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeActionTargetsRequest {
  @scala.inline
  def apply(): DescribeActionTargetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActionTargetsRequest]
  }
  @scala.inline
  implicit class DescribeActionTargetsRequestOps[Self <: DescribeActionTargetsRequest] (val x: Self) extends AnyVal {
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
    def setActionTargetArnsVarargs(value: NonEmptyString*): Self = this.set("ActionTargetArns", js.Array(value :_*))
    @scala.inline
    def setActionTargetArns(value: ArnList): Self = this.set("ActionTargetArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionTargetArns: Self = this.set("ActionTargetArns", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

