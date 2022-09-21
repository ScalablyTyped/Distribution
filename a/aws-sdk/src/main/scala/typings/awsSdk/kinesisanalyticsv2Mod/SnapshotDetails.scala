package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotDetails extends StObject {
  
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId
  
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName
  
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotStatus
}
object SnapshotDetails {
  
  inline def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
  
  extension [Self <: SnapshotDetails](x: Self) {
    
    inline def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreationTimestamp(value: js.Date): Self = StObject.set(x, "SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreationTimestampUndefined: Self = StObject.set(x, "SnapshotCreationTimestamp", js.undefined)
    
    inline def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotStatus(value: SnapshotStatus): Self = StObject.set(x, "SnapshotStatus", value.asInstanceOf[js.Any])
  }
}
