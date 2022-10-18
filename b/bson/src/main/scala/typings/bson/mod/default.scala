package typings.bson.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import typings.bson.anon.TypeofBSONRegExp
import typings.bson.anon.TypeofBinary
import typings.bson.anon.TypeofDecimal128
import typings.bson.anon.TypeofEJSON
import typings.bson.anon.TypeofLong
import typings.bson.anon.TypeofObjectId
import typings.bson.anon.TypeofTimestamp
import typings.bson.anon.TypeofUUID
import typings.buffer.mod.Buffer
import typings.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BSON default export
  * @deprecated Please use named exports
  * @privateRemarks
  * We want to someday deprecate the default export,
  * so none of the new TS types are being exported on the default
  * @public
  */
/**
  * BSON default export
  * @deprecated Please use named exports
  * @privateRemarks
  * We want to someday deprecate the default export,
  * so none of the new TS types are being exported on the default
  * @public
  */
object default {
  
  @JSImport("bson", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bson", "default.BSONError")
  @js.native
  def BSONError: Instantiable1[/* message */ String, typings.bson.mod.BSONError] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.BSONError")
  @js.native
  open class BSONErrorCls protected () extends BSONError {
    def this(message: String) = this()
  }
  
  inline def BSONError_=(x: Instantiable1[/* message */ String, BSONError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BSONError")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.BSONRegExp")
  @js.native
  def BSONRegExp: TypeofBSONRegExp = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.BSONRegExp")
  @js.native
  open class BSONRegExpCls protected () extends BSONRegExp {
    /**
      * @param pattern - The regular expression pattern to match
      * @param options - The regular expression options
      */
    def this(pattern: String) = this()
    def this(pattern: String, options: String) = this()
  }
  
  inline def BSONRegExp_=(x: TypeofBSONRegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BSONRegExp")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.BSONSymbol")
  @js.native
  def BSONSymbol: Instantiable1[/* value */ String, typings.bson.mod.BSONSymbol] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.BSONSymbol")
  @js.native
  open class BSONSymbolCls protected () extends BSONSymbol {
    /**
      * @param value - the string representing the symbol.
      */
    def this(value: String) = this()
  }
  
  inline def BSONSymbol_=(x: Instantiable1[/* value */ String, BSONSymbol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BSONSymbol")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.BSONTypeError")
  @js.native
  def BSONTypeError: Instantiable1[/* message */ String, typings.bson.mod.BSONTypeError] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.BSONTypeError")
  @js.native
  open class BSONTypeErrorCls protected () extends BSONTypeError {
    def this(message: String) = this()
  }
  
  inline def BSONTypeError_=(x: Instantiable1[/* message */ String, BSONTypeError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BSONTypeError")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Binary")
  @js.native
  def Binary: TypeofBinary = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Binary")
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
  open class BinaryCls () extends Binary {
    def this(buffer: String) = this()
    def this(buffer: BinarySequence) = this()
    def this(buffer: String, subType: scala.Double) = this()
    def this(buffer: Unit, subType: scala.Double) = this()
    def this(buffer: BinarySequence, subType: scala.Double) = this()
  }
  
  inline def Binary_=(x: TypeofBinary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Code")
  @js.native
  def Code: Instantiable2[
    /* code */ String | js.Function, 
    /* scope */ js.UndefOr[Document], 
    typings.bson.mod.Code
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Code")
  @js.native
  open class CodeCls protected () extends Code {
    /**
      * @param code - a string or function.
      * @param scope - an optional scope for the function.
      */
    def this(code: String) = this()
    def this(code: js.Function) = this()
    def this(code: String, scope: Document) = this()
    def this(code: js.Function, scope: Document) = this()
  }
  
  inline def Code_=(x: Instantiable2[/* code */ String | js.Function, /* scope */ js.UndefOr[Document], Code]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Code")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.DBRef")
  @js.native
  def DBRef: Instantiable4[
    /* collection */ String, 
    /* oid */ ObjectId, 
    /* db */ js.UndefOr[String], 
    /* fields */ js.UndefOr[Document], 
    typings.bson.mod.DBRef
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.DBRef")
  @js.native
  open class DBRefCls protected () extends DBRef {
    /**
      * @param collection - the collection name.
      * @param oid - the reference ObjectId.
      * @param db - optional db name, if omitted the reference is local to the current db.
      */
    def this(collection: String, oid: ObjectId) = this()
    def this(collection: String, oid: ObjectId, db: String) = this()
    def this(collection: String, oid: ObjectId, db: String, fields: Document) = this()
    def this(collection: String, oid: ObjectId, db: Unit, fields: Document) = this()
  }
  
  inline def DBRef_=(
    x: Instantiable4[
      /* collection */ String, 
      /* oid */ ObjectId, 
      /* db */ js.UndefOr[String], 
      /* fields */ js.UndefOr[Document], 
      DBRef
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DBRef")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Decimal128")
  @js.native
  def Decimal128: TypeofDecimal128 = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Decimal128")
  @js.native
  open class Decimal128Cls protected () extends Decimal128 {
    def this(bytes: String) = this()
    /**
      * @param bytes - a buffer containing the raw Decimal128 bytes in little endian order,
      *                or a string representation as returned by .toString()
      */
    def this(bytes: Buffer) = this()
  }
  
  inline def Decimal128_=(x: TypeofDecimal128): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal128")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Double")
  @js.native
  def Double: Instantiable1[/* value */ scala.Double, typings.bson.mod.Double] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Double")
  @js.native
  open class DoubleCls protected () extends Double {
    /**
      * Create a Double type
      *
      * @param value - the number we want to represent as a double.
      */
    def this(value: scala.Double) = this()
  }
  
  inline def Double_=(x: Instantiable1[/* value */ scala.Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Double")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.EJSON")
  @js.native
  def EJSON: TypeofEJSON = js.native
  inline def EJSON_=(x: TypeofEJSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EJSON")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Int32")
  @js.native
  def Int32: Instantiable1[/* value */ scala.Double | String, typings.bson.mod.Int32] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Int32")
  @js.native
  open class Int32Cls protected () extends Int32 {
    def this(value: String) = this()
    /**
      * Create an Int32 type
      *
      * @param value - the number we want to represent as an int32.
      */
    def this(value: scala.Double) = this()
  }
  
  inline def Int32_=(x: Instantiable1[/* value */ scala.Double | String, Int32]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Int32")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Long")
  @js.native
  def Long: TypeofLong = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Long")
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
  open class LongCls () extends Long {
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
  
  inline def Long_=(x: TypeofLong): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("bson", "default.Map")
  @js.native
  /* standard es2015.collection */
  open class Map[K, V] ()
    extends StObject
       with typings.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("bson", "default.Map")
  @js.native
  def Map: MapConstructor = js.native
  inline def Map_=(x: MapConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.MaxKey")
  @js.native
  def MaxKey: Instantiable0[typings.bson.mod.MaxKey] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.MaxKey")
  @js.native
  open class MaxKeyCls () extends MaxKey
  
  inline def MaxKey_=(x: Instantiable0[MaxKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxKey")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.MinKey")
  @js.native
  def MinKey: Instantiable0[typings.bson.mod.MinKey] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.MinKey")
  @js.native
  open class MinKeyCls () extends MinKey
  
  inline def MinKey_=(x: Instantiable0[MinKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinKey")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.ObjectID")
  @js.native
  /* Excluded from this release type: [kId] */
  /* Excluded from this release type: __id */
  /**
    * Create an ObjectId type
    *
    * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
    */
  open class ObjectIDCls_ ()
    extends StObject
       with ObjectId {
    def this(inputId: String) = this()
    def this(inputId: js.typedarray.Uint8Array) = this()
    def this(inputId: scala.Double) = this()
    def this(inputId: ObjectId) = this()
    def this(inputId: ObjectIdLike) = this()
    def this(inputId: Buffer) = this()
  }
  
  @JSImport("bson", "default.ObjectID")
  @js.native
  def ObjectID_ : TypeofObjectId & (Instantiable1[
    /* inputId */ js.UndefOr[
      String | scala.Double | ObjectId | ObjectIdLike | Buffer | js.typedarray.Uint8Array
    ], 
    ObjectId
  ]) = js.native
  
  inline def ObjectID__=(
    x: TypeofObjectId & (Instantiable1[
      /* inputId */ js.UndefOr[
        String | scala.Double | ObjectId | ObjectIdLike | Buffer | js.typedarray.Uint8Array
      ], 
      ObjectId
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.ObjectId")
  @js.native
  def ObjectId: TypeofObjectId & (Instantiable1[
    /* inputId */ js.UndefOr[
      String | scala.Double | typings.bson.mod.ObjectId | ObjectIdLike | Buffer | js.typedarray.Uint8Array
    ], 
    typings.bson.mod.ObjectId
  ]) = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.ObjectId")
  @js.native
  /* Excluded from this release type: [kId] */
  /* Excluded from this release type: __id */
  /**
    * Create an ObjectId type
    *
    * @param inputId - Can be a 24 character hex string, 12 byte binary Buffer, or a number.
    */
  open class ObjectIdCls ()
    extends StObject
       with ObjectId {
    def this(inputId: String) = this()
    def this(inputId: js.typedarray.Uint8Array) = this()
    def this(inputId: scala.Double) = this()
    def this(inputId: ObjectId) = this()
    def this(inputId: ObjectIdLike) = this()
    def this(inputId: Buffer) = this()
  }
  
  inline def ObjectId_=(
    x: TypeofObjectId & (Instantiable1[
      /* inputId */ js.UndefOr[
        String | scala.Double | ObjectId | ObjectIdLike | Buffer | js.typedarray.Uint8Array
      ], 
      ObjectId
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectId")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.Timestamp")
  @js.native
  def Timestamp: TypeofTimestamp = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.Timestamp")
  @js.native
  open class TimestampCls protected () extends Timestamp {
    /**
      * @param low - A 64-bit Long representing the Timestamp.
      */
    def this(long: Long) = this()
  }
  
  inline def Timestamp_=(x: TypeofTimestamp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.UUID")
  @js.native
  def UUID: TypeofUUID = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bson", "default.UUID")
  @js.native
  /* Excluded from this release type: __id */
  /**
    * Create an UUID type
    *
    * @param input - Can be a 32 or 36 character hex string (dashes excluded/included) or a 16 byte binary Buffer.
    */
  open class UUIDCls () extends UUID {
    def this(input: String) = this()
    def this(input: UUID) = this()
    def this(input: Buffer) = this()
  }
  
  inline def UUID_=(x: TypeofUUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UUID")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.calculateObjectSize")
  @js.native
  def calculateObjectSize: js.Function2[
    /* object */ Document, 
    /* options */ js.UndefOr[CalculateObjectSizeOptions], 
    scala.Double
  ] = js.native
  inline def calculateObjectSize(`object`: Document): scala.Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  inline def calculateObjectSize(`object`: Document, options: CalculateObjectSizeOptions): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def calculateObjectSize_=(
    x: js.Function2[
      /* object */ Document, 
      /* options */ js.UndefOr[CalculateObjectSizeOptions], 
      scala.Double
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("calculateObjectSize")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.deserialize")
  @js.native
  def deserialize: js.Function2[
    /* buffer */ Buffer | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer, 
    /* options */ js.UndefOr[DeserializeOptions], 
    Document
  ] = js.native
  inline def deserialize(buffer: js.typedarray.ArrayBuffer): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def deserialize(buffer: js.typedarray.ArrayBufferView): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def deserialize(buffer: js.typedarray.ArrayBufferView, options: DeserializeOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def deserialize(buffer: js.typedarray.ArrayBuffer, options: DeserializeOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def deserialize(buffer: Buffer): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def deserialize(buffer: Buffer, options: DeserializeOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @JSImport("bson", "default.deserializeStream")
  @js.native
  def deserializeStream: js.Function6[
    /* data */ Buffer | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer, 
    /* startIndex */ scala.Double, 
    /* numberOfDocuments */ scala.Double, 
    /* documents */ js.Array[Document], 
    /* docStartIndex */ scala.Double, 
    /* options */ DeserializeOptions, 
    scala.Double
  ] = js.native
  inline def deserializeStream(
    data: js.typedarray.ArrayBufferView,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[Document],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def deserializeStream(
    data: js.typedarray.ArrayBuffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[Document],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def deserializeStream(
    data: Buffer,
    startIndex: scala.Double,
    numberOfDocuments: scala.Double,
    documents: js.Array[Document],
    docStartIndex: scala.Double,
    options: DeserializeOptions
  ): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def deserializeStream_=(
    x: js.Function6[
      /* data */ Buffer | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer, 
      /* startIndex */ scala.Double, 
      /* numberOfDocuments */ scala.Double, 
      /* documents */ js.Array[Document], 
      /* docStartIndex */ scala.Double, 
      /* options */ DeserializeOptions, 
      scala.Double
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserializeStream")(x.asInstanceOf[js.Any])
  
  inline def deserialize_=(
    x: js.Function2[
      /* buffer */ Buffer | js.typedarray.ArrayBufferView | js.typedarray.ArrayBuffer, 
      /* options */ js.UndefOr[DeserializeOptions], 
      Document
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.serialize")
  @js.native
  def serialize: js.Function2[/* object */ Document, /* options */ js.UndefOr[SerializeOptions], Buffer] = js.native
  inline def serialize(`object`: Document): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def serialize(`object`: Document, options: SerializeOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("bson", "default.serializeWithBufferAndIndex")
  @js.native
  def serializeWithBufferAndIndex: js.Function3[
    /* object */ Document, 
    /* finalBuffer */ Buffer, 
    /* options */ js.UndefOr[SerializeOptions], 
    scala.Double
  ] = js.native
  inline def serializeWithBufferAndIndex(`object`: Document, finalBuffer: Buffer): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def serializeWithBufferAndIndex(`object`: Document, finalBuffer: Buffer, options: SerializeOptions): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  inline def serializeWithBufferAndIndex_=(
    x: js.Function3[
      /* object */ Document, 
      /* finalBuffer */ Buffer, 
      /* options */ js.UndefOr[SerializeOptions], 
      scala.Double
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializeWithBufferAndIndex")(x.asInstanceOf[js.Any])
  
  inline def serialize_=(x: js.Function2[/* object */ Document, /* options */ js.UndefOr[SerializeOptions], Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  
  @JSImport("bson", "default.setInternalBufferSize")
  @js.native
  def setInternalBufferSize: js.Function1[/* size */ scala.Double, Unit] = js.native
  inline def setInternalBufferSize(size: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInternalBufferSize")(size.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setInternalBufferSize_=(x: js.Function1[/* size */ scala.Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setInternalBufferSize")(x.asInstanceOf[js.Any])
}
