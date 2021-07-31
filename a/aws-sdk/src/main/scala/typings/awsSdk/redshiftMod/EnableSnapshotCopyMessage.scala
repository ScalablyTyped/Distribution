package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSnapshotCopyMessage extends StObject {
  
  /**
    * The unique identifier of the source cluster to copy snapshots from. Constraints: Must be the valid name of an existing cluster that does not already have cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String
  
  /**
    * The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services General Reference. 
    */
  var DestinationRegion: String
  
  /**
    * The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Default: 7. Constraints: Must be at least 1 and no more than 35.
    */
  var RetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.undefined
}
object EnableSnapshotCopyMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String, DestinationRegion: String): EnableSnapshotCopyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableSnapshotCopyMessage]
  }
  
  @scala.inline
  implicit class EnableSnapshotCopyMessageMutableBuilder[Self <: EnableSnapshotCopyMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRegion(value: String): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = StObject.set(x, "SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCopyGrantNameUndefined: Self = StObject.set(x, "SnapshotCopyGrantName", js.undefined)
  }
}
