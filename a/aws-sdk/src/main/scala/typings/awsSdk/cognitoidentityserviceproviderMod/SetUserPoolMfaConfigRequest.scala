package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserPoolMfaConfigRequest extends StObject {
  
  /**
    * The MFA configuration. Valid values include:    OFF MFA will not be used for any users.    ON MFA is required for all users to sign in.    OPTIONAL MFA will be required only for individual users who have an MFA factor enabled.  
    */
  var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
  
  /**
    * The SMS text message MFA configuration.
    */
  var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined
  
  /**
    * The software token MFA configuration.
    */
  var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
  
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}
object SetUserPoolMfaConfigRequest {
  
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): SetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUserPoolMfaConfigRequest]
  }
  
  @scala.inline
  implicit class SetUserPoolMfaConfigRequestMutableBuilder[Self <: SetUserPoolMfaConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMfaConfiguration(value: UserPoolMfaType): Self = StObject.set(x, "MfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMfaConfigurationUndefined: Self = StObject.set(x, "MfaConfiguration", js.undefined)
    
    @scala.inline
    def setSmsMfaConfiguration(value: SmsMfaConfigType): Self = StObject.set(x, "SmsMfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMfaConfigurationUndefined: Self = StObject.set(x, "SmsMfaConfiguration", js.undefined)
    
    @scala.inline
    def setSoftwareTokenMfaConfiguration(value: SoftwareTokenMfaConfigType): Self = StObject.set(x, "SoftwareTokenMfaConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftwareTokenMfaConfigurationUndefined: Self = StObject.set(x, "SoftwareTokenMfaConfiguration", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
