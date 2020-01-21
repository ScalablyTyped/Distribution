package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolType extends js.Object {
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.native
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.native
  /**
    * Specifies the attributes that are aliased in a user pool.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.native
  /**
    * The Amazon Resource Name (ARN) for the user pool.
    */
  var Arn: js.UndefOr[ArnType] = js.native
  /**
    * Specifies the attributes that are auto-verified in a user pool.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.native
  /**
    * The date the user pool was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  var CustomDomain: js.UndefOr[DomainType] = js.native
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.native
  /**
    * Holds the domain prefix if the user pool has a domain associated with it.
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.native
  /**
    * The reason why the email configuration cannot send the messages to your users.
    */
  var EmailConfigurationFailure: js.UndefOr[StringType] = js.native
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * A number estimating the size of the user pool.
    */
  var EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.native
  /**
    * The ID of the user pool.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.native
  /**
    * The AWS Lambda triggers associated with the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.native
  /**
    * The date the user pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.native
  /**
    * The name of the user pool.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.native
  /**
    * The policies associated with the user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.native
  /**
    * A container with the schema attributes of a user pool.
    */
  var SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.native
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.native
  /**
    * The reason why the SMS configuration cannot send the messages to your users.
    */
  var SmsConfigurationFailure: js.UndefOr[StringType] = js.native
  /**
    * The contents of the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.native
  /**
    * The status of a user pool.
    */
  var Status: js.UndefOr[StatusType] = js.native
  /**
    * The user pool add-ons.
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.native
  /**
    * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.native
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.native
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}

object UserPoolType {
  @scala.inline
  def apply(
    AccountRecoverySetting: AccountRecoverySettingType = null,
    AdminCreateUserConfig: AdminCreateUserConfigType = null,
    AliasAttributes: AliasAttributesListType = null,
    Arn: ArnType = null,
    AutoVerifiedAttributes: VerifiedAttributesListType = null,
    CreationDate: DateType = null,
    CustomDomain: DomainType = null,
    DeviceConfiguration: DeviceConfigurationType = null,
    Domain: DomainType = null,
    EmailConfiguration: EmailConfigurationType = null,
    EmailConfigurationFailure: StringType = null,
    EmailVerificationMessage: EmailVerificationMessageType = null,
    EmailVerificationSubject: EmailVerificationSubjectType = null,
    EstimatedNumberOfUsers: Int | Double = null,
    Id: UserPoolIdType = null,
    LambdaConfig: LambdaConfigType = null,
    LastModifiedDate: DateType = null,
    MfaConfiguration: UserPoolMfaType = null,
    Name: UserPoolNameType = null,
    Policies: UserPoolPolicyType = null,
    SchemaAttributes: SchemaAttributesListType = null,
    SmsAuthenticationMessage: SmsVerificationMessageType = null,
    SmsConfiguration: SmsConfigurationType = null,
    SmsConfigurationFailure: StringType = null,
    SmsVerificationMessage: SmsVerificationMessageType = null,
    Status: StatusType = null,
    UserPoolAddOns: UserPoolAddOnsType = null,
    UserPoolTags: UserPoolTagsType = null,
    UsernameAttributes: UsernameAttributesListType = null,
    VerificationMessageTemplate: VerificationMessageTemplateType = null
  ): UserPoolType = {
    val __obj = js.Dynamic.literal()
    if (AccountRecoverySetting != null) __obj.updateDynamic("AccountRecoverySetting")(AccountRecoverySetting.asInstanceOf[js.Any])
    if (AdminCreateUserConfig != null) __obj.updateDynamic("AdminCreateUserConfig")(AdminCreateUserConfig.asInstanceOf[js.Any])
    if (AliasAttributes != null) __obj.updateDynamic("AliasAttributes")(AliasAttributes.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (AutoVerifiedAttributes != null) __obj.updateDynamic("AutoVerifiedAttributes")(AutoVerifiedAttributes.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CustomDomain != null) __obj.updateDynamic("CustomDomain")(CustomDomain.asInstanceOf[js.Any])
    if (DeviceConfiguration != null) __obj.updateDynamic("DeviceConfiguration")(DeviceConfiguration.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (EmailConfiguration != null) __obj.updateDynamic("EmailConfiguration")(EmailConfiguration.asInstanceOf[js.Any])
    if (EmailConfigurationFailure != null) __obj.updateDynamic("EmailConfigurationFailure")(EmailConfigurationFailure.asInstanceOf[js.Any])
    if (EmailVerificationMessage != null) __obj.updateDynamic("EmailVerificationMessage")(EmailVerificationMessage.asInstanceOf[js.Any])
    if (EmailVerificationSubject != null) __obj.updateDynamic("EmailVerificationSubject")(EmailVerificationSubject.asInstanceOf[js.Any])
    if (EstimatedNumberOfUsers != null) __obj.updateDynamic("EstimatedNumberOfUsers")(EstimatedNumberOfUsers.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LambdaConfig != null) __obj.updateDynamic("LambdaConfig")(LambdaConfig.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (MfaConfiguration != null) __obj.updateDynamic("MfaConfiguration")(MfaConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (SchemaAttributes != null) __obj.updateDynamic("SchemaAttributes")(SchemaAttributes.asInstanceOf[js.Any])
    if (SmsAuthenticationMessage != null) __obj.updateDynamic("SmsAuthenticationMessage")(SmsAuthenticationMessage.asInstanceOf[js.Any])
    if (SmsConfiguration != null) __obj.updateDynamic("SmsConfiguration")(SmsConfiguration.asInstanceOf[js.Any])
    if (SmsConfigurationFailure != null) __obj.updateDynamic("SmsConfigurationFailure")(SmsConfigurationFailure.asInstanceOf[js.Any])
    if (SmsVerificationMessage != null) __obj.updateDynamic("SmsVerificationMessage")(SmsVerificationMessage.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserPoolAddOns != null) __obj.updateDynamic("UserPoolAddOns")(UserPoolAddOns.asInstanceOf[js.Any])
    if (UserPoolTags != null) __obj.updateDynamic("UserPoolTags")(UserPoolTags.asInstanceOf[js.Any])
    if (UsernameAttributes != null) __obj.updateDynamic("UsernameAttributes")(UsernameAttributes.asInstanceOf[js.Any])
    if (VerificationMessageTemplate != null) __obj.updateDynamic("VerificationMessageTemplate")(VerificationMessageTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolType]
  }
}

