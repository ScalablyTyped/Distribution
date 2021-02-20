package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAutoSnapshotsResult extends StObject {
  
  /**
    * An array of objects that describe the automatic snapshots that are available for the specified source instance or disk.
    */
  var autoSnapshots: js.UndefOr[AutoSnapshotDetailsList] = js.native
  
  /**
    * The name of the source instance or disk for the automatic snapshots.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The resource type (e.g., Instance or Disk).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}
object GetAutoSnapshotsResult {
  
  @scala.inline
  def apply(): GetAutoSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAutoSnapshotsResult]
  }
  
  @scala.inline
  implicit class GetAutoSnapshotsResultMutableBuilder[Self <: GetAutoSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSnapshots(value: AutoSnapshotDetailsList): Self = StObject.set(x, "autoSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSnapshotsUndefined: Self = StObject.set(x, "autoSnapshots", js.undefined)
    
    @scala.inline
    def setAutoSnapshotsVarargs(value: AutoSnapshotDetails*): Self = StObject.set(x, "autoSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
