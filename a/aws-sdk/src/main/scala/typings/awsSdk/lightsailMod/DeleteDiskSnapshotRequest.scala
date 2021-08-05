package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDiskSnapshotRequest extends StObject {
  
  /**
    * The name of the disk snapshot you want to delete (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName
}
object DeleteDiskSnapshotRequest {
  
  inline def apply(diskSnapshotName: ResourceName): DeleteDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskSnapshotRequest]
  }
  
  extension [Self <: DeleteDiskSnapshotRequest](x: Self) {
    
    inline def setDiskSnapshotName(value: ResourceName): Self = StObject.set(x, "diskSnapshotName", value.asInstanceOf[js.Any])
  }
}
