package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoIdentityProvider extends js.Object {
  
  /**
    * <p>The client ID for the Amazon Cognito user pool.</p>
    */
  var ClientId: js.UndefOr[String] = js.native
  
  /**
    * <p>The provider name for an Amazon Cognito user pool. For example,
    *             <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
    */
  var ProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>TRUE if server-side token validation is enabled for the identity provider’s
    *          token.</p>
    *          <p>Once you set <code>ServerSideTokenCheck</code> to TRUE for an identity pool, that
    *          identity pool will check with the integrated user pools to make sure that the user has not
    *          been globally signed out or deleted before the identity pool provides an OIDC token or AWS
    *          credentials for the user.</p>
    *          <p>If the user is signed out or deleted, the identity pool will return a 400 Not
    *          Authorized error.</p>
    */
  var ServerSideTokenCheck: js.UndefOr[Boolean] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "CognitoIdentityProvider")
@js.native
object CognitoIdentityProvider extends js.Object {
  
  def filterSensitiveLog(obj: CognitoIdentityProvider): js.Any = js.native
}
