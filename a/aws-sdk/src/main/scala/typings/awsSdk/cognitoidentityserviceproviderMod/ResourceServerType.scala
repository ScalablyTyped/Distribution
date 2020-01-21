package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerType extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.native
  /**
    * The name of the resource server.
    */
  var Name: js.UndefOr[ResourceServerNameType] = js.native
  /**
    * A list of scopes that are defined for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.native
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object ResourceServerType {
  @scala.inline
  def apply(
    Identifier: ResourceServerIdentifierType = null,
    Name: ResourceServerNameType = null,
    Scopes: ResourceServerScopeListType = null,
    UserPoolId: UserPoolIdType = null
  ): ResourceServerType = {
    val __obj = js.Dynamic.literal()
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Scopes != null) __obj.updateDynamic("Scopes")(Scopes.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerType]
  }
}

