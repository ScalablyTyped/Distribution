package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserAttributesRequest extends js.Object {
  /**
    * The access token for the request to update user attributes.
    */
  var AccessToken: TokenModelType = js.native
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the UpdateUserAttributes API action, Amazon Cognito invokes the function that is assigned to the custom message trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your UpdateUserAttributes request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
    */
  var UserAttributes: AttributeListType = js.native
}

object UpdateUserAttributesRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType, UserAttributes: AttributeListType): UpdateUserAttributesRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any], UserAttributes = UserAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserAttributesRequest]
  }
  @scala.inline
  implicit class UpdateUserAttributesRequestOps[Self <: UpdateUserAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: TokenModelType): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserAttributesVarargs(value: AttributeType*): Self = this.set("UserAttributes", js.Array(value :_*))
    @scala.inline
    def setUserAttributes(value: AttributeListType): Self = this.set("UserAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientMetadata(value: ClientMetadataType): Self = this.set("ClientMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientMetadata: Self = this.set("ClientMetadata", js.undefined)
  }
  
}

