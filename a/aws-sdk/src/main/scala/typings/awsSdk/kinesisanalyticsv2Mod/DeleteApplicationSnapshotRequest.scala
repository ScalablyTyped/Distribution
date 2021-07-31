package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationSnapshotRequest extends StObject {
  
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
    */
  var SnapshotCreationTimestamp: Timestamp
  
  /**
    * The identifier for the snapshot delete.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName
}
object DeleteApplicationSnapshotRequest {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotCreationTimestamp: Timestamp, SnapshotName: SnapshotName): DeleteApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotCreationTimestamp = SnapshotCreationTimestamp.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationSnapshotRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationSnapshotRequestMutableBuilder[Self <: DeleteApplicationSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestamp(value: Timestamp): Self = StObject.set(x, "SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
