package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserPoolRequest extends StObject {
  
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
  def apply(UserPoolId: UserPoolIdType): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
  
  @scala.inline
  implicit class UpdateUserPoolRequestMutableBuilder[Self <: UpdateUserPoolRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = StObject.set(x, "AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountRecoverySettingUndefined: Self = StObject.set(x, "AccountRecoverySetting", js.undefined)
    
    @scala.inline
    def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = StObject.set(x, "AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminCreateUserConfigUndefined: Self = StObject.set(x, "AdminCreateUserConfig", js.undefined)
    
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
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolTags(value: UserPoolTagsType): Self = StObject.set(x, "UserPoolTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolTagsUndefined: Self = StObject.set(x, "UserPoolTags", js.undefined)
    
    @scala.inline
    def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = StObject.set(x, "VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationMessageTemplateUndefined: Self = StObject.set(x, "VerificationMessageTemplate", js.undefined)
  }
}
