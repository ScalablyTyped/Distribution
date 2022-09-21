package typings.bitcoreLibCash.mod

import typings.bitcoreLibCash.mod.crypto.BN
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoding {
  
  @JSImport("bitcore-lib-cash", "encoding.BufferReader")
  @js.native
  open class BufferReader protected () extends StObject {
    def this(buf: Buffer) = this()
    
    def eof(): Boolean = js.native
    
    def finished(): Boolean = js.native
    
    def read(len: Double): Buffer = js.native
    
    def readAll(): Buffer = js.native
    
    def readReverse(len: Double): Buffer = js.native
    
    def readUInt16BE(): Double = js.native
    
    def readUInt16LE(): Double = js.native
    
    def readUInt32BE(): Double = js.native
    
    def readUInt32LE(): Double = js.native
    
    def readUInt64BEBN(): BN = js.native
    
    def readUInt64LEBN(): BN = js.native
    
    def readUInt8(): Double = js.native
    
    def readVarLengthBuffer(): Buffer = js.native
    
    def readVarintBN(): BN = js.native
    
    def readVarintBuf(): Buffer = js.native
    
    def readVarintNum(): Double | BN = js.native
    
    def reverse(): this.type = js.native
    
    def set(obj: js.Object): this.type = js.native
  }
  
  @JSImport("bitcore-lib-cash", "encoding.BufferWriter")
  @js.native
  open class BufferWriter protected () extends StObject {
    def this(obj: js.Object) = this()
    
    def concat(): Buffer = js.native
    
    def set(obj: js.Object): this.type = js.native
    
    def toBuffer(): Buffer = js.native
    
    def varintBufBN(bn: BN): Buffer = js.native
    
    def varintBufNum(n: Double): Buffer = js.native
    
    def write(buf: Buffer): this.type = js.native
    
    def writeReverse(buf: Buffer): this.type = js.native
    
    def writeUInt16BE(n: Double): this.type = js.native
    
    def writeUInt16LE(n: Double): this.type = js.native
    
    def writeUInt32BE(n: Double): this.type = js.native
    
    def writeUInt32LE(n: Double): this.type = js.native
    
    def writeUInt64BEBN(bn: BN): this.type = js.native
    
    def writeUInt64LEBN(bn: BN): this.type = js.native
    
    def writeUInt8(n: Double): this.type = js.native
    
    def writeVarintBN(bn: BN): this.type = js.native
    
    def writeVarintNum(bn: BN): this.type = js.native
  }
}
