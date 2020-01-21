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
  def apply(Entitlements: listOfListedEntitlement = null, NextToken: string = null): ListEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitlementsResponse]
  }
}

