package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateCognitoActionConfig extends js.Object {
  /**
    * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
    */
  var AuthenticationRequestExtraParams: js.UndefOr[AuthenticateCognitoActionAuthenticationRequestExtraParams] = js.native
  /**
    * The behavior if the user is not authenticated. The following are possible values:   deny - Return an HTTP 401 Unauthorized error.   allow - Allow the request to be forwarded to the target.   authenticate - Redirect the request to the IdP authorization endpoint. This is the default value.  
    */
  var OnUnauthenticatedRequest: js.UndefOr[AuthenticateCognitoActionConditionalBehaviorEnum] = js.native
  /**
    * The set of user claims to be requested from the IdP. The default is openid. To verify which scope values your IdP supports and how to separate multiple values, see the documentation for your IdP.
    */
  var Scope: js.UndefOr[AuthenticateCognitoActionScope] = js.native
  /**
    * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
    */
  var SessionCookieName: js.UndefOr[AuthenticateCognitoActionSessionCookieName] = js.native
  /**
    * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
    */
  var SessionTimeout: js.UndefOr[AuthenticateCognitoActionSessionTimeout] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Cognito user pool.
    */
  var UserPoolArn: AuthenticateCognitoActionUserPoolArn = js.native
  /**
    * The ID of the Amazon Cognito user pool client.
    */
  var UserPoolClientId: AuthenticateCognitoActionUserPoolClientId = js.native
  /**
    * The domain prefix or fully-qualified domain name of the Amazon Cognito user pool.
    */
  var UserPoolDomain: AuthenticateCognitoActionUserPoolDomain = js.native
}

object AuthenticateCognitoActionConfig {
  @scala.inline
  def apply(
    UserPoolArn: AuthenticateCognitoActionUserPoolArn,
    UserPoolClientId: AuthenticateCognitoActionUserPoolClientId,
    UserPoolDomain: AuthenticateCognitoActionUserPoolDomain
  ): AuthenticateCognitoActionConfig = {
    val __obj = js.Dynamic.literal(UserPoolArn = UserPoolArn.asInstanceOf[js.Any], UserPoolClientId = UserPoolClientId.asInstanceOf[js.Any], UserPoolDomain = UserPoolDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateCognitoActionConfig]
  }
  @scala.inline
  implicit class AuthenticateCognitoActionConfigOps[Self <: AuthenticateCognitoActionConfig] (val x: Self) extends AnyVal {
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
    def setUserPoolArn(value: AuthenticateCognitoActionUserPoolArn): Self = this.set("UserPoolArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolClientId(value: AuthenticateCognitoActionUserPoolClientId): Self = this.set("UserPoolClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolDomain(value: AuthenticateCognitoActionUserPoolDomain): Self = this.set("UserPoolDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationRequestExtraParams(value: AuthenticateCognitoActionAuthenticationRequestExtraParams): Self = this.set("AuthenticationRequestExtraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationRequestExtraParams: Self = this.set("AuthenticationRequestExtraParams", js.undefined)
    @scala.inline
    def setOnUnauthenticatedRequest(value: AuthenticateCognitoActionConditionalBehaviorEnum): Self = this.set("OnUnauthenticatedRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnauthenticatedRequest: Self = this.set("OnUnauthenticatedRequest", js.undefined)
    @scala.inline
    def setScope(value: AuthenticateCognitoActionScope): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
    @scala.inline
    def setSessionCookieName(value: AuthenticateCognitoActionSessionCookieName): Self = this.set("SessionCookieName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionCookieName: Self = this.set("SessionCookieName", js.undefined)
    @scala.inline
    def setSessionTimeout(value: AuthenticateCognitoActionSessionTimeout): Self = this.set("SessionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeout: Self = this.set("SessionTimeout", js.undefined)
  }
  
}

