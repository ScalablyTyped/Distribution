package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoConfig extends js.Object {
  /**
    * The client ID for your Amazon Cognito user pool.
    */
  var ClientId: typings.awsSdk.sagemakerMod.ClientId = js.native
  /**
    * A  user pool is a user directory in Amazon Cognito. With a user pool, your users can sign in to your web or mobile app through Amazon Cognito. Your users can also sign in through social identity providers like Google, Facebook, Amazon, or Apple, and through SAML identity providers.
    */
  var UserPool: CognitoUserPool = js.native
}

object CognitoConfig {
  @scala.inline
  def apply(ClientId: ClientId, UserPool: CognitoUserPool): CognitoConfig = {
    val __obj = js.Dynamic.literal(ClientId = ClientId.asInstanceOf[js.Any], UserPool = UserPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoConfig]
  }
  @scala.inline
  implicit class CognitoConfigOps[Self <: CognitoConfig] (val x: Self) extends AnyVal {
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
    def setUserPool(value: CognitoUserPool): Self = this.set("UserPool", value.asInstanceOf[js.Any])
  }
  
}

