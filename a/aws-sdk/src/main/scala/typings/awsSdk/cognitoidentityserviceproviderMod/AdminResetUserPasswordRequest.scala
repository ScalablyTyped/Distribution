package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminResetUserPasswordRequest extends js.Object {
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the AdminResetUserPassword API action, Amazon Cognito invokes the function that is assigned to the custom message trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your AdminResetUserPassword request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * The user pool ID for the user pool where you want to reset the user's password.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user whose password you wish to reset.
    */
  var Username: UsernameType = js.native
}

object AdminResetUserPasswordRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminResetUserPasswordRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResetUserPasswordRequest]
  }
  @scala.inline
  implicit class AdminResetUserPasswordRequestOps[Self <: AdminResetUserPasswordRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = this.set("ClientMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientMetadata: Self = this.set("ClientMetadata", js.undefined)
  }
  
}

