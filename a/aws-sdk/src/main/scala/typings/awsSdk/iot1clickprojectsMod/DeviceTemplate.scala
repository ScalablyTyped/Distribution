package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceTemplate extends StObject {
  
  /**
    * An optional Lambda function to invoke instead of the default Lambda function provided by the placement template.
    */
  var callbackOverrides: js.UndefOr[DeviceCallbackOverrideMap] = js.native
  
  /**
    * The device type, which currently must be "button".
    */
  var deviceType: js.UndefOr[DeviceType] = js.native
}
object DeviceTemplate {
  
  @scala.inline
  def apply(): DeviceTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTemplate]
  }
  
  @scala.inline
  implicit class DeviceTemplateMutableBuilder[Self <: DeviceTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackOverrides(value: DeviceCallbackOverrideMap): Self = StObject.set(x, "callbackOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackOverridesUndefined: Self = StObject.set(x, "callbackOverrides", js.undefined)
    
    @scala.inline
    def setDeviceType(value: DeviceType): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
  }
}
