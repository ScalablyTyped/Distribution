package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChangedBlocksRequest extends js.Object {
  
  /**
    * The ID of the first snapshot to use for the comparison.  The FirstSnapshotID parameter must be specified with a SecondSnapshotId parameter; otherwise, an error occurs. 
    */
  var FirstSnapshotId: js.UndefOr[SnapshotId] = js.native
  
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ebsMod.MaxResults] = js.native
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The ID of the second snapshot to use for the comparison.  The SecondSnapshotId parameter must be specified with a FirstSnapshotID parameter; otherwise, an error occurs. 
    */
  var SecondSnapshotId: SnapshotId = js.native
  
  /**
    * The block index from which the comparison should start. The list in the response will start from this block index or the next valid block index in the snapshots.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.native
}
object ListChangedBlocksRequest {
  
  @scala.inline
  def apply(SecondSnapshotId: SnapshotId): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
  
  @scala.inline
  implicit class ListChangedBlocksRequestOps[Self <: ListChangedBlocksRequest] (val x: Self) extends AnyVal {
    
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
    def setSecondSnapshotId(value: SnapshotId): Self = this.set("SecondSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSnapshotId(value: SnapshotId): Self = this.set("FirstSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSnapshotId: Self = this.set("FirstSnapshotId", js.undefined)
    
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
