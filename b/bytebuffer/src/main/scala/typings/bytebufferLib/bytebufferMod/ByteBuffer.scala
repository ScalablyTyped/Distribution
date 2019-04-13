package typings
package bytebufferLib.bytebufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBuffer extends js.Object {
  /**
    * Backing buffer.
    */
  var buffer: nodeLib.Buffer = js.native
  /**
    * Absolute limit of the contained data. Set to the backing buffer's capacity upon allocation.
    */
  var limit: scala.Double = js.native
  /**
    * Whether to use little endian byte order, defaults to false for big endian.
    */
  var littleEndian: scala.Boolean = js.native
  /**
    * Marked offset.
    */
  var markedOffset: scala.Double = js.native
  /**
    * Whether to skip assertions of offsets and values, defaults to false.
    */
  var noAssert: scala.Boolean = js.native
  /**
    * Absolute read/write offset.
    */
  var offset: scala.Double = js.native
  /**
    * Data view to manipulate the backing buffer. Becomes null if the backing buffer has a capacity of 0.
    */
  var view: stdLib.DataView = js.native
  /**
    * Switches (to) big endian byte order.
    */
  def BE(): ByteBuffer = js.native
  def BE(bigEndian: scala.Boolean): ByteBuffer = js.native
  /**
    * Switches (to) little endian byte order.
    */
  def LE(): ByteBuffer = js.native
  def LE(bigEndian: scala.Boolean): ByteBuffer = js.native
  /**
    * Appends some data to this ByteBuffer. This will overwrite any contents behind the specified offset up to the appended data's length.
    */
  def append(source: ByteBuffer): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: scala.Double): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def append(source: java.lang.String): ByteBuffer = js.native
  def append(source: java.lang.String, encoding: java.lang.String): ByteBuffer = js.native
  def append(source: java.lang.String, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def append(source: java.lang.String, encoding: scala.Double): ByteBuffer = js.native
  def append(source: java.lang.String, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def append(source: nodeLib.Buffer): ByteBuffer = js.native
  def append(source: nodeLib.Buffer, encoding: java.lang.String): ByteBuffer = js.native
  def append(source: nodeLib.Buffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def append(source: nodeLib.Buffer, encoding: scala.Double): ByteBuffer = js.native
  def append(source: nodeLib.Buffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.ArrayBuffer): ByteBuffer = js.native
  def append(source: stdLib.ArrayBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def append(source: stdLib.ArrayBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.ArrayBuffer, encoding: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.ArrayBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.Uint8Array): ByteBuffer = js.native
  def append(source: stdLib.Uint8Array, encoding: java.lang.String): ByteBuffer = js.native
  def append(source: stdLib.Uint8Array, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.Uint8Array, encoding: scala.Double): ByteBuffer = js.native
  def append(source: stdLib.Uint8Array, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Appends this ByteBuffer's contents to another ByteBuffer. This will overwrite any contents behind the specified offset up to the length of this ByteBuffer's data.
    */
  def appendTo(target: ByteBuffer): ByteBuffer = js.native
  def appendTo(target: ByteBuffer, offset: scala.Double): ByteBuffer = js.native
  /**
    * Enables or disables assertions of argument types and offsets. Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid.
    */
  def assert(assert: scala.Boolean): ByteBuffer = js.native
  /**
    * Gets the capacity of this ByteBuffer's backing buffer.
    */
  def capacity(): scala.Double = js.native
  /**
    * Clears this ByteBuffer's offsets by setting ByteBuffer#offset to 0 and
    * ByteBuffer#limit to the backing buffer's capacity. Discards ByteBuffer#markedOffset.
    */
  def clear(): ByteBuffer = js.native
  def clone(copy: scala.Boolean): ByteBuffer = js.native
  /**
    * Compacts this ByteBuffer to be backed by a ByteBuffer#buffer of its contents' length. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will set offset = 0 and limit = capacity and adapt ByteBuffer#markedOffset to the same relative position if set.
    */
  def compact(): ByteBuffer = js.native
  def compact(begin: scala.Double): ByteBuffer = js.native
  def compact(begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Creates a copy of this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def copy(): ByteBuffer = js.native
  def copy(begin: scala.Double): ByteBuffer = js.native
  def copy(begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Copies this ByteBuffer's contents to another ByteBuffer. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def copyTo(target: ByteBuffer): ByteBuffer = js.native
  def copyTo(target: ByteBuffer, targetOffset: scala.Double): ByteBuffer = js.native
  def copyTo(target: ByteBuffer, targetOffset: scala.Double, sourceOffset: scala.Double): ByteBuffer = js.native
  def copyTo(
    target: ByteBuffer,
    targetOffset: scala.Double,
    sourceOffset: scala.Double,
    sourceLimit: scala.Double
  ): ByteBuffer = js.native
  /**
    * Makes sure that this ByteBuffer is backed by a ByteBuffer#buffer of at least the specified capacity. If the current capacity is exceeded, it will be doubled. If double the current capacity is less than the required capacity, the required capacity will be used instead.
    */
  def ensureCapacity(capacity: scala.Double): ByteBuffer = js.native
  def fill(value: java.lang.String): ByteBuffer = js.native
  def fill(value: java.lang.String, begin: scala.Double): ByteBuffer = js.native
  def fill(value: java.lang.String, begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Overwrites this ByteBuffer's contents with the specified value. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def fill(value: scala.Double): ByteBuffer = js.native
  def fill(value: scala.Double, begin: scala.Double): ByteBuffer = js.native
  def fill(value: scala.Double, begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Makes this ByteBuffer ready for a new sequence of write or relative read operations. Sets limit = offset and offset = 0. Make sure always to flip a ByteBuffer when all relative read or write operations are complete.
    */
  def flip(): ByteBuffer = js.native
  /**
    * Marks an offset on this ByteBuffer to be used later.
    */
  def mark(): ByteBuffer = js.native
  def mark(offset: scala.Double): ByteBuffer = js.native
  /**
    * Sets the byte order.
    */
  def order(littleEndian: scala.Boolean): ByteBuffer = js.native
  /**
    * Prepends some data to this ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
    */
  def prepend(source: ByteBuffer): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: scala.Double): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: java.lang.String): ByteBuffer = js.native
  def prepend(source: java.lang.String, encoding: java.lang.String): ByteBuffer = js.native
  def prepend(source: java.lang.String, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: java.lang.String, encoding: scala.Double): ByteBuffer = js.native
  def prepend(source: java.lang.String, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: nodeLib.Buffer): ByteBuffer = js.native
  def prepend(source: nodeLib.Buffer, encoding: java.lang.String): ByteBuffer = js.native
  def prepend(source: nodeLib.Buffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: nodeLib.Buffer, encoding: scala.Double): ByteBuffer = js.native
  def prepend(source: nodeLib.Buffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: stdLib.ArrayBuffer): ByteBuffer = js.native
  def prepend(source: stdLib.ArrayBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def prepend(source: stdLib.ArrayBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def prepend(source: stdLib.ArrayBuffer, encoding: scala.Double): ByteBuffer = js.native
  def prepend(source: stdLib.ArrayBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Prepends this ByteBuffer to another ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
    */
  def prependTo(target: ByteBuffer): ByteBuffer = js.native
  def prependTo(target: ByteBuffer, offset: scala.Double): ByteBuffer = js.native
  /**
    * Prints debug information about this ByteBuffer's contents.
    */
  def printDebug(): scala.Unit = js.native
  def printDebug(out: js.Function1[/* text */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Reads an 8bit signed integer. This is an alias of ByteBuffer#readInt8.
    */
  def readByte(): scala.Double = js.native
  def readByte(offset: scala.Double): scala.Double = js.native
  /**
    * Reads the specified number of bytes
    */
  def readBytes(length: scala.Double): ByteBuffer = js.native
  def readBytes(length: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Reads a NULL-terminated UTF8 encoded string. For this to work the string read must not contain any NULL characters itself.
    */
  def readCString(): java.lang.String = js.native
  def readCString(offset: scala.Double): java.lang.String = js.native
  /**
    * Reads a 64bit float. This is an alias of ByteBuffer#readFloat64.
    */
  def readDouble(): scala.Double = js.native
  def readDouble(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 32bit float. This is an alias of ByteBuffer#readFloat32.
    */
  def readFloat(): scala.Double = js.native
  def readFloat(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 32bit float.
    */
  def readFloat32(): scala.Double = js.native
  def readFloat32(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 64bit float.
    */
  def readFloat64(): scala.Double = js.native
  def readFloat64(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a length as uint32 prefixed UTF8 encoded string.
    */
  def readIString(): java.lang.String | bytebufferLib.Anon_Length = js.native
  def readIString(offset: scala.Double): java.lang.String | bytebufferLib.Anon_Length = js.native
  /**
    * Reads a 32bit signed integer.This is an alias of ByteBuffer#readInt32.
    */
  def readInt(): scala.Double = js.native
  def readInt(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 16bit signed integer.
    */
  def readInt16(): scala.Double = js.native
  def readInt16(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 32bit signed integer.
    */
  def readInt32(): scala.Double = js.native
  def readInt32(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 64bit signed integer.
    */
  def readInt64(): longLib.longMod.^ = js.native
  def readInt64(offset: scala.Double): longLib.longMod.^ = js.native
  /**
    * Reads an 8bit signed integer.
    */
  def readInt8(): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 64bit signed integer. This is an alias of ByteBuffer#readInt64.
    */
  def readLong(): longLib.longMod.^ = js.native
  def readLong(offset: scala.Double): longLib.longMod.^ = js.native
  /**
    * Reads a 16bit signed integer. This is an alias of ByteBuffer#readInt16.
    */
  def readShort(): scala.Double = js.native
  def readShort(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an UTF8 encoded string. This is an alias of ByteBuffer#readUTF8String.
    */
  def readString(length: scala.Double): java.lang.String = js.native
  def readString(length: scala.Double, metrics: scala.Double): java.lang.String = js.native
  def readString(length: scala.Double, metrics: scala.Double, offset: scala.Double): java.lang.String = js.native
  /**
    * Reads an UTF8 encoded string.
    */
  def readUTF8String(chars: scala.Double): java.lang.String | bytebufferLib.Anon_Length = js.native
  def readUTF8String(chars: scala.Double, metrics: scala.Double): java.lang.String | bytebufferLib.Anon_Length = js.native
  def readUTF8String(chars: scala.Double, metrics: scala.Double, offset: scala.Double): java.lang.String | bytebufferLib.Anon_Length = js.native
  /**
    * Reads a 16bit unsigned integer.
    */
  def readUint16(): scala.Double = js.native
  def readUint16(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 32bit unsigned integer.
    */
  def readUint32(): scala.Double = js.native
  def readUint32(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 64bit unsigned integer.
    */
  def readUint64(): longLib.longMod.^ = js.native
  def readUint64(offset: scala.Double): longLib.longMod.^ = js.native
  /**
    * Reads an 8bit unsigned integer.
    */
  def readUint8(): scala.Double = js.native
  def readUint8(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a length as varint32 prefixed UTF8 encoded string.
    */
  def readVString(): java.lang.String = js.native
  def readVString(offset: scala.Double): java.lang.String = js.native
  /**
    * Reads a 32bit base 128 variable-length integer.
    */
  def readVarint32(): scala.Double = js.native
  def readVarint32(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a zig-zag encoded 32bit base 128 variable-length integer.
    */
  def readVarint32ZigZag(): scala.Double = js.native
  def readVarint32ZigZag(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a 64bit base 128 variable-length integer. Requires Long.js.
    */
  def readVarint64(): longLib.longMod.^ = js.native
  def readVarint64(offset: scala.Double): longLib.longMod.^ = js.native
  /**
    * Reads a zig-zag encoded 64bit base 128 variable-length integer. Requires Long.js.
    */
  def readVarint64ZigZag(): longLib.longMod.^ = js.native
  def readVarint64ZigZag(offset: scala.Double): longLib.longMod.^ = js.native
  /**
    * Gets the number of remaining readable bytes. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit, so this returns limit - offset.
    */
  def remaining(): scala.Double = js.native
  /**
    * Resets this ByteBuffer's ByteBuffer#offset. If an offset has been marked through ByteBuffer#mark before, offset will be set to ByteBuffer#markedOffset, which will then be discarded. If no offset has been marked, sets offset = 0.
    */
  def reset(): ByteBuffer = js.native
  /**
    * Resizes this ByteBuffer to be backed by a buffer of at least the given capacity. Will do nothing if already that large or larger.
    */
  def resize(capacity: scala.Double): ByteBuffer = js.native
  /**
    * Reverses this ByteBuffer's contents
    */
  def reverse(): ByteBuffer = js.native
  def reverse(begin: scala.Double): ByteBuffer = js.native
  def reverse(begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Skips the next length bytes. This will just advance
    */
  def skip(length: scala.Double): ByteBuffer = js.native
  /**
    * Slices this ByteBuffer by creating a cloned instance with offset = begin and limit = end.
    */
  def slice(): ByteBuffer = js.native
  def slice(begin: scala.Double): ByteBuffer = js.native
  def slice(begin: scala.Double, end: scala.Double): ByteBuffer = js.native
  /**
    * Returns a raw buffer compacted to contain this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will transparently ByteBuffer#flip this ByteBuffer if offset > limit but the actual offsets remain untouched. This is an alias of ByteBuffer#toBuffer.
    */
  def toArrayBuffer(): stdLib.ArrayBuffer = js.native
  def toArrayBuffer(forceCopy: scala.Boolean): stdLib.ArrayBuffer = js.native
  /**
    * Encodes this ByteBuffer's contents to a base64 encoded string.
    */
  def toBase64(): java.lang.String = js.native
  def toBase64(begin: scala.Double): java.lang.String = js.native
  def toBase64(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
    * Encodes this ByteBuffer to a binary encoded string, that is using only characters 0x00-0xFF as bytes.
    */
  def toBinary(): java.lang.String = js.native
  def toBinary(begin: scala.Double): java.lang.String = js.native
  def toBinary(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  /**
    * Returns a copy of the backing buffer that contains this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will transparently ByteBuffer#flip this ByteBuffer if offset > limit but the actual offsets remain untouched.
    */
  def toBuffer(): nodeLib.Buffer = js.native
  def toBuffer(forceCopy: scala.Boolean): nodeLib.Buffer = js.native
  /**
    *Encodes this ByteBuffer to a hex encoded string with marked offsets. Offset symbols are:
    *  < : offset,
    *  ' : markedOffset,
    *  > : limit,
    *  | : offset and limit,
    *  [ : offset and markedOffset,
    *  ] : markedOffset and limit,
    *  ! : offset, markedOffset and limit
    */
  def toDebug(): java.lang.String | js.Array[java.lang.String] = js.native
  def toDebug(columns: scala.Boolean): java.lang.String | js.Array[java.lang.String] = js.native
  /**
    * Encodes this ByteBuffer's contents to a hex encoded string.
    */
  def toHex(): java.lang.String = js.native
  def toHex(begin: scala.Double): java.lang.String = js.native
  def toHex(begin: scala.Double, end: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  /**
    * Encodes this ByteBuffer's contents between ByteBuffer#offset and ByteBuffer#limit to an UTF8 encoded string.
    */
  def toUTF8(): java.lang.String = js.native
  /**
    * Writes an 8bit signed integer. This is an alias of ByteBuffer#writeInt8.
    */
  def writeByte(value: scala.Double): ByteBuffer = js.native
  def writeByte(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes an array of bytes. This is an alias for append
    */
  def writeBytes(source: ByteBuffer): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: scala.Double): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: java.lang.String, encoding: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: java.lang.String, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: java.lang.String, encoding: scala.Double): ByteBuffer = js.native
  def writeBytes(source: java.lang.String, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: nodeLib.Buffer): ByteBuffer = js.native
  def writeBytes(source: nodeLib.Buffer, encoding: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: nodeLib.Buffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: nodeLib.Buffer, encoding: scala.Double): ByteBuffer = js.native
  def writeBytes(source: nodeLib.Buffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.ArrayBuffer): ByteBuffer = js.native
  def writeBytes(source: stdLib.ArrayBuffer, encoding: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: stdLib.ArrayBuffer, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.ArrayBuffer, encoding: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.ArrayBuffer, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.Uint8Array): ByteBuffer = js.native
  def writeBytes(source: stdLib.Uint8Array, encoding: java.lang.String): ByteBuffer = js.native
  def writeBytes(source: stdLib.Uint8Array, encoding: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.Uint8Array, encoding: scala.Double): ByteBuffer = js.native
  def writeBytes(source: stdLib.Uint8Array, encoding: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a NULL-terminated UTF8 encoded string. For this to work the specified string must not contain any NULL characters itself.
    */
  def writeCString(str: java.lang.String): ByteBuffer = js.native
  def writeCString(str: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 64bit float. This is an alias of ByteBuffer#writeFloat64.
    */
  def writeDouble(value: scala.Double): ByteBuffer = js.native
  def writeDouble(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 32bit float. This is an alias of ByteBuffer#writeFloat32.
    */
  def writeFloat(value: scala.Double): ByteBuffer = js.native
  def writeFloat(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 32bit float.
    */
  def writeFloat32(value: scala.Double): ByteBuffer = js.native
  def writeFloat32(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 64bit float.
    */
  def writeFloat64(value: scala.Double): ByteBuffer = js.native
  def writeFloat64(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a length as uint32 prefixed UTF8 encoded string.
    */
  def writeIString(str: java.lang.String): ByteBuffer = js.native
  def writeIString(str: java.lang.String, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 32bit signed integer. This is an alias of ByteBuffer#writeInt32.
    */
  def writeInt(value: scala.Double): ByteBuffer = js.native
  def writeInt(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 16bit signed integer.
    */
  def writeInt16(value: scala.Double): ByteBuffer = js.native
  def writeInt16(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 32bit signed integer.
    */
  def writeInt32(value: scala.Double): ByteBuffer = js.native
  def writeInt32(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeInt64(value: longLib.longMod.^): ByteBuffer = js.native
  def writeInt64(value: longLib.longMod.^, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 64bit signed integer.
    */
  def writeInt64(value: scala.Double): ByteBuffer = js.native
  def writeInt64(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes an 8bit signed integer.
    */
  def writeInt8(value: scala.Double): ByteBuffer = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeLong(value: longLib.longMod.^): ByteBuffer = js.native
  def writeLong(value: longLib.longMod.^, offset: scala.Double): ByteBuffer = js.native
  /**
    * Write a 64bit signed integer. This is an alias of ByteBuffer#writeInt64.
    */
  def writeLong(value: scala.Double): ByteBuffer = js.native
  def writeLong(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 16bit signed integer. This is an alias of ByteBuffer#writeInt16.
    */
  def writeShort(value: scala.Double): ByteBuffer = js.native
  def writeShort(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes an UTF8 encoded string. This is an alias of ByteBuffer#writeUTF8String.
    */
  def writeString(str: java.lang.String): ByteBuffer | scala.Double = js.native
  def writeString(str: java.lang.String, offset: scala.Double): ByteBuffer | scala.Double = js.native
  /**
    * Writes an UTF8 encoded string.
    */
  def writeUTF8String(str: java.lang.String): ByteBuffer | scala.Double = js.native
  def writeUTF8String(str: java.lang.String, offset: scala.Double): ByteBuffer | scala.Double = js.native
  /**
    * Writes a 16bit unsigned integer.
    */
  def writeUint16(value: scala.Double): ByteBuffer = js.native
  def writeUint16(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 32bit unsigned integer.
    */
  def writeUint32(value: scala.Double): ByteBuffer = js.native
  def writeUint32(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeUint64(value: longLib.longMod.^): ByteBuffer = js.native
  def writeUint64(value: longLib.longMod.^, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 64bit unsigned integer.
    */
  def writeUint64(value: scala.Double): ByteBuffer = js.native
  def writeUint64(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes an 8bit unsigned integer.
    */
  def writeUint8(value: scala.Double): ByteBuffer = js.native
  def writeUint8(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a length as varint32 prefixed UTF8 encoded string.
    */
  def writeVString(str: java.lang.String): ByteBuffer | scala.Double = js.native
  def writeVString(str: java.lang.String, offset: scala.Double): ByteBuffer | scala.Double = js.native
  /**
    * Writes a 32bit base 128 variable-length integer.
    */
  def writeVarint32(value: scala.Double): ByteBuffer | scala.Double = js.native
  def writeVarint32(value: scala.Double, offset: scala.Double): ByteBuffer | scala.Double = js.native
  /**
    * Writes a zig-zag encoded 32bit base 128 variable-length integer.
    */
  def writeVarint32ZigZag(value: scala.Double): ByteBuffer | scala.Double = js.native
  def writeVarint32ZigZag(value: scala.Double, offset: scala.Double): ByteBuffer | scala.Double = js.native
  def writeVarint64(value: longLib.longMod.^): ByteBuffer = js.native
  def writeVarint64(value: longLib.longMod.^, offset: scala.Double): ByteBuffer = js.native
  /**
    * Writes a 64bit base 128 variable-length integer.
    */
  def writeVarint64(value: scala.Double): ByteBuffer = js.native
  def writeVarint64(value: scala.Double, offset: scala.Double): ByteBuffer = js.native
  def writeVarint64ZigZag(value: longLib.longMod.^): ByteBuffer | scala.Double = js.native
  def writeVarint64ZigZag(value: longLib.longMod.^, offset: scala.Double): ByteBuffer | scala.Double = js.native
  /**
    * Writes a zig-zag encoded 64bit base 128 variable-length integer.
    */
  def writeVarint64ZigZag(value: scala.Double): ByteBuffer | scala.Double = js.native
  def writeVarint64ZigZag(value: scala.Double, offset: scala.Double): ByteBuffer | scala.Double = js.native
}

