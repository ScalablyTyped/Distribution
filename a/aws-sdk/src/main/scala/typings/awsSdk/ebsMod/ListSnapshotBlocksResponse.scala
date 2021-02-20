package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotBlocksResponse extends StObject {
  
  /**
    * The size of the block.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.ebsMod.BlockSize] = js.native
  
  /**
    * An array of objects containing information about the blocks.
    */
  var Blocks: js.UndefOr[typings.awsSdk.ebsMod.Blocks] = js.native
  
  /**
    * The time when the BlockToken expires.
    */
  var ExpiryTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The size of the volume in GB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.ebsMod.VolumeSize] = js.native
}
object ListSnapshotBlocksResponse {
  
  @scala.inline
  def apply(): ListSnapshotBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotBlocksResponse]
  }
  
  @scala.inline
  implicit class ListSnapshotBlocksResponseMutableBuilder[Self <: ListSnapshotBlocksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: BlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    @scala.inline
    def setBlocks(value: Blocks): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value :_*))
    
    @scala.inline
    def setExpiryTime(value: TimeStamp): Self = StObject.set(x, "ExpiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeUndefined: Self = StObject.set(x, "ExpiryTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
