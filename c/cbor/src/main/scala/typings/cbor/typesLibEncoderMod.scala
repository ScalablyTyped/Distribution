package typings.cbor

import org.scalablytyped.runtime.StringDictionary
import typings.buffer.mod.Buffer
import typings.cbor.anon.Indefinite
import typings.cbor.cborStrings.float
import typings.cbor.cborStrings.int
import typings.cbor.cborStrings.number
import typings.cbor.cborStrings.string
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Transform
import typings.std.Map
import typings.std.Set
import typings.std.URL
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibEncoderMod {
  
  /**
    * @typedef EncodingOptions
    * @property {any[]|object} [genTypes=[]] Array of pairs of
    *   `type`, `function(Encoder)` for semantic types to be encoded.  Not
    *   needed for Array, Date, Buffer, Map, RegExp, Set, or URL.
    *   If an object, the keys are the constructor names for the types.
    * @property {boolean} [canonical=false] Should the output be
    *   canonicalized.
    * @property {boolean|WeakSet} [detectLoops=false] Should object loops
    *   be detected?  This will currently add memory to track every part of the
    *   object being encoded in a WeakSet.  Do not encode
    *   the same object twice on the same encoder, without calling
    *   `removeLoopDetectors` in between, which will clear the WeakSet.
    *   You may pass in your own WeakSet to be used; this is useful in some
    *   recursive scenarios.
    * @property {("number"|"float"|"int"|"string")} [dateType="number"] -
    *   how should dates be encoded?  "number" means float or int, if no
    *   fractional seconds.
    * @property {any} [encodeUndefined=undefined] How should an
    *   "undefined" in the input be encoded.  By default, just encode a CBOR
    *   undefined.  If this is a buffer, use those bytes without re-encoding
    *   them.  If this is a function, the function will be called (which is a
    *   good time to throw an exception, if that's what you want), and the
    *   return value will be used according to these rules.  Anything else will
    *   be encoded as CBOR.
    * @property {boolean} [disallowUndefinedKeys=false] Should
    *   "undefined" be disallowed as a key in a Map that is serialized?  If
    *   this is true, encode(new Map([[undefined, 1]])) will throw an
    *   exception.  Note that it is impossible to get a key of undefined in a
    *   normal JS object.
    * @property {boolean} [collapseBigIntegers=false] Should integers
    *   that come in as ECMAscript bigint's be encoded
    *   as normal CBOR integers if they fit, discarding type information?
    * @property {number} [chunkSize=4096] Number of characters or bytes
    *   for each chunk, if obj is a string or Buffer, when indefinite encoding.
    * @property {boolean} [omitUndefinedProperties=false] When encoding
    *   objects or Maps, do not include a key if its corresponding value is
    *   `undefined`.
    */
  /**
    * Transform JavaScript values into CBOR bytes.  The `Writable` side of
    * the stream is in object mode.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor/types/lib/encoder", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of Encoder.
    *
    * @param {EncodingOptions} [options={}] Options for the encoder.
    */
  open class ^ () extends Encoder {
    def this(options: EncodingOptions) = this()
  }
  @JSImport("cbor/types/lib/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Encode one or more JavaScript objects, and return a Buffer containing the
    * CBOR bytes.
    *
    * @param {...any} objs The objects to encode.
    * @returns {Buffer} The encoded objects.
    */
  /* static member */
  inline def encode(objs: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
  
  /**
    * Encode one JavaScript object using the given options in a way that
    * is more resilient to objects being larger than the highWaterMark
    * number of bytes.  As with the other static encode functions, this
    * will still use a large amount of memory.  Use a stream-based approach
    * directly if you need to process large and complicated inputs.
    *
    * @param {any} obj The object to encode.
    * @param {EncodingOptions} [options={}] Passed to the Encoder constructor.
    * @returns {Promise<Buffer>} A promise for the encoded buffer.
    */
  /* static member */
  inline def encodeAsync(obj: Any): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeAsync")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def encodeAsync(obj: Any, options: EncodingOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAsync")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /**
    * Encode one or more JavaScript objects canonically (slower!), and return
    * a Buffer containing the CBOR bytes.
    *
    * @param {...any} objs The objects to encode.
    * @returns {Buffer} The encoded objects.
    */
  /* static member */
  inline def encodeCanonical(objs: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeCanonical")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
  
  /**
    * Encode the given object with indefinite length.  There are apparently
    * some (IMO) broken implementations of poorly-specified protocols that
    * REQUIRE indefinite-encoding.  See the example for how to add this as an
    * `encodeCBOR` function to an object or class to get indefinite encoding.
    *
    * @param {Encoder} gen The encoder to use.
    * @param {string|Buffer|Array|Map|object} [obj] The object to encode.  If
    *   null, use "this" instead.
    * @param {EncodingOptions} [options={}] Options for encoding.
    * @returns {boolean} True on success.
    * @throws {Error} No object to encode or invalid indefinite encoding.
    * @example <caption>Force indefinite encoding:</caption>
    * const o = {
    *   a: true,
    *   encodeCBOR: cbor.Encoder.encodeIndefinite,
    * }
    * const m = []
    * m.encodeCBOR = cbor.Encoder.encodeIndefinite
    * cbor.encodeOne([o, m])
    */
  /* static member */
  inline def encodeIndefinite(gen: Encoder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: String, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: js.Array[Any], options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: js.Object, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: Unit, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: Buffer, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: Map[Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def encodeIndefinite(gen: Encoder, obj: Map[Any, Any], options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Encode one JavaScript object using the given options.
    *
    * @static
    * @param {any} obj The object to encode.
    * @param {EncodingOptions} [options={}] Passed to the Encoder constructor.
    * @returns {Buffer} The encoded objects.
    */
  /* static member */
  inline def encodeOne(obj: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeOne")(obj.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encodeOne(obj: Any, options: EncodingOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeOne")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Encode an array and all of its elements.
    *
    * @param {Encoder} gen Encoder to use.
    * @param {any[]} obj Array to encode.
    * @param {object} [opts] Options.
    * @param {boolean} [opts.indefinite=false] Use indefinite encoding?
    * @returns {boolean} True on success.
    */
  /* static member */
  inline def pushArray(gen: Encoder, obj: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def pushArray(gen: Encoder, obj: js.Array[Any], opts: Indefinite): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param { ArrayBuffer } obj Array to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushArrayBuffer(gen: Encoder, obj: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushArrayBuffer")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {object} obj Boxed String, Number, or Boolean object to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushBoxed(gen: Encoder, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushBoxed")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {Buffer} obj Buffer to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushBuffer(gen: Encoder, obj: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushBuffer")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {Date} obj Date to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushDate(gen: Encoder, obj: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushDate")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {Map} obj Map to encode.
    * @returns {boolean} True on success.
    * @throws {Error} Map key that is undefined.
    * @ignore
    */
  /* static member */
  inline def pushMap(gen: Encoder, obj: Map[Any, Any], opts: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushMap")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {NoFilter} obj Buffer to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushNoFilter(gen: Encoder, obj: typings.nofilter.mod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushNoFilter")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {RegExp} obj RegExp to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushRegexp(gen: Encoder, obj: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushRegexp")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {Set} obj Set to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushSet(gen: Encoder, obj: Set[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushSet")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {NodeJS.TypedArray} obj Array to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushTypedArray(gen: Encoder, obj: TypedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTypedArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @param {Encoder} gen Encoder.
    * @param {URL} obj URL to encode.
    * @returns {boolean} True on success.
    * @ignore
    */
  /* static member */
  inline def pushURL(gen: Encoder, obj: URL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushURL")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Reset the supported semantic types to the original set, before any
    * plugins modified the list.
    */
  /* static member */
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * Generate the CBOR for a value.  If you are using this, you'll either need
    * to call {@link Encoder.write } with a Buffer, or look into the internals of
    * Encoder to reuse existing non-documented behavior.
    */
  type EncodeFunction = js.Function2[/* enc */ Encoder, /* val */ Any, Boolean]
  
  /**
    * @typedef EncodingOptions
    * @property {any[]|object} [genTypes=[]] Array of pairs of
    *   `type`, `function(Encoder)` for semantic types to be encoded.  Not
    *   needed for Array, Date, Buffer, Map, RegExp, Set, or URL.
    *   If an object, the keys are the constructor names for the types.
    * @property {boolean} [canonical=false] Should the output be
    *   canonicalized.
    * @property {boolean|WeakSet} [detectLoops=false] Should object loops
    *   be detected?  This will currently add memory to track every part of the
    *   object being encoded in a WeakSet.  Do not encode
    *   the same object twice on the same encoder, without calling
    *   `removeLoopDetectors` in between, which will clear the WeakSet.
    *   You may pass in your own WeakSet to be used; this is useful in some
    *   recursive scenarios.
    * @property {("number"|"float"|"int"|"string")} [dateType="number"] -
    *   how should dates be encoded?  "number" means float or int, if no
    *   fractional seconds.
    * @property {any} [encodeUndefined=undefined] How should an
    *   "undefined" in the input be encoded.  By default, just encode a CBOR
    *   undefined.  If this is a buffer, use those bytes without re-encoding
    *   them.  If this is a function, the function will be called (which is a
    *   good time to throw an exception, if that's what you want), and the
    *   return value will be used according to these rules.  Anything else will
    *   be encoded as CBOR.
    * @property {boolean} [disallowUndefinedKeys=false] Should
    *   "undefined" be disallowed as a key in a Map that is serialized?  If
    *   this is true, encode(new Map([[undefined, 1]])) will throw an
    *   exception.  Note that it is impossible to get a key of undefined in a
    *   normal JS object.
    * @property {boolean} [collapseBigIntegers=false] Should integers
    *   that come in as ECMAscript bigint's be encoded
    *   as normal CBOR integers if they fit, discarding type information?
    * @property {number} [chunkSize=4096] Number of characters or bytes
    *   for each chunk, if obj is a string or Buffer, when indefinite encoding.
    * @property {boolean} [omitUndefinedProperties=false] When encoding
    *   objects or Maps, do not include a key if its corresponding value is
    *   `undefined`.
    */
  /**
    * Transform JavaScript values into CBOR bytes.  The `Writable` side of
    * the stream is in object mode.
    *
    * @extends stream.Transform
    */
  @js.native
  trait Encoder extends Transform {
    
    /**
      * @param {any[]} objs Array of supported things.
      * @returns {Buffer} Concatenation of encodings for the supported things.
      * @ignore
      */
    def _encodeAll(objs: js.Array[Any]): Buffer = js.native
    
    /**
      * @param {boolean} obj Bool to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushBoolean(obj: Boolean): Boolean = js.native
    
    /**
      * @param {number} val Number to encode as 8-byte double.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushDoubleBE(`val`: Double): Boolean = js.native
    
    /**
      * Choose the best float representation for a number and encode it.
      *
      * @param {number} obj A number that is known to be not-integer, but not
      *    how many bytes of precision it needs.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushFloat(obj: Double): Boolean = js.native
    
    /**
      * @param {number} val Number to encode as 4-byte float.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushFloatBE(`val`: Double): Boolean = js.native
    
    /**
      * @param {number} obj Positive or negative infinity.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushInfinity(obj: Double): Boolean = js.native
    
    /**
      * Choose the best integer representation for a postive number and encode
      * it.  If the number is over MAX_SAFE_INTEGER, fall back on float (but I
      * don't remember why).
      *
      * @param {number} obj A positive number that is known to be an integer,
      *    but not how many bytes of precision it needs.
      * @param {number} mt The Major Type number to combine with the integer.
      *    Not yet shifted.
      * @param {number} [orig] The number before it was transformed to positive.
      *    If the mt is NEG_INT, and the positive number is over MAX_SAFE_INT,
      *    then we'll encode this as a float rather than making the number
      *    negative again and losing precision.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushInt(obj: Double, mt: Double): Boolean = js.native
    def _pushInt(obj: Double, mt: Double, orig: Double): Boolean = js.native
    
    /**
      * Choose the best integer representation for a number and encode it.
      *
      * @param {number} obj A number that is known to be an integer,
      *    but not how many bytes of precision it needs.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushIntNum(obj: Double): Boolean = js.native
    
    /**
      * @param {bigint} obj BigInt to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushJSBigint(obj: js.BigInt): Boolean = js.native
    
    /**
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushNaN(): Boolean = js.native
    
    /**
      * @param {null} obj Ignored.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushNull(obj: Null): Boolean = js.native
    
    /**
      * @param {number} obj Plain JS number to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushNumber(obj: Double): Boolean = js.native
    
    /**
      * @param {object} obj Object to encode.
      * @returns {boolean} True on success.
      * @throws {Error} Loop detected.
      * @ignore
      */
    def _pushObject(obj: js.Object, opts: Any): Boolean = js.native
    
    /**
      * @param {string} obj String to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushString(obj: String): Boolean = js.native
    
    /**
      * @param {number} tag Tag number to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushTag(tag: Double): Boolean = js.native
    
    /**
      * @param {number} val Number(0-65535) to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushUInt16BE(`val`: Double): Boolean = js.native
    
    /**
      * @param {number} val Number(0..2**32-1) to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushUInt32BE(`val`: Double): Boolean = js.native
    
    /**
      * @param {number} val Number(0-255) to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushUInt8(`val`: Double): Boolean = js.native
    
    /**
      * @param {undefined} obj Ignored.
      * @returns {boolean} True on success.
      * @ignore
      */
    def _pushUndefined(obj: Unit): Boolean = js.native
    
    /**
      * Add an encoding function to the list of supported semantic types.  This
      * is useful for objects for which you can't add an encodeCBOR method.
      *
      * @param {string|Function} type The type to encode.
      * @param {EncodeFunction} fun The encoder to use.
      * @returns {EncodeFunction?} The previous encoder or undefined if there
      *   wasn't one.
      * @throws {TypeError} Invalid function.
      */
    def addSemanticType(`type`: String, fun: EncodeFunction): EncodeFunction | Null = js.native
    def addSemanticType(`type`: js.Function, fun: EncodeFunction): EncodeFunction | Null = js.native
    
    var canonical: Boolean = js.native
    
    var collapseBigIntegers: Boolean = js.native
    
    var dateType: string | number | float | int = js.native
    
    /** @type {WeakSet?} */
    var detectLoops: WeakSet[Any] | Null = js.native
    
    var disallowUndefinedKeys: Boolean = js.native
    
    var encodeUndefined: Any = js.native
    
    var omitUndefinedProperties: Boolean = js.native
    
    /**
      * Push any supported type onto the encoded stream.
      *
      * @param {any} obj The thing to encode.
      * @returns {boolean} True on success.
      * @throws {TypeError} Unknown type for obj.
      */
    def pushAny(obj: Any): Boolean = js.native
    
    /**
      * Remove the loop detector WeakSet for this Encoder.
      *
      * @returns {boolean} True when the Encoder was reset, else false.
      */
    def removeLoopDetectors(): Boolean = js.native
    
    var semanticTypes: StringDictionary[EncodeFunction] = js.native
  }
  
  trait EncodingOptions extends StObject {
    
    /**
      * Should the output be
      * canonicalized.
      */
    var canonical: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of characters or bytes
      * for each chunk, if obj is a string or Buffer, when indefinite encoding.
      */
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Should integers
      * that come in as ECMAscript bigint's be encoded
      * as normal CBOR integers if they fit, discarding type information?
      */
    var collapseBigIntegers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * -
      * how should dates be encoded?  "number" means float or int, if no
      * fractional seconds.
      */
    var dateType: js.UndefOr[number | float | int | string] = js.undefined
    
    /**
      * Should object loops
      * be detected?  This will currently add memory to track every part of the
      * object being encoded in a WeakSet.  Do not encode
      * the same object twice on the same encoder, without calling
      * `removeLoopDetectors` in between, which will clear the WeakSet.
      * You may pass in your own WeakSet to be used; this is useful in some
      * recursive scenarios.
      */
    var detectLoops: js.UndefOr[Boolean | WeakSet[Any]] = js.undefined
    
    /**
      * Should
      * "undefined" be disallowed as a key in a Map that is serialized?  If
      * this is true, encode(new Map([[undefined, 1]])) will throw an
      * exception.  Note that it is impossible to get a key of undefined in a
      * normal JS object.
      */
    var disallowUndefinedKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How should an
      * "undefined" in the input be encoded.  By default, just encode a CBOR
      * undefined.  If this is a buffer, use those bytes without re-encoding
      * them.  If this is a function, the function will be called (which is a
      * good time to throw an exception, if that's what you want), and the
      * return value will be used according to these rules.  Anything else will
      * be encoded as CBOR.
      */
    var encodeUndefined: js.UndefOr[Any] = js.undefined
    
    /**
      * Array of pairs of
      * `type`, `function(Encoder)` for semantic types to be encoded.  Not
      * needed for Array, Date, Buffer, Map, RegExp, Set, or URL.
      * If an object, the keys are the constructor names for the types.
      */
    var genTypes: js.UndefOr[js.Array[Any] | js.Object] = js.undefined
    
    /**
      * When encoding
      * objects or Maps, do not include a key if its corresponding value is
      * `undefined`.
      */
    var omitUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  }
  object EncodingOptions {
    
    inline def apply(): EncodingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingOptions]
    }
    
    extension [Self <: EncodingOptions](x: Self) {
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setCollapseBigIntegers(value: Boolean): Self = StObject.set(x, "collapseBigIntegers", value.asInstanceOf[js.Any])
      
      inline def setCollapseBigIntegersUndefined: Self = StObject.set(x, "collapseBigIntegers", js.undefined)
      
      inline def setDateType(value: number | float | int | string): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
      
      inline def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
      
      inline def setDetectLoops(value: Boolean | WeakSet[Any]): Self = StObject.set(x, "detectLoops", value.asInstanceOf[js.Any])
      
      inline def setDetectLoopsUndefined: Self = StObject.set(x, "detectLoops", js.undefined)
      
      inline def setDisallowUndefinedKeys(value: Boolean): Self = StObject.set(x, "disallowUndefinedKeys", value.asInstanceOf[js.Any])
      
      inline def setDisallowUndefinedKeysUndefined: Self = StObject.set(x, "disallowUndefinedKeys", js.undefined)
      
      inline def setEncodeUndefined(value: Any): Self = StObject.set(x, "encodeUndefined", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefinedUndefined: Self = StObject.set(x, "encodeUndefined", js.undefined)
      
      inline def setGenTypes(value: js.Array[Any] | js.Object): Self = StObject.set(x, "genTypes", value.asInstanceOf[js.Any])
      
      inline def setGenTypesUndefined: Self = StObject.set(x, "genTypes", js.undefined)
      
      inline def setGenTypesVarargs(value: Any*): Self = StObject.set(x, "genTypes", js.Array(value*))
      
      inline def setOmitUndefinedProperties(value: Boolean): Self = StObject.set(x, "omitUndefinedProperties", value.asInstanceOf[js.Any])
      
      inline def setOmitUndefinedPropertiesUndefined: Self = StObject.set(x, "omitUndefinedProperties", js.undefined)
    }
  }
  
  /**
    * A mapping from tag number to a tag decoding function.
    */
  type SemanticMap = StringDictionary[EncodeFunction]
}
