package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInstance extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the device instance.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The ARN of the device.
    */
  var deviceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * A object that contains information about the instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
  
  /**
    * An array of strings that describe the device instance.
    */
  var labels: js.UndefOr[InstanceLabels] = js.undefined
  
  /**
    * The status of the device instance. Valid values are listed here.
    */
  var status: js.UndefOr[InstanceStatus] = js.undefined
  
  /**
    * Unique device identifier for the device instance.
    */
  var udid: js.UndefOr[String] = js.undefined
}
object DeviceInstance {
  
  inline def apply(): DeviceInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceInstance]
  }
  
  extension [Self <: DeviceInstance](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDeviceArn(value: AmazonResourceName): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "deviceArn", js.undefined)
    
    inline def setInstanceProfile(value: InstanceProfile): Self = StObject.set(x, "instanceProfile", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileUndefined: Self = StObject.set(x, "instanceProfile", js.undefined)
    
    inline def setLabels(value: InstanceLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setStatus(value: InstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
  }
}
