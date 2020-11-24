package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfigurationType extends js.Object {
  
  /**
    * Indicates whether a challenge is required on a new device. Only applicable to a new device.
    */
  var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.native
  
  /**
    * If true, a device is only remembered on user prompt.
    */
  var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.native
}
object DeviceConfigurationType {
  
  @scala.inline
  def apply(): DeviceConfigurationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfigurationType]
  }
  
  @scala.inline
  implicit class DeviceConfigurationTypeOps[Self <: DeviceConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setChallengeRequiredOnNewDevice(value: BooleanType): Self = this.set("ChallengeRequiredOnNewDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeRequiredOnNewDevice: Self = this.set("ChallengeRequiredOnNewDevice", js.undefined)
    
    @scala.inline
    def setDeviceOnlyRememberedOnUserPrompt(value: BooleanType): Self = this.set("DeviceOnlyRememberedOnUserPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceOnlyRememberedOnUserPrompt: Self = this.set("DeviceOnlyRememberedOnUserPrompt", js.undefined)
  }
}
