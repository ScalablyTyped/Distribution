package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBillingGroupsResponse extends js.Object {
  /**
    * The list of billing groups.
    */
  var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBillingGroupsResponse {
  @scala.inline
  def apply(): ListBillingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsResponse]
  }
  @scala.inline
  implicit class ListBillingGroupsResponseOps[Self <: ListBillingGroupsResponse] (val x: Self) extends AnyVal {
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
    def setBillingGroupsVarargs(value: GroupNameAndArn*): Self = this.set("billingGroups", js.Array(value :_*))
    @scala.inline
    def setBillingGroups(value: BillingGroupNameAndArnList): Self = this.set("billingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingGroups: Self = this.set("billingGroups", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

