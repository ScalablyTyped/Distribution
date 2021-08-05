package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolType extends StObject {
  
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
    */
  var AccountRecoverySetting: js.UndefOr[AccountRecoverySettingType] = js.undefined
  
  /**
    * The configuration for AdminCreateUser requests.
    */
  var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
  
  /**
    * Specifies the attributes that are aliased in a user pool.
    */
  var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the user pool.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * Specifies the attributes that are auto-verified in a user pool.
    */
  var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
  
  /**
    * The date the user pool was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  var CustomDomain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The device configuration.
    */
  var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
  
  /**
    * Holds the domain prefix if the user pool has a domain associated with it.
    */
  var Domain: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The email configuration.
    */
  var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
  
  /**
    * The reason why the email configuration cannot send the messages to your users.
    */
  var EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined
  
  /**
    * The contents of the email verification message.
    */
  var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * The subject of the email verification message.
    */
  var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * A number estimating the size of the user pool.
    */
  var EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined
  
  /**
    * The ID of the user pool.
    */
  var Id: js.UndefOr[UserPoolIdType] = js.undefined
  
  /**
    * The AWS Lambda triggers associated with the user pool.
    */
  var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
  
  /**
    * The date the user pool was last modified.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  
  /**
    * The name of the user pool.
    */
  var Name: js.UndefOr[UserPoolNameType] = js.undefined
  
  /**
    * The policies associated with the user pool.
    */
  var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
  
  /**
    * A container with the schema attributes of a user pool.
    */
  var SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.undefined
  
  /**
    * The contents of the SMS authentication message.
    */
  var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The SMS configuration.
    */
  var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  
  /**
    * The reason why the SMS configuration cannot send the messages to your users.
    */
  var SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined
  
  /**
    * The contents of the SMS verification message.
    */
  var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  
  /**
    * The status of a user pool.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
  
  /**
    * The user pool add-ons.
    */
  var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
  
  /**
    * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
    */
  var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
  
  /**
    * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
    */
  var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
  
  /**
    * You can choose to enable case sensitivity on the username input for the selected sign-in option. For example, when this is set to False, users will be able to sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see UsernameConfigurationType.
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.undefined
  
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
}
object UserPoolType {
  
  inline def apply(): UserPoolType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolType]
  }
  
  extension [Self <: UserPoolType](x: Self) {
    
    inline def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    inline def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    inline def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    inline def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
    inline def setAliasAttributes(value: AliasAttributesListType): Self = StObject.set(x, "AliasAttributes", value.asInstanceOf[js.Any])
    
    inline def setAliasAttributesUndefined: Self = StObject.set(x, "AliasAttributes", js.undefined)
    
    inline def setAliasAttributesVarargs(value: AliasAttributeType*): Self = StObject.set(x, "AliasAttributes", js.Array(value :_*))
    
    inline def setArn(value: ArnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = StObject.set(x, "AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "AutoVerifiedAttributes", js.undefined)
    
    inline def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AutoVerifiedAttributes", js.Array(value :_*))
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCustomDomain(value: DomainType): Self = StObject.set(x, "CustomDomain", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainUndefined: Self = StObject.set(x, "CustomDomain", js.undefined)
    
    inline def setDeviceConfiguration(value: DeviceConfigurationType): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    inline def setDomain(value: DomainType): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEmailConfiguration(value: EmailConfigurationType): Self = StObject.set(x, "EmailConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationFailure(value: StringType): Self = StObject.set(x, "EmailConfigurationFailure", value.asInstanceOf[js.Any])
    
    inline def setEmailConfigurationFailureUndefined: Self = StObject.set(x, "EmailConfigurationFailure", js.undefined)
    
    inline def setEmailConfigurationUndefined: Self = StObject.set(x, "EmailConfiguration", js.undefined)
    
    inline def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationMessageUndefined: Self = StObject.set(x, "EmailVerificationMessage", js.undefined)
    
    inline def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "EmailVerificationSubject", js.undefined)
    
    inline def setEstimatedNumberOfUsers(value: IntegerType): Self = StObject.set(x, "EstimatedNumberOfUsers", value.asInstanceOf[js.Any])
    
    inline def setEstimatedNumberOfUsersUndefined: Self = StObject.set(x, "EstimatedNumberOfUsers", js.undefined)
    
    inline def setId(value: UserPoolIdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    inline def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    inline def setLastModifiedDate(value: DateType): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setMfaConfiguration(value: UserPoolMfaType): Self = StObject.set(x, "MfaConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMfaConfigurationUndefined: Self = StObject.set(x, "MfaConfiguration", js.undefined)
    
    inline def setName(value: UserPoolNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPolicies(value: UserPoolPolicyType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    inline def setSchemaAttributes(value: SchemaAttributesListType): Self = StObject.set(x, "SchemaAttributes", value.asInstanceOf[js.Any])
    
    inline def setSchemaAttributesUndefined: Self = StObject.set(x, "SchemaAttributes", js.undefined)
    
    inline def setSchemaAttributesVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "SchemaAttributes", js.Array(value :_*))
    
    inline def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    inline def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationFailure(value: StringType): Self = StObject.set(x, "SmsConfigurationFailure", value.asInstanceOf[js.Any])
    
    inline def setSmsConfigurationFailureUndefined: Self = StObject.set(x, "SmsConfigurationFailure", js.undefined)
    
    inline def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
    
    inline def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsVerificationMessageUndefined: Self = StObject.set(x, "SmsVerificationMessage", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserPoolAddOns(value: UserPoolAddOnsType): Self = StObject.set(x, "UserPoolAddOns", value.asInstanceOf[js.Any])
    
    inline def setUserPoolAddOnsUndefined: Self = StObject.set(x, "UserPoolAddOns", js.undefined)
    
    inline def setUserPoolTags(value: UserPoolTagsType): Self = StObject.set(x, "UserPoolTags", value.asInstanceOf[js.Any])
    
    inline def setUserPoolTagsUndefined: Self = StObject.set(x, "UserPoolTags", js.undefined)
    
    inline def setUsernameAttributes(value: UsernameAttributesListType): Self = StObject.set(x, "UsernameAttributes", value.asInstanceOf[js.Any])
    
    inline def setUsernameAttributesUndefined: Self = StObject.set(x, "UsernameAttributes", js.undefined)
    
    inline def setUsernameAttributesVarargs(value: UsernameAttributeType*): Self = StObject.set(x, "UsernameAttributes", js.Array(value :_*))
    
    inline def setUsernameConfiguration(value: UsernameConfigurationType): Self = StObject.set(x, "UsernameConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUsernameConfigurationUndefined: Self = StObject.set(x, "UsernameConfiguration", js.undefined)
    
    inline def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = StObject.set(x, "VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    inline def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "VerificationMessageTemplate", js.undefined)
  }
}
