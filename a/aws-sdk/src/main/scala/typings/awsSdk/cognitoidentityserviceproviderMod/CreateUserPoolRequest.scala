package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolRequest extends js.Object {
  
  /**
    * Use this setting to define which verified available method a user can use to recover their password when they call ForgotPassword. It allows you to define a preferred method when a user has more than one method available. With this setting, SMS does not qualify for a valid password recovery mechanism if the user also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to determine the recovery method where SMS is preferred over email.
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
    * You can choose to set case sensitivity on the username input for the selected sign-in option. For example, when this is set to False, users will be able to sign in using either "username" or "Username". This configuration is immutable once it has been set. For more information, see UsernameConfigurationType.
    */
  var UsernameConfiguration: js.UndefOr[UsernameConfigurationType] = js.native
  
  /**
    * The template for the verification message that the user sees when the app requests permission to access the user's information.
    */
  var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.native
}
object CreateUserPoolRequest {
  
  @scala.inline
  def apply(PoolName: UserPoolNameType): CreateUserPoolRequest = {
    val __obj = js.Dynamic.literal(PoolName = PoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserPoolRequest]
  }
  
  @scala.inline
  implicit class CreateUserPoolRequestOps[Self <: CreateUserPoolRequest] (val x: Self) extends AnyVal {
    
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
    def setPoolName(value: UserPoolNameType): Self = this.set("PoolName", value.asInstanceOf[js.Any])
    
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
    def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = this.set("AutoVerifiedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = this.set("AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoVerifiedAttributes: Self = this.set("AutoVerifiedAttributes", js.undefined)
    
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfigurationType): Self = this.set("DeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceConfiguration: Self = this.set("DeviceConfiguration", js.undefined)
    
    @scala.inline
    def setEmailConfiguration(value: EmailConfigurationType): Self = this.set("EmailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailConfiguration: Self = this.set("EmailConfiguration", js.undefined)
    
    @scala.inline
    def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = this.set("EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailVerificationMessage: Self = this.set("EmailVerificationMessage", js.undefined)
    
    @scala.inline
    def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = this.set("EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailVerificationSubject: Self = this.set("EmailVerificationSubject", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaConfigType): Self = this.set("LambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaConfig: Self = this.set("LambdaConfig", js.undefined)
    
    @scala.inline
    def setMfaConfiguration(value: UserPoolMfaType): Self = this.set("MfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMfaConfiguration: Self = this.set("MfaConfiguration", js.undefined)
    
    @scala.inline
    def setPolicies(value: UserPoolPolicyType): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: SchemaAttributeType*): Self = this.set("Schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: SchemaAttributesListType): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("Schema", js.undefined)
    
    @scala.inline
    def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = this.set("SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsAuthenticationMessage: Self = this.set("SmsAuthenticationMessage", js.undefined)
    
    @scala.inline
    def setSmsConfiguration(value: SmsConfigurationType): Self = this.set("SmsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsConfiguration: Self = this.set("SmsConfiguration", js.undefined)
    
    @scala.inline
    def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = this.set("SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsVerificationMessage: Self = this.set("SmsVerificationMessage", js.undefined)
    
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
