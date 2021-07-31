package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterSnapshotCopyStatus extends StObject {
  
  /**
    * The destination Region that snapshots are automatically copied to when cross-Region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of days that manual snapshots are retained in the destination region after they are copied from a source region. If the value is -1, then the manual snapshot is retained indefinitely. Valid values: Either -1 or an integer between 1 and 3,653
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of days to retain automated snapshots in the destination Region after they are copied from a source Region.
    */
  var RetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterSnapshotCopyStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSnapshotCopyStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterSnapshotCopyStatusMutableBuilder[Self <: AwsRedshiftClusterClusterSnapshotCopyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationRegion(value: NonEmptyString): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: Integer): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: NonEmptyString): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "SnapshotCopyGrantName", js.undefined)
  }
}
