package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceBlockDeviceMapping extends StObject {
  
  /**
    * The device to which these mappings apply.
    */
  var deviceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Use to manage Amazon EBS-specific configuration for this mapping.
    */
  var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.undefined
  
  /**
    * Use to remove a mapping from the base image.
    */
  var noDevice: js.UndefOr[EmptyString] = js.undefined
  
  /**
    * Use to manage instance ephemeral devices.
    */
  var virtualName: js.UndefOr[NonEmptyString] = js.undefined
}
object InstanceBlockDeviceMapping {
  
  inline def apply(): InstanceBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceBlockDeviceMapping]
  }
  
  extension [Self <: InstanceBlockDeviceMapping](x: Self) {
    
    inline def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setEbs(value: EbsInstanceBlockDeviceSpecification): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    inline def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    inline def setNoDevice(value: EmptyString): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    inline def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    inline def setVirtualName(value: NonEmptyString): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    inline def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
