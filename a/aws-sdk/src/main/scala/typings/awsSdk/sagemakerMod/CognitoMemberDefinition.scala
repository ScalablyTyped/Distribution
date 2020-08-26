package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoMemberDefinition extends js.Object {
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId = js.native
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
  def apply(ClientId: ClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
  @scala.inline
  implicit class CognitoMemberDefinitionOps[Self <: CognitoMemberDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserGroup(value: CognitoUserGroup): Self = this.set("UserGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPool(value: CognitoUserPool): Self = this.set("UserPool", value.asInstanceOf[js.Any])
  }
  
}

