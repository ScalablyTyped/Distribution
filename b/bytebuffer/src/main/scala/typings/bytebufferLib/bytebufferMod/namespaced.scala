package typings
package bytebufferLib.bytebufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bytebuffer", JSImport.Namespace)
@js.native
class namespaced () extends ByteBuffer {
  /**
       * Constructs a new ByteBuffer.
       */
  def this(capacity: scala.Double) = this()
  /**
       * Constructs a new ByteBuffer.
       */
  def this(capacity: scala.Double, littleEndian: scala.Boolean) = this()
  /**
       * Constructs a new ByteBuffer.
       */
  def this(capacity: scala.Double, littleEndian: scala.Boolean, noAssert: scala.Boolean) = this()
}

@JSImport("bytebuffer", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * Big endian constant that can be used instead of its boolean value. Evaluates to false.
       */
  var BIG_ENDIAN: scala.Boolean = js.native
  /**
       * Default initial capacity of 16.
       */
  var DEFAULT_CAPACITY: scala.Double = js.native
  /**
       * Default endianess of false for big endian.
       */
  var DEFAULT_ENDIAN: scala.Boolean = js.native
  /**
       * Default no assertions flag of false.
       */
  var DEFAULT_NOASSERT: scala.Boolean = js.native
  /**
       * Little endian constant that can be used instead of its boolean value. Evaluates to true.
       */
  var LITTLE_ENDIAN: scala.Boolean = js.native
  /**
       * Maximum number of bytes required to store a 32bit base 128 variable-length integer.
       */
  var MAX_VARINT32_BYTES: scala.Double = js.native
  /**
       * Maximum number of bytes required to store a 64bit base 128 variable-length integer.
       */
  var MAX_VARINT64_BYTES: scala.Double = js.native
  /**
       * Metrics representing number of bytes.Evaluates to 2.
       */
  var METRICS_BYTES: scala.Double = js.native
  /**
       * Metrics representing number of UTF8 characters.Evaluates to 1.
       */
  var METRICS_CHARS: scala.Double = js.native
  /**
       * ByteBuffer version.
       */
  var VERSION: java.lang.String = js.native
  /**
       * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
       */
  def allocate(): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
       */
  def allocate(capacity: scala.Double): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
       */
  def allocate(capacity: scala.Double, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
       */
  def allocate(capacity: scala.Double, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a base64 encoded string to binary like window.atob does.
       */
  def atob(b64: java.lang.String): java.lang.String = js.native
  /**
       * Encodes a binary string to base64 like window.btoa does.
       */
  def btoa(str: java.lang.String): java.lang.String = js.native
  /**
       * Calculates the number of UTF8 bytes of a string. This is an alias of ByteBuffer#calculateUTF8Bytes.
       */
  def calculateString(str: java.lang.String): scala.Double = js.native
  /**
       * Calculates the number of UTF8 bytes of a string.
       */
  def calculateUTF8Bytes(str: java.lang.String): scala.Double = js.native
  /**
       * Calculates the number of UTF8 characters of a string.JavaScript itself uses UTF- 16, so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF.
       */
  def calculateUTF8Chars(str: java.lang.String): scala.Double = js.native
  /**
       * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer.
       */
  def calculateVarint32(value: scala.Double): scala.Double = js.native
  /**
       * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer.
       */
  def calculateVarint64(value: longLib.longMod.namespaced): scala.Double = js.native
  /**
       * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer.
       */
  def calculateVarint64(value: scala.Double): scala.Double = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ]
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: java.lang.String
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: java.lang.String,
    litteEndian: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: java.lang.String,
    litteEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: scala.Boolean,
    litteEndian: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Concatenates multiple ByteBuffers into one.
       */
  def concat(
    buffers: js.Array[
      bytebufferLib.bytebufferMod.ByteBuffer | stdLib.ArrayBuffer | stdLib.Uint8Array | java.lang.String
    ],
    encoding: scala.Boolean,
    litteEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a base64 encoded string to a ByteBuffer.
       */
  def fromBase64(str: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a base64 encoded string to a ByteBuffer.
       */
  def fromBase64(str: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a base64 encoded string to a ByteBuffer.
       */
  def fromBase64(str: java.lang.String, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
       */
  def fromBinary(str: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
       */
  def fromBinary(str: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
       */
  def fromBinary(str: java.lang.String, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string with marked offsets to a ByteBuffer.
       */
  def fromDebug(str: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string with marked offsets to a ByteBuffer.
       */
  def fromDebug(str: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string with marked offsets to a ByteBuffer.
       */
  def fromDebug(str: java.lang.String, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string to a ByteBuffer.
       */
  def fromHex(str: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string to a ByteBuffer.
       */
  def fromHex(str: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a hex encoded string to a ByteBuffer.
       */
  def fromHex(str: java.lang.String, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes an UTF8 encoded string to a ByteBuffer.
       */
  def fromUTF8(str: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes an UTF8 encoded string to a ByteBuffer.
       */
  def fromUTF8(str: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes an UTF8 encoded string to a ByteBuffer.
       */
  def fromUTF8(str: java.lang.String, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Gets the backing buffer type.
       */
  def isByteBuffer(bb: js.Any): scala.Boolean = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: bytebufferLib.bytebufferMod.ByteBuffer): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: bytebufferLib.bytebufferMod.ByteBuffer, enc: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: bytebufferLib.bytebufferMod.ByteBuffer, enc: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: bytebufferLib.bytebufferMod.ByteBuffer,
    enc: java.lang.String,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: bytebufferLib.bytebufferMod.ByteBuffer, enc: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: bytebufferLib.bytebufferMod.ByteBuffer, enc: scala.Boolean, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: bytebufferLib.bytebufferMod.ByteBuffer,
    enc: scala.Boolean,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String, enc: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String, enc: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: java.lang.String,
    enc: java.lang.String,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String, enc: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String, enc: scala.Boolean, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: java.lang.String, enc: scala.Boolean, littleEndian: scala.Boolean, noAssert: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.ArrayBuffer): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.ArrayBuffer, enc: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.ArrayBuffer, enc: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: stdLib.ArrayBuffer,
    enc: java.lang.String,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.ArrayBuffer, enc: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.ArrayBuffer, enc: scala.Boolean, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: stdLib.ArrayBuffer,
    enc: scala.Boolean,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.Uint8Array): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.Uint8Array, enc: java.lang.String): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.Uint8Array, enc: java.lang.String, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: stdLib.Uint8Array,
    enc: java.lang.String,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.Uint8Array, enc: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(buffer: stdLib.Uint8Array, enc: scala.Boolean, littleEndian: scala.Boolean): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
       * @param buffer Anything that can be wrapped
       * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
       * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
       * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
       */
  def wrap(
    buffer: stdLib.Uint8Array,
    enc: scala.Boolean,
    littleEndian: scala.Boolean,
    noAssert: scala.Boolean
  ): bytebufferLib.bytebufferMod.ByteBuffer = js.native
  /**
       * Decodes a zigzag encoded signed 32bit integer.
       */
  def zigZagDecode32(n: scala.Double): scala.Double = js.native
  /**
       * Decodes a zigzag encoded signed 64bit integer.
       */
  def zigZagDecode64(n: longLib.longMod.namespaced): longLib.longMod.namespaced = js.native
  /**
       * Decodes a zigzag encoded signed 64bit integer.
       */
  def zigZagDecode64(n: scala.Double): longLib.longMod.namespaced = js.native
  /**
       * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding.
       */
  def zigZagEncode32(n: scala.Double): scala.Double = js.native
  /**
       * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding.
       */
  def zigZagEncode64(n: longLib.longMod.namespaced): longLib.longMod.namespaced = js.native
  /**
       * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding.
       */
  def zigZagEncode64(n: scala.Double): longLib.longMod.namespaced = js.native
}

