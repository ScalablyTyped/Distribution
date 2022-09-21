package typings.cbor

import org.scalablytyped.runtime.StringDictionary
import typings.cbor.taggedMod.TagFunction
import typings.cbor.taggedMod.TagMap
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoderMod {
  
  /**
    * Decode a stream of CBOR bytes by transforming them into equivalent
    * JavaScript data.  Because of the limitations of Node object streams,
    * special symbols are emitted instead of NULL or UNDEFINED.  Fix those
    * up by calling {@link Decoder.nullcheck}.
    *
    * @extends BinaryParseStream
    */
  @JSImport("cbor/types/lib/decoder", JSImport.Namespace)
  @js.native
  /**
    * Create a parsing stream.
    *
    * @param {DecoderOptions} [options={}] Options.
    */
  open class ^ () extends Decoder {
    def this(options: DecoderOptions) = this()
  }
  @JSImport("cbor/types/lib/decoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cbor/types/lib/decoder", "NOT_FOUND")
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
    * @static
    * @param {BufferLike} input What to parse?
    * @param {DecoderOptions|decodeAllCallback|string} [options={}]
    *   Decoding options, the callback, or the input encoding.
    * @param {decodeAllCallback} [cb] Callback.
    * @returns {Promise<Array<ExtendedResults>|Array<any>>} Even if callback
    *   is specified.
    * @throws {TypeError} No input specified.
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
    * @static
    * @param {BufferLike} input What to parse?
    * @param {DecoderOptions|string} [options={}] Options or encoding
    *   for input.
    * @returns {Array<ExtendedResults>|Array<any>} Array of all found items.
    * @throws {TypeError} No input provided.
    * @throws {Error} Insufficient data provided.
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
    * @static
    * @param {BufferLike} input What to parse?
    * @param {DecoderOptions|decodeCallback|string} [options={}] Options, the
    *   callback, or input encoding.
    * @param {decodeCallback} [cb] Callback.
    * @returns {Promise<ExtendedResults|any>} Returned even if callback is
    *   specified.
    * @throws {TypeError} No input provided.
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
    * @static
    * @param {BufferLike} input If a Readable stream, must have
    *   received the `readable` event already, or you will get an error
    *   claiming "Insufficient data".
    * @param {DecoderOptions|string} [options={}] Options or encoding for input.
    * @returns {ExtendedResults|any} The decoded value.
    * @throws {UnexpectedDataError} Data is left over after decoding.
    * @throws {Error} Insufficient data.
    */
  /* static member */
  inline def decodeFirstSync(input: BufferLike): ExtendedResults | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any]).asInstanceOf[ExtendedResults | Any]
  inline def decodeFirstSync(input: BufferLike, options: String): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
  inline def decodeFirstSync(input: BufferLike, options: DecoderOptions): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirstSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
  
  /**
    * Check the given value for a symbol encoding a NULL or UNDEFINED value in
    * the CBOR stream.
    *
    * @static
    * @param {any} val The value to check.
    * @returns {any} The corrected value.
    * @throws {Error} Nothing was found.
    * @example
    * myDecoder.on('data', val => {
    *   val = Decoder.nullcheck(val)
    *   // ...
    * })
    */
  /* static member */
  inline def nullcheck(`val`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("nullcheck")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Things that can act as inputs, from which a NoFilter can be created.
    */
  type BufferLike = String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable
  
  /**
    * Decode a stream of CBOR bytes by transforming them into equivalent
    * JavaScript data.  Because of the limitations of Node object streams,
    * special symbols are emitted instead of NULL or UNDEFINED.  Fix those
    * up by calling {@link Decoder.nullcheck}.
    *
    * @extends BinaryParseStream
    */
  @js.native
  trait Decoder
    extends typings.cbor.binaryParseStreamMod.^ {
    
    /**
      * Only called if extendedResults is true.
      *
      * @ignore
      */
    def _onRead(data: Any): Unit = js.native
    
    /**
      * Stop processing.
      */
    def close(): Unit = js.native
    
    var extendedResults: Boolean = js.native
    
    var max_depth: Double = js.native
    
    var preferWeb: Boolean = js.native
    
    var preventDuplicateKeys: Boolean = js.native
    
    var required: Boolean = js.native
    
    var running: Boolean = js.native
    
    var tags: StringDictionary[TagFunction] = js.native
    
    var valueBytes: typings.nofilter.mod.^ = js.native
  }
  
  trait DecoderOptions extends StObject {
    
    /**
      * The encoding of the input.
      * Ignored if input is a Buffer.
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * If true, emit extended
      * results, which will be an object with shape {@link ExtendedResults }.
      * The value will already have been null-checked.
      */
    var extendedResults: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum depth to parse.
      * Use -1 for "until you run out of memory".  Set this to a finite
      * positive number for un-trusted inputs.  Most standard inputs won't nest
      * more than 100 or so levels; I've tested into the millions before
      * running out of memory.
      */
    var max_depth: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, prefer Uint8Arrays to
      * be generated instead of node Buffers.  This might turn on some more
      * changes in the future, so forward-compatibility is not guaranteed yet.
      */
    var preferWeb: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, error is
      * thrown if a map has duplicate keys.
      */
    var preventDuplicateKeys: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should an error be thrown when no
      * data is in the input?
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mapping from tag number to function(v),
      * where v is the decoded value that comes after the tag, and where the
      * function returns the correctly-created value for that tag.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  object DecoderOptions {
    
    inline def apply(): DecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoderOptions]
    }
    
    extension [Self <: DecoderOptions](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExtendedResults(value: Boolean): Self = StObject.set(x, "extendedResults", value.asInstanceOf[js.Any])
      
      inline def setExtendedResultsUndefined: Self = StObject.set(x, "extendedResults", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setPreferWeb(value: Boolean): Self = StObject.set(x, "preferWeb", value.asInstanceOf[js.Any])
      
      inline def setPreferWebUndefined: Self = StObject.set(x, "preferWeb", js.undefined)
      
      inline def setPreventDuplicateKeys(value: Boolean): Self = StObject.set(x, "preventDuplicateKeys", value.asInstanceOf[js.Any])
      
      inline def setPreventDuplicateKeysUndefined: Self = StObject.set(x, "preventDuplicateKeys", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ExtendedResults extends StObject {
    
    /**
      * The bytes of the original input that were used
      * to produce the value.
      */
    var bytes: Buffer
    
    /**
      * The number of bytes of the original input that
      * were read.
      */
    var length: Double
    
    /**
      * The bytes that were left over from the original
      * input.  This property only exists if {@link Decoder.decodeFirst } or
      * {@link Decoder.decodeFirstSync } was called.
      */
    var unused: js.UndefOr[Buffer] = js.undefined
    
    /**
      * The value that was found.
      */
    var value: Any
  }
  object ExtendedResults {
    
    inline def apply(bytes: Buffer, length: Double, value: Any): ExtendedResults = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedResults]
    }
    
    extension [Self <: ExtendedResults](x: Self) {
      
      inline def setBytes(value: Buffer): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setUnused(value: Buffer): Self = StObject.set(x, "unused", value.asInstanceOf[js.Any])
      
      inline def setUnusedUndefined: Self = StObject.set(x, "unused", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type decodeCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* value */ js.UndefOr[Any], Unit]
}
