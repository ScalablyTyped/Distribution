package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResourceServerRequest extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType = js.native
  /**
    * The name of the resource server.
    */
  var Name: ResourceServerNameType = js.native
  /**
    * The scope values to be set for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object UpdateResourceServerRequest {
  @scala.inline
  def apply(
    Identifier: ResourceServerIdentifierType,
    Name: ResourceServerNameType,
    UserPoolId: UserPoolIdType,
    Scopes: ResourceServerScopeListType = null
  ): UpdateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (Scopes != null) __obj.updateDynamic("Scopes")(Scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceServerRequest]
  }
}

