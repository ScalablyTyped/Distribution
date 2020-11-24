package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.ebsMod.BlockIndex] = js.native
  
  /**
    * The block token for the block index.
    */
  var BlockToken: js.UndefOr[typings.awsSdk.ebsMod.BlockToken] = js.native
}
object Block {
  
  @scala.inline
  def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
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
    def setBlockToken(value: BlockToken): Self = this.set("BlockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockToken: Self = this.set("BlockToken", js.undefined)
  }
}
