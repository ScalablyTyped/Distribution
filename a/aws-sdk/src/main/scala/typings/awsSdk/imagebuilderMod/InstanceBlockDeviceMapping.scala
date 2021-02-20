package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceBlockDeviceMapping extends StObject {
  
  /**
    * The device to which these mappings apply.
    */
  var deviceName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Use to manage Amazon EBS-specific configuration for this mapping.
    */
  var ebs: js.UndefOr[EbsInstanceBlockDeviceSpecification] = js.native
  
  /**
    * Use to remove a mapping from the parent image.
    */
  var noDevice: js.UndefOr[EmptyString] = js.native
  
  /**
    * Use to manage instance ephemeral devices.
    */
  var virtualName: js.UndefOr[NonEmptyString] = js.native
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
    def setDeviceName(value: NonEmptyString): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: EbsInstanceBlockDeviceSpecification): Self = StObject.set(x, "ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: EmptyString): Self = StObject.set(x, "noDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "noDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: NonEmptyString): Self = StObject.set(x, "virtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "virtualName", js.undefined)
  }
}
