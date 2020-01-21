package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserPoolRequest extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user pools.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * Device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * Email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The AWS Lambda configuration information from the request to update the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * A container with the policies you wish to update in a user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * A container with information about the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The user pool ID for the user pool you want to update.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object UpdateUserPoolRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    AccountRecoverySetting: AccountRecoverySettingType = null,
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    LambdaConfig: LambdaConfigType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Policies: UserPoolPolicyType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (AccountRecoverySetting != null) __obj.updateDynamic("AccountRecoverySetting")(AccountRecoverySetting.asInstanceOf[js.Any])
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig.asInstanceOf[js.Any])
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes.asInstanceOf[js.Any])
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration.asInstanceOf[js.Any])
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration.asInstanceOf[js.Any])
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage.asInstanceOf[js.Any])
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject.asInstanceOf[js.Any])
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig.asInstanceOf[js.Any])
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage.asInstanceOf[js.Any])
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration.asInstanceOf[js.Any])
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage.asInstanceOf[js.Any])
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns.asInstanceOf[js.Any])
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags.asInstanceOf[js.Any])
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
}

