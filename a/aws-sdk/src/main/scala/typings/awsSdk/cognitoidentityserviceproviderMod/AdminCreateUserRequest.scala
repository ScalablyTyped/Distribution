package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminCreateUserRequest extends js.Object {
  /**
    * A map of custom key-value pairs that you can provide as input for any custom workflows that this action triggers.  You create custom workflows by assigning AWS Lambda functions to user pool triggers. When you use the AdminCreateUser API action, Amazon Cognito invokes the function that is assigned to the pre sign-up trigger. When Amazon Cognito invokes this function, it passes a JSON payload, which the function receives as input. This payload contains a clientMetadata attribute, which provides the data that you assigned to the ClientMetadata parameter in your AdminCreateUser request. In your function code in AWS Lambda, you can process the clientMetadata value to enhance your workflow for your specific needs. For more information, see Customizing User Pool Workflows with Lambda Triggers in the Amazon Cognito Developer Guide.  Take the following limitations into consideration when you use the ClientMetadata parameter:   Amazon Cognito does not store the ClientMetadata value. This data is available only to AWS Lambda triggers that are assigned to a user pool to support custom workflows. If your user pool configuration does not include triggers, the ClientMetadata parameter serves no purpose.   Amazon Cognito does not validate the ClientMetadata value.   Amazon Cognito does not encrypt the the ClientMetadata value, so don't use it to provide sensitive information.   
    */
  var ClientMetadata: js.UndefOr[ClientMetadataType] = js.native
  /**
    * Specify "EMAIL" if email will be used to send the welcome message. Specify "SMS" if the phone number will be used. The default value is "SMS". More than one value can be specified.
    */
  var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.native
  /**
    * This parameter is only used if the phone_number_verified or email_verified attribute is set to True. Otherwise, it is ignored. If this parameter is set to True and the phone number or email address specified in the UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. If this parameter is set to False, the API throws an AliasExistsException error if the alias already exists. The default value is False.
    */
  var ForceAliasCreation: js.UndefOr[typings.awsSdk.cognitoidentityserviceproviderMod.ForceAliasCreation] = js.native
  /**
    * Set to "RESEND" to resend the invitation message to a user that already exists and reset the expiration limit on the user's account. Set to "SUPPRESS" to suppress sending the message. Only one value can be specified.
    */
  var MessageAction: js.UndefOr[MessageActionType] = js.native
  /**
    * The user's temporary password. This password must conform to the password policy that you specified when you created the user pool. The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the temporary password in the sign-in page along with a new password to be used in all future sign-ins. This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you. The temporary password can only be used until the user account expiration limit that you specified when you created the user pool. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
    */
  var TemporaryPassword: js.UndefOr[PasswordType] = js.native
  /**
    * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be created. You can create a user without specifying any attributes other than Username. However, any attributes that you specify as required (in or in the Attributes tab of the console) must be supplied either by you (in your call to AdminCreateUser) or by the user (when he or she signs up in response to your welcome message). For custom attributes, you must prepend the custom: prefix to the attribute name. To send a message inviting the user to sign up, you must specify the user's email address or phone number. This can be done in your call to AdminCreateUser or in the Users tab of the Amazon Cognito console for managing your user pools. In your call to AdminCreateUser, you can set the email_verified attribute to True, and you can set the phone_number_verified attribute to True. (You can also do this by calling .)    email: The email address of the user to whom the message that contains the code and username will be sent. Required if the email_verified attribute is set to True, or if "EMAIL" is specified in the DesiredDeliveryMediums parameter.    phone_number: The phone number of the user to whom the message that contains the code and username will be sent. Required if the phone_number_verified attribute is set to True, or if "SMS" is specified in the DesiredDeliveryMediums parameter.  
    */
  var UserAttributes: js.UndefOr[AttributeListType] = js.native
  /**
    * The user pool ID for the user pool where the user will be created.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128 characters. After the user is created, the username cannot be changed.
    */
  var Username: UsernameType = js.native
  /**
    * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. For example, you might choose to allow or disallow user sign-up based on the user's domain. To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation process. The user's validation data is not persisted.
    */
  var ValidationData: js.UndefOr[AttributeListType] = js.native
}

object AdminCreateUserRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    Username: UsernameType,
    ClientMetadata: ClientMetadataType = null,
    DesiredDeliveryMediums: DeliveryMediumListType = null,
    ForceAliasCreation: js.UndefOr[Boolean] = js.undefined,
    MessageAction: MessageActionType = null,
    TemporaryPassword: PasswordType = null,
    UserAttributes: AttributeListType = null,
    ValidationData: AttributeListType = null
  ): AdminCreateUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (ClientMetadata != null) __obj.updateDynamic("ClientMetadata")(ClientMetadata.asInstanceOf[js.Any])
    if (DesiredDeliveryMediums != null) __obj.updateDynamic("DesiredDeliveryMediums")(DesiredDeliveryMediums.asInstanceOf[js.Any])
    if (!js.isUndefined(ForceAliasCreation)) __obj.updateDynamic("ForceAliasCreation")(ForceAliasCreation.asInstanceOf[js.Any])
    if (MessageAction != null) __obj.updateDynamic("MessageAction")(MessageAction.asInstanceOf[js.Any])
    if (TemporaryPassword != null) __obj.updateDynamic("TemporaryPassword")(TemporaryPassword.asInstanceOf[js.Any])
    if (UserAttributes != null) __obj.updateDynamic("UserAttributes")(UserAttributes.asInstanceOf[js.Any])
    if (ValidationData != null) __obj.updateDynamic("ValidationData")(ValidationData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminCreateUserRequest]
  }
}

