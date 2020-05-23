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
  def apply(
    authorizerArn: AuthorizerArn = null,
    authorizerFunctionArn: AuthorizerFunctionArn = null,
    authorizerName: AuthorizerName = null,
    creationDate: DateType = null,
    lastModifiedDate: DateType = null,
    signingDisabled: js.UndefOr[BooleanKey] = js.undefined,
    status: AuthorizerStatus = null,
    tokenKeyName: TokenKeyName = null,
    tokenSigningPublicKeys: PublicKeyMap = null
  ): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    if (authorizerArn != null) __obj.updateDynamic("authorizerArn")(authorizerArn.asInstanceOf[js.Any])
    if (authorizerFunctionArn != null) __obj.updateDynamic("authorizerFunctionArn")(authorizerFunctionArn.asInstanceOf[js.Any])
    if (authorizerName != null) __obj.updateDynamic("authorizerName")(authorizerName.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(signingDisabled)) __obj.updateDynamic("signingDisabled")(signingDisabled.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tokenKeyName != null) __obj.updateDynamic("tokenKeyName")(tokenKeyName.asInstanceOf[js.Any])
    if (tokenSigningPublicKeys != null) __obj.updateDynamic("tokenSigningPublicKeys")(tokenSigningPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerDescription]
  }
}

