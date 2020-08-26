package typings.awsSdkClientCognitoIdentityBrowser.typesGetIdInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdInput extends InputTypesUnion {
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
    * <p>A standard AWS account ID (9+ digits).</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: String = js.native
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. The available provider names for <code>Logins</code> are as follows:</p> <ul> <li> <p>Facebook: <code>graph.facebook.com</code> </p> </li> <li> <p>Amazon Cognito Identity Provider: <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code> </p> </li> <li> <p>Google: <code>accounts.google.com</code> </p> </li> <li> <p>Amazon: <code>www.amazon.com</code> </p> </li> <li> <p>Twitter: <code>api.twitter.com</code> </p> </li> <li> <p>Digits: <code>www.digits.com</code> </p> </li> </ul>
    */
  var Logins: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
}

object GetIdInput {
  @scala.inline
  def apply(IdentityPoolId: String): GetIdInput = {
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
    def setIdentityPoolId(value: String): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setLogins(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Logins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogins: Self = this.set("Logins", js.undefined)
  }
  
}

