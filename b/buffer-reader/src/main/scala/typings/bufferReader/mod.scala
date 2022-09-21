package typings.bufferReader

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buffer-reader", JSImport.Namespace)
  @js.native
  /**
    * Create a new reader, if no buffer provided, a empty buffer will be used.
    */
  open class ^ ()
    extends StObject
       with BufferReader {
    def this(buffer: Buffer) = this()
  }
  
  @js.native
  trait BufferReader extends StObject {
    
    /**
      * Append new buffer to the end of current reader.
      * @param buffer buffer to append
      */
    def append(buffer: Buffer): Unit = js.native
    
    /**
      * Move the position of reader by offset, offset can be negative; it can be used to skip some bytes.
      * @param offset offset to move by
      */
    def move(offset: Double): Unit = js.native
    
    /**
      * Read a buffer with specified length.
      * @param length specified length
      */
    def nextBuffer(length: Double): Buffer = js.native
    
    /**
      * Read next bytes as Double32BE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextDouble32BE(): Double = js.native
    
    /**
      * Read next bytes as Double32LE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextDouble32LE(): Double = js.native
    
    /**
      * Read next bytes as FloatBE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextFloatBE(): Double = js.native
    
    /**
      * Read next bytes as FloatLE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextFloatLE(): Double = js.native
    
    /**
      * Read next bytes as Int16BE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextInt16BE(): Double = js.native
    
    /**
      * Read next bytes as Int16LE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextInt16LE(): Double = js.native
    
    /**
      * Read next bytes as Int32BE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextInt32BE(): Double = js.native
    
    /**
      * Read next bytes as Int32LE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextInt32LE(): Double = js.native
    
    /**
      * Read next bytes as Int8, the value is just as the same format Buffer in nodejs doc.
      */
    def nextInt8(): Double = js.native
    
    /**
      * Read next length of bytes as String, encoding default is 'utf8'.
      * @param length length of the string to read
      * @param encoding encoding of the string
      */
    def nextString(length: Double): String = js.native
    def nextString(length: Double, encoding: String): String = js.native
    
    /**
      * Read next bytes till the end of buffer as null-terminated string, encoding default is 'utf8'.
      * @param encoding encoding of the string
      */
    def nextStringZero(): String = js.native
    def nextStringZero(encoding: String): String = js.native
    
    /**
      * Read next bytes as UInt16BE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextUInt16BE(): Double = js.native
    
    /**
      * Read next bytes as UInt16LE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextUInt16LE(): Double = js.native
    
    /**
      * Read next bytes as UInt32BE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextUInt32BE(): Double = js.native
    
    /**
      * Read next bytes as UInt32LE, the value is just as the same format Buffer in nodejs doc.
      */
    def nextUInt32LE(): Double = js.native
    
    /**
      * Read next bytes as UInt8, the value is just as the same format Buffer in nodejs doc.
      */
    def nextUInt8(): Double = js.native
    
    /**
      * Get all the remaining bytes as a Buffer.
      */
    def restAll(): Buffer = js.native
    
    /**
      * Set new position of the reader, if the pos is invalid, an exception will be raised.
      * @param position new position
      */
    def seek(position: Double): Unit = js.native
    
    /**
      * Return current position of the reader.
      */
    def tell(): Double = js.native
  }
}
