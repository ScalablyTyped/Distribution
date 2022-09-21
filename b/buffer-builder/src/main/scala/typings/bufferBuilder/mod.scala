package typings.bufferBuilder

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buffer-builder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BufferBuilder {
    def this(initialCapacity: Double) = this()
    def this(initialCapacity: Buffer) = this()
  }
  
  @js.native
  trait BufferBuilder extends StObject {
    
    def appendBuffer(source: Buffer): BufferBuilder = js.native
    
    def appendDoubleBE(value: Double): BufferBuilder = js.native
    
    def appendDoubleLE(value: Double): BufferBuilder = js.native
    
    def appendFill(value: Double, count: Double): BufferBuilder = js.native
    
    def appendFloatBE(value: Double): BufferBuilder = js.native
    
    def appendFloatLE(value: Double): BufferBuilder = js.native
    
    def appendInt16BE(value: Double): BufferBuilder = js.native
    
    def appendInt16LE(value: Double): BufferBuilder = js.native
    
    def appendInt32BE(value: Double): BufferBuilder = js.native
    
    def appendInt32LE(value: Double): BufferBuilder = js.native
    
    def appendInt8(value: Double): BufferBuilder = js.native
    
    def appendString(str: String): BufferBuilder = js.native
    def appendString(str: String, encoding: String): BufferBuilder = js.native
    
    def appendStringZero(str: String): BufferBuilder = js.native
    def appendStringZero(str: String, encoding: String): BufferBuilder = js.native
    
    def appendUInt16BE(value: Double): BufferBuilder = js.native
    
    def appendUInt16LE(value: Double): BufferBuilder = js.native
    
    def appendUInt32BE(value: Double): BufferBuilder = js.native
    
    def appendUInt32LE(value: Double): BufferBuilder = js.native
    
    def appendUInt8(value: Double): BufferBuilder = js.native
    
    def copy(targetBuffer: Buffer): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
    
    def get(): Buffer = js.native
    
    val length: Double = js.native
  }
}
