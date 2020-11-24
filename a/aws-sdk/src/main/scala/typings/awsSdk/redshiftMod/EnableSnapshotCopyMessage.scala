package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableSnapshotCopyMessage extends js.Object {
  
  /**
    * The unique identifier of the source cluster to copy snapshots from. Constraints: Must be the valid name of an existing cluster that does not already have cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * The destination AWS Region that you want to copy snapshots to. Constraints: Must be the name of a valid AWS Region. For more information, see Regions and Endpoints in the Amazon Web Services General Reference. 
    */
  var DestinationRegion: String = js.native
  
  /**
    * The number of days to retain newly copied snapshots in the destination AWS Region after they are copied from the source AWS Region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The number of days to retain automated snapshots in the destination region after they are copied from the source region. Default: 7. Constraints: Must be at least 1 and no more than 35.
    */
  var RetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the snapshot copy grant to use when snapshots of an AWS KMS-encrypted cluster are copied to the destination region.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.native
}
object EnableSnapshotCopyMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String, DestinationRegion: String): EnableSnapshotCopyMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableSnapshotCopyMessage]
  }
  
  @scala.inline
  implicit class EnableSnapshotCopyMessageOps[Self <: EnableSnapshotCopyMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRegion(value: String): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: IntegerOptional): Self = this.set("RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCopyGrantName: Self = this.set("SnapshotCopyGrantName", js.undefined)
  }
}
