package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSnapshotBlocksResponse extends js.Object {
  
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
  implicit class ListSnapshotBlocksResponseOps[Self <: ListSnapshotBlocksResponse] (val x: Self) extends AnyVal {
    
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
    def setBlockSize(value: BlockSize): Self = this.set("BlockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSize: Self = this.set("BlockSize", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = this.set("Blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: Blocks): Self = this.set("Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("Blocks", js.undefined)
    
    @scala.inline
    def setExpiryTime(value: TimeStamp): Self = this.set("ExpiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiryTime: Self = this.set("ExpiryTime", js.undefined)
    
    @scala.inline
    def setNextToken(value: PageToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: VolumeSize): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
  }
}
