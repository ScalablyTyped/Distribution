package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentitiesInput extends js.Object {
  /**
    * An optional boolean parameter that allows you to hide disabled identities. If omitted, the ListIdentities API will include disabled identities in the response.
    */
  var HideDisabled: js.UndefOr[typings.awsSdk.cognitoidentityMod.HideDisabled] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * The maximum number of identities to return.
    */
  var MaxResults: QueryLimit = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentitiesInput {
  @scala.inline
  def apply(
    IdentityPoolId: IdentityPoolId,
    MaxResults: QueryLimit,
    HideDisabled: js.UndefOr[HideDisabled] = js.undefined,
    NextToken: PaginationKey = null
  ): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
    if (!js.isUndefined(HideDisabled)) __obj.updateDynamic("HideDisabled")(HideDisabled.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesInput]
  }
}

