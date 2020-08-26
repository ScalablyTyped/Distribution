package typings.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCredentialsForIdentityInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers that do not support role customization.</p>
    */
  var CustomRoleArn: js.UndefOr[String] = js.native
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: String = js.native
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}

object GetCredentialsForIdentityInput {
  @scala.inline
  def apply(IdentityId: String): GetCredentialsForIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsForIdentityInput]
  }
  @scala.inline
  implicit class GetCredentialsForIdentityInputOps[Self <: GetCredentialsForIdentityInput] (val x: Self) extends AnyVal {
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
    def setIdentityId(value: String): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setCustomRoleArn(value: String): Self = this.set("CustomRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomRoleArn: Self = this.set("CustomRoleArn", js.undefined)
    @scala.inline
    def setLogins(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Logins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
  
}

