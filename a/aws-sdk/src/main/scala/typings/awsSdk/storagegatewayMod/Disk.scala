package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disk extends StObject {
  
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId.
    */
  var DiskAllocationResource: js.UndefOr[String] = js.native
  
  var DiskAllocationType: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskAllocationType] = js.native
  
  var DiskAttributeList: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskAttributeList] = js.native
  
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskId] = js.native
  
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[String] = js.native
  
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[String] = js.native
  
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.native
  
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[String] = js.native
}
object Disk {
  
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  @scala.inline
  implicit class DiskMutableBuilder[Self <: Disk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskAllocationResource(value: String): Self = StObject.set(x, "DiskAllocationResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskAllocationResourceUndefined: Self = StObject.set(x, "DiskAllocationResource", js.undefined)
    
    @scala.inline
    def setDiskAllocationType(value: DiskAllocationType): Self = StObject.set(x, "DiskAllocationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskAllocationTypeUndefined: Self = StObject.set(x, "DiskAllocationType", js.undefined)
    
    @scala.inline
    def setDiskAttributeList(value: DiskAttributeList): Self = StObject.set(x, "DiskAttributeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskAttributeListUndefined: Self = StObject.set(x, "DiskAttributeList", js.undefined)
    
    @scala.inline
    def setDiskAttributeListVarargs(value: DiskAttribute*): Self = StObject.set(x, "DiskAttributeList", js.Array(value :_*))
    
    @scala.inline
    def setDiskId(value: DiskId): Self = StObject.set(x, "DiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskIdUndefined: Self = StObject.set(x, "DiskId", js.undefined)
    
    @scala.inline
    def setDiskNode(value: String): Self = StObject.set(x, "DiskNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskNodeUndefined: Self = StObject.set(x, "DiskNode", js.undefined)
    
    @scala.inline
    def setDiskPath(value: String): Self = StObject.set(x, "DiskPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskPathUndefined: Self = StObject.set(x, "DiskPath", js.undefined)
    
    @scala.inline
    def setDiskSizeInBytes(value: long): Self = StObject.set(x, "DiskSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeInBytesUndefined: Self = StObject.set(x, "DiskSizeInBytes", js.undefined)
    
    @scala.inline
    def setDiskStatus(value: String): Self = StObject.set(x, "DiskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskStatusUndefined: Self = StObject.set(x, "DiskStatus", js.undefined)
  }
}
