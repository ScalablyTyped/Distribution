package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDeviceMapping extends StObject {
  
  /**
    * The device name that is exposed to the instance, such as /dev/sdh. For the root device, you can use the explicit device name or you can set this parameter to ROOT_DEVICE and AWS OpsWorks Stacks will provide the correct device name.
    */
  var DeviceName: js.UndefOr[String] = js.native
  
  /**
    * An EBSBlockDevice that defines how to configure an Amazon EBS volume when the instance is launched.
    */
  var Ebs: js.UndefOr[EbsBlockDevice] = js.native
  
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var NoDevice: js.UndefOr[String] = js.native
  
  /**
    * The virtual device name. For more information, see BlockDeviceMapping.
    */
  var VirtualName: js.UndefOr[String] = js.native
}
object BlockDeviceMapping {
  
  @scala.inline
  def apply(): BlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockDeviceMapping]
  }
  
  @scala.inline
  implicit class BlockDeviceMappingMutableBuilder[Self <: BlockDeviceMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setEbs(value: EbsBlockDevice): Self = StObject.set(x, "Ebs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsUndefined: Self = StObject.set(x, "Ebs", js.undefined)
    
    @scala.inline
    def setNoDevice(value: String): Self = StObject.set(x, "NoDevice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDeviceUndefined: Self = StObject.set(x, "NoDevice", js.undefined)
    
    @scala.inline
    def setVirtualName(value: String): Self = StObject.set(x, "VirtualName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNameUndefined: Self = StObject.set(x, "VirtualName", js.undefined)
  }
}
