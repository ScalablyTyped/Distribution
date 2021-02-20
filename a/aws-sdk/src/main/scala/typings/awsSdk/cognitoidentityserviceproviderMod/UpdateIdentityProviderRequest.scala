package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIdentityProviderRequest extends StObject {
  
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
  implicit class UpdateIdentityProviderRequestMutableBuilder[Self <: UpdateIdentityProviderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeMapping(value: AttributeMappingType): Self = StObject.set(x, "AttributeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeMappingUndefined: Self = StObject.set(x, "AttributeMapping", js.undefined)
    
    @scala.inline
    def setIdpIdentifiers(value: IdpIdentifiersListType): Self = StObject.set(x, "IdpIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdpIdentifiersUndefined: Self = StObject.set(x, "IdpIdentifiers", js.undefined)
    
    @scala.inline
    def setIdpIdentifiersVarargs(value: IdpIdentifierType*): Self = StObject.set(x, "IdpIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setProviderDetails(value: ProviderDetailsType): Self = StObject.set(x, "ProviderDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDetailsUndefined: Self = StObject.set(x, "ProviderDetails", js.undefined)
    
    @scala.inline
    def setProviderName(value: ProviderNameType): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
