package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedBlock extends js.Object {
  
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.ebsMod.BlockIndex] = js.native
  
  /**
    * The block token for the block index of the FirstSnapshotId specified in the ListChangedBlocks operation. This value is absent if the first snapshot does not have the changed block that is on the second snapshot.
    */
  var FirstBlockToken: js.UndefOr[BlockToken] = js.native
  
  /**
    * The block token for the block index of the SecondSnapshotId specified in the ListChangedBlocks operation.
    */
  var SecondBlockToken: js.UndefOr[BlockToken] = js.native
}
object ChangedBlock {
  
  @scala.inline
  def apply(): ChangedBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedBlock]
  }
  
  @scala.inline
  implicit class ChangedBlockOps[Self <: ChangedBlock] (val x: Self) extends AnyVal {
    
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
    def setBlockIndex(value: BlockIndex): Self = this.set("BlockIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockIndex: Self = this.set("BlockIndex", js.undefined)
    
    @scala.inline
    def setFirstBlockToken(value: BlockToken): Self = this.set("FirstBlockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBlockToken: Self = this.set("FirstBlockToken", js.undefined)
    
    @scala.inline
    def setSecondBlockToken(value: BlockToken): Self = this.set("SecondBlockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondBlockToken: Self = this.set("SecondBlockToken", js.undefined)
  }
}
