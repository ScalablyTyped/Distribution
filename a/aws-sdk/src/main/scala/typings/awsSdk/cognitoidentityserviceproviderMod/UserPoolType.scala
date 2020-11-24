package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * You can choose to enable case sensitivity on the username input for the selected sign-in option. For example, when this is set to False, users will be able to sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see UsernameConfigurationType.
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.native
  
  /**
    * The template for verification messages.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}
object UserPoolType {
  
  @scala.inline
  def apply(): UserPoolType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolType]
  }
  
  @scala.inline
  implicit class UserPoolTypeOps[Self <: UserPoolType] (val x: Self) extends AnyVal {
    
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
    def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = this.set("AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountRecoverySetting: Self = this.set("AccountRecoverySetting", js.undefined)
    
    @scala.inline
    def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = this.set("AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminCreateUserConfig: Self = this.set("AdminCreateUserConfig", js.undefined)
    
    @scala.inline
    def setAliasAttributesVarargs(value: AliasAttributeType*): Self = this.set("AliasAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAliasAttributes(value: AliasAttributesListType): Self = this.set("AliasAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasAttributes: Self = this.set("AliasAttributes", js.undefined)
    
    @scala.inline
    def setArn(value: ArnType): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = this.set("AutoVerifiedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = this.set("AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoVerifiedAttributes: Self = this.set("AutoVerifiedAttributes", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setCustomDomain(value: DomainType): Self = this.set("CustomDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDomain: Self = this.set("CustomDomain", js.undefined)
    
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfigurationType): Self = this.set("DeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfiguration: Self = this.set("DeviceConfiguration", js.undefined)
    
    @scala.inline
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setEmailConfiguration(value: EmailConfigurationType): Self = this.set("EmailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailConfiguration: Self = this.set("EmailConfiguration", js.undefined)
    
    @scala.inline
    def setEmailConfigurationFailure(value: StringType): Self = this.set("EmailConfigurationFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailConfigurationFailure: Self = this.set("EmailConfigurationFailure", js.undefined)
    
    @scala.inline
    def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = this.set("EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailVerificationMessage: Self = this.set("EmailVerificationMessage", js.undefined)
    
    @scala.inline
    def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = this.set("EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailVerificationSubject: Self = this.set("EmailVerificationSubject", js.undefined)
    
    @scala.inline
    def setEstimatedNumberOfUsers(value: IntegerType): Self = this.set("EstimatedNumberOfUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedNumberOfUsers: Self = this.set("EstimatedNumberOfUsers", js.undefined)
    
    @scala.inline
    def setId(value: UserPoolIdType): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaConfigType): Self = this.set("LambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaConfig: Self = this.set("LambdaConfig", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setMfaConfiguration(value: UserPoolMfaType): Self = this.set("MfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMfaConfiguration: Self = this.set("MfaConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: UserPoolNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPolicies(value: UserPoolPolicyType): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setSchemaAttributesVarargs(value: SchemaAttributeType*): Self = this.set("SchemaAttributes", js.Array(value :_*))
    
    @scala.inline
    def setSchemaAttributes(value: SchemaAttributesListType): Self = this.set("SchemaAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaAttributes: Self = this.set("SchemaAttributes", js.undefined)
    
    @scala.inline
    def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = this.set("SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsAuthenticationMessage: Self = this.set("SmsAuthenticationMessage", js.undefined)
    
    @scala.inline
    def setSmsConfiguration(value: SmsConfigurationType): Self = this.set("SmsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsConfiguration: Self = this.set("SmsConfiguration", js.undefined)
    
    @scala.inline
    def setSmsConfigurationFailure(value: StringType): Self = this.set("SmsConfigurationFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsConfigurationFailure: Self = this.set("SmsConfigurationFailure", js.undefined)
    
    @scala.inline
    def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = this.set("SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsVerificationMessage: Self = this.set("SmsVerificationMessage", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserPoolAddOns(value: UserPoolAddOnsType): Self = this.set("UserPoolAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolAddOns: Self = this.set("UserPoolAddOns", js.undefined)
    
    @scala.inline
    def setUserPoolTags(value: UserPoolTagsType): Self = this.set("UserPoolTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolTags: Self = this.set("UserPoolTags", js.undefined)
    
    @scala.inline
    def setUsernameAttributesVarargs(value: UsernameAttributeType*): Self = this.set("UsernameAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUsernameAttributes(value: UsernameAttributesListType): Self = this.set("UsernameAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameAttributes: Self = this.set("UsernameAttributes", js.undefined)
    
    @scala.inline
    def setUsernameConfiguration(value: UsernameConfigurationType): Self = this.set("UsernameConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameConfiguration: Self = this.set("UsernameConfiguration", js.undefined)
    
    @scala.inline
    def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = this.set("VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationMessageTemplate: Self = this.set("VerificationMessageTemplate", js.undefined)
  }
}
