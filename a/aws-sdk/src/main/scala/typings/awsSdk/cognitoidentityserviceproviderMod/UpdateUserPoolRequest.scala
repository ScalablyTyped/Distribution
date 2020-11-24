package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(UserPoolId: UserPoolIdType): UpdateUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPoolRequest]
  }
  
  @scala.inline
  implicit class UpdateUserPoolRequestOps[Self <: UpdateUserPoolRequest] (val x: Self) extends AnyVal {
    
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountRecoverySetting(value: AccountRecoverySettingType): Self = this.set("AccountRecoverySetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountRecoverySetting: Self = this.set("AccountRecoverySetting", js.undefined)
    
    @scala.inline
    def setAdminCreateUserConfig(value: AdminCreateUserConfigType): Self = this.set("AdminCreateUserConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminCreateUserConfig: Self = this.set("AdminCreateUserConfig", js.undefined)
    
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
    def setVerificationMessageTemplate(value: VerificationMessageTemplateType): Self = this.set("VerificationMessageTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerificationMessageTemplate: Self = this.set("VerificationMessageTemplate", js.undefined)
  }
}
