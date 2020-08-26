package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitlementsResponse extends js.Object {
  /**
    * A list of entitlements that have been granted to you from other AWS accounts.
    */
  var Entitlements: js.UndefOr[listOfListedEntitlement] = js.native
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListEntitlements request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListEntitlements request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListEntitlementsResponse {
  @scala.inline
  def apply(): ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitlementsResponse]
  }
  @scala.inline
  implicit class ListEntitlementsResponseOps[Self <: ListEntitlementsResponse] (val x: Self) extends AnyVal {
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
    def setEntitlementsVarargs(value: ListedEntitlement*): Self = this.set("Entitlements", js.Array(value :_*))
    @scala.inline
    def setEntitlements(value: listOfListedEntitlement): Self = this.set("Entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlements: Self = this.set("Entitlements", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

