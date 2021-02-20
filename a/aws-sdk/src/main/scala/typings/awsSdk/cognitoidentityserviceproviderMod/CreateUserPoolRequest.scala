package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserPoolRequest extends StObject {
  
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
  implicit class CreateUserPoolRequestMutableBuilder[Self <: CreateUserPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    @scala.inline
    def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
    @scala.inline
    def setAliasAttributes(value: AliasAttributesListType): Self = StObject.set(x, "AliasAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasAttributesUndefined: Self = StObject.set(x, "AliasAttributes", js.undefined)
    
    @scala.inline
    def setAliasAttributesVarargs(value: AliasAttributeType*): Self = StObject.set(x, "AliasAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAutoVerifiedAttributes(value: VerifiedAttributesListType): Self = StObject.set(x, "AutoVerifiedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoVerifiedAttributesUndefined: Self = StObject.set(x, "AutoVerifiedAttributes", js.undefined)
    
    @scala.inline
    def setAutoVerifiedAttributesVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AutoVerifiedAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDeviceConfiguration(value: DeviceConfigurationType): Self = StObject.set(x, "DeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceConfigurationUndefined: Self = StObject.set(x, "DeviceConfiguration", js.undefined)
    
    @scala.inline
    def setEmailConfiguration(value: EmailConfigurationType): Self = StObject.set(x, "EmailConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailConfigurationUndefined: Self = StObject.set(x, "EmailConfiguration", js.undefined)
    
    @scala.inline
    def setEmailVerificationMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerificationMessageUndefined: Self = StObject.set(x, "EmailVerificationMessage", js.undefined)
    
    @scala.inline
    def setEmailVerificationSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailVerificationSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailVerificationSubjectUndefined: Self = StObject.set(x, "EmailVerificationSubject", js.undefined)
    
    @scala.inline
    def setLambdaConfig(value: LambdaConfigType): Self = StObject.set(x, "LambdaConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaConfigUndefined: Self = StObject.set(x, "LambdaConfig", js.undefined)
    
    @scala.inline
    def setMfaConfiguration(value: UserPoolMfaType): Self = StObject.set(x, "MfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaConfigurationUndefined: Self = StObject.set(x, "MfaConfiguration", js.undefined)
    
    @scala.inline
    def setPolicies(value: UserPoolPolicyType): Self = StObject.set(x, "Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "Policies", js.undefined)
    
    @scala.inline
    def setPoolName(value: UserPoolNameType): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: SchemaAttributesListType): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: SchemaAttributeType*): Self = StObject.set(x, "Schema", js.Array(value :_*))
    
    @scala.inline
    def setSmsAuthenticationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsAuthenticationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsAuthenticationMessageUndefined: Self = StObject.set(x, "SmsAuthenticationMessage", js.undefined)
    
    @scala.inline
    def setSmsConfiguration(value: SmsConfigurationType): Self = StObject.set(x, "SmsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsConfigurationUndefined: Self = StObject.set(x, "SmsConfiguration", js.undefined)
    
    @scala.inline
    def setSmsVerificationMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsVerificationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsVerificationMessageUndefined: Self = StObject.set(x, "SmsVerificationMessage", js.undefined)
    
    @scala.inline
    def setUserPoolAddOns(value: UserPoolAddOnsType): Self = StObject.set(x, "UserPoolAddOns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolAddOnsUndefined: Self = StObject.set(x, "UserPoolAddOns", js.undefined)
    
    @scala.inline
    def setUserPoolTags(value: UserPoolTagsType): Self = StObject.set(x, "UserPoolTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolTagsUndefined: Self = StObject.set(x, "UserPoolTags", js.undefined)
    
    @scala.inline
    def setUsernameAttributes(value: UsernameAttributesListType): Self = StObject.set(x, "UsernameAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameAttributesUndefined: Self = StObject.set(x, "UsernameAttributes", js.undefined)
    
    @scala.inline
    def setUsernameAttributesVarargs(value: UsernameAttributeType*): Self = StObject.set(x, "UsernameAttributes", js.Array(value :_*))
    
    @scala.inline
    def setUsernameConfiguration(value: UsernameConfigurationType): Self = StObject.set(x, "UsernameConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameConfigurationUndefined: Self = StObject.set(x, "UsernameConfiguration", js.undefined)
    
    @scala.inline
    def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = StObject.set(x, "VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "VerificationMessageTemplate", js.undefined)
  }
}
