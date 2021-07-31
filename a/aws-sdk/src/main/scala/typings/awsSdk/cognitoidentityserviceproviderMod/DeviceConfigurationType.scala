package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfigurationType extends StObject {
  
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * If true, a device is only remembered on user prompt.
    */
  var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined
}
object DeviceConfigurationType {
  
  @scala.inline
  def apply(): DeviceConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationType]
  }
  
  @scala.inline
  implicit class DeviceConfigurationTypeMutableBuilder[Self <: DeviceConfigurationType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChallengeRequiredOnNewDevice(value: BooleanType): Self = StObject.set(x, "ChallengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeRequiredOnNewDeviceUndefined: Self = StObject.set(x, "ChallengeRequiredOnNewDevice", js.undefined)
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPrompt(value: BooleanType): Self = StObject.set(x, "DeviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPromptUndefined: Self = StObject.set(x, "DeviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
