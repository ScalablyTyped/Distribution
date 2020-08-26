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
  def apply(IdentityPoolId: IdentityPoolId, MaxResults: QueryLimit): ListIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesInput]
  }
  @scala.inline
  implicit class ListIdentitiesInputOps[Self <: ListIdentitiesInput] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: QueryLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideDisabled(value: HideDisabled): Self = this.set("HideDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDisabled: Self = this.set("HideDisabled", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationKey): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

