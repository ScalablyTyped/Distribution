package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOpenIDConnectProvidersResponse extends js.Object {
  /**
    * The list of IAM OIDC provider resource objects defined in the AWS account.
    */
  var OpenIDConnectProviderList: js.UndefOr[OpenIDConnectProviderListType] = js.native
}

object ListOpenIDConnectProvidersResponse {
  @scala.inline
  def apply(): ListOpenIDConnectProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpenIDConnectProvidersResponse]
  }
  @scala.inline
  implicit class ListOpenIDConnectProvidersResponseOps[Self <: ListOpenIDConnectProvidersResponse] (val x: Self) extends AnyVal {
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
    def setOpenIDConnectProviderListVarargs(value: OpenIDConnectProviderListEntry*): Self = this.set("OpenIDConnectProviderList", js.Array(value :_*))
    @scala.inline
    def setOpenIDConnectProviderList(value: OpenIDConnectProviderListType): Self = this.set("OpenIDConnectProviderList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDConnectProviderList: Self = this.set("OpenIDConnectProviderList", js.undefined)
  }
  
}

