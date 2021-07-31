package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceSnapshotRequest extends StObject {
  
  /**
    * The name of the snapshot for which you are requesting information.
    */
  var instanceSnapshotName: ResourceName
}
object GetInstanceSnapshotRequest {
  
  @scala.inline
  def apply(instanceSnapshotName: ResourceName): GetInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceSnapshotRequest]
  }
  
  @scala.inline
  implicit class GetInstanceSnapshotRequestMutableBuilder[Self <: GetInstanceSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceSnapshotName(value: ResourceName): Self = StObject.set(x, "instanceSnapshotName", value.asInstanceOf[js.Any])
  }
}
