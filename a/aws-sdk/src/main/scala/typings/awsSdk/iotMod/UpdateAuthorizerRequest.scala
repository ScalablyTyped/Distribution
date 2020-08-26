package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object UpdateAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
  @scala.inline
  implicit class UpdateAuthorizerRequestOps[Self <: UpdateAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def setAuthorizerName(value: AuthorizerName): Self = this.set("authorizerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = this.set("authorizerFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerFunctionArn: Self = this.set("authorizerFunctionArn", js.undefined)
    @scala.inline
    def setStatus(value: AuthorizerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTokenKeyName(value: TokenKeyName): Self = this.set("tokenKeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenKeyName: Self = this.set("tokenKeyName", js.undefined)
    @scala.inline
    def setTokenSigningPublicKeys(value: PublicKeyMap): Self = this.set("tokenSigningPublicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenSigningPublicKeys: Self = this.set("tokenSigningPublicKeys", js.undefined)
  }
  
}

