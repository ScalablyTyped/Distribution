package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesGetIdentityPoolRolesOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreRoleMappingMod._UnmarshalledRoleMapping
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIdentityPoolRolesOutput extends OutputTypesUnion {
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
  var RoleMappings: js.UndefOr[StringDictionary[_UnmarshalledRoleMapping]] = js.undefined
  /**
    * <p>The map of roles associated with this pool. Currently only authenticated and unauthenticated roles are supported.</p>
    */
  var Roles: js.UndefOr[StringDictionary[String]] = js.undefined
}

object GetIdentityPoolRolesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    IdentityPoolId: String = null,
    RoleMappings: StringDictionary[_UnmarshalledRoleMapping] = null,
    Roles: StringDictionary[String] = null
  ): GetIdentityPoolRolesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (IdentityPoolId != null) __obj.updateDynamic("IdentityPoolId")(IdentityPoolId)
    if (RoleMappings != null) __obj.updateDynamic("RoleMappings")(RoleMappings)
    if (Roles != null) __obj.updateDynamic("Roles")(Roles)
    __obj.asInstanceOf[GetIdentityPoolRolesOutput]
  }
}

