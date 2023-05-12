package typings.bson

import typings.bson.anon.Base64
import typings.bson.bsonStrings.`utf-8`
import typings.bson.bsonStrings.base64
import typings.bson.bsonStrings.hex
import typings.bson.bsonStrings.utf8
import typings.bson.libBsonValueMod.BSONValue
import typings.bson.libExtendedJsonMod.EJSONOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBinaryMod {
  
  @JSImport("bson/lib/binary", "Binary")
  @js.native
  /**
    * Create a new Binary instance.
    *
    * This constructor can accept a string as its first argument. In this case,
    * this string will be encoded using ISO-8859-1, **not** using UTF-8.
    * This is almost certainly not what you want. Use `new Binary(Buffer.from(string))`
    * instead to convert the string to a Buffer using UTF-8 first.
    *
    * @param buffer - a buffer object containing the binary data.
    * @param subType - the option binary type.
    */
  open class Binary () extends BSONValue {
    def this(buffer: String) = this()
    def this(buffer: BinarySequence) = this()
    def this(buffer: String, subType: Double) = this()
    def this(buffer: Unit, subType: Double) = this()
    def this(buffer: BinarySequence, subType: Double) = this()
    
    var buffer: js.typedarray.Uint8Array = js.native
    
    /** the length of the binary sequence */
    def length(): Double = js.native
    
    var position: Double = js.native
    
    /**
      * Updates this binary with byte_value.
      *
      * @param byteValue - a single byte we wish to write.
      */
    def put(byteValue: String): Unit = js.native
    def put(byteValue: js.Array[Double]): Unit = js.native
    def put(byteValue: js.typedarray.Uint8Array): Unit = js.native
    def put(byteValue: Double): Unit = js.native
    
    /**
      * Reads **length** bytes starting at **position**.
      *
      * @param position - read from the given position in the Binary.
      * @param length - the number of bytes to read.
      */
    def read(position: Double, length: Double): BinarySequence = js.native
    
    var sub_type: Double = js.native
    
    def toExtendedJSON(options: EJSONOptions): BinaryExtendedLegacy | BinaryExtended = js.native
    
    def toJSON(): String = js.native
    
    def toString(encoding: hex | base64 | utf8 | `utf-8`): String = js.native
    
    def toUUID(): UUID = js.native
    
    /**
      * Returns the value of this binary as a string.
      * @param asRaw - Will skip converting to a string
      * @remarks
      * This is handy when calling this function conditionally for some key value pairs and not others
      */
    def value(): String | BinarySequence = js.native
    def value(asRaw: Boolean): String | BinarySequence = js.native
    
    /**
      * Writes a buffer or string to the binary.
      *
      * @param sequence - a string or buffer to be written to the Binary BSON object.
      * @param offset - specify the binary of where to write the content.
      */
    def write(sequence: String, offset: Double): Unit = js.native
    def write(sequence: BinarySequence, offset: Double): Unit = js.native
  }
  /* static members */
  object Binary {
    
    @JSImport("bson/lib/binary", "Binary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binary default subtype
      * @internal
      */
    @JSImport("bson/lib/binary", "Binary.BSON_BINARY_SUBTYPE_DEFAULT")
    @js.native
    val BSON_BINARY_SUBTYPE_DEFAULT: Any = js.native
    
    /** Initial buffer default size */
    @JSImport("bson/lib/binary", "Binary.BUFFER_SIZE")
    @js.native
    val BUFFER_SIZE: /* 256 */ Double = js.native
    
    /** Byte Array BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_BYTE_ARRAY")
    @js.native
    val SUBTYPE_BYTE_ARRAY: /* 2 */ Double = js.native
    
    /** Column BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_COLUMN")
    @js.native
    val SUBTYPE_COLUMN: /* 7 */ Double = js.native
    
    /** Default BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_DEFAULT")
    @js.native
    val SUBTYPE_DEFAULT: /* 0 */ Double = js.native
    
    /** Encrypted BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_ENCRYPTED")
    @js.native
    val SUBTYPE_ENCRYPTED: /* 6 */ Double = js.native
    
    /** Function BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_FUNCTION")
    @js.native
    val SUBTYPE_FUNCTION: /* 1 */ Double = js.native
    
    /** MD5 BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_MD5")
    @js.native
    val SUBTYPE_MD5: /* 5 */ Double = js.native
    
    /** User BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_USER_DEFINED")
    @js.native
    val SUBTYPE_USER_DEFINED: /* 128 */ Double = js.native
    
    /** UUID BSON type */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_UUID")
    @js.native
    val SUBTYPE_UUID: /* 4 */ Double = js.native
    
    /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
    @JSImport("bson/lib/binary", "Binary.SUBTYPE_UUID_OLD")
    @js.native
    val SUBTYPE_UUID_OLD: /* 3 */ Double = js.native
    
    /** Creates an Binary instance from a base64 string */
    inline def createFromBase64(base64: String): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[Binary]
    inline def createFromBase64(base64: String, subType: Double): Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any], subType.asInstanceOf[js.Any])).asInstanceOf[Binary]
    
    /** Creates an Binary instance from a hex digit string */
    inline def createFromHexString(hex: String): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[Binary]
    inline def createFromHexString(hex: String, subType: Double): Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hex.asInstanceOf[js.Any], subType.asInstanceOf[js.Any])).asInstanceOf[Binary]
    
    inline def fromExtendedJSON(doc: BinaryExtended): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Binary]
    /** @internal */
    inline def fromExtendedJSON(doc: BinaryExtendedLegacy): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Binary]
    inline def fromExtendedJSON(doc: BinaryExtendedLegacy, options: EJSONOptions): Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Binary]
    inline def fromExtendedJSON(doc: BinaryExtended, options: EJSONOptions): Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Binary]
    inline def fromExtendedJSON(doc: UUIDExtended): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[Binary]
    inline def fromExtendedJSON(doc: UUIDExtended, options: EJSONOptions): Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Binary]
  }
  
  @JSImport("bson/lib/binary", "UUID")
  @js.native
  /**
    * Create a UUID type
    *
    * When the argument to the constructor is omitted a random v4 UUID will be generated.
    *
    * @param input - Can be a 32 or 36 character hex string (dashes excluded/included) or a 16 byte binary Buffer.
    */
  open class UUID () extends Binary {
    def this(input: String) = this()
    def this(input: js.typedarray.Uint8Array) = this()
    def this(input: UUID) = this()
    
    /**
      * Compares the equality of this UUID with `otherID`.
      *
      * @param otherId - UUID instance to compare against.
      */
    def equals(otherId: String): Boolean = js.native
    def equals(otherId: js.typedarray.Uint8Array): Boolean = js.native
    def equals(otherId: UUID): Boolean = js.native
    
    /**
      * The UUID bytes
      * @readonly
      */
    def id: js.typedarray.Uint8Array = js.native
    def id_=(value: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Creates a Binary instance from the current UUID.
      */
    def toBinary(): Binary = js.native
    
    /**
      * Returns the UUID id as a 32 or 36 character hex string representation, excluding/including dashes (defaults to 36 character dash separated)
      * @param includeDashes - should the string exclude dash-separators.
      */
    def toHexString(): String = js.native
    def toHexString(includeDashes: Boolean): String = js.native
  }
  /* static members */
  object UUID {
    
    @JSImport("bson/lib/binary", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def bytesFromString(representation: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromString")(representation.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /** @deprecated Hex string is no longer cached, this control will be removed in a future major release */
    @JSImport("bson/lib/binary", "UUID.cacheHexString")
    @js.native
    def cacheHexString: Boolean = js.native
    inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /** Creates an UUID from a base64 string representation of an UUID. */
    inline def createFromBase64(base64: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[UUID]
    
    /**
      * Creates an UUID from a hex string representation of an UUID.
      * @param hexString - 32 or 36 character hex string (dashes excluded/included).
      */
    inline def createFromHexString(hexString: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[UUID]
    
    /**
      * Generates a populated buffer containing a v4 uuid
      */
    inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Checks if a value is a valid bson UUID
      * @param input - UUID, string or Buffer to validate.
      */
    inline def isValid(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(input: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(input: Binary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(input: UUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * @internal
      *
      * Validates a string to be a hex digit sequence with or without dashes.
      * The canonical hyphenated representation of a uuid is hex in 8-4-4-4-12 groups.
      */
    inline def isValidUUIDString(representation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUUIDString")(representation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait BinaryExtended extends StObject {
    
    @JSName("$binary")
    var $binary: Base64
  }
  object BinaryExtended {
    
    inline def apply($binary: Base64): BinaryExtended = {
      val __obj = js.Dynamic.literal($binary = $binary.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryExtended] (val x: Self) extends AnyVal {
      
      inline def set$binary(value: Base64): Self = StObject.set(x, "$binary", value.asInstanceOf[js.Any])
    }
  }
  
  trait BinaryExtendedLegacy extends StObject {
    
    @JSName("$binary")
    var $binary: String
    
    @JSName("$type")
    var $type: String
  }
  object BinaryExtendedLegacy {
    
    inline def apply($binary: String, $type: String): BinaryExtendedLegacy = {
      val __obj = js.Dynamic.literal($binary = $binary.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BinaryExtendedLegacy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryExtendedLegacy] (val x: Self) extends AnyVal {
      
      inline def set$binary(value: String): Self = StObject.set(x, "$binary", value.asInstanceOf[js.Any])
      
      inline def set$type(value: String): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    }
  }
  
  type BinarySequence = js.typedarray.Uint8Array | js.Array[Double]
  
  trait UUIDExtended extends StObject {
    
    @JSName("$uuid")
    var $uuid: String
  }
  object UUIDExtended {
    
    inline def apply($uuid: String): UUIDExtended = {
      val __obj = js.Dynamic.literal($uuid = $uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UUIDExtended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UUIDExtended] (val x: Self) extends AnyVal {
      
      inline def set$uuid(value: String): Self = StObject.set(x, "$uuid", value.asInstanceOf[js.Any])
    }
  }
}
