package typings.cbor

import typings.buffer.mod.Buffer
import typings.cbor.typesLibCommentedMod.CommentOptions
import typings.cbor.typesLibCommentedMod.commentCallback
import typings.cbor.typesLibDecoderMod.BufferLike
import typings.cbor.typesLibDecoderMod.DecoderOptions
import typings.cbor.typesLibDecoderMod.ExtendedResults
import typings.cbor.typesLibDecoderMod.decodeCallback
import typings.cbor.typesLibDiagnoseMod.DiagnoseOptions
import typings.cbor.typesLibDiagnoseMod.diagnoseCallback
import typings.cbor.typesLibEncoderMod.Encoder
import typings.cbor.typesLibEncoderMod.EncodingOptions
import typings.cbor.typesLibSimpleMod.Simple
import typings.node.NodeJS.TypedArray
import typings.node.streamMod.Readable
import typings.nofilter.mod.^
import typings.std.Map
import typings.std.Set
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Indefinite extends StObject {
    
    var indefinite: js.UndefOr[Boolean] = js.undefined
  }
  object Indefinite {
    
    inline def apply(): Indefinite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indefinite]
    }
    
    extension [Self <: Indefinite](x: Self) {
      
      inline def setIndefinite(value: Boolean): Self = StObject.set(x, "indefinite", value.asInstanceOf[js.Any])
      
      inline def setIndefiniteUndefined: Self = StObject.set(x, "indefinite", js.undefined)
    }
  }
  
  trait TypeofimportedCommented extends StObject {
    
    /**
      * Comment on an input Buffer or string, creating a string passed to the
      * callback.  If callback not specified, a promise is returned.
      *
      * @static
      * @param {string|Buffer|ArrayBuffer|Uint8Array|Uint8ClampedArray
      *   |DataView|stream.Readable} input Something to parse.
      * @param {CommentOptions|commentCallback|string|number} [options={}]
      *   Encoding, max_depth, or callback.
      * @param {commentCallback} [cb] If specified, called on completion.
      * @returns {Promise} If cb not specified.
      * @throws {Error} Input required.
      */
    /* static member */
    def comment(
      input: String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable,
      options: js.UndefOr[CommentOptions | commentCallback | String | Double],
      cb: js.UndefOr[commentCallback]
    ): js.Promise[Any]
  }
  object TypeofimportedCommented {
    
    inline def apply(
      comment: (String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable, js.UndefOr[CommentOptions | commentCallback | String | Double], js.UndefOr[commentCallback]) => js.Promise[Any]
    ): TypeofimportedCommented = {
      val __obj = js.Dynamic.literal(comment = js.Any.fromFunction3(comment))
      __obj.asInstanceOf[TypeofimportedCommented]
    }
    
    extension [Self <: TypeofimportedCommented](x: Self) {
      
      inline def setComment(
        value: (String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable, js.UndefOr[CommentOptions | commentCallback | String | Double], js.UndefOr[commentCallback]) => js.Promise[Any]
      ): Self = StObject.set(x, "comment", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait TypeofimportedDecoder extends StObject {
    
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
    def decodeAll(input: BufferLike): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(input: BufferLike, options: String): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(
      input: BufferLike,
      options: String,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(
      input: BufferLike,
      options: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(
      input: BufferLike,
      options: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any],
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(
      input: BufferLike,
      options: Unit,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(input: BufferLike, options: DecoderOptions): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    def decodeAll(
      input: BufferLike,
      options: DecoderOptions,
      cb: js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
    ): js.Promise[js.Array[Any | ExtendedResults]] = js.native
    
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
    def decodeAllSync(input: BufferLike): js.Array[Any | ExtendedResults] = js.native
    def decodeAllSync(input: BufferLike, options: String): js.Array[Any | ExtendedResults] = js.native
    def decodeAllSync(input: BufferLike, options: DecoderOptions): js.Array[Any | ExtendedResults] = js.native
    
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
    def decodeFirst(input: BufferLike): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: String): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: String, cb: decodeCallback): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: Unit, cb: decodeCallback): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: DecoderOptions): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: DecoderOptions, cb: decodeCallback): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: decodeCallback): js.Promise[ExtendedResults | Any] = js.native
    def decodeFirst(input: BufferLike, options: decodeCallback, cb: decodeCallback): js.Promise[ExtendedResults | Any] = js.native
    
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
    def decodeFirstSync(input: BufferLike): ExtendedResults | Any = js.native
    def decodeFirstSync(input: BufferLike, options: String): ExtendedResults | Any = js.native
    def decodeFirstSync(input: BufferLike, options: DecoderOptions): ExtendedResults | Any = js.native
    
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
    def nullcheck(`val`: Any): Any = js.native
  }
  
  @js.native
  trait TypeofimportedDiagnose extends StObject {
    
    /**
      * Convenience function to return a string in diagnostic format.
      *
      * @param {BufferLike} input The CBOR bytes to format.
      * @param {DiagnoseOptions |diagnoseCallback|string} [options={}]
      *   Options, the callback, or the input encoding.
      * @param {diagnoseCallback} [cb] Callback.
      * @throws {TypeError} Input not provided.
      * @returns {Promise} If callback not specified.
      */
    /* static member */
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: String): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: String, cb: diagnoseCallback): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: Unit, cb: diagnoseCallback): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: DiagnoseOptions): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: DiagnoseOptions, cb: diagnoseCallback): js.Promise[Any] = js.native
    def diagnose(input: typings.cbor.typesLibDiagnoseMod.BufferLike, options: diagnoseCallback): js.Promise[Any] = js.native
    def diagnose(
      input: typings.cbor.typesLibDiagnoseMod.BufferLike,
      options: diagnoseCallback,
      cb: diagnoseCallback
    ): js.Promise[Any] = js.native
  }
  
  @js.native
  trait TypeofimportedEncoder extends StObject {
    
    /**
      * @param {Encoder} gen Encoder.
      * @param { ArrayBuffer } obj Array to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushArrayBuffer(gen: Encoder, obj: js.typedarray.ArrayBuffer): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {object} obj Boxed String, Number, or Boolean object to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushBoxed(gen: Encoder, obj: js.Object): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Buffer} obj Buffer to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushBuffer(gen: Encoder, obj: Buffer): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Date} obj Date to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushDate(gen: Encoder, obj: js.Date): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Map} obj Map to encode.
      * @returns {boolean} True on success.
      * @throws {Error} Map key that is undefined.
      * @ignore
      */
    /* static member */
    def _pushMap(gen: Encoder, obj: Map[Any, Any], opts: Any): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {NoFilter} obj Buffer to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushNoFilter(gen: Encoder, obj: ^): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {RegExp} obj RegExp to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushRegexp(gen: Encoder, obj: js.RegExp): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {Set} obj Set to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushSet(gen: Encoder, obj: Set[Any]): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {NodeJS.TypedArray} obj Array to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushTypedArray(gen: Encoder, obj: TypedArray): Boolean = js.native
    
    /**
      * @param {Encoder} gen Encoder.
      * @param {URL} obj URL to encode.
      * @returns {boolean} True on success.
      * @ignore
      */
    /* static member */
    def _pushURL(gen: Encoder, obj: URL): Boolean = js.native
    
    /**
      * Encode one or more JavaScript objects, and return a Buffer containing the
      * CBOR bytes.
      *
      * @param {...any} objs The objects to encode.
      * @returns {Buffer} The encoded objects.
      */
    /* static member */
    def encode(objs: Any*): Buffer = js.native
    
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
    def encodeAsync(obj: Any): js.Promise[Buffer] = js.native
    def encodeAsync(obj: Any, options: EncodingOptions): js.Promise[Buffer] = js.native
    
    /**
      * Encode one or more JavaScript objects canonically (slower!), and return
      * a Buffer containing the CBOR bytes.
      *
      * @param {...any} objs The objects to encode.
      * @returns {Buffer} The encoded objects.
      */
    /* static member */
    def encodeCanonical(objs: Any*): Buffer = js.native
    
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
    def encodeIndefinite(gen: Encoder): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: String): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: String, options: EncodingOptions): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: js.Array[Any]): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: js.Array[Any], options: EncodingOptions): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: js.Object): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: js.Object, options: EncodingOptions): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: Unit, options: EncodingOptions): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: Buffer): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: Buffer, options: EncodingOptions): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: Map[Any, Any]): Boolean = js.native
    def encodeIndefinite(gen: Encoder, obj: Map[Any, Any], options: EncodingOptions): Boolean = js.native
    
    /**
      * Encode one JavaScript object using the given options.
      *
      * @static
      * @param {any} obj The object to encode.
      * @param {EncodingOptions} [options={}] Passed to the Encoder constructor.
      * @returns {Buffer} The encoded objects.
      */
    /* static member */
    def encodeOne(obj: Any): Buffer = js.native
    def encodeOne(obj: Any, options: EncodingOptions): Buffer = js.native
    
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
    def pushArray(gen: Encoder, obj: js.Array[Any]): Boolean = js.native
    def pushArray(gen: Encoder, obj: js.Array[Any], opts: Indefinite): Boolean = js.native
    
    /**
      * Reset the supported semantic types to the original set, before any
      * plugins modified the list.
      */
    /* static member */
    def reset(): Unit = js.native
  }
  
  trait TypeofimportedMap extends StObject {
    
    /**
      * @ignore
      */
    /* static member */
    def _decode(key: Any): Any
    
    /**
      * @ignore
      */
    /* static member */
    def _encode(key: Any): String
  }
  object TypeofimportedMap {
    
    inline def apply(_decode: Any => Any, _encode: Any => String): TypeofimportedMap = {
      val __obj = js.Dynamic.literal(_decode = js.Any.fromFunction1(_decode), _encode = js.Any.fromFunction1(_encode))
      __obj.asInstanceOf[TypeofimportedMap]
    }
    
    extension [Self <: TypeofimportedMap](x: Self) {
      
      inline def set_decode(value: Any => Any): Self = StObject.set(x, "_decode", js.Any.fromFunction1(value))
      
      inline def set_encode(value: Any => String): Self = StObject.set(x, "_encode", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofimportedSimple extends StObject {
    
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
    def decode(`val`: Double): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    def decode(`val`: Double, has_parent: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    def decode(`val`: Double, has_parent: Boolean, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    def decode(`val`: Double, has_parent: Unit, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    
    /**
      * Is the given object a Simple?
      *
      * @param {any} obj Object to test.
      * @returns {boolean} Is it Simple?
      */
    /* static member */
    def isSimple(obj: Any): Boolean = js.native
  }
  
  trait TypeofimportedTagged extends StObject {
    
    val INTERNAL_JSON: js.Symbol
    
    /**
      * Reset the supported tags to the original set, before any plugins modified
      * the list.
      */
    /* static member */
    def reset(): Unit
  }
  object TypeofimportedTagged {
    
    inline def apply(INTERNAL_JSON: js.Symbol, reset: () => Unit): TypeofimportedTagged = {
      val __obj = js.Dynamic.literal(INTERNAL_JSON = INTERNAL_JSON.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[TypeofimportedTagged]
    }
    
    extension [Self <: TypeofimportedTagged](x: Self) {
      
      inline def setINTERNAL_JSON(value: js.Symbol): Self = StObject.set(x, "INTERNAL_JSON", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
}
