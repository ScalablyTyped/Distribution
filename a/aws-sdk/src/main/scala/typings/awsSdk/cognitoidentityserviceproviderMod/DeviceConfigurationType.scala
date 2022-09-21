package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfigurationType extends StObject {
  
  /**
    * When true, a remembered device can sign in with device authentication instead of SMS and time-based one-time password (TOTP) factors for multi-factor authentication (MFA).  Whether or not ChallengeRequiredOnNewDevice is true, users who sign in with devices that have not been confirmed or remembered must still provide a second factor in a user pool that requires MFA. 
    */
  var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * When true, Amazon Cognito doesn't automatically remember a user's device when your app sends a  ConfirmDevice API request. In your app, create a prompt for your user to choose whether they want to remember their device. Return the user's choice in an  UpdateDeviceStatus API request. When DeviceOnlyRememberedOnUserPrompt is false, Amazon Cognito immediately remembers devices that you register in a ConfirmDevice API request.
    */
  var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined
}
object DeviceConfigurationType {
  
  inline def apply(): DeviceConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationType]
  }
  
  extension [Self <: DeviceConfigurationType](x: Self) {
    
    inline def setChallengeRequiredOnNewDevice(value: BooleanType): Self = StObject.set(x, "ChallengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    inline def setChallengeRequiredOnNewDeviceUndefined: Self = StObject.set(x, "ChallengeRequiredOnNewDevice", js.undefined)
    
    inline def setDeviceOnlyRememberedOnUserPrompt(value: BooleanType): Self = StObject.set(x, "DeviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    inline def setDeviceOnlyRememberedOnUserPromptUndefined: Self = StObject.set(x, "DeviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
