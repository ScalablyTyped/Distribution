package typings.awsSdkClientCognitoIdentityBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.UnmarshalledRoleMapping
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/types/GetIdentityPoolRolesOutput", JSImport.Namespace)
@js.native
object typesGetIdentityPoolRolesOutputMod extends js.Object {
  @js.native
  trait GetIdentityPoolRolesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An identity pool ID in the format REGION:GUID.</p>
      */
    var IdentityPoolId: js.UndefOr[String] = js.native
    /**
      * <p>How users for a specific identity provider are to mapped to roles. This is a String-to-<a>RoleMapping</a> object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
      */
    var RoleMappings: js.UndefOr[StringDictionary[UnmarshalledRoleMapping]] = js.native
    /**
      * <p>The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.</p>
      */
    var Roles: js.UndefOr[StringDictionary[String]] = js.native
  }
  
}

