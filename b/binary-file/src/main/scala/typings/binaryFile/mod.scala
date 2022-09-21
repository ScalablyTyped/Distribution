package typings.binaryFile

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("binary-file", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BinaryFile {
    def this(path: String, mode: OpenMode) = this()
    def this(path: String, mode: OpenMode, littleEndian: Boolean) = this()
  }
  
  @js.native
  trait BinaryFile extends StObject {
    
    def close(): js.Promise[Unit] = js.native
    
    def open(): js.Promise[Unit] = js.native
    
    def read(length: Double): js.Promise[Buffer] = js.native
    def read(length: Double, position: Double): js.Promise[Buffer] = js.native
    
    def readDouble(): js.Promise[Double] = js.native
    def readDouble(position: Double): js.Promise[Double] = js.native
    
    def readFloat(): js.Promise[Double] = js.native
    def readFloat(position: Double): js.Promise[Double] = js.native
    
    def readInt16(): js.Promise[Double] = js.native
    def readInt16(position: Double): js.Promise[Double] = js.native
    
    def readInt32(): js.Promise[Double] = js.native
    def readInt32(position: Double): js.Promise[Double] = js.native
    
    def readInt64(): js.Promise[Double] = js.native
    def readInt64(position: Double): js.Promise[Double] = js.native
    
    def readInt8(): js.Promise[Double] = js.native
    def readInt8(position: Double): js.Promise[Double] = js.native
    
    def readString(length: Double): js.Promise[String] = js.native
    def readString(length: Double, position: Double): js.Promise[String] = js.native
    
    def readUInt16(): js.Promise[Double] = js.native
    def readUInt16(position: Double): js.Promise[Double] = js.native
    
    def readUInt32(): js.Promise[Double] = js.native
    def readUInt32(position: Double): js.Promise[Double] = js.native
    
    def readUInt64(): js.Promise[Double] = js.native
    def readUInt64(position: Double): js.Promise[Double] = js.native
    
    def readUInt8(): js.Promise[Double] = js.native
    def readUInt8(position: Double): js.Promise[Double] = js.native
    
    def seek(position: Double): Double = js.native
    
    def size(): js.Promise[Double] = js.native
    
    def tell(): Double = js.native
    
    def write(buffer: Buffer): js.Promise[Double] = js.native
    def write(buffer: Buffer, position: Double): js.Promise[Double] = js.native
    
    def writeDouble(value: Double): js.Promise[Double] = js.native
    def writeDouble(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeFloat(value: Double): js.Promise[Double] = js.native
    def writeFloat(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeInt16(value: Double): js.Promise[Double] = js.native
    def writeInt16(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeInt32(value: Double): js.Promise[Double] = js.native
    def writeInt32(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeInt64(value: Double): js.Promise[Double] = js.native
    def writeInt64(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeInt8(value: Double): js.Promise[Double] = js.native
    def writeInt8(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeString(string: String): js.Promise[Double] = js.native
    def writeString(string: String, position: Double): js.Promise[Double] = js.native
    
    def writeUInt16(value: Double): js.Promise[Double] = js.native
    def writeUInt16(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeUInt32(value: Double): js.Promise[Double] = js.native
    def writeUInt32(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeUInt64(value: Double): js.Promise[Double] = js.native
    def writeUInt64(value: Double, position: Double): js.Promise[Double] = js.native
    
    def writeUInt8(value: Double): js.Promise[Double] = js.native
    def writeUInt8(value: Double, position: Double): js.Promise[Double] = js.native
  }
}
