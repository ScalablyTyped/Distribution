package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlConfiguration extends StObject {
  
  /**
    * Lists which organizations defined in the SAML assertion are allowed to use the Amazon Managed Grafana workspace. If this is empty, all organizations in the assertion attribute have access.
    */
  var allowedOrganizations: js.UndefOr[AllowedOrganizations] = js.undefined
  
  /**
    * A structure that defines which attributes in the SAML assertion are to be used to define information about the users authenticated by that IdP to use the workspace.
    */
  var assertionAttributes: js.UndefOr[AssertionAttributes] = js.undefined
  
  /**
    * A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this workspace.
    */
  var idpMetadata: IdpMetadata
  
  /**
    * How long a sign-on session by a SAML user is valid, before the user has to sign on again.
    */
  var loginValidityDuration: js.UndefOr[LoginValidityDuration] = js.undefined
  
  /**
    * A structure containing arrays that map group names in the SAML assertion to the Grafana Admin and Editor roles in the workspace.
    */
  var roleValues: js.UndefOr[RoleValues] = js.undefined
}
object SamlConfiguration {
  
  inline def apply(idpMetadata: IdpMetadata): SamlConfiguration = {
    val __obj = js.Dynamic.literal(idpMetadata = idpMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlConfiguration]
  }
  
  extension [Self <: SamlConfiguration](x: Self) {
    
    inline def setAllowedOrganizations(value: AllowedOrganizations): Self = StObject.set(x, "allowedOrganizations", value.asInstanceOf[js.Any])
    
    inline def setAllowedOrganizationsUndefined: Self = StObject.set(x, "allowedOrganizations", js.undefined)
    
    inline def setAllowedOrganizationsVarargs(value: AllowedOrganization*): Self = StObject.set(x, "allowedOrganizations", js.Array(value*))
    
    inline def setAssertionAttributes(value: AssertionAttributes): Self = StObject.set(x, "assertionAttributes", value.asInstanceOf[js.Any])
    
    inline def setAssertionAttributesUndefined: Self = StObject.set(x, "assertionAttributes", js.undefined)
    
    inline def setIdpMetadata(value: IdpMetadata): Self = StObject.set(x, "idpMetadata", value.asInstanceOf[js.Any])
    
    inline def setLoginValidityDuration(value: LoginValidityDuration): Self = StObject.set(x, "loginValidityDuration", value.asInstanceOf[js.Any])
    
    inline def setLoginValidityDurationUndefined: Self = StObject.set(x, "loginValidityDuration", js.undefined)
    
    inline def setRoleValues(value: RoleValues): Self = StObject.set(x, "roleValues", value.asInstanceOf[js.Any])
    
    inline def setRoleValuesUndefined: Self = StObject.set(x, "roleValues", js.undefined)
  }
}
