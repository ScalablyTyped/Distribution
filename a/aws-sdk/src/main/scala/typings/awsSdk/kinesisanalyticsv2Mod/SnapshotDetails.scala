package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotDetails extends StObject {
  
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
  
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotStatus = js.native
}
object SnapshotDetails {
  
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
  
  @scala.inline
  implicit class SnapshotDetailsMutableBuilder[Self <: SnapshotDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestamp(value: Timestamp): Self = StObject.set(x, "SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestampUndefined: Self = StObject.set(x, "SnapshotCreationTimestamp", js.undefined)
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotStatus(value: SnapshotStatus): Self = StObject.set(x, "SnapshotStatus", value.asInstanceOf[js.Any])
  }
}
