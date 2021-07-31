package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetUserPoolMfaConfigResponse extends StObject {
  
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
}
object SetUserPoolMfaConfigResponse {
  
  @scala.inline
  def apply(): SetUserPoolMfaConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetUserPoolMfaConfigResponse]
  }
  
  @scala.inline
  implicit class SetUserPoolMfaConfigResponseMutableBuilder[Self <: SetUserPoolMfaConfigResponse] (val x: Self) extends AnyVal {
    
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
  }
}
