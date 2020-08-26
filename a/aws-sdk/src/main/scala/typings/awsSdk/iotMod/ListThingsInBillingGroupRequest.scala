package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingsInBillingGroupRequest extends js.Object {
  /**
    * The name of the billing group.
    */
  var billingGroupName: BillingGroupName = js.native
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListThingsInBillingGroupRequest {
  @scala.inline
  def apply(billingGroupName: BillingGroupName): ListThingsInBillingGroupRequest = {
    val __obj = js.Dynamic.literal(billingGroupName = billingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingsInBillingGroupRequest]
  }
  @scala.inline
  implicit class ListThingsInBillingGroupRequestOps[Self <: ListThingsInBillingGroupRequest] (val x: Self) extends AnyVal {
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
    def setBillingGroupName(value: BillingGroupName): Self = this.set("billingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

