package typings
package bufferDashReaderLib.bufferDashReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferReader extends js.Object {
  /**
       * Append new buffer to the end of current reader.
       * @param buffer buffer to append
       */
  def append(buffer: nodeLib.Buffer): scala.Unit = js.native
  /**
       * Move the position of reader by offset, offset can be negative; it can be used to skip some bytes.
       * @param offset offset to move by
       */
  def move(offset: scala.Double): scala.Unit = js.native
  /**
       * Read a buffer with specified length.
       * @param length specified length
       */
  def nextBuffer(length: scala.Double): nodeLib.Buffer = js.native
  /**
       * Read next bytes as Double32BE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextDouble32BE(): scala.Double = js.native
  /**
       * Read next bytes as Double32LE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextDouble32LE(): scala.Double = js.native
  /**
       * Read next bytes as FloatBE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextFloatBE(): scala.Double = js.native
  /**
       * Read next bytes as FloatLE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextFloatLE(): scala.Double = js.native
  /**
       * Read next bytes as Int16BE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextInt16BE(): scala.Double = js.native
  /**
       * Read next bytes as Int16LE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextInt16LE(): scala.Double = js.native
  /**
       * Read next bytes as Int32BE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextInt32BE(): scala.Double = js.native
  /**
       * Read next bytes as Int32LE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextInt32LE(): scala.Double = js.native
  /**
       * Read next bytes as Int8, the value is just as the same format Buffer in nodejs doc.
       */
  def nextInt8(): scala.Double = js.native
  /**
       * Read next length of bytes as String, encoding default is 'utf8'.
       * @param length length of the string to read
       * @param encoding encoding of the string
       */
  def nextString(length: scala.Double): java.lang.String = js.native
  /**
       * Read next length of bytes as String, encoding default is 'utf8'.
       * @param length length of the string to read
       * @param encoding encoding of the string
       */
  def nextString(length: scala.Double, encoding: java.lang.String): java.lang.String = js.native
  /**
       * Read next bytes till the end of buffer as null-terminated string, encoding default is 'utf8'.
       * @param encoding encoding of the string
       */
  def nextStringZero(): java.lang.String = js.native
  /**
       * Read next bytes till the end of buffer as null-terminated string, encoding default is 'utf8'.
       * @param encoding encoding of the string
       */
  def nextStringZero(encoding: java.lang.String): java.lang.String = js.native
  /**
       * Read next bytes as UInt16BE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextUInt16BE(): scala.Double = js.native
  /**
       * Read next bytes as UInt16LE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextUInt16LE(): scala.Double = js.native
  /**
       * Read next bytes as UInt32BE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextUInt32BE(): scala.Double = js.native
  /**
       * Read next bytes as UInt32LE, the value is just as the same format Buffer in nodejs doc.
       */
  def nextUInt32LE(): scala.Double = js.native
  /**
       * Read next bytes as UInt8, the value is just as the same format Buffer in nodejs doc.
       */
  def nextUInt8(): scala.Double = js.native
  /**
       * Get all the remaining bytes as a Buffer.
       */
  def restAll(): nodeLib.Buffer = js.native
  /**
       * Set new position of the reader, if the pos is invalid, an exception will be raised.
       * @param position new position
       */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
       * Return current position of the reader.
       */
  def tell(): scala.Double = js.native
}

