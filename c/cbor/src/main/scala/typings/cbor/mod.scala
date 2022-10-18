package typings.cbor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.buffer.mod.Buffer
import typings.cbor.anon.TypeofimportedCommented
import typings.cbor.anon.TypeofimportedDecoder
import typings.cbor.anon.TypeofimportedDiagnose
import typings.cbor.anon.TypeofimportedEncoder
import typings.cbor.anon.TypeofimportedMap
import typings.cbor.anon.TypeofimportedSimple
import typings.cbor.anon.TypeofimportedTagged
import typings.cbor.typesLibCommentedMod.CommentOptions
import typings.cbor.typesLibCommentedMod.commentCallback
import typings.cbor.typesLibDecoderMod.BufferLike
import typings.cbor.typesLibDecoderMod.DecoderOptions
import typings.cbor.typesLibDecoderMod.ExtendedResults
import typings.cbor.typesLibDecoderMod.decodeCallback
import typings.cbor.typesLibDiagnoseMod.DiagnoseOptions
import typings.cbor.typesLibDiagnoseMod.diagnoseCallback
import typings.cbor.typesLibEncoderMod.EncodingOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cbor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Commented")
  @js.native
  def Commented: (Instantiable1[/* options */ js.UndefOr[CommentOptions], typings.cbor.typesLibCommentedMod.^]) & TypeofimportedCommented = js.native
  inline def Commented_=(
    x: (Instantiable1[/* options */ js.UndefOr[CommentOptions], typings.cbor.typesLibCommentedMod.^]) & TypeofimportedCommented
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Commented")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Decoder")
  @js.native
  def Decoder: (Instantiable1[/* options */ js.UndefOr[DecoderOptions], typings.cbor.typesLibDecoderMod.^]) & TypeofimportedDecoder = js.native
  inline def Decoder_=(
    x: (Instantiable1[/* options */ js.UndefOr[DecoderOptions], typings.cbor.typesLibDecoderMod.^]) & TypeofimportedDecoder
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decoder")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  
  @JSImport("cbor", "Diagnose")
  @js.native
  def Diagnose_ : (Instantiable1[/* options */ js.UndefOr[DiagnoseOptions], typings.cbor.typesLibDiagnoseMod.^]) & TypeofimportedDiagnose = js.native
  
  inline def Diagnose__=(
    x: (Instantiable1[/* options */ js.UndefOr[DiagnoseOptions], typings.cbor.typesLibDiagnoseMod.^]) & TypeofimportedDiagnose
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Diagnose")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Encoder")
  @js.native
  def Encoder: (Instantiable1[/* options */ js.UndefOr[EncodingOptions], typings.cbor.typesLibEncoderMod.^]) & TypeofimportedEncoder = js.native
  inline def Encoder_=(
    x: (Instantiable1[/* options */ js.UndefOr[EncodingOptions], typings.cbor.typesLibEncoderMod.^]) & TypeofimportedEncoder
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Encoder")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Map")
  @js.native
  def Map: (Instantiable1[/* iterable */ js.UndefOr[js.Iterable[Any]], typings.cbor.typesLibMapMod.^]) & TypeofimportedMap = js.native
  inline def Map_=(
    x: (Instantiable1[/* iterable */ js.UndefOr[js.Iterable[Any]], typings.cbor.typesLibMapMod.^]) & TypeofimportedMap
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Simple")
  @js.native
  def Simple: (Instantiable1[/* value */ Double, typings.cbor.typesLibSimpleMod.^]) & TypeofimportedSimple = js.native
  inline def Simple_=(x: (Instantiable1[/* value */ Double, typings.cbor.typesLibSimpleMod.^]) & TypeofimportedSimple): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Simple")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
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
  @JSImport("cbor", "Tagged")
  @js.native
  def Tagged: (Instantiable3[
    /* tag */ Double, 
    /* value */ Any, 
    /* err */ js.UndefOr[js.Error], 
    typings.cbor.typesLibTaggedMod.^
  ]) & TypeofimportedTagged = js.native
  inline def Tagged_=(
    x: (Instantiable3[
      /* tag */ Double, 
      /* value */ Any, 
      /* err */ js.UndefOr[js.Error], 
      typings.cbor.typesLibTaggedMod.^
    ]) & TypeofimportedTagged
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tagged")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "comment")
  @js.native
  def comment: js.Function3[
    /* input */ String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable, 
    /* options */ js.UndefOr[CommentOptions | commentCallback | String | Double], 
    /* cb */ js.UndefOr[commentCallback], 
    js.Promise[Any]
  ] = js.native
  inline def comment_=(
    x: js.Function3[
      /* input */ String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable, 
      /* options */ js.UndefOr[CommentOptions | commentCallback | String | Double], 
      /* cb */ js.UndefOr[commentCallback], 
      js.Promise[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comment")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "decode")
  @js.native
  def decode: js.Function2[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | String], 
    ExtendedResults | Any
  ] = js.native
  
  @JSImport("cbor", "decodeAll")
  @js.native
  def decodeAll: js.Function3[
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
  def decodeAllSync: js.Function2[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | String], 
    js.Array[Any | ExtendedResults]
  ] = js.native
  inline def decodeAllSync_=(
    x: js.Function2[
      /* input */ BufferLike, 
      /* options */ js.UndefOr[DecoderOptions | String], 
      js.Array[Any | ExtendedResults]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeAllSync")(x.asInstanceOf[js.Any])
  
  inline def decodeAll_=(
    x: js.Function3[
      /* input */ BufferLike, 
      /* options */ js.UndefOr[
        String | DecoderOptions | (js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any])
      ], 
      /* cb */ js.UndefOr[
        js.Function2[/* error */ js.Error, /* value */ js.Array[Any | ExtendedResults], Any]
      ], 
      js.Promise[js.Array[Any | ExtendedResults]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeAll")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "decodeFirst")
  @js.native
  def decodeFirst: js.Function3[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | decodeCallback | String], 
    /* cb */ js.UndefOr[decodeCallback], 
    js.Promise[ExtendedResults | Any]
  ] = js.native
  
  @JSImport("cbor", "decodeFirstSync")
  @js.native
  def decodeFirstSync: js.Function2[
    /* input */ BufferLike, 
    /* options */ js.UndefOr[DecoderOptions | String], 
    ExtendedResults | Any
  ] = js.native
  inline def decodeFirstSync_=(
    x: js.Function2[
      /* input */ BufferLike, 
      /* options */ js.UndefOr[DecoderOptions | String], 
      ExtendedResults | Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFirstSync")(x.asInstanceOf[js.Any])
  
  inline def decodeFirst_=(
    x: js.Function3[
      /* input */ BufferLike, 
      /* options */ js.UndefOr[DecoderOptions | decodeCallback | String], 
      /* cb */ js.UndefOr[decodeCallback], 
      js.Promise[ExtendedResults | Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeFirst")(x.asInstanceOf[js.Any])
  
  inline def decode_=(
    x: js.Function2[
      /* input */ BufferLike, 
      /* options */ js.UndefOr[DecoderOptions | String], 
      ExtendedResults | Any
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "diagnose")
  @js.native
  def diagnose: js.Function3[
    /* input */ typings.cbor.typesLibDiagnoseMod.BufferLike, 
    /* options */ js.UndefOr[DiagnoseOptions | diagnoseCallback | String], 
    /* cb */ js.UndefOr[diagnoseCallback], 
    js.Promise[Any]
  ] = js.native
  inline def diagnose_=(
    x: js.Function3[
      /* input */ typings.cbor.typesLibDiagnoseMod.BufferLike, 
      /* options */ js.UndefOr[DiagnoseOptions | diagnoseCallback | String], 
      /* cb */ js.UndefOr[diagnoseCallback], 
      js.Promise[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diagnose")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "encode")
  @js.native
  def encode: js.Function1[/* repeated */ Any, Buffer] = js.native
  
  @JSImport("cbor", "encodeAsync")
  @js.native
  def encodeAsync: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], js.Promise[Buffer]] = js.native
  inline def encodeAsync_=(x: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], js.Promise[Buffer]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeAsync")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "encodeCanonical")
  @js.native
  def encodeCanonical: js.Function1[/* repeated */ Any, Buffer] = js.native
  inline def encodeCanonical_=(x: js.Function1[/* repeated */ Any, Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeCanonical")(x.asInstanceOf[js.Any])
  
  @JSImport("cbor", "encodeOne")
  @js.native
  def encodeOne: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], Buffer] = js.native
  inline def encodeOne_=(x: js.Function2[/* obj */ Any, /* options */ js.UndefOr[EncodingOptions], Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeOne")(x.asInstanceOf[js.Any])
  
  inline def encode_=(x: js.Function1[/* repeated */ Any, Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
  
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
    /* was `typeof imported_decoder.decodeFirstSync` */
    inline def decode(input: BufferLike): ExtendedResults | Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[ExtendedResults | Any]
    inline def decode(input: BufferLike, options: String): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    inline def decode(input: BufferLike, options: DecoderOptions): ExtendedResults | Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtendedResults | Any]
    
    /**
      * Encode one or more JavaScript objects, and return a Buffer containing the
      * CBOR bytes.
      *
      * @param {...any} objs The objects to encode.
      * @returns {Buffer} The encoded objects.
      */
    /* static member */
    /* was `typeof imported_encoder.encode` */
    inline def encode(objs: Any*): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Buffer]
    
    @JSImport("cbor", "leveldb.name")
    @js.native
    val name: String = js.native
  }
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
}
