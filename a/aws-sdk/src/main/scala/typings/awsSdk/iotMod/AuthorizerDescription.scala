package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerDescription extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  /**
    * The authorizer's Lambda function ARN.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
  /**
    * The UNIX timestamp of when the authorizer was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The UNIX timestamp of when the authorizer was last updated.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  /**
    * The status of the authorizer.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * The key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to validate the token signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object AuthorizerDescription {
  @scala.inline
  def apply(): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerDescription]
  }
  @scala.inline
  implicit class AuthorizerDescriptionOps[Self <: AuthorizerDescription] (val x: Self) extends AnyVal {
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
    def setAuthorizerArn(value: AuthorizerArn): Self = this.set("authorizerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerArn: Self = this.set("authorizerArn", js.undefined)
    @scala.inline
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = this.set("authorizerFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerFunctionArn: Self = this.set("authorizerFunctionArn", js.undefined)
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = this.set("authorizerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerName: Self = this.set("authorizerName", js.undefined)
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setSigningDisabled(value: BooleanKey): Self = this.set("signingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningDisabled: Self = this.set("signingDisabled", js.undefined)
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

