package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceServerRequest extends js.Object {
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType = js.native
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DeleteResourceServerRequest {
  @scala.inline
  def apply(Identifier: ResourceServerIdentifierType, UserPoolId: UserPoolIdType): DeleteResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResourceServerRequest]
  }
}

