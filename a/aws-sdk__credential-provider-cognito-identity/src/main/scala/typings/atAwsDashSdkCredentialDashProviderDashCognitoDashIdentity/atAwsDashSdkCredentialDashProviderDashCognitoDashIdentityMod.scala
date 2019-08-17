package typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity

import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildFromCognitoIdentityMod.FromCognitoIdentityParameters
import typings.atAwsDashSdkCredentialDashProviderDashCognitoDashIdentity.buildFromCognitoIdentityPoolMod.FromCognitoIdentityPoolParameters
import typings.atAwsDashSdkTypes.buildCredentialsMod.CredentialProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/credential-provider-cognito-identity", JSImport.Namespace)
@js.native
object atAwsDashSdkCredentialDashProviderDashCognitoDashIdentityMod extends js.Object {
  def fromCognitoIdentity(parameters: FromCognitoIdentityParameters): CredentialProvider = js.native
  def fromCognitoIdentityPool(
    hasAccountIdCacheClientCustomRoleArnIdentityPoolIdLoginsUserIdentifier: FromCognitoIdentityPoolParameters
  ): CredentialProvider = js.native
}

