package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDiskSnapshotResult extends StObject {
  
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.undefined
}
object GetDiskSnapshotResult {
  
  @scala.inline
  def apply(): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
  
  @scala.inline
  implicit class GetDiskSnapshotResultMutableBuilder[Self <: GetDiskSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSnapshot(value: DiskSnapshot): Self = StObject.set(x, "diskSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSnapshotUndefined: Self = StObject.set(x, "diskSnapshot", js.undefined)
  }
}
