package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPool extends js.Object {
  
  /**
    * <p>Enables or disables the Basic (Classic) authentication flow. For more information, see
    *       <a href="https://docs.aws.amazon.com/cognito/latest/developerguide/authentication-flow.html">Identity Pools (Federated Identities) Authentication Flow</a> in the <i>Amazon Cognito Developer Guide</i>.</p>
    */
  var AllowClassicFlow: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>TRUE if the identity pool supports unauthenticated logins.</p>
    */
  var AllowUnauthenticatedIdentities: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>A list representing an Amazon Cognito user pool and its client ID.</p>
    */
  var CognitoIdentityProviders: js.UndefOr[js.Array[CognitoIdentityProvider]] = js.native
  
  /**
    * <p>The "domain" by which Cognito will refer to your users.</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.native
  
  /**
    * <p>The tags that are assigned to the identity pool. A tag is a label that you can apply to
    *          identity pools to categorize and manage them in different ways, such as by purpose, owner,
    *          environment, or other criteria.</p>
    */
  var IdentityPoolTags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * <p>A list of OpendID Connect provider ARNs.</p>
    */
  var OpenIdConnectProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>An array of Amazon Resource Names (ARNs) of the SAML provider for your identity
    *          pool.</p>
    */
  var SamlProviderARNs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * <p>Optional key:value pairs mapping provider names to provider app IDs.</p>
    */
  var SupportedLoginProviders: js.UndefOr[StringDictionary[String]] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "IdentityPool")
@js.native
object IdentityPool extends js.Object {
  
  def filterSensitiveLog(obj: IdentityPool): js.Any = js.native
}
