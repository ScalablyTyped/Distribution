package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangedBlocksRequest extends StObject {
  
  /**
    * The ID of the first snapshot to use for the comparison.  The FirstSnapshotID parameter must be specified with a SecondSnapshotId parameter; otherwise, an error occurs. 
    */
  var FirstSnapshotId: js.UndefOr[SnapshotId] = js.undefined
  
  /**
    * The number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ebsMod.MaxResults] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The ID of the second snapshot to use for the comparison.  The SecondSnapshotId parameter must be specified with a FirstSnapshotID parameter; otherwise, an error occurs. 
    */
  var SecondSnapshotId: SnapshotId
  
  /**
    * The block index from which the comparison should start. The list in the response will start from this block index or the next valid block index in the snapshots.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
}
object ListChangedBlocksRequest {
  
  @scala.inline
  def apply(SecondSnapshotId: SnapshotId): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
  
  @scala.inline
  implicit class ListChangedBlocksRequestMutableBuilder[Self <: ListChangedBlocksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstSnapshotId(value: SnapshotId): Self = StObject.set(x, "FirstSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstSnapshotIdUndefined: Self = StObject.set(x, "FirstSnapshotId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSecondSnapshotId(value: SnapshotId): Self = StObject.set(x, "SecondSnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBlockIndex(value: BlockIndex): Self = StObject.set(x, "StartingBlockIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBlockIndexUndefined: Self = StObject.set(x, "StartingBlockIndex", js.undefined)
  }
}
