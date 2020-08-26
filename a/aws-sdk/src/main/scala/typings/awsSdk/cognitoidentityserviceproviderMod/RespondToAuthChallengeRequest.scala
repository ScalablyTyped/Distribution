package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RespondToAuthChallengeRequest extends js.Object {
  /**
    * The Amazon Pinpoint analytics metadata for collecting metrics for RespondToAuthChallenge calls.
    */
  var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.native
  /**
    * The challenge name. For more information, see .  ADMIN_NO_SRP_AUTH is not a valid value.
    */
  var ChallengeName: ChallengeNameType = js.native
  /**
    * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:   SECRET_HASH (if app client is configured with client secret) applies to all inputs below (including SOFTWARE_TOKEN_MFA).     SMS_MFA: SMS_MFA_CODE, USERNAME.    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME.    NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME.     SOFTWARE_TOKEN_MFA: USERNAME and SOFTWARE_TOKEN_MFA_CODE are required attributes.    DEVICE_SRP_AUTH requires USERNAME, DEVICE_KEY, SRP_A (and SECRET_HASH).    DEVICE_PASSWORD_VERIFIER requires everything that PASSWORD_VERIFIER requires plus DEVICE_KEY.  
    */
  var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.native
  /**
    * The app client ID.
    */
  var ClientId: ClientIdType = js.native
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the RespondToAuthChallenge API action, Amazon Cognito invokes any functions that are assigned to the following triggers: post authentication, pre token generation, define auth challenge, create auth challenge, and verify auth challenge. When Amazon Cognito invokes any of these functions, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your RespondToAuthChallenge request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
    */
  var Session: js.UndefOr[SessionType] = js.native
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var UserContextData: js.UndefOr[UserContextDataType] = js.native
}

object RespondToAuthChallengeRequest {
  @scala.inline
  def apply(ChallengeName: ChallengeNameType, ClientId: ClientIdType): RespondToAuthChallengeRequest = {
    val __obj = js.Dynamic.literal(ChallengeName = ChallengeName.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RespondToAuthChallengeRequest]
  }
  @scala.inline
  implicit class RespondToAuthChallengeRequestOps[Self <: RespondToAuthChallengeRequest] (val x: Self) extends AnyVal {
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
    def setChallengeName(value: ChallengeNameType): Self = this.set("ChallengeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: ClientIdType): Self = this.set("ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnalyticsMetadata(value: AnalyticsMetadataType): Self = this.set("AnalyticsMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsMetadata: Self = this.set("AnalyticsMetadata", js.undefined)
    @scala.inline
    def setChallengeResponses(value: ChallengeResponsesType): Self = this.set("ChallengeResponses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChallengeResponses: Self = this.set("ChallengeResponses", js.undefined)
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = this.set("ClientMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientMetadata: Self = this.set("ClientMetadata", js.undefined)
    @scala.inline
    def setSession(value: SessionType): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
    @scala.inline
    def setUserContextData(value: UserContextDataType): Self = this.set("UserContextData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserContextData: Self = this.set("UserContextData", js.undefined)
  }
  
}

