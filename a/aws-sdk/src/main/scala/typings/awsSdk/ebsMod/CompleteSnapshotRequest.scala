package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompleteSnapshotRequest extends js.Object {
  
  /**
    * The number of blocks that were written to the snapshot.
    */
  var ChangedBlocksCount: typings.awsSdk.ebsMod.ChangedBlocksCount = js.native
  
  /**
    * An aggregated Base-64 SHA256 checksum based on the checksums of each written block. To generate the aggregated checksum using the linear aggregation method, arrange the checksums for each written block in ascending order of their block index, concatenate them to form a single string, and then generate the checksum on the entire string using the SHA256 algorithm.
    */
  var Checksum: js.UndefOr[typings.awsSdk.ebsMod.Checksum] = js.native
  
  /**
    * The aggregation method used to generate the checksum. Currently, the only supported aggregation method is LINEAR.
    */
  var ChecksumAggregationMethod: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAggregationMethod] = js.native
  
  /**
    * The algorithm used to generate the checksum. Currently, the only supported algorithm is SHA256.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.ebsMod.ChecksumAlgorithm] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsSdk.ebsMod.SnapshotId = js.native
}
object CompleteSnapshotRequest {
  
  @scala.inline
  def apply(ChangedBlocksCount: ChangedBlocksCount, SnapshotId: SnapshotId): CompleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(ChangedBlocksCount = ChangedBlocksCount.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteSnapshotRequest]
  }
  
  @scala.inline
  implicit class CompleteSnapshotRequestOps[Self <: CompleteSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangedBlocksCount(value: ChangedBlocksCount): Self = this.set("ChangedBlocksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksum(value: Checksum): Self = this.set("Checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("Checksum", js.undefined)
    
    @scala.inline
    def setChecksumAggregationMethod(value: ChecksumAggregationMethod): Self = this.set("ChecksumAggregationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksumAggregationMethod: Self = this.set("ChecksumAggregationMethod", js.undefined)
    
    @scala.inline
    def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = this.set("ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksumAlgorithm: Self = this.set("ChecksumAlgorithm", js.undefined)
  }
}
