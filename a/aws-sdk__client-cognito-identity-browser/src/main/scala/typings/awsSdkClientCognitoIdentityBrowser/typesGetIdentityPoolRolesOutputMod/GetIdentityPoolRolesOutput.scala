package typings.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesRoleMappingMod.UnmarshalledRoleMapping
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object GetIdentityPoolRolesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetIdentityPoolRolesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoolRolesOutput]
  }
  @scala.inline
  implicit class GetIdentityPoolRolesOutputOps[Self <: GetIdentityPoolRolesOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityPoolId(value: String): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityPoolId: Self = this.set("IdentityPoolId", js.undefined)
    @scala.inline
    def setRoleMappings(value: StringDictionary[UnmarshalledRoleMapping]): Self = this.set("RoleMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleMappings: Self = this.set("RoleMappings", js.undefined)
    @scala.inline
    def setRoles(value: StringDictionary[String]): Self = this.set("Roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("Roles", js.undefined)
  }
  
}

