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
  def apply(authorizerFunctionArn: AuthorizerFunctionArn, authorizerName: AuthorizerName): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn.asInstanceOf[js.Any], authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  @scala.inline
  implicit class CreateAuthorizerRequestOps[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
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
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = this.set("authorizerFunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = this.set("authorizerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigningDisabled(value: BooleanKey): Self = this.set("signingDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningDisabled: Self = this.set("signingDisabled", js.undefined)
    @scala.inline
    def setStatus(value: AuthorizerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
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

