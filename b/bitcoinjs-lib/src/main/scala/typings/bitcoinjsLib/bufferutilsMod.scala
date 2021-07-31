package typings.bitcoinjsLib

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferutilsMod {
  
  @JSImport("bitcoinjs-lib/types/bufferutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bitcoinjs-lib/types/bufferutils", "BufferReader")
  @js.native
  class BufferReader protected () extends StObject {
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
  
  @JSImport("bitcoinjs-lib/types/bufferutils", "BufferWriter")
  @js.native
  class BufferWriter protected () extends StObject {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, offset: Double) = this()
    
    var buffer: Buffer = js.native
    
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
  
  @scala.inline
  def cloneBuffer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def readUInt64LE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def reverseBuffer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("reverseBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def writeUInt64LE(buffer: Buffer, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
