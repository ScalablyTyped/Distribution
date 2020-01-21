package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIdentityProvidersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.native
  /**
    * A list of identity provider objects.
    */
  var Providers: ProvidersListType = js.native
}

object ListIdentityProvidersResponse {
  @scala.inline
  def apply(Providers: ProvidersListType, NextToken: PaginationKeyType = null): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
}

