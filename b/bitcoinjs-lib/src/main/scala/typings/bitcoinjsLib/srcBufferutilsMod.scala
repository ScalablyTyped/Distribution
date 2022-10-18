package typings.bitcoinjsLib

import typings.node.bufferMod.global.Buffer
import typings.varuintBitcoin.mod.Decode_
import typings.varuintBitcoin.mod.Encode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBufferutilsMod {
  
  @JSImport("bitcoinjs-lib/src/bufferutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcoinjs-lib/src/bufferutils", "BufferReader")
  @js.native
  open class BufferReader protected () extends StObject {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, offset: Double) = this()
    
    var buffer: Buffer = js.native
    
    var offset: Double = js.native
    
    def readInt32(): Double = js.native
    
    def readSlice(n: Double): Buffer = js.native
    
    def readUInt32(): Double = js.native
    
    def readUInt64(): Double = js.native
    
    def readUInt8(): Double = js.native
    
    def readVarInt(): Double = js.native
    
    def readVarSlice(): Buffer = js.native
    
    def readVector(): js.Array[Buffer] = js.native
  }
  
  @JSImport("bitcoinjs-lib/src/bufferutils", "BufferWriter")
  @js.native
  open class BufferWriter protected () extends StObject {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, offset: Double) = this()
    
    var buffer: Buffer = js.native
    
    def end(): Buffer = js.native
    
    var offset: Double = js.native
    
    def writeInt32(i: Double): Unit = js.native
    
    def writeSlice(slice: Buffer): Unit = js.native
    
    def writeUInt32(i: Double): Unit = js.native
    
    def writeUInt64(i: Double): Unit = js.native
    
    def writeUInt8(i: Double): Unit = js.native
    
    def writeVarInt(i: Double): Unit = js.native
    
    def writeVarSlice(slice: Buffer): Unit = js.native
    
    def writeVector(vector: js.Array[Buffer]): Unit = js.native
  }
  /* static members */
  object BufferWriter {
    
    @JSImport("bitcoinjs-lib/src/bufferutils", "BufferWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def withCapacity(size: Double): BufferWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("withCapacity")(size.asInstanceOf[js.Any]).asInstanceOf[BufferWriter]
  }
  
  inline def cloneBuffer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def readUInt64LE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reverseBuffer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  object varuint {
    
    @JSImport("bitcoinjs-lib/src/bufferutils", "varuint")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bitcoinjs-lib/src/bufferutils", "varuint.decode")
    @js.native
    val decode: Decode_ = js.native
    
    @JSImport("bitcoinjs-lib/src/bufferutils", "varuint.encode")
    @js.native
    val encode: Encode_ = js.native
    
    inline def encodingLength(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
