package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAuthorizerRequest extends js.Object {
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: AuthorizerFunctionArn = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  /**
    * The status of the create authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  /**
    * Metadata which can be used to manage the custom authorizer.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the token key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  /**
    * The public keys used to verify the digital signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}

object CreateAuthorizerRequest {
  @scala.inline
  def apply(
    authorizerFunctionArn: AuthorizerFunctionArn,
    authorizerName: AuthorizerName,
    signingDisabled: js.UndefOr[BooleanKey] = js.undefined,
    status: AuthorizerStatus = null,
    tags: TagList = null,
    tokenKeyName: TokenKeyName = null,
    tokenSigningPublicKeys: PublicKeyMap = null
  ): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn.asInstanceOf[js.Any], authorizerName = authorizerName.asInstanceOf[js.Any])
    if (!js.isUndefined(signingDisabled)) __obj.updateDynamic("signingDisabled")(signingDisabled.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (tokenKeyName != null) __obj.updateDynamic("tokenKeyName")(tokenKeyName.asInstanceOf[js.Any])
    if (tokenSigningPublicKeys != null) __obj.updateDynamic("tokenSigningPublicKeys")(tokenSigningPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
}

