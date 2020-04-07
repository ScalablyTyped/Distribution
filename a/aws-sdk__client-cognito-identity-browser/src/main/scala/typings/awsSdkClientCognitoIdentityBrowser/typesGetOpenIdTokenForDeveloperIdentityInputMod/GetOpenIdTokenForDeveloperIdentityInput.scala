package typings.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOpenIdTokenForDeveloperIdentityInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: String
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. Each name-value pair represents a user from a public provider or developer provider. If the user is from a developer provider, the name-value pair will follow the syntax <code>"developer_provider_name": "developer_user_identifier"</code>. The developer provider is the "domain" by which Cognito will refer to your users; you provided this domain while creating/updating the identity pool. The developer user identifier is an identifier from your backend that uniquely identifies a user. When you create an identity pool, you can specify the supported logins.</p>
    */
  var Logins: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])
  /**
    * <p>The expiration time of the token, in seconds. You can specify a custom expiration time for the token so that you can cache it. If you don't provide an expiration time, the token is valid for 15 minutes. You can exchange the token with Amazon STS for temporary AWS credentials, which are valid for a maximum of one hour. The maximum token duration you can set is 24 hours. You should take care in setting the expiration time for a token, as there are significant security implications: an attacker could use a leaked token to access your AWS resources for the token's duration.</p>
    */
  var TokenDuration: js.UndefOr[Double] = js.undefined
}

object GetOpenIdTokenForDeveloperIdentityInput {
  @scala.inline
  def apply(
    IdentityPoolId: String,
    Logins: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]),
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    IdentityId: String = null,
    TokenDuration: Int | Double = null
  ): GetOpenIdTokenForDeveloperIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (TokenDuration != null) __obj.updateDynamic("TokenDuration")(TokenDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityInput]
  }
}

