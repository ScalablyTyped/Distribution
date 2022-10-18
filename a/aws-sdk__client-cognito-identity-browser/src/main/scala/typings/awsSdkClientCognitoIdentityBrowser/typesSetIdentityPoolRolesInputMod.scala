package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.RoleMapping
import typings.awsSdkTypes.distTypesAbortMod.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSetIdentityPoolRolesInputMod {
  
  trait SetIdentityPoolRolesInput
    extends StObject
       with InputTypesUnion {
    
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ] = js.undefined
    
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: String
    
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a string to <a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p> <p>Up to 25 rules can be specified per identity provider.</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[RoleMapping] | (js.Iterable[js.Tuple2[String, RoleMapping]])] = js.undefined
    
    /**
      * <p>The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.</p>
      */
    var Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])
  }
  object SetIdentityPoolRolesInput {
    
    inline def apply(IdentityPoolId: String, Roles: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): SetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIdentityPoolRolesInput]
    }
    
    extension [Self <: SetIdentityPoolRolesInput](x: Self) {
      
      inline def set$abortSignal(value: AbortSignal): Self = StObject.set(x, "$abortSignal", value.asInstanceOf[js.Any])
      
      inline def set$abortSignalUndefined: Self = StObject.set(x, "$abortSignal", js.undefined)
      
      inline def set$httpOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __HttpOptions__ */ Any
      ): Self = StObject.set(x, "$httpOptions", value.asInstanceOf[js.Any])
      
      inline def set$httpOptionsUndefined: Self = StObject.set(x, "$httpOptions", js.undefined)
      
      inline def set$maxRetries(value: Double): Self = StObject.set(x, "$maxRetries", value.asInstanceOf[js.Any])
      
      inline def set$maxRetriesUndefined: Self = StObject.set(x, "$maxRetries", js.undefined)
      
      inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
      
      inline def setRoleMappings(value: StringDictionary[RoleMapping] | (js.Iterable[js.Tuple2[String, RoleMapping]])): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
      
      inline def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
      
      inline def setRoles(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    }
  }
}
