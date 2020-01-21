package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityPoolsResponse extends js.Object {
  /**
    * The identity pools returned by the ListIdentityPools action.
    */
  var IdentityPools: js.UndefOr[IdentityPoolsList] = js.native
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
}

object ListIdentityPoolsResponse {
  @scala.inline
  def apply(IdentityPools: IdentityPoolsList = null, NextToken: PaginationKey = null): ListIdentityPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (IdentityPools != null) __obj.updateDynamic("IdentityPools")(IdentityPools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsResponse]
  }
}

