package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSnapshotCopyStatus extends StObject {
  
  /**
    * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region.
    */
  var RetentionPeriod: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
}
object ClusterSnapshotCopyStatus {
  
  @scala.inline
  def apply(): ClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSnapshotCopyStatus]
  }
  
  @scala.inline
  implicit class ClusterSnapshotCopyStatusMutableBuilder[Self <: ClusterSnapshotCopyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationRegion(value: String): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: Long): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "SnapshotCopyGrantName", js.undefined)
  }
}
