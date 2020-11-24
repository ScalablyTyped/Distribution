package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotBlocksRequest extends js.Object {
  
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ebsMod.MaxResults] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The ID of the snapshot from which to get block indexes and block tokens.
    */
  var SnapshotId: typings.awsSdk.ebsMod.SnapshotId = js.native
  
  /**
    * The block index from which the list should start. The list in the response will start from this block index or the next valid block index in the snapshot.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}
object ListSnapshotBlocksRequest {
  
  @scala.inline
  def apply(SnapshotId: SnapshotId): ListSnapshotBlocksRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSnapshotBlocksRequest]
  }
  
  @scala.inline
  implicit class ListSnapshotBlocksRequestOps[Self <: ListSnapshotBlocksRequest] (val x: Self) extends AnyVal {
    
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
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStartingBlockIndex(value: BlockIndex): Self = this.set("StartingBlockIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingBlockIndex: Self = this.set("StartingBlockIndex", js.undefined)
  }
}
