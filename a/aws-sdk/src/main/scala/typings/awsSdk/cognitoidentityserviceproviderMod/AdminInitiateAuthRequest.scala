package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminInitiateAuthRequest extends js.Object {
  /**
    * The analytics metadata for collecting Amazon Pinpoint metrics for AdminInitiateAuth calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.native
  /**
    * The authentication flow for this call to execute. The API action will depend on this value. For example:    REFRESH_TOKEN_AUTH will take in a valid refresh token and return new tokens.    USER_SRP_AUTH will take in USERNAME and SRP_A and return the SRP variables to be used for next challenge execution.    USER_PASSWORD_AUTH will take in USERNAME and PASSWORD and return the next challenge or tokens.   Valid values include:    USER_SRP_AUTH: Authentication flow for the Secure Remote Password (SRP) protocol.    REFRESH_TOKEN_AUTH/REFRESH_TOKEN: Authentication flow for refreshing the access token and ID token by supplying a valid refresh token.    CUSTOM_AUTH: Custom authentication flow.    ADMIN_NO_SRP_AUTH: Non-SRP authentication flow; you can pass in the USERNAME and PASSWORD directly if the flow is enabled for calling the app client.    USER_PASSWORD_AUTH: Non-SRP authentication flow; USERNAME and PASSWORD are passed directly. If a user migration Lambda trigger is set, this flow will invoke the user migration Lambda if the USERNAME is not found in the user pool.     ADMIN_USER_PASSWORD_AUTH: Admin-based user password authentication. This replaces the ADMIN_NO_SRP_AUTH authentication flow. In this flow, Cognito receives the password in the request instead of using the SRP process to verify passwords.  
    */
  var AuthFlow: AuthFlowType = js.native
  /**
    * The authentication parameters. These are inputs corresponding to the AuthFlow that you are invoking. The required values depend on the value of AuthFlow:   For USER_SRP_AUTH: USERNAME (required), SRP_A (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For REFRESH_TOKEN_AUTH/REFRESH_TOKEN: REFRESH_TOKEN (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For ADMIN_NO_SRP_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), PASSWORD (required), DEVICE_KEY    For CUSTOM_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), DEVICE_KEY   
    */
  var AuthParameters: js.UndefOr[AuthParametersType] = js.native
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType = js.native
  /**
    * A map of custom key-value pairs that you can provide as input for certain custom workflows that this action triggers. You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the AdminInitiateAuth API action, Amazon Cognito invokes the AWS Lambda functions that are specified for various triggers. The ClientMetadata value is passed as input to the functions for only the following triggers:   Pre signup   Pre authentication   User migration   When Amazon Cognito invokes the functions for these triggers, it passes a JSON payload, which the function receives as input. This payload contains a validationData attribute, which provides the data that you assigned to the ClientMetadata parameter in your AdminInitiateAuth request. In your function code in AWS Lambda, you can process the validationData value to enhance your workflow for your specific needs. When you use the AdminInitiateAuth API action, Amazon Cognito also invokes the functions for the following triggers, but it does not provide the ClientMetadata value as input:   Post authentication   Custom message   Pre token generation   Create auth challenge   Define auth challenge   Verify auth challenge   For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var ContextData: js.UndefOr[ContextDataType] = js.native
  /**
    * The ID of the Amazon Cognito user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object AdminInitiateAuthRequest {
  @scala.inline
  def apply(AuthFlow: AuthFlowType, ClientId: ClientIdType, UserPoolId: UserPoolIdType): AdminInitiateAuthRequest = {
    val __obj = js.Dynamic.literal(AuthFlow = AuthFlow.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminInitiateAuthRequest]
  }
  @scala.inline
  implicit class AdminInitiateAuthRequestOps[Self <: AdminInitiateAuthRequest] (val x: Self) extends AnyVal {
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
    def setAuthFlow(value: AuthFlowType): Self = this.set("AuthFlow", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = this.set("AnalyticsMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsMetadata: Self = this.set("AnalyticsMetadata", js.undefined)
    @scala.inline
    def setAuthParameters(value: AuthParametersType): Self = this.set("AuthParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthParameters: Self = this.set("AuthParameters", js.undefined)
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = this.set("ClientMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientMetadata: Self = this.set("ClientMetadata", js.undefined)
    @scala.inline
    def setContextData(value: ContextDataType): Self = this.set("ContextData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextData: Self = this.set("ContextData", js.undefined)
  }
  
}

