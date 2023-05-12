package typings.bson.libMod

import typings.bson.anon.High
import typings.bson.anon.I
import typings.bson.anon.NumberLong
import typings.bson.anon.PinExcludekeyofLongTimestAdd
import typings.bson.bsonInts.`-1`
import typings.bson.bsonInts.`0`
import typings.bson.bsonInts.`10`
import typings.bson.bsonInts.`11`
import typings.bson.bsonInts.`127`
import typings.bson.bsonInts.`12`
import typings.bson.bsonInts.`13`
import typings.bson.bsonInts.`14`
import typings.bson.bsonInts.`15`
import typings.bson.bsonInts.`16`
import typings.bson.bsonInts.`17`
import typings.bson.bsonInts.`18`
import typings.bson.bsonInts.`19`
import typings.bson.bsonInts.`1`
import typings.bson.bsonInts.`2`
import typings.bson.bsonInts.`3`
import typings.bson.bsonInts.`4`
import typings.bson.bsonInts.`5`
import typings.bson.bsonInts.`6`
import typings.bson.bsonInts.`7`
import typings.bson.bsonInts.`8`
import typings.bson.bsonInts.`9`
import typings.bson.libBinaryMod.BinaryExtended
import typings.bson.libBinaryMod.BinaryExtendedLegacy
import typings.bson.libBinaryMod.BinarySequence
import typings.bson.libBinaryMod.UUIDExtended
import typings.bson.libBsonMod.CalculateObjectSizeOptions
import typings.bson.libBsonMod.Document
import typings.bson.libCodeMod.CodeExtended
import typings.bson.libDbRefMod.DBRefLike
import typings.bson.libDecimal128Mod.Decimal128Extended
import typings.bson.libDoubleMod.DoubleExtended
import typings.bson.libExtendedJsonMod.EJSONOptions
import typings.bson.libInt32Mod.Int32Extended
import typings.bson.libObjectidMod.ObjectIdExtended
import typings.bson.libObjectidMod.ObjectIdLike
import typings.bson.libRegexpMod.BSONRegExpExtended
import typings.bson.libRegexpMod.BSONRegExpExtendedLegacy
import typings.bson.libSymbolMod.BSONSymbolExtended
import typings.bson.libTimestampMod.LongWithoutOverrides
import typings.bson.libTimestampMod.TimestampExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BSON {
  
  @JSImport("bson/lib", "BSON")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bson/lib", "BSON.BSONError")
  @js.native
  open class BSONError protected ()
    extends typings.bson.libBsonMod.BSONError {
    def this(message: String) = this()
  }
  /* static members */
  object BSONError {
    
    @JSImport("bson/lib", "BSON.BSONError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @public
      *
      * All errors thrown from the BSON library inherit from `BSONError`.
      * This method can assist with determining if an error originates from the BSON library
      * even if it does not pass an `instanceof` check against this class' constructor.
      *
      * @param value - any javascript value that needs type checking
      */
    inline def isBSONError(value: Any): /* is bson.bson/lib/error.BSONError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBSONError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson/lib/error.BSONError */ Boolean]
  }
  
  @JSImport("bson/lib", "BSON.BSONRegExp")
  @js.native
  open class BSONRegExp protected ()
    extends typings.bson.libBsonMod.BSONRegExp {
    /**
      * @param pattern - The regular expression pattern to match
      * @param options - The regular expression options
      */
    def this(pattern: String) = this()
    def this(pattern: String, options: String) = this()
  }
  /* static members */
  object BSONRegExp {
    
    @JSImport("bson/lib", "BSON.BSONRegExp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromExtendedJSON(doc: BSONRegExpExtended): typings.bson.libRegexpMod.BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libRegexpMod.BSONRegExp]
    /** @internal */
    inline def fromExtendedJSON(doc: BSONRegExpExtendedLegacy): typings.bson.libRegexpMod.BSONRegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libRegexpMod.BSONRegExp]
    
    inline def parseOptions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")().asInstanceOf[String]
    inline def parseOptions(options: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOptions")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("bson/lib", "BSON.BSONRuntimeError")
  @js.native
  open class BSONRuntimeError protected ()
    extends typings.bson.libBsonMod.BSONRuntimeError {
    def this(message: String) = this()
  }
  
  @JSImport("bson/lib", "BSON.BSONSymbol")
  @js.native
  open class BSONSymbol protected ()
    extends typings.bson.libBsonMod.BSONSymbol {
    /**
      * @param value - the string representing the symbol.
      */
    def this(value: String) = this()
  }
  /* static members */
  object BSONSymbol {
    
    @JSImport("bson/lib", "BSON.BSONSymbol")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: BSONSymbolExtended): typings.bson.libSymbolMod.BSONSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libSymbolMod.BSONSymbol]
  }
  
  /* Inlined std.Readonly<{ readonly double :1,  readonly string :2,  readonly object :3,  readonly array :4,  readonly binData :5,  readonly undefined :6,  readonly objectId :7,  readonly bool :8,  readonly date :9,  readonly null :10,  readonly regex :11,  readonly dbPointer :12,  readonly javascript :13,  readonly symbol :14,  readonly javascriptWithScope :15,  readonly int :16,  readonly timestamp :17,  readonly long :18,  readonly decimal :19,  readonly minKey :-1,  readonly maxKey :127}> */
  object BSONType {
    
    @JSImport("bson/lib", "BSON.BSONType.array")
    @js.native
    val array: `4` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.binData")
    @js.native
    val binData: `5` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.bool")
    @js.native
    val bool: `8` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.date")
    @js.native
    val date: `9` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.dbPointer")
    @js.native
    val dbPointer: `12` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.decimal")
    @js.native
    val decimal: `19` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.double")
    @js.native
    val double: `1` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.int")
    @js.native
    val int: `16` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.javascript")
    @js.native
    val javascript: `13` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.javascriptWithScope")
    @js.native
    val javascriptWithScope: `15` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.long")
    @js.native
    val long: `18` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.maxKey")
    @js.native
    val maxKey: `127` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.minKey")
    @js.native
    val minKey: `-1` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.null")
    @js.native
    val `null`: `10` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.object")
    @js.native
    val `object`: `3` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.objectId")
    @js.native
    val objectId: `7` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.regex")
    @js.native
    val regex: `11` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.string")
    @js.native
    val string: `2` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.symbol")
    @js.native
    val symbol: `14` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.timestamp")
    @js.native
    val timestamp: `17` = js.native
    
    @JSImport("bson/lib", "BSON.BSONType.undefined")
    @js.native
    val undefined: `6` = js.native
  }
  
  /* note: abstract class */ @JSImport("bson/lib", "BSON.BSONValue")
  @js.native
  open class BSONValue ()
    extends typings.bson.libBsonMod.BSONValue
  
  @JSImport("bson/lib", "BSON.BSONVersionError")
  @js.native
  open class BSONVersionError ()
    extends typings.bson.libBsonMod.BSONVersionError
  
  @JSImport("bson/lib", "BSON.Binary")
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
  open class Binary ()
    extends typings.bson.libBsonMod.Binary {
    def this(buffer: String) = this()
    def this(buffer: BinarySequence) = this()
    def this(buffer: String, subType: scala.Double) = this()
    def this(buffer: Unit, subType: scala.Double) = this()
    def this(buffer: BinarySequence, subType: scala.Double) = this()
  }
  /* static members */
  object Binary {
    
    @JSImport("bson/lib", "BSON.Binary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binary default subtype
      * @internal
      */
    @JSImport("bson/lib", "BSON.Binary.BSON_BINARY_SUBTYPE_DEFAULT")
    @js.native
    val BSON_BINARY_SUBTYPE_DEFAULT: Any = js.native
    
    /** Initial buffer default size */
    @JSImport("bson/lib", "BSON.Binary.BUFFER_SIZE")
    @js.native
    val BUFFER_SIZE: /* 256 */ scala.Double = js.native
    
    /** Byte Array BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_BYTE_ARRAY")
    @js.native
    val SUBTYPE_BYTE_ARRAY: /* 2 */ scala.Double = js.native
    
    /** Column BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_COLUMN")
    @js.native
    val SUBTYPE_COLUMN: /* 7 */ scala.Double = js.native
    
    /** Default BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_DEFAULT")
    @js.native
    val SUBTYPE_DEFAULT: /* 0 */ scala.Double = js.native
    
    /** Encrypted BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_ENCRYPTED")
    @js.native
    val SUBTYPE_ENCRYPTED: /* 6 */ scala.Double = js.native
    
    /** Function BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_FUNCTION")
    @js.native
    val SUBTYPE_FUNCTION: /* 1 */ scala.Double = js.native
    
    /** MD5 BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_MD5")
    @js.native
    val SUBTYPE_MD5: /* 5 */ scala.Double = js.native
    
    /** User BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_USER_DEFINED")
    @js.native
    val SUBTYPE_USER_DEFINED: /* 128 */ scala.Double = js.native
    
    /** UUID BSON type */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_UUID")
    @js.native
    val SUBTYPE_UUID: /* 4 */ scala.Double = js.native
    
    /** Deprecated UUID BSON type @deprecated Please use SUBTYPE_UUID */
    @JSImport("bson/lib", "BSON.Binary.SUBTYPE_UUID_OLD")
    @js.native
    val SUBTYPE_UUID_OLD: /* 3 */ scala.Double = js.native
    
    /** Creates an Binary instance from a base64 string */
    inline def createFromBase64(base64: String): typings.bson.libBinaryMod.Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def createFromBase64(base64: String, subType: scala.Double): typings.bson.libBinaryMod.Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any], subType.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libBinaryMod.Binary]
    
    /** Creates an Binary instance from a hex digit string */
    inline def createFromHexString(hex: String): typings.bson.libBinaryMod.Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hex.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def createFromHexString(hex: String, subType: scala.Double): typings.bson.libBinaryMod.Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hex.asInstanceOf[js.Any], subType.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libBinaryMod.Binary]
    
    inline def fromExtendedJSON(doc: BinaryExtended): typings.bson.libBinaryMod.Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.Binary]
    /** @internal */
    inline def fromExtendedJSON(doc: BinaryExtendedLegacy): typings.bson.libBinaryMod.Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def fromExtendedJSON(doc: BinaryExtendedLegacy, options: EJSONOptions): typings.bson.libBinaryMod.Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def fromExtendedJSON(doc: BinaryExtended, options: EJSONOptions): typings.bson.libBinaryMod.Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def fromExtendedJSON(doc: UUIDExtended): typings.bson.libBinaryMod.Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.Binary]
    inline def fromExtendedJSON(doc: UUIDExtended, options: EJSONOptions): typings.bson.libBinaryMod.Binary = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libBinaryMod.Binary]
  }
  
  @JSImport("bson/lib", "BSON.Code")
  @js.native
  open class Code protected ()
    extends typings.bson.libBsonMod.Code {
    /**
      * @param code - a string or function.
      * @param scope - an optional scope for the function.
      */
    def this(code: String) = this()
    def this(code: js.Function) = this()
    def this(code: String, scope: Document) = this()
    def this(code: js.Function, scope: Document) = this()
  }
  /* static members */
  object Code {
    
    @JSImport("bson/lib", "BSON.Code")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: CodeExtended): typings.bson.libCodeMod.Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libCodeMod.Code]
  }
  
  @JSImport("bson/lib", "BSON.DBRef")
  @js.native
  open class DBRef protected ()
    extends typings.bson.libBsonMod.DBRef {
    /**
      * @param collection - the collection name.
      * @param oid - the reference ObjectId.
      * @param db - optional db name, if omitted the reference is local to the current db.
      */
    def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId) = this()
    def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: String) = this()
    def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: String, fields: Document) = this()
    def this(collection: String, oid: typings.bson.libObjectidMod.ObjectId, db: Unit, fields: Document) = this()
  }
  /* static members */
  object DBRef {
    
    @JSImport("bson/lib", "BSON.DBRef")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: DBRefLike): typings.bson.libDbRefMod.DBRef = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDbRefMod.DBRef]
  }
  
  @JSImport("bson/lib", "BSON.Decimal128")
  @js.native
  open class Decimal128 protected ()
    extends typings.bson.libBsonMod.Decimal128 {
    def this(bytes: String) = this()
    /**
      * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
      *                or a string representation as returned by .toString()
      */
    def this(bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object Decimal128 {
    
    @JSImport("bson/lib", "BSON.Decimal128")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: Decimal128Extended): typings.bson.libDecimal128Mod.Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDecimal128Mod.Decimal128]
    
    /**
      * Create a Decimal128 instance from a string representation
      *
      * @param representation - a numeric string representation.
      */
    inline def fromString(representation: String): typings.bson.libDecimal128Mod.Decimal128 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(representation.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libDecimal128Mod.Decimal128]
  }
  
  @JSImport("bson/lib", "BSON.Double")
  @js.native
  open class Double protected ()
    extends typings.bson.libBsonMod.Double {
    /**
      * Create a Double type
      *
      * @param value - the number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  /* static members */
  object Double {
    
    @JSImport("bson/lib", "BSON.Double")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: DoubleExtended): scala.Double | typings.bson.libDoubleMod.Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libDoubleMod.Double]
    inline def fromExtendedJSON(doc: DoubleExtended, options: EJSONOptions): scala.Double | typings.bson.libDoubleMod.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libDoubleMod.Double]
  }
  
  /** @public */
  object EJSON {
    
    @JSImport("bson/lib", "BSON.EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib", "BSON.EJSON.deserialize")
    @js.native
    def deserialize: js.Function2[/* ejson */ Document, /* options */ js.UndefOr[EJSONOptions], Any] = js.native
    inline def deserialize(ejson: Document): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(ejson.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def deserialize(ejson: Document, options: EJSONOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(ejson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def deserialize_=(x: js.Function2[/* ejson */ Document, /* options */ js.UndefOr[EJSONOptions], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib", "BSON.EJSON.parse")
    @js.native
    def parse: js.Function2[/* text */ String, /* options */ js.UndefOr[EJSONOptions], Any] = js.native
    inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def parse(text: String, options: EJSONOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def parse_=(x: js.Function2[/* text */ String, /* options */ js.UndefOr[EJSONOptions], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib", "BSON.EJSON.serialize")
    @js.native
    def serialize: js.Function2[/* value */ Any, /* options */ js.UndefOr[EJSONOptions], Document] = js.native
    inline def serialize(value: Any): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[Document]
    inline def serialize(value: Any, options: EJSONOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def serialize_=(x: js.Function2[/* value */ Any, /* options */ js.UndefOr[EJSONOptions], Document]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib", "BSON.EJSON.stringify")
    @js.native
    def stringify: js.Function4[
        /* value */ Any, 
        /* replacer */ js.UndefOr[
          (js.Array[scala.Double | String]) | (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | EJSONOptions
        ], 
        /* space */ js.UndefOr[String | scala.Double], 
        /* options */ js.UndefOr[EJSONOptions], 
        String
      ] = js.native
    inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String], space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String], space: scala.Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String], space: scala.Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.Array[scala.Double | String], space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: String,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: scala.Double
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: scala.Double,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(
      value: Any,
      replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
      space: Unit,
      options: EJSONOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: scala.Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: scala.Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: Unit, space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: String, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: scala.Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: scala.Double, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(value: Any, replacer: EJSONOptions, space: Unit, options: EJSONOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify_=(
      x: js.Function4[
          /* value */ Any, 
          /* replacer */ js.UndefOr[
            (js.Array[scala.Double | String]) | (js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) | EJSONOptions
          ], 
          /* space */ js.UndefOr[String | scala.Double], 
          /* options */ js.UndefOr[EJSONOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("bson/lib", "BSON.Int32")
  @js.native
  open class Int32 protected ()
    extends typings.bson.libBsonMod.Int32 {
    def this(value: String) = this()
    /**
      * Create an Int32 type
      *
      * @param value - the number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  /* static members */
  object Int32 {
    
    @JSImport("bson/lib", "BSON.Int32")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(doc: Int32Extended): scala.Double | typings.bson.libInt32Mod.Int32 = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libInt32Mod.Int32]
    inline def fromExtendedJSON(doc: Int32Extended, options: EJSONOptions): scala.Double | typings.bson.libInt32Mod.Int32 = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libInt32Mod.Int32]
  }
  
  @JSImport("bson/lib", "BSON.Long")
  @js.native
  /**
    * Constructs a 64 bit two's-complement integer, given its low and high 32 bit values as *signed* integers.
    *  See the from* functions below for more convenient ways of constructing Longs.
    *
    * Acceptable signatures are:
    * - Long(low, high, unsigned?)
    * - Long(bigint, unsigned?)
    * - Long(string, unsigned?)
    *
    * @param low - The low (signed) 32 bits of the long
    * @param high - The high (signed) 32 bits of the long
    * @param unsigned - Whether unsigned or not, defaults to signed
    */
  open class Long ()
    extends typings.bson.libBsonMod.Long {
    def this(low: String) = this()
    def this(low: js.BigInt) = this()
    def this(low: scala.Double) = this()
    def this(low: String, high: Boolean) = this()
    def this(low: String, high: scala.Double) = this()
    def this(low: js.BigInt, high: Boolean) = this()
    def this(low: js.BigInt, high: scala.Double) = this()
    def this(low: scala.Double, high: Boolean) = this()
    def this(low: scala.Double, high: scala.Double) = this()
    def this(low: Unit, high: Boolean) = this()
    def this(low: Unit, high: scala.Double) = this()
    def this(low: String, high: Boolean, unsigned: Boolean) = this()
    def this(low: String, high: scala.Double, unsigned: Boolean) = this()
    def this(low: String, high: Unit, unsigned: Boolean) = this()
    def this(low: js.BigInt, high: Boolean, unsigned: Boolean) = this()
    def this(low: js.BigInt, high: scala.Double, unsigned: Boolean) = this()
    def this(low: js.BigInt, high: Unit, unsigned: Boolean) = this()
    def this(low: scala.Double, high: Boolean, unsigned: Boolean) = this()
    def this(low: scala.Double, high: scala.Double, unsigned: Boolean) = this()
    def this(low: scala.Double, high: Unit, unsigned: Boolean) = this()
    def this(low: Unit, high: Boolean, unsigned: Boolean) = this()
    def this(low: Unit, high: scala.Double, unsigned: Boolean) = this()
    def this(low: Unit, high: Unit, unsigned: Boolean) = this()
  }
  /* static members */
  object Long {
    
    @JSImport("bson/lib", "BSON.Long")
    @js.native
    val ^ : js.Any = js.native
    
    /** Maximum unsigned value. */
    @JSImport("bson/lib", "BSON.Long.MAX_UNSIGNED_VALUE")
    @js.native
    def MAX_UNSIGNED_VALUE: typings.bson.libLongMod.Long = js.native
    inline def MAX_UNSIGNED_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_UNSIGNED_VALUE")(x.asInstanceOf[js.Any])
    
    /** Maximum signed value. */
    @JSImport("bson/lib", "BSON.Long.MAX_VALUE")
    @js.native
    def MAX_VALUE: typings.bson.libLongMod.Long = js.native
    inline def MAX_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
    
    /** Minimum signed value. */
    @JSImport("bson/lib", "BSON.Long.MIN_VALUE")
    @js.native
    def MIN_VALUE: typings.bson.libLongMod.Long = js.native
    inline def MIN_VALUE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
    
    /** Signed negative one. */
    @JSImport("bson/lib", "BSON.Long.NEG_ONE")
    @js.native
    def NEG_ONE: typings.bson.libLongMod.Long = js.native
    inline def NEG_ONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEG_ONE")(x.asInstanceOf[js.Any])
    
    /** Signed one. */
    @JSImport("bson/lib", "BSON.Long.ONE")
    @js.native
    def ONE: typings.bson.libLongMod.Long = js.native
    inline def ONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("bson/lib", "BSON.Long.TWO_PWR_24")
    @js.native
    def TWO_PWR_24: typings.bson.libLongMod.Long = js.native
    inline def TWO_PWR_24_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TWO_PWR_24")(x.asInstanceOf[js.Any])
    
    /** Unsigned one. */
    @JSImport("bson/lib", "BSON.Long.UONE")
    @js.native
    def UONE: typings.bson.libLongMod.Long = js.native
    inline def UONE_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UONE")(x.asInstanceOf[js.Any])
    
    /** Unsigned zero. */
    @JSImport("bson/lib", "BSON.Long.UZERO")
    @js.native
    def UZERO: typings.bson.libLongMod.Long = js.native
    inline def UZERO_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UZERO")(x.asInstanceOf[js.Any])
    
    /** Signed zero */
    @JSImport("bson/lib", "BSON.Long.ZERO")
    @js.native
    def ZERO: typings.bson.libLongMod.Long = js.native
    inline def ZERO_=(x: typings.bson.libLongMod.Long): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      * @param value - The number in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromBigInt(value: js.BigInt): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBigInt(value: js.BigInt, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBigInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Returns a Long representing the 64 bit integer that comes by concatenating the given low and high bits.
      * Each is assumed to use 32 bits.
      * @param lowBits - The low 32 bits
      * @param highBits - The high 32 bits
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBits(lowBits: scala.Double, highBits: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Creates a Long from its byte representation.
      * @param bytes - Byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @param le - Whether little or big endian, defaults to big endian
      * @returns The corresponding Long value
      */
    inline def fromBytes(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Boolean, le: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBytes(bytes: js.Array[scala.Double], unsigned: Unit, le: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], le.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Creates a Long from its big endian byte representation.
      * @param bytes - Big endian byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromBytesBE(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBytesBE(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Creates a Long from its little endian byte representation.
      * @param bytes - Little endian byte representation
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromBytesLE(bytes: js.Array[scala.Double]): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromBytesLE(bytes: js.Array[scala.Double], unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesLE")(bytes.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    inline def fromExtendedJSON(doc: NumberLong): scala.Double | typings.bson.libLongMod.Long | js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[scala.Double | typings.bson.libLongMod.Long | js.BigInt]
    inline def fromExtendedJSON(doc: NumberLong, options: EJSONOptions): scala.Double | typings.bson.libLongMod.Long | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double | typings.bson.libLongMod.Long | js.BigInt]
    
    /**
      * Returns a Long representing the given 32 bit integer value.
      * @param value - The 32 bit integer in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromInt(value: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromInt(value: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Returns a Long representing the given value, provided that it is a finite number. Otherwise, zero is returned.
      * @param value - The number in question
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @returns The corresponding Long value
      */
    inline def fromNumber(value: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromNumber(value: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Returns a Long representation of the given string, written using the specified radix.
      * @param str - The textual representation of the Long
      * @param unsigned - Whether unsigned or not, defaults to signed
      * @param radix - The radix in which the text is written (2-36), defaults to 10
      * @returns The corresponding Long value
      */
    inline def fromString(str: String): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromString(str: String, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromString(str: String, unsigned: Boolean, radix: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromString(str: String, unsigned: Unit, radix: scala.Double): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    inline def fromValue(`val`: String): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromValue(`val`: String, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    /**
      * Converts the specified value to a Long.
      * @param unsigned - Whether unsigned or not, defaults to signed
      */
    inline def fromValue(`val`: scala.Double): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromValue(`val`: scala.Double, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromValue(`val`: High): typings.bson.libLongMod.Long = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libLongMod.Long]
    inline def fromValue(`val`: High, unsigned: Boolean): typings.bson.libLongMod.Long = (^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(`val`.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libLongMod.Long]
    
    /**
      * Tests if the specified object is a Long.
      */
    inline def isLong(value: Any): /* is bson.bson/lib/long.Long */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLong")(value.asInstanceOf[js.Any]).asInstanceOf[/* is bson.bson/lib/long.Long */ Boolean]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bson/lib", "BSON.LongWithoutOverridesClass")
  @js.native
  open class LongWithoutOverridesClass protected ()
    extends StObject
       with PinExcludekeyofLongTimestAdd {
    def this(low: Any) = this()
    def this(low: Any, high: Boolean) = this()
    def this(low: Any, high: scala.Double) = this()
    def this(low: Any, high: Boolean, unsigned: Boolean) = this()
    def this(low: Any, high: scala.Double, unsigned: Boolean) = this()
    def this(low: Any, high: Unit, unsigned: Boolean) = this()
    
    /* CompleteClass */
    override def __isLong__(): Boolean = js.native
    /* CompleteClass */
    @JSName("__isLong__")
    var __isLong___Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def add(addend: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def add(addend: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def add(addend: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def add(addend: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("add")
    var add_Original: js.Function1[
        /* addend */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def and(other: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def and(other: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def and(other: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def and(other: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("and")
    var and_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def comp(other: String): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: scala.Double): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: typings.bson.libLongMod.Long): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def comp(other: typings.bson.libTimestampMod.Timestamp): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    @JSName("comp")
    var comp_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        `0` | `1` | `-1`
      ] = js.native
    
    /* CompleteClass */
    override def compare(other: String): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: scala.Double): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: typings.bson.libLongMod.Long): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    override def compare(other: typings.bson.libTimestampMod.Timestamp): `0` | `1` | `-1` = js.native
    /* CompleteClass */
    @JSName("compare")
    var compare_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        `0` | `1` | `-1`
      ] = js.native
    
    /* CompleteClass */
    @JSName("constructor")
    var constructor_Original: js.Function3[
        /* low */ js.UndefOr[scala.Double | js.BigInt | String], 
        /* high */ js.UndefOr[scala.Double | Boolean], 
        /* unsigned */ js.UndefOr[Boolean], 
        Any
      ] = js.native
    
    /* CompleteClass */
    override def div(divisor: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def div(divisor: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def div(divisor: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def div(divisor: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("div")
    var div_Original: js.Function1[
        /* divisor */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def divide(divisor: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def divide(divisor: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def divide(divisor: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def divide(divisor: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("divide")
    var divide_Original: js.Function1[
        /* divisor */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def eq(other: String): Boolean = js.native
    /* CompleteClass */
    override def eq(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def eq(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def eq(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("eq")
    var eq_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def equals(other: String): Boolean = js.native
    /* CompleteClass */
    override def equals(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def equals(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def equals(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("equals")
    var equals_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def eqz(): Boolean = js.native
    /* CompleteClass */
    @JSName("eqz")
    var eqz_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def ge(other: String): Boolean = js.native
    /* CompleteClass */
    override def ge(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def ge(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def ge(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("ge")
    var ge_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def getHighBits(): scala.Double = js.native
    
    /* CompleteClass */
    override def getHighBitsUnsigned(): scala.Double = js.native
    /* CompleteClass */
    @JSName("getHighBitsUnsigned")
    var getHighBitsUnsigned_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    @JSName("getHighBits")
    var getHighBits_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    override def getLowBits(): scala.Double = js.native
    
    /* CompleteClass */
    override def getLowBitsUnsigned(): scala.Double = js.native
    /* CompleteClass */
    @JSName("getLowBitsUnsigned")
    var getLowBitsUnsigned_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    @JSName("getLowBits")
    var getLowBits_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    override def getNumBitsAbs(): scala.Double = js.native
    /* CompleteClass */
    @JSName("getNumBitsAbs")
    var getNumBitsAbs_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    override def greaterThan(other: String): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def greaterThan(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    
    /* CompleteClass */
    override def greaterThanOrEqual(other: String): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def greaterThanOrEqual(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("greaterThanOrEqual")
    var greaterThanOrEqual_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    @JSName("greaterThan")
    var greaterThan_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def gt(other: String): Boolean = js.native
    /* CompleteClass */
    override def gt(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def gt(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def gt(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("gt")
    var gt_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def gte(other: String): Boolean = js.native
    /* CompleteClass */
    override def gte(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def gte(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def gte(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("gte")
    var gte_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    var high: scala.Double = js.native
    
    /* CompleteClass */
    override def isEven(): Boolean = js.native
    /* CompleteClass */
    @JSName("isEven")
    var isEven_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isNegative(): Boolean = js.native
    /* CompleteClass */
    @JSName("isNegative")
    var isNegative_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isOdd(): Boolean = js.native
    /* CompleteClass */
    @JSName("isOdd")
    var isOdd_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isPositive(): Boolean = js.native
    /* CompleteClass */
    @JSName("isPositive")
    var isPositive_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def isZero(): Boolean = js.native
    /* CompleteClass */
    @JSName("isZero")
    var isZero_Original: js.Function0[Boolean] = js.native
    
    /* CompleteClass */
    override def le(other: String): Boolean = js.native
    /* CompleteClass */
    override def le(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def le(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def le(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("le")
    var le_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def lessThan(other: String): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def lessThan(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    
    /* CompleteClass */
    override def lessThanOrEqual(other: String): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def lessThanOrEqual(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lessThanOrEqual")
    var lessThanOrEqual_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    @JSName("lessThan")
    var lessThan_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    var low: scala.Double = js.native
    
    /* CompleteClass */
    override def lt(other: String): Boolean = js.native
    /* CompleteClass */
    override def lt(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def lt(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def lt(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lt")
    var lt_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def lte(other: String): Boolean = js.native
    /* CompleteClass */
    override def lte(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def lte(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def lte(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("lte")
    var lte_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def mod(divisor: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mod(divisor: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mod(divisor: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mod(divisor: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("mod")
    var mod_Original: js.Function1[
        /* divisor */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def modulo(divisor: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def modulo(divisor: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def modulo(divisor: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def modulo(divisor: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("modulo")
    var modulo_Original: js.Function1[
        /* divisor */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def mul(multiplier: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mul(multiplier: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mul(multiplier: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def mul(multiplier: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("mul")
    var mul_Original: js.Function1[
        /* multiplier */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def multiply(multiplier: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def multiply(multiplier: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("multiply")
    var multiply_Original: js.Function1[
        /* multiplier */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def ne(other: String): Boolean = js.native
    /* CompleteClass */
    override def ne(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def ne(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def ne(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("ne")
    var ne_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def neg(): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("neg")
    var neg_Original: js.Function0[typings.bson.libLongMod.Long] = js.native
    
    /* CompleteClass */
    override def negate(): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("negate")
    var negate_Original: js.Function0[typings.bson.libLongMod.Long] = js.native
    
    /* CompleteClass */
    override def neq(other: String): Boolean = js.native
    /* CompleteClass */
    override def neq(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def neq(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def neq(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("neq")
    var neq_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    override def not(): typings.bson.libLongMod.Long = js.native
    
    /* CompleteClass */
    override def notEquals(other: String): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: scala.Double): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: typings.bson.libLongMod.Long): Boolean = js.native
    /* CompleteClass */
    override def notEquals(other: typings.bson.libTimestampMod.Timestamp): Boolean = js.native
    /* CompleteClass */
    @JSName("notEquals")
    var notEquals_Original: js.Function1[
        /* other */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        Boolean
      ] = js.native
    
    /* CompleteClass */
    @JSName("not")
    var not_Original: js.Function0[typings.bson.libLongMod.Long] = js.native
    
    /* CompleteClass */
    override def or(other: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def or(other: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def or(other: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("or")
    var or_Original: js.Function1[
        /* other */ scala.Double | String | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def rem(divisor: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def rem(divisor: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def rem(divisor: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def rem(divisor: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("rem")
    var rem_Original: js.Function1[
        /* divisor */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shiftLeft(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shiftLeft(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shiftLeft")
    var shiftLeft_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shiftRight(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shiftRight(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    
    /* CompleteClass */
    override def shiftRightUnsigned(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shiftRightUnsigned(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shiftRightUnsigned")
    var shiftRightUnsigned_Original: js.Function1[
        /* numBits */ typings.bson.libLongMod.Long | scala.Double, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    @JSName("shiftRight")
    var shiftRight_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shl(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shl(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shl")
    var shl_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shr(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shr(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shr")
    var shr_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shr_u(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shr_u(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shr_u")
    var shr_u_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def shru(numBits: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def shru(numBits: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("shru")
    var shru_Original: js.Function1[
        /* numBits */ scala.Double | typings.bson.libLongMod.Long, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def sub(subtrahend: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def sub(subtrahend: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("sub")
    var sub_Original: js.Function1[
        /* subtrahend */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def subtract(subtrahend: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def subtract(subtrahend: typings.bson.libTimestampMod.Timestamp): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("subtract")
    var subtract_Original: js.Function1[
        /* subtrahend */ String | scala.Double | typings.bson.libLongMod.Long | typings.bson.libTimestampMod.Timestamp, 
        typings.bson.libLongMod.Long
      ] = js.native
    
    /* CompleteClass */
    override def toBigInt(): js.BigInt = js.native
    /* CompleteClass */
    @JSName("toBigInt")
    var toBigInt_Original: js.Function0[js.BigInt] = js.native
    
    /* CompleteClass */
    override def toBytes(): js.Array[scala.Double] = js.native
    /* CompleteClass */
    override def toBytes(le: Boolean): js.Array[scala.Double] = js.native
    
    /* CompleteClass */
    override def toBytesBE(): js.Array[scala.Double] = js.native
    /* CompleteClass */
    @JSName("toBytesBE")
    var toBytesBE_Original: js.Function0[js.Array[scala.Double]] = js.native
    
    /* CompleteClass */
    override def toBytesLE(): js.Array[scala.Double] = js.native
    /* CompleteClass */
    @JSName("toBytesLE")
    var toBytesLE_Original: js.Function0[js.Array[scala.Double]] = js.native
    
    /* CompleteClass */
    @JSName("toBytes")
    var toBytes_Original: js.Function1[/* le */ js.UndefOr[Boolean], js.Array[scala.Double]] = js.native
    
    /* CompleteClass */
    override def toInt(): scala.Double = js.native
    /* CompleteClass */
    @JSName("toInt")
    var toInt_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    override def toNumber(): scala.Double = js.native
    /* CompleteClass */
    @JSName("toNumber")
    var toNumber_Original: js.Function0[scala.Double] = js.native
    
    /* CompleteClass */
    override def toSigned(): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("toSigned")
    var toSigned_Original: js.Function0[typings.bson.libLongMod.Long] = js.native
    
    /* CompleteClass */
    override def toString(radix: scala.Double): String = js.native
    /* CompleteClass */
    @JSName("toString")
    var toString_Original: js.Function1[/* radix */ js.UndefOr[scala.Double], String] = js.native
    
    /* CompleteClass */
    override def toUnsigned(): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("toUnsigned")
    var toUnsigned_Original: js.Function0[typings.bson.libLongMod.Long] = js.native
    
    /* CompleteClass */
    var unsigned: Boolean = js.native
    
    /* CompleteClass */
    override def xor(other: String): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def xor(other: scala.Double): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    override def xor(other: typings.bson.libLongMod.Long): typings.bson.libLongMod.Long = js.native
    /* CompleteClass */
    @JSName("xor")
    var xor_Original: js.Function1[
        /* other */ typings.bson.libLongMod.Long | scala.Double | String, 
        typings.bson.libLongMod.Long
      ] = js.native
  }
  @JSImport("bson/lib", "BSON.LongWithoutOverridesClass")
  @js.native
  val LongWithoutOverridesClass: LongWithoutOverrides = js.native
  
  @JSImport("bson/lib", "BSON.MaxKey")
  @js.native
  open class MaxKey ()
    extends typings.bson.libBsonMod.MaxKey
  /* static members */
  object MaxKey {
    
    @JSImport("bson/lib", "BSON.MaxKey")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(): typings.bson.libMaxKeyMod.MaxKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")().asInstanceOf[typings.bson.libMaxKeyMod.MaxKey]
  }
  
  @JSImport("bson/lib", "BSON.MinKey")
  @js.native
  open class MinKey ()
    extends typings.bson.libBsonMod.MinKey
  /* static members */
  object MinKey {
    
    @JSImport("bson/lib", "BSON.MinKey")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def fromExtendedJSON(): typings.bson.libMinKeyMod.MinKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")().asInstanceOf[typings.bson.libMinKeyMod.MinKey]
  }
  
  @JSImport("bson/lib", "BSON.ObjectId")
  @js.native
  /**
    * Create an ObjectId type
    *
    * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
    */
  open class ObjectId ()
    extends typings.bson.libBsonMod.ObjectId {
    def this(inputId: String) = this()
    def this(inputId: js.typedarray.Uint8Array) = this()
    def this(inputId: scala.Double) = this()
    def this(inputId: typings.bson.libObjectidMod.ObjectId) = this()
    def this(inputId: ObjectIdLike) = this()
  }
  /* static members */
  object ObjectId {
    
    @JSImport("bson/lib", "BSON.ObjectId")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib", "BSON.ObjectId.cacheHexString")
    @js.native
    def cacheHexString: Boolean = js.native
    inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /** Creates an ObjectId instance from a base64 string */
    inline def createFromBase64(base64: String): typings.bson.libObjectidMod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libObjectidMod.ObjectId]
    
    /**
      * Creates an ObjectId from a hex string representation of an ObjectId.
      *
      * @param hexString - create a ObjectId from a passed in 24 character hexstring.
      */
    inline def createFromHexString(hexString: String): typings.bson.libObjectidMod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libObjectidMod.ObjectId]
    
    /**
      * Creates an ObjectId from a second based number, with the rest of the ObjectId zeroed out. Used for comparisons or sorting the ObjectId.
      *
      * @param time - an integer number representing a number of seconds.
      */
    inline def createFromTime(time: scala.Double): typings.bson.libObjectidMod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromTime")(time.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libObjectidMod.ObjectId]
    
    /** @internal */
    inline def createPk(): typings.bson.libObjectidMod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("createPk")().asInstanceOf[typings.bson.libObjectidMod.ObjectId]
    
    /** @internal */
    inline def fromExtendedJSON(doc: ObjectIdExtended): typings.bson.libObjectidMod.ObjectId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libObjectidMod.ObjectId]
    
    /**
      * Generate a 12 byte id buffer used in ObjectId's
      *
      * @param time - pass in a second based timestamp.
      */
    inline def generate(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[js.typedarray.Uint8Array]
    inline def generate(time: scala.Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(time.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Update the ObjectId index
      * @internal
      */
    @JSImport("bson/lib", "BSON.ObjectId.getInc")
    @js.native
    def getInc: Any = js.native
    inline def getInc_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInc")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("bson/lib", "BSON.ObjectId.index")
    @js.native
    def index: Any = js.native
    inline def index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("index")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if a value is a valid bson ObjectId
      *
      * @param id - ObjectId instance to validate.
      */
    inline def isValid(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: scala.Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: typings.bson.libObjectidMod.ObjectId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(id: ObjectIdLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("bson/lib", "BSON.Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.bson.libBsonMod.Timestamp {
    /**
      * @param int - A 64-bit bigint representing the Timestamp.
      */
    def this(int: js.BigInt) = this()
    /**
      * @param long - A 64-bit Long representing the Timestamp.
      */
    def this(long: typings.bson.libLongMod.Long) = this()
    /**
      * @param value - A pair of two values indicating timestamp and increment.
      */
    def this(value: I) = this()
  }
  /* static members */
  object Timestamp {
    
    @JSImport("bson/lib", "BSON.Timestamp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bson/lib", "BSON.Timestamp.MAX_VALUE")
    @js.native
    val MAX_VALUE: typings.bson.libLongMod.Long = js.native
    
    /**
      * Returns a Timestamp for the given high and low bits. Each is assumed to use 32 bits.
      *
      * @param lowBits - the low 32-bits.
      * @param highBits - the high 32-bits.
      */
    inline def fromBits(lowBits: scala.Double, highBits: scala.Double): typings.bson.libTimestampMod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(lowBits.asInstanceOf[js.Any], highBits.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
    
    /** @internal */
    inline def fromExtendedJSON(doc: TimestampExtended): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedJSON")(doc.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
    
    /** Returns a Timestamp represented by the given (32-bit) integer value. */
    inline def fromInt(value: scala.Double): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
    
    /** Returns a Timestamp representing the given number value, provided that it is a finite number. Otherwise, zero is returned. */
    inline def fromNumber(value: scala.Double): typings.bson.libTimestampMod.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
    
    /**
      * Returns a Timestamp from the given string, optionally using the given radix.
      *
      * @param str - the textual representation of the Timestamp.
      * @param optRadix - the radix in which the text is written.
      */
    inline def fromString(str: String, optRadix: scala.Double): typings.bson.libTimestampMod.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any], optRadix.asInstanceOf[js.Any])).asInstanceOf[typings.bson.libTimestampMod.Timestamp]
  }
  
  @JSImport("bson/lib", "BSON.UUID")
  @js.native
  /**
    * Create a UUID type
    *
    * When the argument to the constructor is omitted a random v4 UUID will be generated.
    *
    * @param input - Can be a 32 or 36 character hex string (dashes excluded/included) or a 16 byte binary Buffer.
    */
  open class UUID ()
    extends typings.bson.libBsonMod.UUID {
    def this(input: String) = this()
    def this(input: js.typedarray.Uint8Array) = this()
    def this(input: typings.bson.libBinaryMod.UUID) = this()
  }
  /* static members */
  object UUID {
    
    @JSImport("bson/lib", "BSON.UUID")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    inline def bytesFromString(representation: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesFromString")(representation.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /** @deprecated Hex string is no longer cached, this control will be removed in a future major release */
    @JSImport("bson/lib", "BSON.UUID.cacheHexString")
    @js.native
    def cacheHexString: Boolean = js.native
    inline def cacheHexString_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cacheHexString")(x.asInstanceOf[js.Any])
    
    /** Creates an UUID from a base64 string representation of an UUID. */
    inline def createFromBase64(base64: String): typings.bson.libBinaryMod.UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.UUID]
    
    /**
      * Creates an UUID from a hex string representation of an UUID.
      * @param hexString - 32 or 36 character hex string (dashes excluded/included).
      */
    inline def createFromHexString(hexString: String): typings.bson.libBinaryMod.UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromHexString")(hexString.asInstanceOf[js.Any]).asInstanceOf[typings.bson.libBinaryMod.UUID]
    
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
    inline def isValid(input: typings.bson.libBinaryMod.Binary): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(input: typings.bson.libBinaryMod.UUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * @internal
      *
      * Validates a string to be a hex digit sequence with or without dashes.
      * The canonical hyphenated representation of a uuid is hex in 8-4-4-4-12 groups.
      */
    inline def isValidUUIDString(representation: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUUIDString")(representation.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def calculateObjectSize(`object`: Document): scala.Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  inline def calculateObjectSize(`object`: Document, options: CalculateObjectSizeOptions): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  inline def deserialize(buffer: js.typedarray.Uint8Array): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def deserialize(
    buffer: js.typedarray.Uint8Array,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeserializeOptions */ Any
  ): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def deserializeStream(
    data: js.typedarray.ArrayBuffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[Document],
    docStartIndex: scala.Double,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeserializeOptions */ Any
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def deserializeStream(
    data: js.typedarray.Uint8Array,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[Document],
    docStartIndex: scala.Double,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeserializeOptions */ Any
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  inline def serialize(`object`: Document): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def serialize(
    `object`: Document,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializeOptions */ Any
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def serializeWithBufferAndIndex(`object`: Document, finalBuffer: js.typedarray.Uint8Array): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def serializeWithBufferAndIndex(
    `object`: Document,
    finalBuffer: js.typedarray.Uint8Array,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializeOptions */ Any
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  inline def setInternalBufferSize(size: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInternalBufferSize")(size.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
