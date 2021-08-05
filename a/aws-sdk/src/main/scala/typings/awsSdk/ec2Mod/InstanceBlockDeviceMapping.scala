package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceBlockDeviceMapping extends StObject {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters used to automatically set up EBS volumes when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsInstanceBlockDevice] = js.undefined
}
object InstanceBlockDeviceMapping {
  
  inline def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  
  extension [Self <: InstanceBlockDeviceMapping](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEbs(value: EbsInstanceBlockDevice): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
  }
}
