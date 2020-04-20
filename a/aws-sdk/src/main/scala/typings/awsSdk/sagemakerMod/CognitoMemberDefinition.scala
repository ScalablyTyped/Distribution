package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoMemberDefinition extends js.Object {
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: CognitoClientId = js.native
  /**
    * An identifier for a user group.
    */
  var UserGroup: CognitoUserGroup = js.native
  /**
    * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
    */
  var UserPool: CognitoUserPool = js.native
}

object CognitoMemberDefinition {
  @scala.inline
  def apply(ClientId: CognitoClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
}

