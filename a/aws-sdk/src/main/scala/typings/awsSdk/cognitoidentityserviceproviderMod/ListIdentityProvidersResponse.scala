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
  def apply(Providers: ProvidersListType): ListIdentityProvidersResponse = {
    val __obj = js.Dynamic.literal(Providers = Providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityProvidersResponse]
  }
  @scala.inline
  implicit class ListIdentityProvidersResponseOps[Self <: ListIdentityProvidersResponse] (val x: Self) extends AnyVal {
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
    def setProvidersVarargs(value: ProviderDescription*): Self = this.set("Providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: ProvidersListType): Self = this.set("Providers", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationKeyType): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

