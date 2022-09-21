package typings.bitcoinComputerBitcore.mod.Bitcoin

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoding {
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.encoding.BufferReader")
  @js.native
  open class BufferReader protected () extends StObject {
    def this(args: Any*) = this()
    
    def readReverse(): Any = js.native
    def readReverse(len: Any): Any = js.native
  }
  
  @JSImport("bitcoin-computer-bitcore", "Bitcoin.encoding.BufferWriter")
  @js.native
  open class BufferWriter protected () extends StObject {
    def this(args: Any*) = this()
    
    def concat(): Buffer = js.native
    
    def write(buf: Buffer): Buffer = js.native
    
    def writeUInt8(n: Double): Buffer = js.native
  }
}
