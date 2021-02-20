package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotBlocksRequest extends StObject {
  
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
  implicit class ListSnapshotBlocksRequestMutableBuilder[Self <: ListSnapshotBlocksRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBlockIndex(value: BlockIndex): Self = StObject.set(x, "StartingBlockIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingBlockIndexUndefined: Self = StObject.set(x, "StartingBlockIndex", js.undefined)
  }
}
