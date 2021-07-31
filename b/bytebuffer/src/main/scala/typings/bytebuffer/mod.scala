package typings.bytebuffer

import typings.bytebuffer.anon.Length
import typings.bytebuffer.anon.LengthValue
import typings.bytebuffer.anon.Value
import typings.long.mod.Long
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bytebuffer", JSImport.Namespace)
  @js.native
  /**
    * Constructs a new ByteBuffer.
    */
  class ^ ()
    extends StObject
       with ByteBuffer {
    def this(capacity: Double) = this()
    def this(capacity: Double, littleEndian: Boolean) = this()
    def this(capacity: Unit, littleEndian: Boolean) = this()
    def this(capacity: Double, littleEndian: Boolean, noAssert: Boolean) = this()
    def this(capacity: Double, littleEndian: Unit, noAssert: Boolean) = this()
    def this(capacity: Unit, littleEndian: Boolean, noAssert: Boolean) = this()
    def this(capacity: Unit, littleEndian: Unit, noAssert: Boolean) = this()
  }
  @JSImport("bytebuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Big endian constant that can be used instead of its boolean value. Evaluates to false.
    */
  /* static member */
  @JSImport("bytebuffer", "BIG_ENDIAN")
  @js.native
  def BIG_ENDIAN: Boolean = js.native
  @scala.inline
  def BIG_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIG_ENDIAN")(x.asInstanceOf[js.Any])
  
  /**
    * Default initial capacity of 16.
    */
  /* static member */
  @JSImport("bytebuffer", "DEFAULT_CAPACITY")
  @js.native
  def DEFAULT_CAPACITY: Double = js.native
  @scala.inline
  def DEFAULT_CAPACITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CAPACITY")(x.asInstanceOf[js.Any])
  
  /**
    * Default endianess of false for big endian.
    */
  /* static member */
  @JSImport("bytebuffer", "DEFAULT_ENDIAN")
  @js.native
  def DEFAULT_ENDIAN: Boolean = js.native
  @scala.inline
  def DEFAULT_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ENDIAN")(x.asInstanceOf[js.Any])
  
  /**
    * Default no assertions flag of false.
    */
  /* static member */
  @JSImport("bytebuffer", "DEFAULT_NOASSERT")
  @js.native
  def DEFAULT_NOASSERT: Boolean = js.native
  @scala.inline
  def DEFAULT_NOASSERT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_NOASSERT")(x.asInstanceOf[js.Any])
  
  /**
    * Little endian constant that can be used instead of its boolean value. Evaluates to true.
    */
  /* static member */
  @JSImport("bytebuffer", "LITTLE_ENDIAN")
  @js.native
  def LITTLE_ENDIAN: Boolean = js.native
  @scala.inline
  def LITTLE_ENDIAN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LITTLE_ENDIAN")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum number of bytes required to store a 32bit base 128 variable-length integer.
    */
  /* static member */
  @JSImport("bytebuffer", "MAX_VARINT32_BYTES")
  @js.native
  def MAX_VARINT32_BYTES: Double = js.native
  @scala.inline
  def MAX_VARINT32_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VARINT32_BYTES")(x.asInstanceOf[js.Any])
  
  /**
    * Maximum number of bytes required to store a 64bit base 128 variable-length integer.
    */
  /* static member */
  @JSImport("bytebuffer", "MAX_VARINT64_BYTES")
  @js.native
  def MAX_VARINT64_BYTES: Double = js.native
  @scala.inline
  def MAX_VARINT64_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VARINT64_BYTES")(x.asInstanceOf[js.Any])
  
  /**
    * Metrics representing number of bytes.Evaluates to 2.
    */
  /* static member */
  @JSImport("bytebuffer", "METRICS_BYTES")
  @js.native
  def METRICS_BYTES: Double = js.native
  @scala.inline
  def METRICS_BYTES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_BYTES")(x.asInstanceOf[js.Any])
  
  /**
    * Metrics representing number of UTF8 characters.Evaluates to 1.
    */
  /* static member */
  @JSImport("bytebuffer", "METRICS_CHARS")
  @js.native
  def METRICS_CHARS: Double = js.native
  @scala.inline
  def METRICS_CHARS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METRICS_CHARS")(x.asInstanceOf[js.Any])
  
  /**
    * ByteBuffer version.
    */
  /* static member */
  @JSImport("bytebuffer", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * Allocates a new ByteBuffer backed by a buffer of the specified capacity.
    */
  /* static member */
  @scala.inline
  def allocate(): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")().asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Double): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Double, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Double, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Double, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Unit, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Unit, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def allocate(capacity: Unit, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(capacity.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a base64 encoded string to binary like window.atob does.
    */
  /* static member */
  @scala.inline
  def atob(b64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(b64.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Encodes a binary string to base64 like window.btoa does.
    */
  /* static member */
  @scala.inline
  def btoa(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Calculates the number of UTF8 bytes of a string. This is an alias of ByteBuffer#calculateUTF8Bytes.
    */
  /* static member */
  @scala.inline
  def calculateString(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateString")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the number of UTF8 bytes of a string.
    */
  /* static member */
  @scala.inline
  def calculateUTF8Bytes(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateUTF8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the number of UTF8 characters of a string.JavaScript itself uses UTF- 16, so that a string's length property does not reflect its actual UTF8 size if it contains code points larger than 0xFFFF.
    */
  /* static member */
  @scala.inline
  def calculateUTF8Chars(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateUTF8Chars")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the actual number of bytes required to store a 32bit base 128 variable-length integer.
    */
  /* static member */
  @scala.inline
  def calculateVarint32(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint32")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Calculates the actual number of bytes required to store a 64bit base 128 variable-length integer.
    */
  /* static member */
  @scala.inline
  def calculateVarint64(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint64")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def calculateVarint64(value: Long): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateVarint64")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Concatenates multiple ByteBuffers into one.
    */
  /* static member */
  @scala.inline
  def concat(buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String]): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String], encoding: String): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: String,
    litteEndian: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: String,
    litteEndian: Boolean,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: String,
    litteEndian: Unit,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String], encoding: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Boolean,
    litteEndian: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Boolean,
    litteEndian: Boolean,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Boolean,
    litteEndian: Unit,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Unit,
    litteEndian: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Unit,
    litteEndian: Boolean,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def concat(
    buffers: js.Array[ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String],
    encoding: Unit,
    litteEndian: Unit,
    noAssert: Boolean
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], litteEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a base64 encoded string to a ByteBuffer.
    */
  /* static member */
  @scala.inline
  def fromBase64(str: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBase64(str: String, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBase64(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBase64(str: String, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a binary encoded string, that is using only characters 0x00-0xFF as bytes, to a ByteBuffer.
    */
  /* static member */
  @scala.inline
  def fromBinary(str: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBinary(str: String, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBinary(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromBinary(str: String, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a hex encoded string with marked offsets to a ByteBuffer.
    */
  /* static member */
  @scala.inline
  def fromDebug(str: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromDebug(str: String, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromDebug(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromDebug(str: String, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDebug")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a hex encoded string to a ByteBuffer.
    */
  /* static member */
  @scala.inline
  def fromHex(str: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromHex(str: String, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromHex(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromHex(str: String, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes an UTF8 encoded string to a ByteBuffer.
    */
  /* static member */
  @scala.inline
  def fromUTF8(str: String): ByteBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any]).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromUTF8(str: String, littleEndian: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromUTF8(str: String, littleEndian: Boolean, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def fromUTF8(str: String, littleEndian: Unit, noAssert: Boolean): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUTF8")(str.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Gets the backing buffer type.
    */
  /* static member */
  @scala.inline
  def isByteBuffer(bb: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isByteBuffer")(bb.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Wraps a buffer or a string. Sets the allocated ByteBuffer's ByteBuffer#offset to 0 and its ByteBuffer#limit to the length of the wrapped data.
    * @param buffer Anything that can be wrapped
    * @param encoding String encoding if buffer is a string ("base64", "hex", "binary", defaults to "utf8")
    * @param littleEndian Whether to use little or big endian byte order. Defaults to ByteBuffer.DEFAULT_ENDIAN.
    * @param noAssert Whether to skip assertions of offsets and values. Defaults to ByteBuffer.DEFAULT_NOASSERT.
    */
  /* static member */
  @scala.inline
  def wrap(
    buffer: ByteBuffer | Buffer | ArrayBuffer | Uint8Array | String,
    enc: js.UndefOr[String | Boolean],
    littleEndian: js.UndefOr[Boolean],
    noAssert: js.UndefOr[Boolean]
  ): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any], noAssert.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  /**
    * Decodes a zigzag encoded signed 32bit integer.
    */
  /* static member */
  @scala.inline
  def zigZagDecode32(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode32")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Decodes a zigzag encoded signed 64bit integer.
    */
  /* static member */
  @scala.inline
  def zigZagDecode64(n: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
  @scala.inline
  def zigZagDecode64(n: Long): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagDecode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
  
  /**
    * Zigzag encodes a signed 32bit integer so that it can be effectively used with varint encoding.
    */
  /* static member */
  @scala.inline
  def zigZagEncode32(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode32")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Zigzag encodes a signed 64bit integer so that it can be effectively used with varint encoding.
    */
  /* static member */
  @scala.inline
  def zigZagEncode64(n: Double): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
  @scala.inline
  def zigZagEncode64(n: Long): Long = ^.asInstanceOf[js.Dynamic].applyDynamic("zigZagEncode64")(n.asInstanceOf[js.Any]).asInstanceOf[Long]
  
  @js.native
  trait ByteBuffer extends StObject {
    
    /**
      * Switches (to) big endian byte order.
      */
    def BE(): this.type = js.native
    def BE(bigEndian: Boolean): this.type = js.native
    
    /**
      * Switches (to) little endian byte order.
      */
    def LE(): this.type = js.native
    def LE(bigEndian: Boolean): this.type = js.native
    
    def append(source: String): this.type = js.native
    def append(source: String, encoding: String): this.type = js.native
    def append(source: String, encoding: String, offset: Double): this.type = js.native
    def append(source: String, encoding: Double): this.type = js.native
    def append(source: String, encoding: Double, offset: Double): this.type = js.native
    def append(source: String, encoding: Unit, offset: Double): this.type = js.native
    /**
      * Appends some data to this ByteBuffer. This will overwrite any contents behind the specified offset up to the appended data's length.
      */
    def append(source: ByteBuffer): this.type = js.native
    def append(source: ByteBuffer, encoding: String): this.type = js.native
    def append(source: ByteBuffer, encoding: String, offset: Double): this.type = js.native
    def append(source: ByteBuffer, encoding: Double): this.type = js.native
    def append(source: ByteBuffer, encoding: Double, offset: Double): this.type = js.native
    def append(source: ByteBuffer, encoding: Unit, offset: Double): this.type = js.native
    def append(source: Buffer): this.type = js.native
    def append(source: Buffer, encoding: String): this.type = js.native
    def append(source: Buffer, encoding: String, offset: Double): this.type = js.native
    def append(source: Buffer, encoding: Double): this.type = js.native
    def append(source: Buffer, encoding: Double, offset: Double): this.type = js.native
    def append(source: Buffer, encoding: Unit, offset: Double): this.type = js.native
    def append(source: ArrayBuffer): this.type = js.native
    def append(source: ArrayBuffer, encoding: String): this.type = js.native
    def append(source: ArrayBuffer, encoding: String, offset: Double): this.type = js.native
    def append(source: ArrayBuffer, encoding: Double): this.type = js.native
    def append(source: ArrayBuffer, encoding: Double, offset: Double): this.type = js.native
    def append(source: ArrayBuffer, encoding: Unit, offset: Double): this.type = js.native
    def append(source: Uint8Array): this.type = js.native
    def append(source: Uint8Array, encoding: String): this.type = js.native
    def append(source: Uint8Array, encoding: String, offset: Double): this.type = js.native
    def append(source: Uint8Array, encoding: Double): this.type = js.native
    def append(source: Uint8Array, encoding: Double, offset: Double): this.type = js.native
    def append(source: Uint8Array, encoding: Unit, offset: Double): this.type = js.native
    
    /**
      * Appends this ByteBuffer's contents to another ByteBuffer. This will overwrite any contents behind the specified offset up to the length of this ByteBuffer's data.
      */
    def appendTo(target: ByteBuffer): this.type = js.native
    def appendTo(target: ByteBuffer, offset: Double): this.type = js.native
    
    /**
      * Enables or disables assertions of argument types and offsets. Assertions are enabled by default but you can opt to disable them if your code already makes sure that everything is valid.
      */
    def assert(assert: Boolean): this.type = js.native
    
    /**
      * Backing buffer.
      */
    var buffer: Buffer = js.native
    
    /**
      * Gets the capacity of this ByteBuffer's backing buffer.
      */
    def capacity(): Double = js.native
    
    /**
      * Clears this ByteBuffer's offsets by setting ByteBuffer#offset to 0 and
      * ByteBuffer#limit to the backing buffer's capacity. Discards ByteBuffer#markedOffset.
      */
    def clear(): this.type = js.native
    
    def clone(copy: Boolean): ByteBuffer = js.native
    
    /**
      * Compacts this ByteBuffer to be backed by a ByteBuffer#buffer of its contents' length. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit. Will set offset = 0 and limit = capacity and adapt ByteBuffer#markedOffset to the same relative position if set.
      */
    def compact(): this.type = js.native
    def compact(begin: Double): this.type = js.native
    def compact(begin: Double, end: Double): this.type = js.native
    def compact(begin: Unit, end: Double): this.type = js.native
    
    /**
      * Creates a copy of this ByteBuffer's contents. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
      */
    def copy(): ByteBuffer = js.native
    def copy(begin: Double): ByteBuffer = js.native
    def copy(begin: Double, end: Double): ByteBuffer = js.native
    def copy(begin: Unit, end: Double): ByteBuffer = js.native
    
    /**
      * Copies this ByteBuffer's contents to another ByteBuffer. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
      */
    def copyTo(target: ByteBuffer): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Double, sourceOffset: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Double, sourceOffset: Double, sourceLimit: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Double, sourceOffset: Unit, sourceLimit: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Unit, sourceOffset: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Unit, sourceOffset: Double, sourceLimit: Double): this.type = js.native
    def copyTo(target: ByteBuffer, targetOffset: Unit, sourceOffset: Unit, sourceLimit: Double): this.type = js.native
    
    /**
      * Makes sure that this ByteBuffer is backed by a ByteBuffer#buffer of at least the specified capacity. If the current capacity is exceeded, it will be doubled. If double the current capacity is less than the required capacity, the required capacity will be used instead.
      */
    def ensureCapacity(capacity: Double): this.type = js.native
    
    def fill(value: String): this.type = js.native
    def fill(value: String, begin: Double): this.type = js.native
    def fill(value: String, begin: Double, end: Double): this.type = js.native
    def fill(value: String, begin: Unit, end: Double): this.type = js.native
    /**
      * Overwrites this ByteBuffer's contents with the specified value. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit.
      */
    def fill(value: Double): this.type = js.native
    def fill(value: Double, begin: Double): this.type = js.native
    def fill(value: Double, begin: Double, end: Double): this.type = js.native
    def fill(value: Double, begin: Unit, end: Double): this.type = js.native
    
    /**
      * Makes this ByteBuffer ready for a new sequence of write or relative read operations. Sets limit = offset and offset = 0. Make sure always to flip a ByteBuffer when all relative read or write operations are complete.
      */
    def flip(): this.type = js.native
    
    /**
      * Absolute limit of the contained data. Set to the backing buffer's capacity upon allocation.
      */
    var limit: Double = js.native
    
    /**
      * Whether to use little endian byte order, defaults to false for big endian.
      */
    var littleEndian: Boolean = js.native
    
    /**
      * Marks an offset on this ByteBuffer to be used later.
      */
    def mark(): this.type = js.native
    def mark(offset: Double): this.type = js.native
    
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
      * Sets the byte order.
      */
    def order(littleEndian: Boolean): this.type = js.native
    
    def prepend(source: String): this.type = js.native
    def prepend(source: String, encoding: String): this.type = js.native
    def prepend(source: String, encoding: String, offset: Double): this.type = js.native
    def prepend(source: String, encoding: Double): this.type = js.native
    def prepend(source: String, encoding: Double, offset: Double): this.type = js.native
    def prepend(source: String, encoding: Unit, offset: Double): this.type = js.native
    /**
      * Prepends some data to this ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
      */
    def prepend(source: ByteBuffer): this.type = js.native
    def prepend(source: ByteBuffer, encoding: String): this.type = js.native
    def prepend(source: ByteBuffer, encoding: String, offset: Double): this.type = js.native
    def prepend(source: ByteBuffer, encoding: Double): this.type = js.native
    def prepend(source: ByteBuffer, encoding: Double, offset: Double): this.type = js.native
    def prepend(source: ByteBuffer, encoding: Unit, offset: Double): this.type = js.native
    def prepend(source: Buffer): this.type = js.native
    def prepend(source: Buffer, encoding: String): this.type = js.native
    def prepend(source: Buffer, encoding: String, offset: Double): this.type = js.native
    def prepend(source: Buffer, encoding: Double): this.type = js.native
    def prepend(source: Buffer, encoding: Double, offset: Double): this.type = js.native
    def prepend(source: Buffer, encoding: Unit, offset: Double): this.type = js.native
    def prepend(source: ArrayBuffer): this.type = js.native
    def prepend(source: ArrayBuffer, encoding: String): this.type = js.native
    def prepend(source: ArrayBuffer, encoding: String, offset: Double): this.type = js.native
    def prepend(source: ArrayBuffer, encoding: Double): this.type = js.native
    def prepend(source: ArrayBuffer, encoding: Double, offset: Double): this.type = js.native
    def prepend(source: ArrayBuffer, encoding: Unit, offset: Double): this.type = js.native
    
    /**
      * Prepends this ByteBuffer to another ByteBuffer. This will overwrite any contents before the specified offset up to the prepended data's length. If there is not enough space available before the specified offset, the backing buffer will be resized and its contents moved accordingly.
      */
    def prependTo(target: ByteBuffer): this.type = js.native
    def prependTo(target: ByteBuffer, offset: Double): this.type = js.native
    
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
    def readCString(offset: Double): Length = js.native
    
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
    def readIString(): String = js.native
    def readIString(offset: Double): Length = js.native
    
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
    def readInt64(): Long = js.native
    def readInt64(offset: Double): Long = js.native
    
    /**
      * Reads an 8bit signed integer.
      */
    def readInt8(): Double = js.native
    def readInt8(offset: Double): Double = js.native
    
    /**
      * Reads a 64bit signed integer. This is an alias of ByteBuffer#readInt64.
      */
    def readLong(): Long = js.native
    def readLong(offset: Double): Long = js.native
    
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
    def readString(length: Double, metrics: Double, offset: Double): Length = js.native
    
    /**
      * Reads an UTF8 encoded string.
      */
    def readUTF8String(chars: Double): String = js.native
    def readUTF8String(chars: Double, metrics: Double): String = js.native
    def readUTF8String(chars: Double, metrics: Double, offset: Double): Length = js.native
    
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
    def readUint64(): Long = js.native
    def readUint64(offset: Double): Long = js.native
    
    /**
      * Reads an 8bit unsigned integer.
      */
    def readUint8(): Double = js.native
    def readUint8(offset: Double): Double = js.native
    
    /**
      * Reads a length as varint32 prefixed UTF8 encoded string.
      */
    def readVString(): String = js.native
    def readVString(offset: Double): Length = js.native
    
    /**
      * Reads a 32bit base 128 variable-length integer.
      */
    def readVarint32(): Double = js.native
    def readVarint32(offset: Double): Value = js.native
    
    /**
      * Reads a zig-zag encoded 32bit base 128 variable-length integer.
      */
    def readVarint32ZigZag(): Double = js.native
    def readVarint32ZigZag(offset: Double): Value = js.native
    
    /**
      * Reads a 64bit base 128 variable-length integer. Requires Long.js.
      */
    def readVarint64(): Long = js.native
    def readVarint64(offset: Double): LengthValue = js.native
    
    /**
      * Reads a zig-zag encoded 64bit base 128 variable-length integer. Requires Long.js.
      */
    def readVarint64ZigZag(): Long = js.native
    def readVarint64ZigZag(offset: Double): LengthValue = js.native
    
    /**
      * Gets the number of remaining readable bytes. Contents are the bytes between ByteBuffer#offset and ByteBuffer#limit, so this returns limit - offset.
      */
    def remaining(): Double = js.native
    
    /**
      * Resets this ByteBuffer's ByteBuffer#offset. If an offset has been marked through ByteBuffer#mark before, offset will be set to ByteBuffer#markedOffset, which will then be discarded. If no offset has been marked, sets offset = 0.
      */
    def reset(): this.type = js.native
    
    /**
      * Resizes this ByteBuffer to be backed by a buffer of at least the given capacity. Will do nothing if already that large or larger.
      */
    def resize(capacity: Double): this.type = js.native
    
    /**
      * Reverses this ByteBuffer's contents
      */
    def reverse(): this.type = js.native
    def reverse(begin: Double): this.type = js.native
    def reverse(begin: Double, end: Double): this.type = js.native
    def reverse(begin: Unit, end: Double): this.type = js.native
    
    /**
      * Skips the next length bytes. This will just advance
      */
    def skip(length: Double): this.type = js.native
    
    /**
      * Slices this ByteBuffer by creating a cloned instance with offset = begin and limit = end.
      */
    def slice(): ByteBuffer = js.native
    def slice(begin: Double): ByteBuffer = js.native
    def slice(begin: Double, end: Double): ByteBuffer = js.native
    def slice(begin: Unit, end: Double): ByteBuffer = js.native
    
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
    def toBase64(begin: Unit, end: Double): String = js.native
    
    /**
      * Encodes this ByteBuffer to a binary encoded string, that is using only characters 0x00-0xFF as bytes.
      */
    def toBinary(): String = js.native
    def toBinary(begin: Double): String = js.native
    def toBinary(begin: Double, end: Double): String = js.native
    def toBinary(begin: Unit, end: Double): String = js.native
    
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
    def toHex(begin: Unit, end: Double): String = js.native
    
    def toString(encoding: String): String = js.native
    
    /**
      * Encodes this ByteBuffer's contents between ByteBuffer#offset and ByteBuffer#limit to an UTF8 encoded string.
      */
    def toUTF8(): String = js.native
    
    /**
      * Data view to manipulate the backing buffer. Becomes null if the backing buffer has a capacity of 0.
      */
    var view: DataView = js.native
    
    /**
      * Writes an 8bit signed integer. This is an alias of ByteBuffer#writeInt8.
      */
    def writeByte(value: Double): this.type = js.native
    def writeByte(value: Double, offset: Double): this.type = js.native
    
    def writeBytes(source: String): this.type = js.native
    def writeBytes(source: String, encoding: String): this.type = js.native
    def writeBytes(source: String, encoding: String, offset: Double): this.type = js.native
    def writeBytes(source: String, encoding: Double): this.type = js.native
    def writeBytes(source: String, encoding: Double, offset: Double): this.type = js.native
    def writeBytes(source: String, encoding: Unit, offset: Double): this.type = js.native
    /**
      * Writes an array of bytes. This is an alias for append
      */
    def writeBytes(source: ByteBuffer): this.type = js.native
    def writeBytes(source: ByteBuffer, encoding: String): this.type = js.native
    def writeBytes(source: ByteBuffer, encoding: String, offset: Double): this.type = js.native
    def writeBytes(source: ByteBuffer, encoding: Double): this.type = js.native
    def writeBytes(source: ByteBuffer, encoding: Double, offset: Double): this.type = js.native
    def writeBytes(source: ByteBuffer, encoding: Unit, offset: Double): this.type = js.native
    def writeBytes(source: Buffer): this.type = js.native
    def writeBytes(source: Buffer, encoding: String): this.type = js.native
    def writeBytes(source: Buffer, encoding: String, offset: Double): this.type = js.native
    def writeBytes(source: Buffer, encoding: Double): this.type = js.native
    def writeBytes(source: Buffer, encoding: Double, offset: Double): this.type = js.native
    def writeBytes(source: Buffer, encoding: Unit, offset: Double): this.type = js.native
    def writeBytes(source: ArrayBuffer): this.type = js.native
    def writeBytes(source: ArrayBuffer, encoding: String): this.type = js.native
    def writeBytes(source: ArrayBuffer, encoding: String, offset: Double): this.type = js.native
    def writeBytes(source: ArrayBuffer, encoding: Double): this.type = js.native
    def writeBytes(source: ArrayBuffer, encoding: Double, offset: Double): this.type = js.native
    def writeBytes(source: ArrayBuffer, encoding: Unit, offset: Double): this.type = js.native
    def writeBytes(source: Uint8Array): this.type = js.native
    def writeBytes(source: Uint8Array, encoding: String): this.type = js.native
    def writeBytes(source: Uint8Array, encoding: String, offset: Double): this.type = js.native
    def writeBytes(source: Uint8Array, encoding: Double): this.type = js.native
    def writeBytes(source: Uint8Array, encoding: Double, offset: Double): this.type = js.native
    def writeBytes(source: Uint8Array, encoding: Unit, offset: Double): this.type = js.native
    
    /**
      * Writes a NULL-terminated UTF8 encoded string. For this to work the specified string must not contain any NULL characters itself.
      */
    def writeCString(str: String): this.type = js.native
    def writeCString(str: String, offset: Double): this.type = js.native
    
    /**
      * Writes a 64bit float. This is an alias of ByteBuffer#writeFloat64.
      */
    def writeDouble(value: Double): this.type = js.native
    def writeDouble(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 32bit float. This is an alias of ByteBuffer#writeFloat32.
      */
    def writeFloat(value: Double): this.type = js.native
    def writeFloat(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 32bit float.
      */
    def writeFloat32(value: Double): this.type = js.native
    def writeFloat32(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 64bit float.
      */
    def writeFloat64(value: Double): this.type = js.native
    def writeFloat64(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a length as uint32 prefixed UTF8 encoded string.
      */
    def writeIString(str: String): this.type = js.native
    def writeIString(str: String, offset: Double): this.type = js.native
    
    /**
      * Writes a 32bit signed integer. This is an alias of ByteBuffer#writeInt32.
      */
    def writeInt(value: Double): this.type = js.native
    def writeInt(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 16bit signed integer.
      */
    def writeInt16(value: Double): this.type = js.native
    def writeInt16(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 32bit signed integer.
      */
    def writeInt32(value: Double): this.type = js.native
    def writeInt32(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 64bit signed integer.
      */
    def writeInt64(value: Double): this.type = js.native
    def writeInt64(value: Double, offset: Double): this.type = js.native
    def writeInt64(value: Long): this.type = js.native
    def writeInt64(value: Long, offset: Double): this.type = js.native
    
    /**
      * Writes an 8bit signed integer.
      */
    def writeInt8(value: Double): this.type = js.native
    def writeInt8(value: Double, offset: Double): this.type = js.native
    
    /**
      * Write a 64bit signed integer. This is an alias of ByteBuffer#writeInt64.
      */
    def writeLong(value: Double): this.type = js.native
    def writeLong(value: Double, offset: Double): this.type = js.native
    def writeLong(value: Long): this.type = js.native
    def writeLong(value: Long, offset: Double): this.type = js.native
    
    /**
      * Writes a 16bit signed integer. This is an alias of ByteBuffer#writeInt16.
      */
    def writeShort(value: Double): this.type = js.native
    def writeShort(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes an UTF8 encoded string. This is an alias of ByteBuffer#writeUTF8String.
      */
    def writeString(str: String): this.type = js.native
    def writeString(str: String, offset: Double): Double = js.native
    
    /**
      * Writes an UTF8 encoded string.
      */
    def writeUTF8String(str: String): this.type = js.native
    def writeUTF8String(str: String, offset: Double): Double = js.native
    @JSName("writeUTF8String")
    def writeUTF8String_Double(str: String): Double = js.native
    
    /**
      * Writes a 16bit unsigned integer.
      */
    def writeUint16(value: Double): this.type = js.native
    def writeUint16(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 32bit unsigned integer.
      */
    def writeUint32(value: Double): this.type = js.native
    def writeUint32(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a 64bit unsigned integer.
      */
    def writeUint64(value: Double): this.type = js.native
    def writeUint64(value: Double, offset: Double): this.type = js.native
    def writeUint64(value: Long): this.type = js.native
    def writeUint64(value: Long, offset: Double): this.type = js.native
    
    /**
      * Writes an 8bit unsigned integer.
      */
    def writeUint8(value: Double): this.type = js.native
    def writeUint8(value: Double, offset: Double): this.type = js.native
    
    /**
      * Writes a length as varint32 prefixed UTF8 encoded string.
      */
    def writeVString(str: String): this.type = js.native
    def writeVString(str: String, offset: Double): Double = js.native
    
    /**
      * Writes a 32bit base 128 variable-length integer.
      */
    def writeVarint32(value: Double): this.type = js.native
    def writeVarint32(value: Double, offset: Double): Double = js.native
    
    /**
      * Writes a zig-zag encoded 32bit base 128 variable-length integer.
      */
    def writeVarint32ZigZag(value: Double): this.type = js.native
    def writeVarint32ZigZag(value: Double, offset: Double): Double = js.native
    
    /**
      * Writes a 64bit base 128 variable-length integer.
      */
    def writeVarint64(value: Double): this.type = js.native
    def writeVarint64(value: Double, offset: Double): Double = js.native
    def writeVarint64(value: Long): this.type = js.native
    def writeVarint64(value: Long, offset: Double): Double = js.native
    
    /**
      * Writes a zig-zag encoded 64bit base 128 variable-length integer.
      */
    def writeVarint64ZigZag(value: Double): this.type = js.native
    def writeVarint64ZigZag(value: Double, offset: Double): Double = js.native
    def writeVarint64ZigZag(value: Long): this.type = js.native
    def writeVarint64ZigZag(value: Long, offset: Double): Double = js.native
  }
}
