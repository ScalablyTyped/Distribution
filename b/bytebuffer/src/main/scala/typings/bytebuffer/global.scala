package typings.bytebuffer

import typings.long.mod.Long
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ByteBuffer {
    
    @JSGlobal("ByteBuffer")
    @js.native
    /**
      * Constructs a new ByteBuffer.
      */
    class ^ ()
      extends typings.bytebuffer.mod.^ {
      def this(capacity: Double) = this()
      def this(capacity: Double, littleEndian: Boolean) = this()
      def this(capacity: Unit, littleEndian: Boolean) = this()
      def this(capacity: Double, littleEndian: Boolean, noAssert: Boolean) = this()
      def this(capacity: Double, littleEndian: Unit, noAssert: Boolean) = this()
      def this(capacity: Unit, littleEndian: Boolean, noAssert: Boolean) = this()
      def this(capacity: Unit, littleEndian: Unit, noAssert: Boolean) = this()
    }
    
    @JSGlobal("ByteBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Big endian constant that can be used instead of its boolean value. Evaluates to false.
      */
    /* static member */
    @JSGlobal("ByteBuffer.BIG_ENDIAN")
    @js.native
    def BIG_ENDIAN: Boolean = js.native
    inline def BIG_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIG_ENDIAN")(x.asInstanceOf[js.Any])
    
    /**
      * Default initial capacity of 16.
      */
    /* static member */
    @JSGlobal("ByteBuffer.DEFAULT_CAPACITY")
    @js.native
    def DEFAULT_CAPACITY: Double = js.native
    inline def DEFAULT_CAPACITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CAPACITY")(x.asInstanceOf[js.Any])
    
    /**
      * Default endianess of false for big endian.
      */
    /* static member */
    @JSGlobal("ByteBuffer.DEFAULT_ENDIAN")
    @js.native
    def DEFAULT_ENDIAN: Boolean = js.native
    inline def DEFAULT_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ENDIAN")(x.asInstanceOf[js.Any])
    
    /**
      * Default no assertions flag of false.
      */
    /* static member */
    @JSGlobal("ByteBuffer.DEFAULT_NOASSERT")
    @js.native
    def DEFAULT_NOASSERT: Boolean = js.native
    inline def DEFAULT_NOASSERT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_NOASSERT")(x.asInstanceOf[js.Any])
    
    /**
      * Little endian constant that can be used instead of its boolean value. Evaluates to true.
      */
    /* static member */
    @JSGlobal("ByteBuffer.LITTLE_ENDIAN")
    @js.native
    def LITTLE_ENDIAN: Boolean = js.native
    inline def LITTLE_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITTLE_ENDIAN")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of bytes required to store a 32bit base 128 variable-length integer.
      */
    /* static member */
    @JSGlobal("ByteBuffer.MAX_VARINT32_BYTES")
    @js.native
    def MAX_VARINT32_BYTES: Double = js.native
    inline def MAX_VARINT32_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VARINT32_BYTES")(x.asInstanceOf[js.Any])
    
    /**
      * Maximum number of bytes required to store a 64bit base 128 variable-length integer.
      */
    /* static member */
    @JSGlobal("ByteBuffer.MAX_VARINT64_BYTES")
    @js.native
    def MAX_VARINT64_BYTES: Double = js.native
    inline def MAX_VARINT64_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VARINT64_BYTES")(x.asInstanceOf[js.Any])
    
    /**
      * Metrics representing number of bytes.Evaluates to 2.
      */
    /* static member */
    @JSGlobal("ByteBuffer.METRICS_BYTES")
    @js.native
    def METRICS_BYTES: Double = js.native
    inline def METRICS_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_BYTES")(x.asInstanceOf[js.Any])
    
    /**
      * Metrics representing number of UTF8 characters.Evaluates to 1.
      */
    /* static member */
    @JSGlobal("ByteBuffer.METRICS_CHARS")
    @js.native
    def METRICS_CHARS: Double = js.native
    inline def METRICS_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_CHARS")(x.asInstanceOf[js.Any])
    
    /**
      * ByteBuffer version.
      */
    /* static member */
    @JSGlobal("ByteBuffer.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /**
      * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
      */
    /* static member */
    inline def allocate(): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")().asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Double): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Double, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Double, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Double, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Unit, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Unit, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def allocate(capacity: Unit, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a base64 encoded string to binary like window.atob does.
      */
    /* static member */
    inline def atob(b64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(b64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Encodes a binary string to base64 like window.btoa does.
      */
    /* static member */
    inline def btoa(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Calculates the number of UTF8 bytes of a string. This is an alias of ByteBuffer#calculateUTF8Bytes.
      */
    /* static member */
    inline def calculateString(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateString")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the number of UTF8 bytes of a string.
      */
    /* static member */
    inline def calculateUTF8Bytes(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateUTF8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the number of UTF8 characters of a string.JavaScript itself uses UTF- 16, so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF.
      */
    /* static member */
    inline def calculateUTF8Chars(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateUTF8Chars")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer.
      */
    /* static member */
    inline def calculateVarint32(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint32")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer.
      */
    /* static member */
    inline def calculateVarint64(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint64")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def calculateVarint64(value: Long): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint64")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Concatenates multiple ByteBuffers into one.
      */
    /* static member */
    inline def concat(buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String]): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: String
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: String,
      litteEndian: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: String,
      litteEndian: Boolean,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: String,
      litteEndian: Unit,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Boolean,
      litteEndian: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Boolean,
      litteEndian: Boolean,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Boolean,
      litteEndian: Unit,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Unit,
      litteEndian: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Unit,
      litteEndian: Boolean,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def concat(
      buffers: js.Array[typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
      encoding: Unit,
      litteEndian: Unit,
      noAssert: Boolean
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a base64 encoded string to a ByteBuffer.
      */
    /* static member */
    inline def fromBase64(str: String): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBase64(str: String, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBase64(str: String, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBase64(str: String, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
      */
    /* static member */
    inline def fromBinary(str: String): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBinary(str: String, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBinary(str: String, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromBinary(str: String, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a hex encoded string with marked offsets to a ByteBuffer.
      */
    /* static member */
    inline def fromDebug(str: String): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromDebug(str: String, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromDebug(str: String, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromDebug(str: String, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a hex encoded string to a ByteBuffer.
      */
    /* static member */
    inline def fromHex(str: String): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromHex(str: String, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromHex(str: String, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromHex(str: String, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes an UTF8 encoded string to a ByteBuffer.
      */
    /* static member */
    inline def fromUTF8(str: String): typings.bytebuffer.mod.ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromUTF8(str: String, littleEndian: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromUTF8(str: String, littleEndian: Boolean, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    inline def fromUTF8(str: String, littleEndian: Unit, noAssert: Boolean): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Gets the backing buffer type.
      */
    /* static member */
    inline def isByteBuffer(bb: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isByteBuffer")(bb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
      * @param buffer Anything that can be wrapped
      * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
      * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
      * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
      */
    /* static member */
    inline def wrap(
      buffer: typings.bytebuffer.mod.ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String,
      enc: js.UndefOr[String | Boolean],
      littleEndian: js.UndefOr[Boolean],
      noAssert: js.UndefOr[Boolean]
    ): typings.bytebuffer.mod.ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[typings.bytebuffer.mod.ByteBuffer]
    
    /**
      * Decodes a zigzag encoded signed 32bit integer.
      */
    /* static member */
    inline def zigZagDecode32(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode32")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Decodes a zigzag encoded signed 64bit integer.
      */
    /* static member */
    inline def zigZagDecode64(n: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
    inline def zigZagDecode64(n: Long): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
    
    /**
      * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding.
      */
    /* static member */
    inline def zigZagEncode32(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode32")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding.
      */
    /* static member */
    inline def zigZagEncode64(n: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
    inline def zigZagEncode64(n: Long): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
  }
}
