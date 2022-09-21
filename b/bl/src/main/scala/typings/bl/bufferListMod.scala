package typings.bl

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferListMod {
  
  @JSImport("bl/BufferList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BufferList {
    def this(initialData: String) = this()
    def this(initialData: js.Array[Buffer | BufferList]) = this()
    def this(initialData: BufferList) = this()
    def this(initialData: Buffer) = this()
  }
  @JSImport("bl/BufferList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isBufferList(other: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferList")(other.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait BufferList extends StObject {
    
    def append(buffer: String): BufferList = js.native
    def append(buffer: js.Array[Buffer | BufferList]): BufferList = js.native
    def append(buffer: BufferList): BufferList = js.native
    def append(buffer: Buffer): BufferList = js.native
    
    def consume(): Unit = js.native
    def consume(bytes: Double): Unit = js.native
    
    def copy(dest: Buffer): Buffer = js.native
    def copy(dest: Buffer, destStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Double, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Unit, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Double, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Unit, srcEnd: Double): Buffer = js.native
    
    def duplicate(): BufferList = js.native
    
    def get(index: Double): Double = js.native
    
    def indexOf(value: String): Double = js.native
    def indexOf(value: String, byteOffset: Double): Double = js.native
    def indexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: String, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Double, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: BufferList): Double = js.native
    def indexOf(value: BufferList, byteOffset: Double): Double = js.native
    def indexOf(value: BufferList, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: BufferList, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Buffer): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Buffer, byteOffset: Unit, encoding: String): Double = js.native
    
    var length: Double = js.native
    
    def readDoubleBE(): Double = js.native
    def readDoubleBE(offset: Double): Double = js.native
    
    def readDoubleLE(): Double = js.native
    def readDoubleLE(offset: Double): Double = js.native
    
    def readFloatBE(): Double = js.native
    def readFloatBE(offset: Double): Double = js.native
    
    def readFloatLE(): Double = js.native
    def readFloatLE(offset: Double): Double = js.native
    
    def readInt16BE(): Double = js.native
    def readInt16BE(offset: Double): Double = js.native
    
    def readInt16LE(): Double = js.native
    def readInt16LE(offset: Double): Double = js.native
    
    def readInt32BE(): Double = js.native
    def readInt32BE(offset: Double): Double = js.native
    
    def readInt32LE(): Double = js.native
    def readInt32LE(offset: Double): Double = js.native
    
    def readInt8(offset: Double): Double = js.native
    
    def readIntBE(offset: Double): Double = js.native
    
    def readIntLE(offset: Double): Double = js.native
    
    def readUInt16BE(): Double = js.native
    def readUInt16BE(offset: Double): Double = js.native
    
    def readUInt16LE(): Double = js.native
    def readUInt16LE(offset: Double): Double = js.native
    
    def readUInt32BE(): Double = js.native
    def readUInt32BE(offset: Double): Double = js.native
    
    def readUInt32LE(): Double = js.native
    def readUInt32LE(offset: Double): Double = js.native
    
    def readUInt8(offset: Double): Double = js.native
    
    def readUIntBE(offset: Double): Double = js.native
    
    def readUIntLE(offset: Double): Double = js.native
    
    def shallowSlice(): BufferList = js.native
    def shallowSlice(start: Double): BufferList = js.native
    def shallowSlice(start: Double, end: Double): BufferList = js.native
    def shallowSlice(start: Unit, end: Double): BufferList = js.native
    
    def slice(): Buffer = js.native
    def slice(start: Double): Buffer = js.native
    def slice(start: Double, end: Double): Buffer = js.native
    def slice(start: Unit, end: Double): Buffer = js.native
    
    def toString(encoding: String): String = js.native
    def toString(encoding: String, start: Double): String = js.native
    def toString(encoding: String, start: Double, end: Double): String = js.native
    def toString(encoding: String, start: Unit, end: Double): String = js.native
    def toString(encoding: Unit, start: Double): String = js.native
    def toString(encoding: Unit, start: Double, end: Double): String = js.native
    def toString(encoding: Unit, start: Unit, end: Double): String = js.native
  }
}
