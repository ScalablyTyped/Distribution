package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBinaryEncodingMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/binary-encoding", "BinaryReader")
  @js.native
  open class BinaryReader protected ()
    extends StObject
       with IBinaryReader {
    def this(buf: js.typedarray.Uint8Array) = this()
    def this(buf: js.typedarray.Uint8Array, textDecoder: TextDecoderLike) = this()
    
    /**
      * Throws error if position in byte array is out of range.
      */
    /* protected */ def assertBounds(): Unit = js.native
    
    /**
      * Read a `bool` field, a variant.
      */
    /* CompleteClass */
    override def bool(): Boolean = js.native
    
    /* private */ val buf: Any = js.native
    
    /**
      * Read a `bytes` field, length-delimited arbitrary data.
      */
    /* CompleteClass */
    override def bytes(): js.typedarray.Uint8Array = js.native
    
    /**
      * Read a `double` field, a 64-bit floating point number.
      */
    /* CompleteClass */
    override def double(): Double = js.native
    
    /**
      * Read a `fixed32` field, an unsigned, fixed-length 32-bit integer.
      */
    /* CompleteClass */
    override def fixed32(): Double = js.native
    
    /**
      * Read a `fixed64` field, an unsigned, fixed-length 64 bit integer.
      */
    /* CompleteClass */
    override def fixed64(): js.BigInt | String = js.native
    
    /**
      * Read a `float` field, 32-bit floating point number.
      */
    /* CompleteClass */
    override def float(): Double = js.native
    
    /**
      * Read a `sint32` field, a signed, zigzag-encoded 32-bit varint.
      */
    /* CompleteClass */
    override def int32(): Double = js.native
    
    /**
      * Read a `int64` field, a signed 64-bit varint.
      */
    /* CompleteClass */
    override def int64(): js.BigInt | String = js.native
    
    /**
      * Number of bytes available in this reader.
      */
    /* CompleteClass */
    override val len: Double = js.native
    
    /**
      * Current position.
      */
    /* CompleteClass */
    override val pos: Double = js.native
    
    /**
      * Read a `sfixed32` field, a signed, fixed-length 32-bit integer.
      */
    /* CompleteClass */
    override def sfixed32(): Double = js.native
    
    /**
      * Read a `fixed64` field, a signed, fixed-length 64-bit integer.
      */
    /* CompleteClass */
    override def sfixed64(): js.BigInt | String = js.native
    
    /**
      * Read a `sint32` field, a signed, zigzag-encoded 32-bit varint.
      */
    /* CompleteClass */
    override def sint32(): Double = js.native
    
    /**
      * Read a `sint64` field, a signed, zig-zag-encoded 64-bit varint.
      */
    /* CompleteClass */
    override def sint64(): js.BigInt | String = js.native
    
    /**
      * Skip one element on the wire and return the skipped data.
      */
    /* CompleteClass */
    override def skip(wireType: WireType): js.typedarray.Uint8Array = js.native
    
    /**
      * Read a `string` field, length-delimited data converted to UTF-8 text.
      */
    /* CompleteClass */
    override def string(): String = js.native
    
    /**
      * Reads a tag - field number and wire type.
      */
    /* CompleteClass */
    override def tag(): js.Tuple2[Double, WireType] = js.native
    
    /* private */ val textDecoder: Any = js.native
    
    /**
      * Read a `int32` field, a signed 32 bit varint.
      */
    /* CompleteClass */
    override def uint32(): Double = js.native
    
    /**
      * Read a `uint64` field, an unsigned 64-bit varint.
      */
    /* CompleteClass */
    override def uint64(): js.BigInt | String = js.native
    
    /* protected */ def varint64(): js.Tuple2[Double, Double] = js.native
    
    /* private */ val view: Any = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/binary-encoding", "BinaryWriter")
  @js.native
  open class BinaryWriter ()
    extends StObject
       with IBinaryWriter {
    def this(textEncoder: TextEncoderLike) = this()
    
    /**
      * A growing buffer for byte values. If you don't know
      * the size of the data you are writing, push to this
      * array.
      */
    /* protected */ var buf: js.Array[Double] = js.native
    
    /**
      * We cannot allocate a buffer for the entire output
      * because we don't know it's size.
      *
      * So we collect smaller chunks of known size and
      * concat them later.
      *
      * Use `raw()` to push data to this array. It will flush
      * `buf` first.
      */
    /* private */ var chunks: Any = js.native
    
    /**
      * Previous fork states.
      */
    /* private */ var stack: Any = js.native
    
    /**
      * Text encoder instance to convert UTF-8 to bytes.
      */
    /* private */ val textEncoder: Any = js.native
  }
  
  @js.native
  sealed trait WireType extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/binary-encoding", "WireType")
  @js.native
  object WireType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WireType & Double] = js.native
    
    /**
      * Used for fixed32, sfixed32, float.
      * Always 4 bytes with little-endian byte order.
      */
    @js.native
    sealed trait Bit32
      extends StObject
         with WireType
    /* 5 */ val Bit32: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.Bit32 & Double = js.native
    
    /**
      * Used for fixed64, sfixed64, double.
      * Always 8 bytes with little-endian byte order.
      */
    @js.native
    sealed trait Bit64
      extends StObject
         with WireType
    /* 1 */ val Bit64: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.Bit64 & Double = js.native
    
    /**
      * Used for groups
      * @deprecated
      */
    @js.native
    sealed trait EndGroup
      extends StObject
         with WireType
    /* 4 */ val EndGroup: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.EndGroup & Double = js.native
    
    /**
      * Used for string, bytes, embedded messages, packed repeated fields
      *
      * Only repeated numeric types (types which use the varint, 32-bit,
      * or 64-bit wire types) can be packed. In proto3, such fields are
      * packed by default.
      */
    @js.native
    sealed trait LengthDelimited
      extends StObject
         with WireType
    /* 2 */ val LengthDelimited: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.LengthDelimited & Double = js.native
    
    /**
      * Used for groups
      * @deprecated
      */
    @js.native
    sealed trait StartGroup
      extends StObject
         with WireType
    /* 3 */ val StartGroup: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.StartGroup & Double = js.native
    
    /**
      * Used for int32, int64, uint32, uint64, sint32, sint64, bool, enum
      */
    @js.native
    sealed trait Varint
      extends StObject
         with WireType
    /* 0 */ val Varint: typings.bufbuildProtobuf.distTypesBinaryEncodingMod.WireType.Varint & Double = js.native
  }
  
  trait IBinaryReader extends StObject {
    
    /**
      * Read a `bool` field, a variant.
      */
    def bool(): Boolean
    
    /**
      * Read a `bytes` field, length-delimited arbitrary data.
      */
    def bytes(): js.typedarray.Uint8Array
    
    /**
      * Read a `double` field, a 64-bit floating point number.
      */
    def double(): Double
    
    /**
      * Read a `fixed32` field, an unsigned, fixed-length 32-bit integer.
      */
    def fixed32(): Double
    
    /**
      * Read a `fixed64` field, an unsigned, fixed-length 64 bit integer.
      */
    def fixed64(): js.BigInt | String
    
    /**
      * Read a `float` field, 32-bit floating point number.
      */
    def float(): Double
    
    /**
      * Read a `sint32` field, a signed, zigzag-encoded 32-bit varint.
      */
    def int32(): Double
    
    /**
      * Read a `int64` field, a signed 64-bit varint.
      */
    def int64(): js.BigInt | String
    
    /**
      * Number of bytes available in this reader.
      */
    val len: Double
    
    /**
      * Current position.
      */
    val pos: Double
    
    /**
      * Read a `sfixed32` field, a signed, fixed-length 32-bit integer.
      */
    def sfixed32(): Double
    
    /**
      * Read a `fixed64` field, a signed, fixed-length 64-bit integer.
      */
    def sfixed64(): js.BigInt | String
    
    /**
      * Read a `sint32` field, a signed, zigzag-encoded 32-bit varint.
      */
    def sint32(): Double
    
    /**
      * Read a `sint64` field, a signed, zig-zag-encoded 64-bit varint.
      */
    def sint64(): js.BigInt | String
    
    /**
      * Skip one element on the wire and return the skipped data.
      */
    def skip(wireType: WireType): js.typedarray.Uint8Array
    
    /**
      * Read a `string` field, length-delimited data converted to UTF-8 text.
      */
    def string(): String
    
    /**
      * Reads a tag - field number and wire type.
      */
    def tag(): js.Tuple2[Double, WireType]
    
    /**
      * Read a `int32` field, a signed 32 bit varint.
      */
    def uint32(): Double
    
    /**
      * Read a `uint64` field, an unsigned 64-bit varint.
      */
    def uint64(): js.BigInt | String
  }
  object IBinaryReader {
    
    inline def apply(
      bool: () => Boolean,
      bytes: () => js.typedarray.Uint8Array,
      double: () => Double,
      fixed32: () => Double,
      fixed64: () => js.BigInt | String,
      float: () => Double,
      int32: () => Double,
      int64: () => js.BigInt | String,
      len: Double,
      pos: Double,
      sfixed32: () => Double,
      sfixed64: () => js.BigInt | String,
      sint32: () => Double,
      sint64: () => js.BigInt | String,
      skip: WireType => js.typedarray.Uint8Array,
      string: () => String,
      tag: () => js.Tuple2[Double, WireType],
      uint32: () => Double,
      uint64: () => js.BigInt | String
    ): IBinaryReader = {
      val __obj = js.Dynamic.literal(bool = js.Any.fromFunction0(bool), bytes = js.Any.fromFunction0(bytes), double = js.Any.fromFunction0(double), fixed32 = js.Any.fromFunction0(fixed32), fixed64 = js.Any.fromFunction0(fixed64), float = js.Any.fromFunction0(float), int32 = js.Any.fromFunction0(int32), int64 = js.Any.fromFunction0(int64), len = len.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], sfixed32 = js.Any.fromFunction0(sfixed32), sfixed64 = js.Any.fromFunction0(sfixed64), sint32 = js.Any.fromFunction0(sint32), sint64 = js.Any.fromFunction0(sint64), skip = js.Any.fromFunction1(skip), string = js.Any.fromFunction0(string), tag = js.Any.fromFunction0(tag), uint32 = js.Any.fromFunction0(uint32), uint64 = js.Any.fromFunction0(uint64))
      __obj.asInstanceOf[IBinaryReader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBinaryReader] (val x: Self) extends AnyVal {
      
      inline def setBool(value: () => Boolean): Self = StObject.set(x, "bool", js.Any.fromFunction0(value))
      
      inline def setBytes(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", js.Any.fromFunction0(value))
      
      inline def setDouble(value: () => Double): Self = StObject.set(x, "double", js.Any.fromFunction0(value))
      
      inline def setFixed32(value: () => Double): Self = StObject.set(x, "fixed32", js.Any.fromFunction0(value))
      
      inline def setFixed64(value: () => js.BigInt | String): Self = StObject.set(x, "fixed64", js.Any.fromFunction0(value))
      
      inline def setFloat(value: () => Double): Self = StObject.set(x, "float", js.Any.fromFunction0(value))
      
      inline def setInt32(value: () => Double): Self = StObject.set(x, "int32", js.Any.fromFunction0(value))
      
      inline def setInt64(value: () => js.BigInt | String): Self = StObject.set(x, "int64", js.Any.fromFunction0(value))
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setSfixed32(value: () => Double): Self = StObject.set(x, "sfixed32", js.Any.fromFunction0(value))
      
      inline def setSfixed64(value: () => js.BigInt | String): Self = StObject.set(x, "sfixed64", js.Any.fromFunction0(value))
      
      inline def setSint32(value: () => Double): Self = StObject.set(x, "sint32", js.Any.fromFunction0(value))
      
      inline def setSint64(value: () => js.BigInt | String): Self = StObject.set(x, "sint64", js.Any.fromFunction0(value))
      
      inline def setSkip(value: WireType => js.typedarray.Uint8Array): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      inline def setString(value: () => String): Self = StObject.set(x, "string", js.Any.fromFunction0(value))
      
      inline def setTag(value: () => js.Tuple2[Double, WireType]): Self = StObject.set(x, "tag", js.Any.fromFunction0(value))
      
      inline def setUint32(value: () => Double): Self = StObject.set(x, "uint32", js.Any.fromFunction0(value))
      
      inline def setUint64(value: () => js.BigInt | String): Self = StObject.set(x, "uint64", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IBinaryWriter extends StObject {
    
    /**
      * Write a `bool` value, a variant.
      */
    def bool(value: Boolean): IBinaryWriter = js.native
    
    /**
      * Write a `bytes` value, length-delimited arbitrary data.
      */
    def bytes(value: js.typedarray.Uint8Array): IBinaryWriter = js.native
    
    /**
      * Write a `double` value, a 64-bit floating point number.
      */
    def double(value: Double): IBinaryWriter = js.native
    
    /**
      * Return all bytes written and reset this writer.
      */
    def finish(): js.typedarray.Uint8Array = js.native
    
    /**
      * Write a `fixed32` value, an unsigned, fixed-length 32-bit integer.
      */
    def fixed32(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `fixed64` value, an unsigned, fixed-length 64 bit integer.
      */
    def fixed64(value: String): IBinaryWriter = js.native
    def fixed64(value: js.BigInt): IBinaryWriter = js.native
    def fixed64(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `float` value, 32-bit floating point number.
      */
    def float(value: Double): IBinaryWriter = js.native
    
    /**
      * Start a new fork for length-delimited data like a message
      * or a packed repeated field.
      *
      * Must be joined later with `join()`.
      */
    def fork(): IBinaryWriter = js.native
    
    /**
      * Write a `int32` value, a signed 32 bit varint.
      */
    def int32(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `int64` value, a signed 64-bit varint.
      */
    def int64(value: String): IBinaryWriter = js.native
    def int64(value: js.BigInt): IBinaryWriter = js.native
    def int64(value: Double): IBinaryWriter = js.native
    
    /**
      * Join the last fork. Write its length and bytes, then
      * return to the previous state.
      */
    def join(): IBinaryWriter = js.native
    
    /**
      * Write a chunk of raw bytes.
      */
    def raw(chunk: js.typedarray.Uint8Array): IBinaryWriter = js.native
    
    /**
      * Write a `sfixed32` value, a signed, fixed-length 32-bit integer.
      */
    def sfixed32(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `fixed64` value, a signed, fixed-length 64-bit integer.
      */
    def sfixed64(value: String): IBinaryWriter = js.native
    def sfixed64(value: js.BigInt): IBinaryWriter = js.native
    def sfixed64(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `sint32` value, a signed, zigzag-encoded 32-bit varint.
      */
    def sint32(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `sint64` value, a signed, zig-zag-encoded 64-bit varint.
      */
    def sint64(value: String): IBinaryWriter = js.native
    def sint64(value: js.BigInt): IBinaryWriter = js.native
    def sint64(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `string` value, length-delimited data converted to UTF-8 text.
      */
    def string(value: String): IBinaryWriter = js.native
    
    /**
      * Writes a tag (field number and wire type).
      *
      * Equivalent to `uint32( (fieldNo << 3 | type) >>> 0 )`
      *
      * Generated code should compute the tag ahead of time and call `uint32()`.
      */
    def tag(fieldNo: Double, `type`: WireType): IBinaryWriter = js.native
    
    /**
      * Write a `uint32` value, an unsigned 32 bit varint.
      */
    def uint32(value: Double): IBinaryWriter = js.native
    
    /**
      * Write a `uint64` value, an unsigned 64-bit varint.
      */
    def uint64(value: String): IBinaryWriter = js.native
    def uint64(value: js.BigInt): IBinaryWriter = js.native
    def uint64(value: Double): IBinaryWriter = js.native
  }
  
  @js.native
  trait TextDecoderLike extends StObject {
    
    def decode(): String = js.native
    def decode(input: js.typedarray.Uint8Array): String = js.native
  }
  
  @js.native
  trait TextEncoderLike extends StObject {
    
    def encode(): js.typedarray.Uint8Array = js.native
    def encode(input: String): js.typedarray.Uint8Array = js.native
  }
}
