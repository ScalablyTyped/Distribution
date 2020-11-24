package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIDConnectProviderResponse extends js.Object {
  
  /**
    * A list of client IDs (also known as audiences) that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider.
    */
  var ClientIDList: js.UndefOr[clientIDListType] = js.native
  
  /**
    * The date and time when the IAM OIDC provider resource object was created in the AWS account.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  
  /**
    * A list of certificate thumbprints that are associated with the specified IAM OIDC provider resource object. For more information, see CreateOpenIDConnectProvider. 
    */
  var ThumbprintList: js.UndefOr[thumbprintListType] = js.native
  
  /**
    * The URL that the IAM OIDC provider resource object is associated with. For more information, see CreateOpenIDConnectProvider.
    */
  var Url: js.UndefOr[OpenIDConnectProviderUrlType] = js.native
}
object GetOpenIDConnectProviderResponse {
  
  @scala.inline
  def apply(): GetOpenIDConnectProviderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIDConnectProviderResponse]
  }
  
  @scala.inline
  implicit class GetOpenIDConnectProviderResponseOps[Self <: GetOpenIDConnectProviderResponse] (val x: Self) extends AnyVal {
    
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
    def setClientIDListVarargs(value: clientIDType*): Self = this.set("ClientIDList", js.Array(value :_*))
    
    @scala.inline
    def setClientIDList(value: clientIDListType): Self = this.set("ClientIDList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIDList: Self = this.set("ClientIDList", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setThumbprintListVarargs(value: thumbprintType*): Self = this.set("ThumbprintList", js.Array(value :_*))
    
    @scala.inline
    def setThumbprintList(value: thumbprintListType): Self = this.set("ThumbprintList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbprintList: Self = this.set("ThumbprintList", js.undefined)
    
    @scala.inline
    def setUrl(value: OpenIDConnectProviderUrlType): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
