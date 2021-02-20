package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDiskSnapshotRequest extends StObject {
  
  /**
    * The unique name of the source disk (e.g., Disk-Virginia-1).  This parameter cannot be defined together with the instance name parameter. The disk name and instance name parameters are mutually exclusive. 
    */
  var diskName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The name of the destination disk snapshot (e.g., my-disk-snapshot) based on the source disk.
    */
  var diskSnapshotName: ResourceName = js.native
  
  /**
    * The unique name of the source instance (e.g., Amazon_Linux-512MB-Virginia-1). When this is defined, a snapshot of the instance's system volume is created.  This parameter cannot be defined together with the disk name parameter. The instance name and disk name parameters are mutually exclusive. 
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateDiskSnapshotRequest {
  
  @scala.inline
  def apply(diskSnapshotName: ResourceName): CreateDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiskSnapshotRequest]
  }
  
  @scala.inline
  implicit class CreateDiskSnapshotRequestMutableBuilder[Self <: CreateDiskSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskNameUndefined: Self = StObject.set(x, "diskName", js.undefined)
    
    @scala.inline
    def setDiskSnapshotName(value: ResourceName): Self = StObject.set(x, "diskSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
