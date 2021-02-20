package typings.cryptoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base block cipher template.
  */
@js.native
trait BlockCipher extends StObject {
  
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
  implicit class BlockCipherMutableBuilder[Self <: BlockCipher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
  }
}
