package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIdentityProviderRequest extends js.Object {
  
  /**
    * The identity provider attribute mapping to be changed.
    */
  var AttributeMapping: js.UndefOr[AttributeMappingType] = js.native
  
  /**
    * A list of identity provider identifiers.
    */
  var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.native
  
  /**
    * The identity provider details to be updated, such as MetadataURL and MetadataFile.
    */
  var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.native
  
  /**
    * The identity provider name.
    */
  var ProviderName: ProviderNameType = js.native
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
}
object UpdateIdentityProviderRequest {
  
  @scala.inline
  def apply(ProviderName: ProviderNameType, UserPoolId: UserPoolIdType): UpdateIdentityProviderRequest = {
    val __obj = js.Dynamic.literal(ProviderName = ProviderName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIdentityProviderRequest]
  }
  
  @scala.inline
  implicit class UpdateIdentityProviderRequestOps[Self <: UpdateIdentityProviderRequest] (val x: Self) extends AnyVal {
    
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
    def setProviderName(value: ProviderNameType): Self = this.set("ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeMapping(value: AttributeMappingType): Self = this.set("AttributeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeMapping: Self = this.set("AttributeMapping", js.undefined)
    
    @scala.inline
    def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = this.set("IdpIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdpIdentifiers(value: IdpIdentifiersListType): Self = this.set("IdpIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdpIdentifiers: Self = this.set("IdpIdentifiers", js.undefined)
    
    @scala.inline
    def setProviderDetails(value: ProviderDetailsType): Self = this.set("ProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderDetails: Self = this.set("ProviderDetails", js.undefined)
  }
}
