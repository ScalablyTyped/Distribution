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
  
  @scala.inline
  def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  
  @scala.inline
  implicit class InstanceBlockDeviceMappingMutableBuilder[Self <: InstanceBlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: EbsInstanceBlockDevice): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
  }
}
