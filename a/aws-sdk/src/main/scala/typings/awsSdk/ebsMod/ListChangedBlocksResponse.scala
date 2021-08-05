package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangedBlocksResponse extends StObject {
  
  /**
    * The size of the block.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.ebsMod.BlockSize] = js.undefined
  
  /**
    * An array of objects containing information about the changed blocks.
    */
  var ChangedBlocks: js.UndefOr[typings.awsSdk.ebsMod.ChangedBlocks] = js.undefined
  
  /**
    * The time when the BlockToken expires.
    */
  var ExpiryTime: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The size of the volume in GB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.ebsMod.VolumeSize] = js.undefined
}
object ListChangedBlocksResponse {
  
  inline def apply(): ListChangedBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangedBlocksResponse]
  }
  
  extension [Self <: ListChangedBlocksResponse](x: Self) {
    
    inline def setBlockSize(value: BlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    inline def setChangedBlocks(value: ChangedBlocks): Self = StObject.set(x, "ChangedBlocks", value.asInstanceOf[js.Any])
    
    inline def setChangedBlocksUndefined: Self = StObject.set(x, "ChangedBlocks", js.undefined)
    
    inline def setChangedBlocksVarargs(value: ChangedBlock*): Self = StObject.set(x, "ChangedBlocks", js.Array(value :_*))
    
    inline def setExpiryTime(value: TimeStamp): Self = StObject.set(x, "ExpiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "ExpiryTime", js.undefined)
    
    inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
