package typings.bytebuffer.mod

import typings.bytebuffer.AnonLength
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteBuffer extends js.Object {
  /**
    * Backing buffer.
    */
  var buffer: Buffer = js.native
  /**
    * Absolute limit of the contained data. Set to the backing buffer's capacity upon allocation.
    */
  var limit: Double = js.native
  /**
    * Whether to use little endian byte order, defaults to false for big endian.
    */
  var littleEndian: Boolean = js.native
  /**
    * Marked offset.
    */
  var markedOffset: Double = js.native
  /**
    * Whether to skip assertions of offsets and values, defaults to false.
    */
  var noAssert: Boolean = js.native
  /**
    * Absolute read/write offset.
    */
  var offset: Double = js.native
  /**
    * Data view to manipulate the backing buffer. Becomes null if the backing buffer has a capacity of 0.
    */
  var view: DataView = js.native
  /**
    * Switches (to) big endian byte order.
    */
  def BE(): ByteBuffer = js.native
  def BE(bigEndian: Boolean): ByteBuffer = js.native
  /**
    * Switches (to) little endian byte order.
    */
  def LE(): ByteBuffer = js.native
  def LE(bigEndian: Boolean): ByteBuffer = js.native
  def append(source: String): ByteBuffer = js.native
  def append(source: String, encoding: String): ByteBuffer = js.native
  def append(source: String, encoding: String, offset: Double): ByteBuffer = js.native
  def append(source: String, encoding: Double): ByteBuffer = js.native
  def append(source: String, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Appends some data to this ByteBuffer. This will overwrite any contents behind the specified offset up to the appended data's length.
    */
  def append(source: ByteBuffer): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: String): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: Double): ByteBuffer = js.native
  def append(source: ByteBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def append(source: Buffer): ByteBuffer = js.native
  def append(source: Buffer, encoding: String): ByteBuffer = js.native
  def append(source: Buffer, encoding: String, offset: Double): ByteBuffer = js.native
  def append(source: Buffer, encoding: Double): ByteBuffer = js.native
  def append(source: Buffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def append(source: ArrayBuffer): ByteBuffer = js.native
  def append(source: ArrayBuffer, encoding: String): ByteBuffer = js.native
  def append(source: ArrayBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def append(source: ArrayBuffer, encoding: Double): ByteBuffer = js.native
  def append(source: ArrayBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def append(source: Uint8Array): ByteBuffer = js.native
  def append(source: Uint8Array, encoding: String): ByteBuffer = js.native
  def append(source: Uint8Array, encoding: String, offset: Double): ByteBuffer = js.native
  def append(source: Uint8Array, encoding: Double): ByteBuffer = js.native
  def append(source: Uint8Array, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Appends this ByteBuffer's contents to another ByteBuffer. This will overwrite any contents behind the specified offset up to the length of this ByteBuffer's data.
    */
  def appendTo(target: ByteBuffer): ByteBuffer = js.native
  def appendTo(target: ByteBuffer, offset: Double): ByteBuffer = js.native
  /**
    * Enables or disables assertions of argument types and offsets. Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid.
    */
  def assert(assert: Boolean): ByteBuffer = js.native
  /**
    * Gets the capacity of this ByteBuffer's backing buffer.
    */
  def capacity(): Double = js.native
  /**
    * Clears this ByteBuffer's offsets by setting ByteBuffer#offset to 0 and
    * ByteBuffer#limit to the backing buffer's capacity. Discards ByteBuffer#markedOffset.
    */
  def clear(): ByteBuffer = js.native
  def clone(copy: Boolean): ByteBuffer = js.native
  /**
    * Compacts this ByteBuffer to be backed by a ByteBuffer#buffer of its contents' length. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will set offset = 0 and limit = capacity and adapt ByteBuffer#markedOffset to the same relative position if set.
    */
  def compact(): ByteBuffer = js.native
  def compact(begin: Double): ByteBuffer = js.native
  def compact(begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Creates a copy of this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def copy(): ByteBuffer = js.native
  def copy(begin: Double): ByteBuffer = js.native
  def copy(begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Copies this ByteBuffer's contents to another ByteBuffer. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def copyTo(target: ByteBuffer): ByteBuffer = js.native
  def copyTo(target: ByteBuffer, targetOffset: Double): ByteBuffer = js.native
  def copyTo(target: ByteBuffer, targetOffset: Double, sourceOffset: Double): ByteBuffer = js.native
  def copyTo(target: ByteBuffer, targetOffset: Double, sourceOffset: Double, sourceLimit: Double): ByteBuffer = js.native
  /**
    * Makes sure that this ByteBuffer is backed by a ByteBuffer#buffer of at least the specified capacity. If the current capacity is exceeded, it will be doubled. If double the current capacity is less than the required capacity, the required capacity will be used instead.
    */
  def ensureCapacity(capacity: Double): ByteBuffer = js.native
  def fill(value: String): ByteBuffer = js.native
  def fill(value: String, begin: Double): ByteBuffer = js.native
  def fill(value: String, begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Overwrites this ByteBuffer's contents with the specified value. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
    */
  def fill(value: Double): ByteBuffer = js.native
  def fill(value: Double, begin: Double): ByteBuffer = js.native
  def fill(value: Double, begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Makes this ByteBuffer ready for a new sequence of write or relative read operations. Sets limit = offset and offset = 0. Make sure always to flip a ByteBuffer when all relative read or write operations are complete.
    */
  def flip(): ByteBuffer = js.native
  /**
    * Marks an offset on this ByteBuffer to be used later.
    */
  def mark(): ByteBuffer = js.native
  def mark(offset: Double): ByteBuffer = js.native
  /**
    * Sets the byte order.
    */
  def order(littleEndian: Boolean): ByteBuffer = js.native
  def prepend(source: String): ByteBuffer = js.native
  def prepend(source: String, encoding: String): ByteBuffer = js.native
  def prepend(source: String, encoding: String, offset: Double): ByteBuffer = js.native
  def prepend(source: String, encoding: Double): ByteBuffer = js.native
  def prepend(source: String, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Prepends some data to this ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
    */
  def prepend(source: ByteBuffer): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: String): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: Double): ByteBuffer = js.native
  def prepend(source: ByteBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def prepend(source: Buffer): ByteBuffer = js.native
  def prepend(source: Buffer, encoding: String): ByteBuffer = js.native
  def prepend(source: Buffer, encoding: String, offset: Double): ByteBuffer = js.native
  def prepend(source: Buffer, encoding: Double): ByteBuffer = js.native
  def prepend(source: Buffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def prepend(source: ArrayBuffer): ByteBuffer = js.native
  def prepend(source: ArrayBuffer, encoding: String): ByteBuffer = js.native
  def prepend(source: ArrayBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def prepend(source: ArrayBuffer, encoding: Double): ByteBuffer = js.native
  def prepend(source: ArrayBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Prepends this ByteBuffer to another ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
    */
  def prependTo(target: ByteBuffer): ByteBuffer = js.native
  def prependTo(target: ByteBuffer, offset: Double): ByteBuffer = js.native
  /**
    * Prints debug information about this ByteBuffer's contents.
    */
  def printDebug(): Unit = js.native
  def printDebug(out: js.Function1[/* text */ String, Unit]): Unit = js.native
  /**
    * Reads an 8bit signed integer. This is an alias of ByteBuffer#readInt8.
    */
  def readByte(): Double = js.native
  def readByte(offset: Double): Double = js.native
  /**
    * Reads the specified number of bytes
    */
  def readBytes(length: Double): ByteBuffer = js.native
  def readBytes(length: Double, offset: Double): ByteBuffer = js.native
  /**
    * Reads a NULL-terminated UTF8 encoded string. For this to work the string read must not contain any NULL characters itself.
    */
  def readCString(): String = js.native
  def readCString(offset: Double): String = js.native
  /**
    * Reads a 64bit float. This is an alias of ByteBuffer#readFloat64.
    */
  def readDouble(): Double = js.native
  def readDouble(offset: Double): Double = js.native
  /**
    * Reads a 32bit float. This is an alias of ByteBuffer#readFloat32.
    */
  def readFloat(): Double = js.native
  def readFloat(offset: Double): Double = js.native
  /**
    * Reads a 32bit float.
    */
  def readFloat32(): Double = js.native
  def readFloat32(offset: Double): Double = js.native
  /**
    * Reads a 64bit float.
    */
  def readFloat64(): Double = js.native
  def readFloat64(offset: Double): Double = js.native
  /**
    * Reads a length as uint32 prefixed UTF8 encoded string.
    */
  def readIString(): String | AnonLength = js.native
  def readIString(offset: Double): String | AnonLength = js.native
  /**
    * Reads a 32bit signed integer.This is an alias of ByteBuffer#readInt32.
    */
  def readInt(): Double = js.native
  def readInt(offset: Double): Double = js.native
  /**
    * Reads a 16bit signed integer.
    */
  def readInt16(): Double = js.native
  def readInt16(offset: Double): Double = js.native
  /**
    * Reads a 32bit signed integer.
    */
  def readInt32(): Double = js.native
  def readInt32(offset: Double): Double = js.native
  /**
    * Reads a 64bit signed integer.
    */
  def readInt64(): typings.long.mod.^ = js.native
  def readInt64(offset: Double): typings.long.mod.^ = js.native
  /**
    * Reads an 8bit signed integer.
    */
  def readInt8(): Double = js.native
  def readInt8(offset: Double): Double = js.native
  /**
    * Reads a 64bit signed integer. This is an alias of ByteBuffer#readInt64.
    */
  def readLong(): typings.long.mod.^ = js.native
  def readLong(offset: Double): typings.long.mod.^ = js.native
  /**
    * Reads a 16bit signed integer. This is an alias of ByteBuffer#readInt16.
    */
  def readShort(): Double = js.native
  def readShort(offset: Double): Double = js.native
  /**
    * Reads an UTF8 encoded string. This is an alias of ByteBuffer#readUTF8String.
    */
  def readString(length: Double): String = js.native
  def readString(length: Double, metrics: Double): String = js.native
  def readString(length: Double, metrics: Double, offset: Double): String = js.native
  /**
    * Reads an UTF8 encoded string.
    */
  def readUTF8String(chars: Double): String | AnonLength = js.native
  def readUTF8String(chars: Double, metrics: Double): String | AnonLength = js.native
  def readUTF8String(chars: Double, metrics: Double, offset: Double): String | AnonLength = js.native
  /**
    * Reads a 16bit unsigned integer.
    */
  def readUint16(): Double = js.native
  def readUint16(offset: Double): Double = js.native
  /**
    * Reads a 32bit unsigned integer.
    */
  def readUint32(): Double = js.native
  def readUint32(offset: Double): Double = js.native
  /**
    * Reads a 64bit unsigned integer.
    */
  def readUint64(): typings.long.mod.^ = js.native
  def readUint64(offset: Double): typings.long.mod.^ = js.native
  /**
    * Reads an 8bit unsigned integer.
    */
  def readUint8(): Double = js.native
  def readUint8(offset: Double): Double = js.native
  /**
    * Reads a length as varint32 prefixed UTF8 encoded string.
    */
  def readVString(): String = js.native
  def readVString(offset: Double): String = js.native
  /**
    * Reads a 32bit base 128 variable-length integer.
    */
  def readVarint32(): Double = js.native
  def readVarint32(offset: Double): Double = js.native
  /**
    * Reads a zig-zag encoded 32bit base 128 variable-length integer.
    */
  def readVarint32ZigZag(): Double = js.native
  def readVarint32ZigZag(offset: Double): Double = js.native
  /**
    * Reads a 64bit base 128 variable-length integer. Requires Long.js.
    */
  def readVarint64(): typings.long.mod.^ = js.native
  def readVarint64(offset: Double): typings.long.mod.^ = js.native
  /**
    * Reads a zig-zag encoded 64bit base 128 variable-length integer. Requires Long.js.
    */
  def readVarint64ZigZag(): typings.long.mod.^ = js.native
  def readVarint64ZigZag(offset: Double): typings.long.mod.^ = js.native
  /**
    * Gets the number of remaining readable bytes. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit, so this returns limit - offset.
    */
  def remaining(): Double = js.native
  /**
    * Resets this ByteBuffer's ByteBuffer#offset. If an offset has been marked through ByteBuffer#mark before, offset will be set to ByteBuffer#markedOffset, which will then be discarded. If no offset has been marked, sets offset = 0.
    */
  def reset(): ByteBuffer = js.native
  /**
    * Resizes this ByteBuffer to be backed by a buffer of at least the given capacity. Will do nothing if already that large or larger.
    */
  def resize(capacity: Double): ByteBuffer = js.native
  /**
    * Reverses this ByteBuffer's contents
    */
  def reverse(): ByteBuffer = js.native
  def reverse(begin: Double): ByteBuffer = js.native
  def reverse(begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Skips the next length bytes. This will just advance
    */
  def skip(length: Double): ByteBuffer = js.native
  /**
    * Slices this ByteBuffer by creating a cloned instance with offset = begin and limit = end.
    */
  def slice(): ByteBuffer = js.native
  def slice(begin: Double): ByteBuffer = js.native
  def slice(begin: Double, end: Double): ByteBuffer = js.native
  /**
    * Returns a raw buffer compacted to contain this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will transparently ByteBuffer#flip this ByteBuffer if offset > limit but the actual offsets remain untouched. This is an alias of ByteBuffer#toBuffer.
    */
  def toArrayBuffer(): ArrayBuffer = js.native
  def toArrayBuffer(forceCopy: Boolean): ArrayBuffer = js.native
  /**
    * Encodes this ByteBuffer's contents to a base64 encoded string.
    */
  def toBase64(): String = js.native
  def toBase64(begin: Double): String = js.native
  def toBase64(begin: Double, end: Double): String = js.native
  /**
    * Encodes this ByteBuffer to a binary encoded string, that is using only characters 0x00-0xFF as bytes.
    */
  def toBinary(): String = js.native
  def toBinary(begin: Double): String = js.native
  def toBinary(begin: Double, end: Double): String = js.native
  /**
    * Returns a copy of the backing buffer that contains this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will transparently ByteBuffer#flip this ByteBuffer if offset > limit but the actual offsets remain untouched.
    */
  def toBuffer(): Buffer = js.native
  def toBuffer(forceCopy: Boolean): Buffer = js.native
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
  def toDebug(): String | js.Array[String] = js.native
  def toDebug(columns: Boolean): String | js.Array[String] = js.native
  /**
    * Encodes this ByteBuffer's contents to a hex encoded string.
    */
  def toHex(): String = js.native
  def toHex(begin: Double): String = js.native
  def toHex(begin: Double, end: Double): String = js.native
  def toString(encoding: String): String = js.native
  /**
    * Encodes this ByteBuffer's contents between ByteBuffer#offset and ByteBuffer#limit to an UTF8 encoded string.
    */
  def toUTF8(): String = js.native
  /**
    * Writes an 8bit signed integer. This is an alias of ByteBuffer#writeInt8.
    */
  def writeByte(value: Double): ByteBuffer = js.native
  def writeByte(value: Double, offset: Double): ByteBuffer = js.native
  def writeBytes(source: String): ByteBuffer = js.native
  def writeBytes(source: String, encoding: String): ByteBuffer = js.native
  def writeBytes(source: String, encoding: String, offset: Double): ByteBuffer = js.native
  def writeBytes(source: String, encoding: Double): ByteBuffer = js.native
  def writeBytes(source: String, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes an array of bytes. This is an alias for append
    */
  def writeBytes(source: ByteBuffer): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: String): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: Double): ByteBuffer = js.native
  def writeBytes(source: ByteBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def writeBytes(source: Buffer): ByteBuffer = js.native
  def writeBytes(source: Buffer, encoding: String): ByteBuffer = js.native
  def writeBytes(source: Buffer, encoding: String, offset: Double): ByteBuffer = js.native
  def writeBytes(source: Buffer, encoding: Double): ByteBuffer = js.native
  def writeBytes(source: Buffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def writeBytes(source: ArrayBuffer): ByteBuffer = js.native
  def writeBytes(source: ArrayBuffer, encoding: String): ByteBuffer = js.native
  def writeBytes(source: ArrayBuffer, encoding: String, offset: Double): ByteBuffer = js.native
  def writeBytes(source: ArrayBuffer, encoding: Double): ByteBuffer = js.native
  def writeBytes(source: ArrayBuffer, encoding: Double, offset: Double): ByteBuffer = js.native
  def writeBytes(source: Uint8Array): ByteBuffer = js.native
  def writeBytes(source: Uint8Array, encoding: String): ByteBuffer = js.native
  def writeBytes(source: Uint8Array, encoding: String, offset: Double): ByteBuffer = js.native
  def writeBytes(source: Uint8Array, encoding: Double): ByteBuffer = js.native
  def writeBytes(source: Uint8Array, encoding: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a NULL-terminated UTF8 encoded string. For this to work the specified string must not contain any NULL characters itself.
    */
  def writeCString(str: String): ByteBuffer = js.native
  def writeCString(str: String, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 64bit float. This is an alias of ByteBuffer#writeFloat64.
    */
  def writeDouble(value: Double): ByteBuffer = js.native
  def writeDouble(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 32bit float. This is an alias of ByteBuffer#writeFloat32.
    */
  def writeFloat(value: Double): ByteBuffer = js.native
  def writeFloat(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 32bit float.
    */
  def writeFloat32(value: Double): ByteBuffer = js.native
  def writeFloat32(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 64bit float.
    */
  def writeFloat64(value: Double): ByteBuffer = js.native
  def writeFloat64(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a length as uint32 prefixed UTF8 encoded string.
    */
  def writeIString(str: String): ByteBuffer = js.native
  def writeIString(str: String, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 32bit signed integer. This is an alias of ByteBuffer#writeInt32.
    */
  def writeInt(value: Double): ByteBuffer = js.native
  def writeInt(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 16bit signed integer.
    */
  def writeInt16(value: Double): ByteBuffer = js.native
  def writeInt16(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 32bit signed integer.
    */
  def writeInt32(value: Double): ByteBuffer = js.native
  def writeInt32(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 64bit signed integer.
    */
  def writeInt64(value: Double): ByteBuffer = js.native
  def writeInt64(value: Double, offset: Double): ByteBuffer = js.native
  def writeInt64(value: typings.long.mod.^): ByteBuffer = js.native
  def writeInt64(value: typings.long.mod.^, offset: Double): ByteBuffer = js.native
  /**
    * Writes an 8bit signed integer.
    */
  def writeInt8(value: Double): ByteBuffer = js.native
  def writeInt8(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Write a 64bit signed integer. This is an alias of ByteBuffer#writeInt64.
    */
  def writeLong(value: Double): ByteBuffer = js.native
  def writeLong(value: Double, offset: Double): ByteBuffer = js.native
  def writeLong(value: typings.long.mod.^): ByteBuffer = js.native
  def writeLong(value: typings.long.mod.^, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 16bit signed integer. This is an alias of ByteBuffer#writeInt16.
    */
  def writeShort(value: Double): ByteBuffer = js.native
  def writeShort(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes an UTF8 encoded string. This is an alias of ByteBuffer#writeUTF8String.
    */
  def writeString(str: String): ByteBuffer | Double = js.native
  def writeString(str: String, offset: Double): ByteBuffer | Double = js.native
  /**
    * Writes an UTF8 encoded string.
    */
  def writeUTF8String(str: String): ByteBuffer | Double = js.native
  def writeUTF8String(str: String, offset: Double): ByteBuffer | Double = js.native
  /**
    * Writes a 16bit unsigned integer.
    */
  def writeUint16(value: Double): ByteBuffer = js.native
  def writeUint16(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 32bit unsigned integer.
    */
  def writeUint32(value: Double): ByteBuffer = js.native
  def writeUint32(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a 64bit unsigned integer.
    */
  def writeUint64(value: Double): ByteBuffer = js.native
  def writeUint64(value: Double, offset: Double): ByteBuffer = js.native
  def writeUint64(value: typings.long.mod.^): ByteBuffer = js.native
  def writeUint64(value: typings.long.mod.^, offset: Double): ByteBuffer = js.native
  /**
    * Writes an 8bit unsigned integer.
    */
  def writeUint8(value: Double): ByteBuffer = js.native
  def writeUint8(value: Double, offset: Double): ByteBuffer = js.native
  /**
    * Writes a length as varint32 prefixed UTF8 encoded string.
    */
  def writeVString(str: String): ByteBuffer | Double = js.native
  def writeVString(str: String, offset: Double): ByteBuffer | Double = js.native
  /**
    * Writes a 32bit base 128 variable-length integer.
    */
  def writeVarint32(value: Double): ByteBuffer | Double = js.native
  def writeVarint32(value: Double, offset: Double): ByteBuffer | Double = js.native
  /**
    * Writes a zig-zag encoded 32bit base 128 variable-length integer.
    */
  def writeVarint32ZigZag(value: Double): ByteBuffer | Double = js.native
  def writeVarint32ZigZag(value: Double, offset: Double): ByteBuffer | Double = js.native
  /**
    * Writes a 64bit base 128 variable-length integer.
    */
  def writeVarint64(value: Double): ByteBuffer = js.native
  def writeVarint64(value: Double, offset: Double): ByteBuffer = js.native
  def writeVarint64(value: typings.long.mod.^): ByteBuffer = js.native
  def writeVarint64(value: typings.long.mod.^, offset: Double): ByteBuffer = js.native
  /**
    * Writes a zig-zag encoded 64bit base 128 variable-length integer.
    */
  def writeVarint64ZigZag(value: Double): ByteBuffer | Double = js.native
  def writeVarint64ZigZag(value: Double, offset: Double): ByteBuffer | Double = js.native
  def writeVarint64ZigZag(value: typings.long.mod.^): ByteBuffer | Double = js.native
  def writeVarint64ZigZag(value: typings.long.mod.^, offset: Double): ByteBuffer | Double = js.native
}

