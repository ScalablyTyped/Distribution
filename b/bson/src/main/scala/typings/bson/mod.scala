package typings.bson

import org.scalablytyped.runtime.StringDictionary
import typings.bson.anon.Relaxed
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bson", "BSONRegExp")
  @js.native
  class BSONRegExp protected () extends StObject {
    def this(pattern: String, options: String) = this()
    
    val options: String = js.native
    
    val pattern: String = js.native
  }
  
  @JSImport("bson", "Binary")
  @js.native
  class Binary protected () extends StObject {
    /**
      * @param buffer A buffer object containing the binary data
      * @param subType Binary data subtype
      */
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, subType: scala.Double) = this()
    
    /** The underlying Buffer which stores the binary data. */
    val buffer: Buffer = js.native
    
    /** The length of the binary. */
    def length(): scala.Double = js.native
    
    def put(byte_value: String): Unit = js.native
    /** Updates this binary with byte_value */
    def put(byte_value: scala.Double): Unit = js.native
    
    /** Reads length bytes starting at position. */
    def read(position: scala.Double, length: scala.Double): Buffer = js.native
    
    /** Binary data subtype */
    val sub_type: js.UndefOr[scala.Double] = js.native
    
    /** Returns the value of this binary as a string. */
    def value(): String = js.native
    
    def write(buffer: String, offset: scala.Double): Unit = js.native
    /** Writes a buffer or string to the binary */
    def write(buffer: Buffer, offset: scala.Double): Unit = js.native
  }
  /* static members */
  object Binary {
    
    @JSImport("bson", "Binary.SUBTYPE_BYTE_ARRAY")
    @js.native
    val SUBTYPE_BYTE_ARRAY: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_DEFAULT")
    @js.native
    val SUBTYPE_DEFAULT: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_FUNCTION")
    @js.native
    val SUBTYPE_FUNCTION: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_MD5")
    @js.native
    val SUBTYPE_MD5: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_USER_DEFINED")
    @js.native
    val SUBTYPE_USER_DEFINED: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_UUID")
    @js.native
    val SUBTYPE_UUID: scala.Double = js.native
    
    @JSImport("bson", "Binary.SUBTYPE_UUID_OLD")
    @js.native
    val SUBTYPE_UUID_OLD: scala.Double = js.native
  }
  
  @JSImport("bson", "Code")
  @js.native
  class Code protected () extends StObject {
    /**
      * @param code A string or function.
      * @param scope An optional scope for the function.
      */
    def this(code: String) = this()
    def this(code: js.Function) = this()
    def this(code: String, scope: js.Any) = this()
    def this(code: js.Function, scope: js.Any) = this()
    
    val code: String | js.Function = js.native
    
    val scope: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("bson", "DBRef")
  @js.native
  class DBRef protected () extends StObject {
    /**
      * @param namespace The collection name.
      * @param oid The reference ObjectId.
      * @param db Optional db name, if omitted the reference is local to the current db
      */
    def this(namespace: String, oid: ObjectId) = this()
    def this(namespace: String, oid: ObjectId, db: String) = this()
    
    var db: js.UndefOr[String] = js.native
    
    var namespace: String = js.native
    
    var oid: ObjectId = js.native
  }
  
  @JSImport("bson", "Decimal128")
  @js.native
  class Decimal128 protected () extends StObject {
    /**
      * @param bytes A buffer containing the raw Decimal128 bytes.
      */
    def this(bytes: Buffer) = this()
    
    /** A buffer containing the raw Decimal128 bytes. */
    val bytes: Buffer = js.native
    
    def toJSON(): String = js.native
  }
  /* static members */
  object Decimal128 {
    
    /** Create a Decimal128 instance from a string representation. */
    @JSImport("bson", "Decimal128.fromString")
    @js.native
    def fromString(s: String): Decimal128 = js.native
  }
  
  @JSImport("bson", "Double")
  @js.native
  class Double protected () extends StObject {
    /**
      * @param value The number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
    
    /**
      * https://github.com/mongodb/js-bson/blob/master/lib/double.js#L17
      */
    var value: scala.Double = js.native
  }
  
  object EJSON {
    
    @JSImport("bson", "EJSON.deserialize")
    @js.native
    def deserialize(ejson: js.Object): js.Object = js.native
    @JSImport("bson", "EJSON.deserialize")
    @js.native
    def deserialize(ejson: js.Object, options: Relaxed): js.Object = js.native
    
    @JSImport("bson", "EJSON.parse")
    @js.native
    def parse(text: String): js.Object = js.native
    @JSImport("bson", "EJSON.parse")
    @js.native
    def parse(text: String, options: Relaxed): js.Object = js.native
    
    @JSImport("bson", "EJSON.serialize")
    @js.native
    def serialize(bson: js.Object): js.Object = js.native
    @JSImport("bson", "EJSON.serialize")
    @js.native
    def serialize(bson: js.Object, options: Relaxed): js.Object = js.native
    
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.UndefOr[scala.Nothing],
      indents: js.UndefOr[scala.Nothing],
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: String): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: String, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: scala.Double): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: scala.Double, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Array[scala.Double | String]): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Array[String | scala.Double],
      indents: js.UndefOr[scala.Nothing],
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: scala.Double): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Array[String | scala.Double],
      indents: scala.Double,
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Array[String | scala.Double], options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      indents: js.UndefOr[scala.Nothing],
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], indents: String): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      indents: String,
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      indents: scala.Double
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      indents: scala.Double,
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(
      value: js.Object,
      replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
      options: Relaxed
    ): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, indents: js.UndefOr[scala.Nothing], options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, indents: String): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, indents: String, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, indents: scala.Double): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, indents: scala.Double, options: Relaxed): String = js.native
    @JSImport("bson", "EJSON.stringify")
    @js.native
    def stringify(value: js.Object, replacer: Null, options: Relaxed): String = js.native
  }
  
  @JSImport("bson", "Int32")
  @js.native
  class Int32 protected () extends StObject {
    /**
      * @param value The number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  @JSImport("bson", "Long")
  @js.native
  class Long () extends LongLike[Long]
  /* static members */
  object Long {
    
    @JSImport("bson", "Long.MAX_VALUE")
    @js.native
    val MAX_VALUE: Long = js.native
    
    @JSImport("bson", "Long.MIN_VALUE")
    @js.native
    val MIN_VALUE: Long = js.native
    
    @JSImport("bson", "Long.NEG_ONE")
    @js.native
    val NEG_ONE: Long = js.native
    
    @JSImport("bson", "Long.ONE")
    @js.native
    val ONE: Long = js.native
    
    @JSImport("bson", "Long.ZERO")
    @js.native
    val ZERO: Long = js.native
    
    /**
      * Returns a Long representing the 64-bit integer that comes by concatenating the given high and low bits. Each is assumed to use 32 bits.
      * @param lowBits The low 32-bits.
      * @param highBits The high 32-bits.
      */
    @JSImport("bson", "Long.fromBits")
    @js.native
    def fromBits(lowBits: scala.Double, highBits: scala.Double): Long = js.native
    
    /** Returns a Long representing the given (32-bit) integer value. */
    @JSImport("bson", "Long.fromInt")
    @js.native
    def fromInt(i: scala.Double): Long = js.native
    
    /** Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned. */
    @JSImport("bson", "Long.fromNumber")
    @js.native
    def fromNumber(n: scala.Double): Long = js.native
    
    /**
      * Returns a Long representation of the given string
      * @param opt_radix The radix in which the text is written. {default:10}
      */
    @JSImport("bson", "Long.fromString")
    @js.native
    def fromString(s: String): Long = js.native
    @JSImport("bson", "Long.fromString")
    @js.native
    def fromString(s: String, opt_radix: scala.Double): Long = js.native
  }
  
  @JSImport("bson", "MaxKey")
  @js.native
  class MaxKey () extends StObject
  
  @JSImport("bson", "MinKey")
  @js.native
  class MinKey () extends StObject
  
  @JSImport("bson", "ObjectID")
  @js.native
  /**
    * Create a new ObjectId instance
    * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
    */
  class ObjectID_ () extends ObjectId {
    def this(id: String) = this()
    def this(id: scala.Double) = this()
    def this(id: ObjectId) = this()
  }
  /* static members */
  object ObjectID_ {
    
    @JSImport("bson", "ObjectID")
    @js.native
    val ^ : js.Any = js.native
    
    /** If true cache the hex string representation of ObjectId */
    @JSImport("bson", "ObjectID.cacheHexString")
    @js.native
    def cacheHexString: js.UndefOr[Boolean] = js.native
    @scala.inline
    def cacheHexString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /**
      * Creates an ObjectId from a hex string representation of an ObjectId.
      * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
      * @return {ObjectId} return the created ObjectId
      */
    @JSImport("bson", "ObjectID.createFromHexString")
    @js.native
    def createFromHexString(hexString: String): ObjectId = js.native
    
    /**
      * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
      * @param {number} time an integer number representing a number of seconds.
      * @return {ObjectId} return the created ObjectId
      */
    @JSImport("bson", "ObjectID.createFromTime")
    @js.native
    def createFromTime(time: scala.Double): ObjectId = js.native
    
    /**
      * Generate a 12 byte id string used in ObjectId's
      * @param {number} time optional parameter allowing to pass in a second based timestamp.
      * @return {string} return the 12 byte id binary string.
      */
    @JSImport("bson", "ObjectID.generate")
    @js.native
    def generate(): Buffer = js.native
    @JSImport("bson", "ObjectID.generate")
    @js.native
    def generate(time: scala.Double): Buffer = js.native
    
    /**
      * Checks if a value is a valid bson ObjectId
      *
      * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
      */
    @JSImport("bson", "ObjectID.isValid")
    @js.native
    def isValid(id: String): Boolean = js.native
    @JSImport("bson", "ObjectID.isValid")
    @js.native
    def isValid(id: scala.Double): Boolean = js.native
    @JSImport("bson", "ObjectID.isValid")
    @js.native
    def isValid(id: ObjectId): Boolean = js.native
  }
  
  @JSImport("bson", "ObjectId")
  @js.native
  /**
    * Create a new ObjectId instance
    * @param {(string|number|ObjectId)} id Can be a 24 byte hex string, 12 byte binary string or a Number.
    */
  class ObjectId () extends StObject {
    def this(id: String) = this()
    def this(id: scala.Double) = this()
    def this(id: ObjectId) = this()
    
    def equals(otherID: String): Boolean = js.native
    /**
      * Compares the equality of this ObjectId with `otherID`.
      * @param {ObjectId|string} otherID ObjectId instance to compare against.
      * @return {boolean} the result of comparing two ObjectId's
      */
    def equals(otherID: ObjectId): Boolean = js.native
    
    /** The generation time of this ObjectId instance */
    var generationTime: scala.Double = js.native
    
    /**
      * Returns the generation date (accurate up to the second) that this ID was generated.
      * @return {Date} the generation date
      */
    def getTimestamp(): Date = js.native
    
    /**
      * Return the ObjectId id as a 24 byte hex string representation
      * @return {string} return the 24 byte hex string representation.
      */
    def toHexString(): String = js.native
  }
  /* static members */
  object ObjectId {
    
    @JSImport("bson", "ObjectId")
    @js.native
    val ^ : js.Any = js.native
    
    /** If true cache the hex string representation of ObjectId */
    @JSImport("bson", "ObjectId.cacheHexString")
    @js.native
    def cacheHexString: js.UndefOr[Boolean] = js.native
    @scala.inline
    def cacheHexString_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /**
      * Creates an ObjectId from a hex string representation of an ObjectId.
      * @param {string} hexString create a ObjectId from a passed in 24 byte hexstring.
      * @return {ObjectId} return the created ObjectId
      */
    @JSImport("bson", "ObjectId.createFromHexString")
    @js.native
    def createFromHexString(hexString: String): ObjectId = js.native
    
    /**
      * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
      * @param {number} time an integer number representing a number of seconds.
      * @return {ObjectId} return the created ObjectId
      */
    @JSImport("bson", "ObjectId.createFromTime")
    @js.native
    def createFromTime(time: scala.Double): ObjectId = js.native
    
    /**
      * Generate a 12 byte id string used in ObjectId's
      * @param {number} time optional parameter allowing to pass in a second based timestamp.
      * @return {string} return the 12 byte id binary string.
      */
    @JSImport("bson", "ObjectId.generate")
    @js.native
    def generate(): Buffer = js.native
    @JSImport("bson", "ObjectId.generate")
    @js.native
    def generate(time: scala.Double): Buffer = js.native
    
    /**
      * Checks if a value is a valid bson ObjectId
      *
      * @return {boolean} return true if the value is a valid bson ObjectId, return false otherwise.
      */
    @JSImport("bson", "ObjectId.isValid")
    @js.native
    def isValid(id: String): Boolean = js.native
    @JSImport("bson", "ObjectId.isValid")
    @js.native
    def isValid(id: scala.Double): Boolean = js.native
    @JSImport("bson", "ObjectId.isValid")
    @js.native
    def isValid(id: ObjectId): Boolean = js.native
  }
  
  @JSImport("bson", "Symbol")
  @js.native
  class Symbol protected () extends StObject {
    def this(value: String) = this()
  }
  
  @JSImport("bson", "Timestamp")
  @js.native
  class Timestamp () extends LongLike[Timestamp]
  /* static members */
  object Timestamp {
    
    @JSImport("bson", "Timestamp.MAX_VALUE")
    @js.native
    val MAX_VALUE: Timestamp = js.native
    
    @JSImport("bson", "Timestamp.MIN_VALUE")
    @js.native
    val MIN_VALUE: Timestamp = js.native
    
    @JSImport("bson", "Timestamp.NEG_ONE")
    @js.native
    val NEG_ONE: Timestamp = js.native
    
    @JSImport("bson", "Timestamp.ONE")
    @js.native
    val ONE: Timestamp = js.native
    
    @JSImport("bson", "Timestamp.ZERO")
    @js.native
    val ZERO: Timestamp = js.native
    
    /**
      * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
      * @param lowBits The low 32-bits.
      * @param highBits The high 32-bits.
      */
    @JSImport("bson", "Timestamp.fromBits")
    @js.native
    def fromBits(lowBits: scala.Double, highBits: scala.Double): Timestamp = js.native
    
    /** Returns a Timestamp represented by the given (32-bit) integer value */
    @JSImport("bson", "Timestamp.fromInt")
    @js.native
    def fromInt(value: scala.Double): Timestamp = js.native
    
    /** Returns a Timestamp representing the given number value, provided that it is a finite number. */
    @JSImport("bson", "Timestamp.fromNumber")
    @js.native
    def fromNumber(value: scala.Double): Timestamp = js.native
    
    /**
      * Returns a Timestamp from the given string.
      * @param opt_radix The radix in which the text is written. {default:10}
      */
    @JSImport("bson", "Timestamp.fromString")
    @js.native
    def fromString(str: String): Timestamp = js.native
    @JSImport("bson", "Timestamp.fromString")
    @js.native
    def fromString(str: String, opt_radix: scala.Double): Timestamp = js.native
  }
  
  @JSImport("bson", "calculateObjectSize")
  @js.native
  def calculateObjectSize(`object`: js.Any): scala.Double = js.native
  @JSImport("bson", "calculateObjectSize")
  @js.native
  def calculateObjectSize(`object`: js.Any, options: CalculateObjectSizeOptions): scala.Double = js.native
  
  @JSImport("bson", "deserialize")
  @js.native
  def deserialize(buffer: Buffer): js.Any = js.native
  @JSImport("bson", "deserialize")
  @js.native
  def deserialize(buffer: Buffer, options: DeserializeOptions): js.Any = js.native
  
  @JSImport("bson", "deserializeStream")
  @js.native
  def deserializeStream(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double
  ): scala.Double = js.native
  @JSImport("bson", "deserializeStream")
  @js.native
  def deserializeStream(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[_],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = js.native
  
  @JSImport("bson", "serialize")
  @js.native
  def serialize(`object`: js.Any): Buffer = js.native
  @JSImport("bson", "serialize")
  @js.native
  def serialize(`object`: js.Any, options: SerializeOptions): Buffer = js.native
  
  @JSImport("bson", "serializeWithBufferAndIndex")
  @js.native
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: Buffer): scala.Double = js.native
  @JSImport("bson", "serializeWithBufferAndIndex")
  @js.native
  def serializeWithBufferAndIndex(`object`: js.Any, buffer: Buffer, options: SerializeWithBufferAndIndexOptions): scala.Double = js.native
  
  @js.native
  trait CalculateObjectSizeOptions extends StObject {
    
    /** {default:true}, ignore undefined fields. */
    var ignoreUndefined: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, serialize the javascript functions */
    var serializeFunctions: js.UndefOr[Boolean] = js.native
  }
  object CalculateObjectSizeOptions {
    
    @scala.inline
    def apply(): CalculateObjectSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalculateObjectSizeOptions]
    }
    
    @scala.inline
    implicit class CalculateObjectSizeOptionsMutableBuilder[Self <: CalculateObjectSizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    }
  }
  
  @js.native
  trait CommonSerializeOptions extends StObject {
    
    /** {default:false}, the serializer will check if keys are valid. */
    var checkKeys: js.UndefOr[Boolean] = js.native
    
    /** {default:true}, ignore undefined fields. */
    var ignoreUndefined: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, serialize the javascript functions. */
    var serializeFunctions: js.UndefOr[Boolean] = js.native
  }
  object CommonSerializeOptions {
    
    @scala.inline
    def apply(): CommonSerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonSerializeOptions]
    }
    
    @scala.inline
    implicit class CommonSerializeOptionsMutableBuilder[Self <: CommonSerializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckKeys(value: Boolean): Self = StObject.set(x, "checkKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckKeysUndefined: Self = StObject.set(x, "checkKeys", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
    }
  }
  
  @js.native
  trait DeserializeOptions extends StObject {
    
    /** {default:false}, allows the buffer to be larger than the parsed BSON object. */
    var allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, return BSON regular expressions as BSONRegExp instances. */
    var bsonRegExp: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, cache evaluated functions for reuse. */
    var cacheFunctions: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, use a crc32 code for caching, otherwise use the string of the function. */
    var cacheFunctionsCrc32: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, evaluate functions in the BSON document scoped to the object deserialized. */
    var evalFunctions: js.UndefOr[Boolean] = js.native
    
    /** {default:null}, allow to specify if there what fields we wish to return as unserialized raw buffer. */
    var fieldsAsRaw: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    /** {default:false}, deserialize Binary data directly into node.js Buffer object. */
    var promoteBuffers: js.UndefOr[Boolean] = js.native
    
    /** {default:true}, when deserializing a Long will fit it into a Number if it's smaller than 53 bits. */
    var promoteLongs: js.UndefOr[Boolean] = js.native
    
    /** {default:false}, when deserializing will promote BSON values to their Node.js closest equivalent types. */
    var promoteValues: js.UndefOr[Boolean] = js.native
  }
  object DeserializeOptions {
    
    @scala.inline
    def apply(): DeserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializeOptions]
    }
    
    @scala.inline
    implicit class DeserializeOptionsMutableBuilder[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowObjectSmallerThanBufferSize(value: Boolean): Self = StObject.set(x, "allowObjectSmallerThanBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowObjectSmallerThanBufferSizeUndefined: Self = StObject.set(x, "allowObjectSmallerThanBufferSize", js.undefined)
      
      @scala.inline
      def setBsonRegExp(value: Boolean): Self = StObject.set(x, "bsonRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsonRegExpUndefined: Self = StObject.set(x, "bsonRegExp", js.undefined)
      
      @scala.inline
      def setCacheFunctions(value: Boolean): Self = StObject.set(x, "cacheFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheFunctionsCrc32(value: Boolean): Self = StObject.set(x, "cacheFunctionsCrc32", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheFunctionsCrc32Undefined: Self = StObject.set(x, "cacheFunctionsCrc32", js.undefined)
      
      @scala.inline
      def setCacheFunctionsUndefined: Self = StObject.set(x, "cacheFunctions", js.undefined)
      
      @scala.inline
      def setEvalFunctions(value: Boolean): Self = StObject.set(x, "evalFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalFunctionsUndefined: Self = StObject.set(x, "evalFunctions", js.undefined)
      
      @scala.inline
      def setFieldsAsRaw(value: StringDictionary[Boolean]): Self = StObject.set(x, "fieldsAsRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsAsRawUndefined: Self = StObject.set(x, "fieldsAsRaw", js.undefined)
      
      @scala.inline
      def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
      
      @scala.inline
      def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
      
      @scala.inline
      def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    }
  }
  
  /**
    * Base class for Long and Timestamp.
    * In original js-node@1.0.x code 'Timestamp' is a 100% copy-paste of 'Long'
    * with 'Long' replaced by 'Timestamp' (changed to inheritance in js-node@2.0.0)
    */
  @js.native
  trait LongLike[T] extends StObject {
    
    /** Returns the sum of `this` and the `other`. */
    def add(other: T): T = js.native
    
    /** Returns the bitwise-AND of `this` and the `other`. */
    def and(other: T): T = js.native
    
    /**
      * Compares `this` with the given `other`.
      * @returns 0 if they are the same, 1 if the this is greater, and -1 if the given one is greater.
      */
    def compare(other: T): scala.Double = js.native
    
    /** Returns `this` divided by the given `other`. */
    def div(other: T): T = js.native
    
    /** Return the high 32-bits value. */
    def getHighBits(): scala.Double = js.native
    
    /** Return the low 32-bits value. */
    def getLowBits(): scala.Double = js.native
    
    /** Return the low unsigned 32-bits value. */
    def getLowBitsUnsigned(): scala.Double = js.native
    
    /** Returns the number of bits needed to represent the absolute value of `this`. */
    def getNumBitsAbs(): scala.Double = js.native
    
    /** Return whether `this` is greater than the `other`. */
    def greaterThan(other: T): Boolean = js.native
    
    /** Return whether `this` is greater than or equal to the `other`. */
    def greaterThanOrEqual(other: T): Boolean = js.native
    
    /** Return whether `this` value is negative. */
    def isNegative(): Boolean = js.native
    
    /** Return whether `this` value is odd. */
    def isOdd(): Boolean = js.native
    
    /** Return whether `this` value is zero. */
    def isZero(): Boolean = js.native
    
    /** Return whether `this` is less than the `other`. */
    def lessThan(other: T): Boolean = js.native
    
    /** Return whether `this` is less than or equal to the `other`. */
    def lessThanOrEqual(other: T): Boolean = js.native
    
    /** Returns `this` modulo the given `other`. */
    def modulo(other: T): T = js.native
    
    /** Returns the product of `this` and the given `other`. */
    def multiply(other: T): T = js.native
    
    /** The negation of this value. */
    def negate(): T = js.native
    
    /** The bitwise-NOT of this value. */
    def not(): T = js.native
    
    /** Return whether `this` does not equal to the `other`. */
    def notEquals(other: T): Boolean = js.native
    
    /** Returns the bitwise-OR of `this` and the given `other`. */
    def or(other: T): T = js.native
    
    /**
      * Returns `this` with bits shifted to the left by the given amount.
      * @param numBits The number of bits by which to shift.
      */
    def shiftLeft(numBits: scala.Double): T = js.native
    
    /**
      * Returns `this` with bits shifted to the right by the given amount.
      * @param numBits The number of bits by which to shift.
      */
    def shiftRight(numBits: scala.Double): T = js.native
    
    /**
      * Returns `this` with bits shifted to the right by the given amount, with the new top bits matching the current sign bit.
      * @param numBits The number of bits by which to shift.
      */
    def shiftRightUnsigned(numBits: scala.Double): T = js.native
    
    /** Returns the difference of `this` and the given `other`. */
    def subtract(other: T): T = js.native
    
    /** Return the int value (low 32 bits). */
    def toInt(): scala.Double = js.native
    
    /** Return the JSON value. */
    def toJSON(): String = js.native
    
    /** Returns closest floating-point representation to `this` value */
    def toNumber(): scala.Double = js.native
    
    def toString(radix: scala.Double): String = js.native
    
    /** Returns the bitwise-XOR of `this` and the given `other`. */
    def xor(other: T): T = js.native
  }
  
  @js.native
  trait SerializeOptions extends CommonSerializeOptions {
    
    /** {default:1024*1024*17}, minimum size of the internal temporary serialization buffer. */
    var minInternalBufferSize: js.UndefOr[scala.Double] = js.native
  }
  object SerializeOptions {
    
    @scala.inline
    def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    @scala.inline
    implicit class SerializeOptionsMutableBuilder[Self <: SerializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinInternalBufferSize(value: scala.Double): Self = StObject.set(x, "minInternalBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInternalBufferSizeUndefined: Self = StObject.set(x, "minInternalBufferSize", js.undefined)
    }
  }
  
  @js.native
  trait SerializeWithBufferAndIndexOptions extends CommonSerializeOptions {
    
    /** {default:0}, the index in the buffer where we wish to start serializing into. */
    var index: js.UndefOr[scala.Double] = js.native
  }
  object SerializeWithBufferAndIndexOptions {
    
    @scala.inline
    def apply(): SerializeWithBufferAndIndexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeWithBufferAndIndexOptions]
    }
    
    @scala.inline
    implicit class SerializeWithBufferAndIndexOptionsMutableBuilder[Self <: SerializeWithBufferAndIndexOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
}
