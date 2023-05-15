package typings.cbor

import typings.buffer.mod.Buffer
import typings.cbor.anon.Indefinite
import typings.cbor.typesLibCommentedMod.CommentOptions
import typings.cbor.typesLibCommentedMod.commentCallback
import typings.cbor.typesLibDecoderMod.BufferLike
import typings.cbor.typesLibDecoderMod.DecoderOptions
import typings.cbor.typesLibDecoderMod.ExtendedResults
import typings.cbor.typesLibDecoderMod.decodeCallback
import typings.cbor.typesLibDiagnoseMod.DiagnoseOptions
import typings.cbor.typesLibDiagnoseMod.diagnoseCallback
import typings.cbor.typesLibEncoderMod.EncodingOptions
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Readable
import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generate the expanded format of RFC 8949, section 3.2.2.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor", "Commented")
  @js.native
  /**
    * Create a CBOR commenter.
    *
    * @param {CommentOptions} [options={}] Stream options.
    */
  open class Commented ()
    extends typings.cbor.typesLibCommentedMod.^ {
    def this(options: CommentOptions) = this()
  }
  object Commented {
    
    @JSImport("cbor", "Commented")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Comment on an input Buffer or string, creating a string passed to the
      * callback.  If callback not specified, a promise is returned.
      *
      * @param {string|Buffer|ArrayBuffer|Uint8Array|Uint8ClampedArray
      *   |DataView|stream.Readable} input Something to parse.
      * @param {CommentOptions|commentCallback|string|number} [options={}]
      *   Encoding, max_depth, or callback.
      * @param {commentCallback} [cb] If specified, called on completion.
      * @returns {Promise} If cb not specified.
      * @throws {Error} Input required.
      * @static
      */
    /* static member */
    inline def comment(
      input: String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable,
      options: js.UndefOr[CommentOptions | commentCallback | String | Double],
      cb: js.UndefOr[commentCallback]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  /**
    * Decode a stream of CBOR bytes by transforming them into equivalent
    * JavaScript data.  Because of the limitations of Node object streams,
    * special symbols are emitted instead of NULL or UNDEFINED.  Fix those
    * up by calling {@link Decoder.nullcheck}.
    *
    * @extends BinaryParseStream
    */
  @JSImport("cbor", "Decoder")
  @js.native
  /**
    * Create a parsing stream.
    *
    * @param {DecoderOptions} [options={}] Options.
    */
  open class Decoder ()
    extends typings.cbor.typesLibDecoderMod.^ {
    def this(options: DecoderOptions) = this()
  }
  object Decoder {
    
    @JSImport("cbor", "Decoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cbor", "Decoder.NOT_FOUND")
    @js.native
    val NOT_FOUND: js.Symbol = js.native
    
    /**
      * @callback decodeAllCallback
      * @param {Error} error If one was generated.
      * @param {Array<ExtendedResults>|Array<any>} value All of the decoded
      *   values, wrapped in an Array.
      */
    /**
      * Decode all of the CBOR items in the input.  This will error if there are
      * more bytes left over at the end.
      *
      * @param {BufferLike} input What to parse?
      * @param {DecoderOptions|decodeAllCallback|string} [options={}]
      *   Decoding options, the callback, or the input encoding.
      * @param {decodeAllCallback} [cb] Callback.
      * @returns {Promise<Array<ExtendedResults>|Array<any>>} Even if callback
      *   is specified.
      * @throws {TypeError} No input specified.
      * @static
      */
    /* static member */
    inline def decodeAll(input: BufferLike): js.Promise[js.Array[Any | ExtendedResults]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(input: BufferLike, options: String): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(
      input: BufferLike,
      options: String,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(
      input: BufferLike,
      options: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(
      input: BufferLike,
      options: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any],
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(
      input: BufferLike,
      options: Unit,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(input: BufferLike, options: DecoderOptions): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    inline def decodeAll(
      input: BufferLike,
      options: DecoderOptions,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAll")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any | ExtendedResults]]]
    
    /**
      * Decode all of the CBOR items in the input into an array.  This will throw
      * an exception if the input is not valid CBOR; a zero-length input will
      * return an empty array.
      *
      * @param {BufferLike} input What to parse?
      * @param {DecoderOptions|string} [options={}] Options or encoding
      *   for input.
      * @returns {Array<ExtendedResults>|Array<any>} Array of all found items.
      * @throws {TypeError} No input provided.
      * @throws {Error} Insufficient data provided.
      * @static
      */
    /* static member */
    inline def decodeAllSync(input: BufferLike): js.Array[Any | ExtendedResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAllSync")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any | ExtendedResults]]
    inline def decodeAllSync(input: BufferLike, options: String): js.Array[Any | ExtendedResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAllSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any | ExtendedResults]]
    inline def decodeAllSync(input: BufferLike, options: DecoderOptions): js.Array[Any | ExtendedResults] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeAllSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any | ExtendedResults]]
    
    /**
      * Decode the first CBOR item in the input.  This will error if there are
      * more bytes left over at the end (if options.extendedResults is not true),
      * and optionally if there were no valid CBOR bytes in the input.  Emits the
      * {Decoder.NOT_FOUND} Symbol in the callback if no data was found and the
      * `required` option is false.
      *
      * @param {BufferLike} input What to parse?
      * @param {DecoderOptions|decodeCallback|string} [options={}] Options, the
      *   callback, or input encoding.
      * @param {decodeCallback} [cb] Callback.
      * @returns {Promise<ExtendedResults|any>} Returned even if callback is
      *   specified.
      * @throws {TypeError} No input provided.
      * @static
      */
    /* static member */
    inline def decodeFirst(input: BufferLike): js.Promise[ExtendedResults | Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: String): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: String, cb: decodeCallback): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: Unit, cb: decodeCallback): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: DecoderOptions): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: DecoderOptions, cb: decodeCallback): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: decodeCallback): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    inline def decodeFirst(input: BufferLike, options: decodeCallback, cb: decodeCallback): js.Promise[ExtendedResults | Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtendedResults | Any]]
    
    /**
      * Decode the first CBOR item in the input, synchronously.  This will throw
      * an exception if the input is not valid CBOR, or if there are more bytes
      * left over at the end (if options.extendedResults is not true).
      *
      * @param {BufferLike} input If a Readable stream, must have
      *   received the `readable` event already, or you will get an error
      *   claiming "Insufficient data".
      * @param {DecoderOptions|string} [options={}] Options or encoding for input.
      * @returns {ExtendedResults|any} The decoded value.
      * @throws {UnexpectedDataError} Data is left over after decoding.
      * @throws {Error} Insufficient data.
      * @static
      */
    /* static member */
    inline def decodeFirstSync(input: BufferLike): ExtendedResults | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any]).asInstanceOf[ExtendedResults | Any]
    inline def decodeFirstSync(input: BufferLike, options: String): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    inline def decodeFirstSync(input: BufferLike, options: DecoderOptions): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    
    /**
      * Check the given value for a symbol encoding a NULL or UNDEFINED value in
      * the CBOR stream.
      *
      * @param {any} val The value to check.
      * @returns {any} The corrected value.
      * @throws {Error} Nothing was found.
      * @static
      * @example
      * myDecoder.on('data', val => {
      *   val = Decoder.nullcheck(val)
      *   // ...
      * })
      */
    /* static member */
    inline def nullcheck(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nullcheck")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /**
    * Output the diagnostic format from a stream of CBOR bytes.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor", "Diagnose")
  @js.native
  /**
    * Creates an instance of Diagnose.
    *
    * @param {DiagnoseOptions} [options={}] Options for creation.
    */
  open class Diagnose_ ()
    extends typings.cbor.typesLibDiagnoseMod.^ {
    def this(options: DiagnoseOptions) = this()
  }
  object Diagnose_ {
    
    @JSImport("cbor", "Diagnose")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience function to return a string in diagnostic format.
      *
      * @param {BufferLike} input The CBOR bytes to format.
      * @param {DiagnoseOptions |diagnoseCallback|string} [options={}]
      *   Options, the callback, or the input encoding.
      * @param {diagnoseCallback} [cb] Callback.
      * @returns {Promise} If callback not specified.
      * @throws {TypeError} Input not provided.
      */
    /* static member */
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: String, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: Unit, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: DiagnoseOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: DiagnoseOptions, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def diagnose(
      input: typings.cbor.typesLibDiagnoseMod.BufferLike,
      options: diagnoseCallback,
      cb: diagnoseCallback
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  }
  
  /**
    * @typedef ObjectOptions
    * @property {boolean} [indefinite = false] Force indefinite encoding for this
    *   object.
    * @property {boolean} [skipTypes = false] Do not use available type mappings
    *   for this object, but encode it as a "normal" JS object would be.
    */
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
  @JSImport("cbor", "Encoder")
  @js.native
  /**
    * Creates an instance of Encoder.
    *
    * @param {EncodingOptions} [options={}] Options for the encoder.
    */
  open class Encoder ()
    extends typings.cbor.typesLibEncoderMod.^ {
    def this(options: EncodingOptions) = this()
  }
  object Encoder {
    
    @JSImport("cbor", "Encoder")
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
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: String, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Array[Any], options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Object, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: Unit, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: Buffer, options: EncodingOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: typings.std.Map[Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def encodeIndefinite(
      gen: typings.cbor.typesLibEncoderMod.Encoder,
      obj: typings.std.Map[Any, Any],
      options: EncodingOptions
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeIndefinite")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Encode one JavaScript object using the given options.
      *
      * @param {any} obj The object to encode.
      * @param {EncodingOptions} [options={}] Passed to the Encoder constructor.
      * @returns {Buffer} The encoded objects.
      * @static
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
    inline def pushArray(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def pushArray(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Array[Any], opts: Indefinite): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pushArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param { ArrayBuffer } obj Array to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushArrayBuffer(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushArrayBuffer")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {object} obj Boxed String, Number, or Boolean object to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushBoxed(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushBoxed")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Buffer} obj Buffer to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushBuffer(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushBuffer")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Date} obj Date to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushDate(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushDate")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Map} obj Map to encode.
      * @returns {boolean} True on success.
      * @throws {Error} Map key that is undefined.
      * @ignore
      */
    /* static member */
    inline def pushMap(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: typings.std.Map[Any, Any], opts: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushMap")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {NoFilter} obj Buffer to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushNoFilter(
      gen: typings.cbor.typesLibEncoderMod.Encoder,
      obj: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NoFilter */ Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushNoFilter")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {RegExp} obj RegExp to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushRegexp(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushRegexp")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Set} obj Set to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushSet(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: Set[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushSet")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {NodeJS.TypedArray} obj Array to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushTypedArray(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: TypedArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTypedArray")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {URL} obj URL to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    inline def pushURL(gen: typings.cbor.typesLibEncoderMod.Encoder, obj: URL): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushURL")(gen.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Reset the supported semantic types to the original set, before any
      * plugins modified the list.
      */
    /* static member */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
  
  /**
    * Wrapper around a JavaScript Map object that allows the keys to be
    * any complex type.  The base Map object allows this, but will only
    * compare the keys by identity, not by value.  CborMap translates keys
    * to CBOR first (and base64's them to ensure by-value comparison).
    *
    * This is not a subclass of Object, because it would be tough to get
    * the semantics to be an exact match.
    *
    * @extends Map
    */
  @JSImport("cbor", "Map")
  @js.native
  /**
    * Creates an instance of CborMap.
    *
    * @param {Iterable<any>} [iterable] An Array or other iterable
    *   object whose elements are key-value pairs (arrays with two elements, e.g.
    *   <code>[[ 1, 'one' ],[ 2, 'two' ]]</code>). Each key-value pair is added
    *   to the new CborMap; null values are treated as undefined.
    */
  open class Map ()
    extends typings.cbor.typesLibMapMod.^ {
    def this(iterable: js.Iterable[Any]) = this()
  }
  object Map {
    
    @JSImport("cbor", "Map")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @ignore
      */
    /* static member */
    inline def decode(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_decode")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    /**
      * @ignore
      */
    /* static member */
    inline def encode(key: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_encode")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /**
    * Implement value sharing.
    *
    * @see {@link cbor.schmorp.de/value-sharing}
    */
  @JSImport("cbor", "SharedValueEncoder")
  @js.native
  open class SharedValueEncoder protected ()
    extends typings.cbor.typesLibSharedValueEncoderMod.^ {
    def this(opts: Any) = this()
  }
  
  /**
    * A CBOR Simple Value that does not map onto a known constant.
    */
  @JSImport("cbor", "Simple")
  @js.native
  open class Simple protected ()
    extends typings.cbor.typesLibSimpleMod.^ {
    /**
      * Creates an instance of Simple.
      *
      * @param {number} value The simple value's integer value.
      */
    def this(value: Double) = this()
  }
  object Simple {
    
    @JSImport("cbor", "Simple")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decode from the CBOR additional information into a JavaScript value.
      * If the CBOR item has no parent, return a "safe" symbol instead of
      * `null` or `undefined`, so that the value can be passed through a
      * stream in object mode.
      *
      * @param {number} val The CBOR additional info to convert.
      * @param {boolean} [has_parent=true] Does the CBOR item have a parent?
      * @param {boolean} [parent_indefinite=false] Is the parent element
      *   indefinitely encoded?
      * @returns {(null|undefined|boolean|symbol|Simple)} The decoded value.
      * @throws {Error} Invalid BREAK.
      */
    /* static member */
    inline def decode(`val`: Double): js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple]]
    inline def decode(`val`: Double, has_parent: Boolean): js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple]]
    inline def decode(`val`: Double, has_parent: Boolean, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any], parent_indefinite.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple]]
    inline def decode(`val`: Double, has_parent: Unit, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any], parent_indefinite.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | typings.cbor.typesLibSimpleMod.Simple]]
    
    /**
      * Is the given object a Simple?
      *
      * @param {any} obj Object to test.
      * @returns {boolean} Is it Simple?
      */
    /* static member */
    inline def isSimple(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimple")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * A CBOR tagged item, where the tag does not have semantics specified at the
    * moment, or those semantics threw an error during parsing. Typically this will
    * be an extension point you're not yet expecting.
    */
  @JSImport("cbor", "Tagged")
  @js.native
  open class Tagged protected ()
    extends typings.cbor.typesLibTaggedMod.^ {
    /**
      * Creates an instance of Tagged.
      *
      * @param {number} tag The number of the tag.
      * @param {any} value The value inside the tag.
      * @param {Error} [err] The error that was thrown parsing the tag, or null.
      */
    def this(tag: Double, value: Any) = this()
    def this(tag: Double, value: Any, err: js.Error) = this()
  }
  object Tagged {
    
    @JSImport("cbor", "Tagged")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cbor", "Tagged.INTERNAL_JSON")
    @js.native
    val INTERNAL_JSON: js.Symbol = js.native
    
    /**
      * Reset the supported tags to the original set, before any plugins modified
      * the list.
      */
    /* static member */
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
  
  @JSImport("cbor", "comment")
  @js.native
  val comment: js.Function3[
    /* input */ String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable, 
    /* options */ js.UndefOr[CommentOptions | commentCallback | String | Double], 
    /* cb */ js.UndefOr[commentCallback], 
    js.Promise[Any]
  ] = js.native
  
  @JSImport("cbor", "decode")
  @js.native
  val decode: js.Function2[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | String], 
    ExtendedResults | Any
  ] = js.native
  
  @JSImport("cbor", "decodeAll")
  @js.native
  val decodeAll: js.Function3[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[
      String | DecoderOptions | (js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any])
    ], 
    /* cb */ js.UndefOr[
      js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ], 
    js.Promise[js.Array[Any | ExtendedResults]]
  ] = js.native
  
  @JSImport("cbor", "decodeAllSync")
  @js.native
  val decodeAllSync: js.Function2[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | String], 
    js.Array[Any | ExtendedResults]
  ] = js.native
  
  @JSImport("cbor", "decodeFirst")
  @js.native
  val decodeFirst: js.Function3[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | decodeCallback | String], 
    /* cb */ js.UndefOr[decodeCallback], 
    js.Promise[ExtendedResults | Any]
  ] = js.native
  
  @JSImport("cbor", "decodeFirstSync")
  @js.native
  val decodeFirstSync: Any = js.native
  
  @JSImport("cbor", "diagnose")
  @js.native
  val diagnose: js.Function3[
    /* input */ typings.cbor.typesLibDiagnoseMod.BufferLike, 
    /* options */ js.UndefOr[DiagnoseOptions | diagnoseCallback | String], 
    /* cb */ js.UndefOr[diagnoseCallback], 
    js.Promise[Any]
  ] = js.native
  
  @JSImport("cbor", "encode")
  @js.native
  val encode: js.Function1[/* repeated */ Any, Buffer] = js.native
  
  @JSImport("cbor", "encodeAsync")
  @js.native
  val encodeAsync: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], js.Promise[Buffer]] = js.native
  
  @JSImport("cbor", "encodeCanonical")
  @js.native
  val encodeCanonical: js.Function1[/* repeated */ Any, Buffer] = js.native
  
  @JSImport("cbor", "encodeOne")
  @js.native
  val encodeOne: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], Buffer] = js.native
  
  object leveldb {
    
    @JSImport("cbor", "leveldb")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cbor", "leveldb.buffer")
    @js.native
    val buffer: Boolean = js.native
    
    /**
      * Decode the first CBOR item in the input, synchronously.  This will throw
      * an exception if the input is not valid CBOR, or if there are more bytes
      * left over at the end (if options.extendedResults is not true).
      *
      * @param {BufferLike} input If a Readable stream, must have
      *   received the `readable` event already, or you will get an error
      *   claiming "Insufficient data".
      * @param {DecoderOptions|string} [options={}] Options or encoding for input.
      * @returns {ExtendedResults|any} The decoded value.
      * @throws {UnexpectedDataError} Data is left over after decoding.
      * @throws {Error} Insufficient data.
      * @static
      */
    /* static member */
    /* was `typeof Decoder.decodeFirstSync` */
    inline def decode1(input: BufferLike): ExtendedResults | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_1")(input.asInstanceOf[js.Any]).asInstanceOf[ExtendedResults | Any]
    inline def decode1(input: BufferLike, options: String): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode_1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    inline def decode1(input: BufferLike, options: DecoderOptions): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode_1")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    
    /**
      * Encode one or more JavaScript objects, and return a Buffer containing the
      * CBOR bytes.
      *
      * @param {...any} objs The objects to encode.
      * @returns {Buffer} The encoded objects.
      */
    /* static member */
    /* was `typeof Encoder.encode` */
    inline def encode1(objs: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_1")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
    
    @JSImport("cbor", "leveldb.name")
    @js.native
    val name: String = js.native
  }
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
