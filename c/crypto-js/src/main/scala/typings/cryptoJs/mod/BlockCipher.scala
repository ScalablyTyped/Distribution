package typings.cryptoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base block cipher template.
  */
@js.native
trait BlockCipher extends js.Object {
  
  /**
    * The number of 32-bit words this cipher operates on. Default: 4 (128 bits)
    */
  var blockSize: Double = js.native
}
object BlockCipher {
  
  @scala.inline
  def apply(blockSize: Double): BlockCipher = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCipher]
  }
  
  @scala.inline
  implicit class BlockCipherOps[Self <: BlockCipher] (val x: Self) extends AnyVal {
    
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
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
  }
}
