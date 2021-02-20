package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSnapshotRequest extends StObject {
  
  /**
    * The name of the instance or disk snapshot to be exported to Amazon EC2.
    */
  var sourceSnapshotName: ResourceName = js.native
}
object ExportSnapshotRequest {
  
  @scala.inline
  def apply(sourceSnapshotName: ResourceName): ExportSnapshotRequest = {
    val __obj = js.Dynamic.literal(sourceSnapshotName = sourceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSnapshotRequest]
  }
  
  @scala.inline
  implicit class ExportSnapshotRequestMutableBuilder[Self <: ExportSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceSnapshotName(value: ResourceName): Self = StObject.set(x, "sourceSnapshotName", value.asInstanceOf[js.Any])
  }
}
