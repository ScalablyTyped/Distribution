package typings.bytebuffer.bytebufferMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bytebuffer", JSImport.Namespace)
@js.native
/**
  * Constructs a new ByteBuffer.
  */
class ^ () extends ByteBuffer {
  def this(capacity: Double) = this()
  def this(capacity: Double, littleEndian: Boolean) = this()
  def this(capacity: Double, littleEndian: Boolean, noAssert: Boolean) = this()
}

@JSImport("bytebuffer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Big endian constant that can be used instead of its boolean value. Evaluates to false.
    */
  var BIG_ENDIAN: Boolean = js.native
  /**
    * Default initial capacity of 16.
    */
  var DEFAULT_CAPACITY: Double = js.native
  /**
    * Default endianess of false for big endian.
    */
  var DEFAULT_ENDIAN: Boolean = js.native
  /**
    * Default no assertions flag of false.
    */
  var DEFAULT_NOASSERT: Boolean = js.native
  /**
    * Little endian constant that can be used instead of its boolean value. Evaluates to true.
    */
  var LITTLE_ENDIAN: Boolean = js.native
  /**
    * Maximum number of bytes required to store a 32bit base 128 variable-length integer.
    */
  var MAX_VARINT32_BYTES: Double = js.native
  /**
    * Maximum number of bytes required to store a 64bit base 128 variable-length integer.
    */
  var MAX_VARINT64_BYTES: Double = js.native
  /**
    * Metrics representing number of bytes.Evaluates to 2.
    */
  var METRICS_BYTES: Double = js.native
  /**
    * Metrics representing number of UTF8 characters.Evaluates to 1.
    */
  var METRICS_CHARS: Double = js.native
  /**
    * ByteBuffer version.
    */
  var VERSION: String = js.native
  /**
    * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
    */
  def allocate(): ByteBuffer = js.native
  def allocate(capacity: Double): ByteBuffer = js.native
  def allocate(capacity: Double, littleEndian: Boolean): ByteBuffer = js.native
  def allocate(capacity: Double, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes a base64 encoded string to binary like window.atob does.
    */
  def atob(b64: String): String = js.native
  /**
    * Encodes a binary string to base64 like window.btoa does.
    */
  def btoa(str: String): String = js.native
  /**
    * Calculates the number of UTF8 bytes of a string. This is an alias of ByteBuffer#calculateUTF8Bytes.
    */
  def calculateString(str: String): Double = js.native
  /**
    * Calculates the number of UTF8 bytes of a string.
    */
  def calculateUTF8Bytes(str: String): Double = js.native
  /**
    * Calculates the number of UTF8 characters of a string.JavaScript itself uses UTF- 16, so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF.
    */
  def calculateUTF8Chars(str: String): Double = js.native
  /**
    * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer.
    */
  def calculateVarint32(value: Double): Double = js.native
  /**
    * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer.
    */
  def calculateVarint64(value: Double): Double = js.native
  def calculateVarint64(value: typings.long.longMod.^): Double = js.native
  /**
    * Concatenates multiple ByteBuffers into one.
    */
  def concat(buffers: js.Array[ArrayBuffer | Buffer | ByteBuffer | String | Uint8Array]): ByteBuffer = js.native
  def concat(buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String], encoding: String): ByteBuffer = js.native
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: String,
    litteEndian: Boolean
  ): ByteBuffer = js.native
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: String,
    litteEndian: Boolean,
    noAssert: Boolean
  ): ByteBuffer = js.native
  def concat(buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String], encoding: Boolean): ByteBuffer = js.native
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Boolean,
    litteEndian: Boolean
  ): ByteBuffer = js.native
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Boolean,
    litteEndian: Boolean,
    noAssert: Boolean
  ): ByteBuffer = js.native
  /**
    * Decodes a base64 encoded string to a ByteBuffer.
    */
  def fromBase64(str: String): ByteBuffer = js.native
  def fromBase64(str: String, littleEndian: Boolean): ByteBuffer = js.native
  def fromBase64(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
    */
  def fromBinary(str: String): ByteBuffer = js.native
  def fromBinary(str: String, littleEndian: Boolean): ByteBuffer = js.native
  def fromBinary(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes a hex encoded string with marked offsets to a ByteBuffer.
    */
  def fromDebug(str: String): ByteBuffer = js.native
  def fromDebug(str: String, littleEndian: Boolean): ByteBuffer = js.native
  def fromDebug(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes a hex encoded string to a ByteBuffer.
    */
  def fromHex(str: String): ByteBuffer = js.native
  def fromHex(str: String, littleEndian: Boolean): ByteBuffer = js.native
  def fromHex(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes an UTF8 encoded string to a ByteBuffer.
    */
  def fromUTF8(str: String): ByteBuffer = js.native
  def fromUTF8(str: String, littleEndian: Boolean): ByteBuffer = js.native
  def fromUTF8(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Gets the backing buffer type.
    */
  def isByteBuffer(bb: js.Any): Boolean = js.native
  def wrap(buffer: String): ByteBuffer = js.native
  def wrap(buffer: String, enc: String): ByteBuffer = js.native
  def wrap(buffer: String, enc: String, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: String, enc: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: String, enc: Boolean): ByteBuffer = js.native
  def wrap(buffer: String, enc: Boolean, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: String, enc: Boolean, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
    * @param buffer Anything that can be wrapped
    * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
    * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
    */
  def wrap(buffer: ByteBuffer): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: String): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: String, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: Boolean): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: Boolean, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: ByteBuffer, enc: Boolean, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: Buffer): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: String): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: String, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: Boolean): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: Boolean, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: Buffer, enc: Boolean, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: String): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: String, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: Boolean): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: Boolean, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: ArrayBuffer, enc: Boolean, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: Uint8Array): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: String): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: String, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: Boolean): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: Boolean, littleEndian: Boolean): ByteBuffer = js.native
  def wrap(buffer: Uint8Array, enc: Boolean, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = js.native
  /**
    * Decodes a zigzag encoded signed 32bit integer.
    */
  def zigZagDecode32(n: Double): Double = js.native
  /**
    * Decodes a zigzag encoded signed 64bit integer.
    */
  def zigZagDecode64(n: Double): typings.long.longMod.^ = js.native
  def zigZagDecode64(n: typings.long.longMod.^): typings.long.longMod.^ = js.native
  /**
    * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding.
    */
  def zigZagEncode32(n: Double): Double = js.native
  /**
    * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding.
    */
  def zigZagEncode64(n: Double): typings.long.longMod.^ = js.native
  def zigZagEncode64(n: typings.long.longMod.^): typings.long.longMod.^ = js.native
}

