package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.UnmarshalledRoleMapping
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetIdentityPoolRolesOutputMod {
  
  trait GetIdentityPoolRolesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a String-to-<a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[UnmarshalledRoleMapping]] = js.undefined
    
    /**
      * <p>The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.</p>
      */
    var Roles: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetIdentityPoolRolesOutput {
    
    inline def apply($metadata: ResponseMetadata): GetIdentityPoolRolesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIdentityPoolRolesOutput]
    }
    
    extension [Self <: GetIdentityPoolRolesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
      
      inline def setRoleMappings(value: StringDictionary[UnmarshalledRoleMapping]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
      
      inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
      
      inline def setRoles(value: StringDictionary[String]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
      
      inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    }
  }
}
