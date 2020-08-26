package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSAMLProvidersResponse extends js.Object {
  /**
    * The list of SAML provider resource objects defined in IAM for this AWS account.
    */
  var SAMLProviderList: js.UndefOr[SAMLProviderListType] = js.native
}

object ListSAMLProvidersResponse {
  @scala.inline
  def apply(): ListSAMLProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSAMLProvidersResponse]
  }
  @scala.inline
  implicit class ListSAMLProvidersResponseOps[Self <: ListSAMLProvidersResponse] (val x: Self) extends AnyVal {
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
    def setSAMLProviderListVarargs(value: SAMLProviderListEntry*): Self = this.set("SAMLProviderList", js.Array(value :_*))
    @scala.inline
    def setSAMLProviderList(value: SAMLProviderListType): Self = this.set("SAMLProviderList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSAMLProviderList: Self = this.set("SAMLProviderList", js.undefined)
  }
  
}

