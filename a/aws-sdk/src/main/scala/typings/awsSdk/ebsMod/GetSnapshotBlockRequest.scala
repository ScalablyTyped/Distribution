package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotBlockRequest extends StObject {
  
  /**
    * The block index of the block from which to get data. Obtain the BlockIndex by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockIndex: typings.awsSdk.ebsMod.BlockIndex
  
  /**
    * The block token of the block from which to get data. Obtain the BlockToken by running the ListChangedBlocks or ListSnapshotBlocks operations.
    */
  var BlockToken: typings.awsSdk.ebsMod.BlockToken
  
  /**
    * The ID of the snapshot containing the block from which to get data.
    */
  var SnapshotId: typings.awsSdk.ebsMod.SnapshotId
}
object GetSnapshotBlockRequest {
  
  inline def apply(BlockIndex: BlockIndex, BlockToken: BlockToken, SnapshotId: SnapshotId): GetSnapshotBlockRequest = {
    val __obj = js.Dynamic.literal(BlockIndex = BlockIndex.asInstanceOf[js.Any], BlockToken = BlockToken.asInstanceOf[js.Any], SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotBlockRequest]
  }
  
  extension [Self <: GetSnapshotBlockRequest](x: Self) {
    
    inline def setBlockIndex(value: BlockIndex): Self = StObject.set(x, "BlockIndex", value.asInstanceOf[js.Any])
    
    inline def setBlockToken(value: BlockToken): Self = StObject.set(x, "BlockToken", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
