package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersRequest extends js.Object {
  /**
    * The maximum number of items to return in the response. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.securityhubMod.MaxResults] = js.native
  /**
    * The token that is required for pagination. On your first call to the ListMembers operation, set the value of this parameter to NULL. For subsequent calls to the operation, to continue listing data, set the value of this parameter to the value returned from the previous response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  /**
    * Specifies which member accounts to include in the response based on their relationship status with the master account. The default value is TRUE. If OnlyAssociated is set to TRUE, the response includes member accounts whose relationship status with the master is set to ENABLED or DISABLED. If OnlyAssociated is set to FALSE, the response includes all existing member accounts. 
    */
  var OnlyAssociated: js.UndefOr[Boolean] = js.native
}

object ListMembersRequest {
  @scala.inline
  def apply(
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null,
    OnlyAssociated: js.UndefOr[scala.Boolean] = js.undefined
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(OnlyAssociated)) __obj.updateDynamic("OnlyAssociated")(OnlyAssociated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersRequest]
  }
}

