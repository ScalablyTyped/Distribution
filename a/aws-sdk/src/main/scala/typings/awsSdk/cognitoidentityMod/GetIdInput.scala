package typings.awsSdk.cognitoidentityMod

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityCredentialsInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdInput extends CognitoIdentityCredentialsInputs {
  /**
    * A standard AWS account ID (9+ digits).
    */
  var AccountId: js.UndefOr[typings.awsSdk.cognitoidentityMod.AccountId] = js.native
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId = js.native
  /**
    * A set of optional name-value pairs that map provider names to provider tokens. The available provider names for Logins are as follows:   Facebook: graph.facebook.com    Amazon Cognito user pool: cognito-idp.&lt;region&gt;.amazonaws.com/&lt;YOUR_USER_POOL_ID&gt;, for example, cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789.    Google: accounts.google.com    Amazon: www.amazon.com    Twitter: api.twitter.com    Digits: www.digits.com   
    */
  var Logins: js.UndefOr[LoginsMap] = js.native
}

object GetIdInput {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetIdInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdInput]
  }
  @scala.inline
  implicit class GetIdInputOps[Self <: GetIdInput] (val x: Self) extends AnyVal {
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
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setLogins(value: LoginsMap): Self = this.set("Logins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
  
}

