package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. Each
    *          name-value pair represents a user from a public provider or developer provider. If the user
    *          is from a developer provider, the name-value pair will follow the syntax
    *             <code>"developer_provider_name": "developer_user_identifier"</code>. The developer
    *          provider is the "domain" by which Cognito will refer to your users; you provided this
    *          domain while creating/updating the identity pool. The developer user identifier is an
    *          identifier from your backend that uniquely identifies a user. When you create an identity
    *          pool, you can specify the supported logins.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * <p>The expiration time of the token, in seconds. You can specify a custom expiration
    *          time for the token so that you can cache it. If you don't provide an expiration time, the
    *          token is valid for 15 minutes. You can exchange the token with Amazon STS for temporary AWS
    *          credentials, which are valid for a maximum of one hour. The maximum token duration you can
    *          set is 24 hours. You should take care in setting the expiration time for a token, as there
    *          are significant security implications: an attacker could use a leaked token to access your
    *          AWS resources for the token's duration.</p>
    *          <note>
    *             <p>Please provide for a small grace period, usually no more than 5 minutes, to account for clock skew.</p>
    *          </note>
    */
  var TokenDuration: js.UndefOr[Double] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenForDeveloperIdentityInput")
@js.native
object GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
  
  def filterSensitiveLog(obj: GetOpenIdTokenForDeveloperIdentityInput): js.Any = js.native
}
