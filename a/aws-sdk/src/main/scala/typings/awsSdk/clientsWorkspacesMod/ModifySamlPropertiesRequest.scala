package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySamlPropertiesRequest extends StObject {
  
  /**
    * The SAML properties to delete as part of your request. Specify one of the following options:    SAML_PROPERTIES_USER_ACCESS_URL to delete the user access URL.    SAML_PROPERTIES_RELAY_STATE_PARAMETER_NAME to delete the relay state parameter name.  
    */
  var PropertiesToDelete: js.UndefOr[DeletableSamlPropertiesList] = js.undefined
  
  /**
    * The directory identifier for which you want to configure SAML properties.
    */
  var ResourceId: DirectoryId
  
  /**
    * The properties for configuring SAML 2.0 authentication.
    */
  var SamlProperties: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.SamlProperties] = js.undefined
}
object ModifySamlPropertiesRequest {
  
  inline def apply(ResourceId: DirectoryId): ModifySamlPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySamlPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifySamlPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setPropertiesToDelete(value: DeletableSamlPropertiesList): Self = StObject.set(x, "PropertiesToDelete", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToDeleteUndefined: Self = StObject.set(x, "PropertiesToDelete", js.undefined)
    
    inline def setPropertiesToDeleteVarargs(value: DeletableSamlProperty*): Self = StObject.set(x, "PropertiesToDelete", js.Array(value*))
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setSamlProperties(value: SamlProperties): Self = StObject.set(x, "SamlProperties", value.asInstanceOf[js.Any])
    
    inline def setSamlPropertiesUndefined: Self = StObject.set(x, "SamlProperties", js.undefined)
  }
}
