package typings.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnderscoreCognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CognitoIdentityProvider extends js.Object {
  /**
    * <p>The client ID for the Amazon Cognito Identity User Pool.</p>
    */
  var ClientId: js.UndefOr[String] = js.undefined
  /**
    * <p>The provider name for an Amazon Cognito Identity User Pool. For example, <code>cognito-idp.us-east-1.amazonaws.com/us-east-1_123456789</code>.</p>
    */
  var ProviderName: js.UndefOr[String] = js.undefined
  /**
    * <p>TRUE if server-side token validation is enabled for the identity provider’s token.</p>
    */
  var ServerSideTokenCheck: js.UndefOr[Boolean] = js.undefined
}

object _CognitoIdentityProvider {
  @scala.inline
  def apply(
    ClientId: String = null,
    ProviderName: String = null,
    ServerSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  ): _CognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    if (!js.isUndefined(ServerSideTokenCheck)) __obj.updateDynamic("ServerSideTokenCheck")(ServerSideTokenCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CognitoIdentityProvider]
  }
}

