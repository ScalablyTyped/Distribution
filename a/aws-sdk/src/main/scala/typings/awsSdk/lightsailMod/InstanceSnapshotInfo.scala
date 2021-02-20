package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceSnapshotInfo extends StObject {
  
  /**
    * The blueprint ID from which the source instance (e.g., os_debian_8_3).
    */
  var fromBlueprintId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The bundle ID from which the source instance was created (e.g., micro_1_0).
    */
  var fromBundleId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of objects describing the disks that were attached to the source instance.
    */
  var fromDiskInfo: js.UndefOr[DiskInfoList] = js.native
}
object InstanceSnapshotInfo {
  
  @scala.inline
  def apply(): InstanceSnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSnapshotInfo]
  }
  
  @scala.inline
  implicit class InstanceSnapshotInfoMutableBuilder[Self <: InstanceSnapshotInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromBlueprintId(value: NonEmptyString): Self = StObject.set(x, "fromBlueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromBlueprintIdUndefined: Self = StObject.set(x, "fromBlueprintId", js.undefined)
    
    @scala.inline
    def setFromBundleId(value: NonEmptyString): Self = StObject.set(x, "fromBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromBundleIdUndefined: Self = StObject.set(x, "fromBundleId", js.undefined)
    
    @scala.inline
    def setFromDiskInfo(value: DiskInfoList): Self = StObject.set(x, "fromDiskInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDiskInfoUndefined: Self = StObject.set(x, "fromDiskInfo", js.undefined)
    
    @scala.inline
    def setFromDiskInfoVarargs(value: DiskInfo*): Self = StObject.set(x, "fromDiskInfo", js.Array(value :_*))
  }
}
