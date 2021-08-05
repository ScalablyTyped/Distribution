package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskSnapshotRequest extends StObject {
  
  /**
    * The name of the disk snapshot (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName
}
object GetDiskSnapshotRequest {
  
  inline def apply(diskSnapshotName: ResourceName): GetDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskSnapshotRequest]
  }
  
  extension [Self <: GetDiskSnapshotRequest](x: Self) {
    
    inline def setDiskSnapshotName(value: ResourceName): Self = StObject.set(x, "diskSnapshotName", value.asInstanceOf[js.Any])
  }
}
