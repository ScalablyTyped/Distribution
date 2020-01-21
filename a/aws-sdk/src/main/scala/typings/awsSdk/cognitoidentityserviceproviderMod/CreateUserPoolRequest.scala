package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserPoolRequest extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.  Starting February 1, 2020, the value of AccountRecoverySetting will default to verified_email first and verified_phone_number as the second option for newly created user pools if no value is provided. 
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.native
  /**
    * The attributes to be auto-verified. Possible values: email, phone_number.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * A string representing the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * A string representing the email verification subject.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The Lambda trigger configuration information for the new user pool.  In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function. So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.  For more information on using the Lambda API to add permission, see  AddPermission .  For adding permission using the AWS CLI, see  add-permission . 
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * Specifies MFA configuration details.
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The policies associated with the new user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * A string used to name the user pool.
    */
  var PoolName: UserPoolNameType = js.native
  /**
    * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
    */
  var Schema: js.UndefOr[SchemaAttributesListType] = js.native
  /**
    * A string representing the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * A string representing the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.native
  /**
    * The template for the verification message that the user sees when the app requests permission to access the user's information.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object CreateUserPoolRequest {
  @scala.inline
  def apply(
    PoolName: UserPoolNameType,
    AccountRecoverySetting: AccountRecoverySettingType = null,
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AliasAttributes: AliasAttributesListType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    LambdaConfig: LambdaConfigType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Policies: UserPoolPolicyType = null,
    Schema: SchemaAttributesListType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    UsernameAttributes: UsernameAttributesListType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): CreateUserPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    if (AccountRecoverySetting != null) __obj.updateDynamic("AccountRecoverySetting")(AccountRecoverySetting.asInstanceOf[js.Any])
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig.asInstanceOf[js.Any])
    if (AliasAttributes != null) __obj.updateDynamic("AliasAttributes")(AliasAttributes.asInstanceOf[js.Any])
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes.asInstanceOf[js.Any])
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration.asInstanceOf[js.Any])
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration.asInstanceOf[js.Any])
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage.asInstanceOf[js.Any])
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject.asInstanceOf[js.Any])
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig.asInstanceOf[js.Any])
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (Schema != null) __obj.updateDynamic("Schema")(Schema.asInstanceOf[js.Any])
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage.asInstanceOf[js.Any])
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration.asInstanceOf[js.Any])
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage.asInstanceOf[js.Any])
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns.asInstanceOf[js.Any])
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags.asInstanceOf[js.Any])
    if (UsernameAttributes != null) __obj.updateDynamic("UsernameAttributes")(UsernameAttributes.asInstanceOf[js.Any])
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolRequest]
  }
}

