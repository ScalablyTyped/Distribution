package typings.cbor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typings.cbor.cborBooleans.`true`
import typings.cbor.cborStrings.float
import typings.cbor.cborStrings.int
import typings.cbor.cborStrings.number
import typings.cbor.cborStrings.string
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.ArrayBufferView
import typings.std.Error
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cbor", "Commented")
  @js.native
  class Commented () extends Transform {
    def this(options: CommentedOptions) = this()
  }
  /* static members */
  object Commented {
    
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String, options: String): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String, options: String, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String, options: CommentOptions): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: String, options: CommentOptions, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer, options: String): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer, options: String, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer, options: CommentOptions): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: Buffer, options: CommentOptions, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView, options: String): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView, options: String, cb: commentCallback): Unit = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView, options: CommentOptions): js.Promise[String] = js.native
    @JSImport("cbor", "Commented.comment")
    @js.native
    def comment(input: ArrayBufferView, options: CommentOptions, cb: commentCallback): Unit = js.native
  }
  
  @JSImport("cbor", "Decoder")
  @js.native
  class Decoder () extends Transform {
    def this(options: DecoderOptions) = this()
  }
  /* static members */
  object Decoder {
    
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String, options: String, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: String, options: DecodeOptions, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer, options: String, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: Buffer, options: DecodeOptions, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView, options: String, cb: decodeAllCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeAll")
    @js.native
    def decodeAll(input: ArrayBufferView, options: DecodeOptions, cb: decodeAllCallback): Unit = js.native
    
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: String): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: String, options: String): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: String, options: DecodeOptions): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: Buffer): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: Buffer, options: String): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: Buffer, options: DecodeOptions): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: ArrayBufferView): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: ArrayBufferView, options: String): js.Array[_] = js.native
    @JSImport("cbor", "Decoder.decodeAllSync")
    @js.native
    def decodeAllSync(input: ArrayBufferView, options: DecodeOptions): js.Array[_] = js.native
    
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String, options: String, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: String, options: DecodeOptions, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer, options: String, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: Buffer, options: DecodeOptions, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView, options: String): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView, options: String, cb: decodeCallback): Unit = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView, options: DecodeOptions): js.Promise[_] = js.native
    @JSImport("cbor", "Decoder.decodeFirst")
    @js.native
    def decodeFirst(input: ArrayBufferView, options: DecodeOptions, cb: decodeCallback): Unit = js.native
    
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: String): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: String, options: String): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: String, options: DecodeOptions): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: Buffer): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: Buffer, options: String): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: Buffer, options: DecodeOptions): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: ArrayBufferView): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: ArrayBufferView, options: String): js.Any = js.native
    @JSImport("cbor", "Decoder.decodeFirstSync")
    @js.native
    def decodeFirstSync(input: ArrayBufferView, options: DecodeOptions): js.Any = js.native
    
    @JSImport("cbor", "Decoder.nullcheck")
    @js.native
    def nullcheck(`val`: js.Any): js.Any = js.native
  }
  
  @JSImport("cbor", "Diagnose")
  @js.native
  class Diagnose () extends Transform {
    def this(options: DiagnoseOptions) = this()
  }
  /* static members */
  object Diagnose {
    
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: String): js.Promise[String] = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: String, cb: diagnoseCallback): Unit = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: String, encoding: String): js.Promise[String] = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: Buffer): js.Promise[String] = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: Buffer, cb: diagnoseCallback): Unit = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: Buffer, encoding: String): js.Promise[String] = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: ArrayBufferView): js.Promise[String] = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: ArrayBufferView, cb: diagnoseCallback): Unit = js.native
    @JSImport("cbor", "Diagnose.diagnose")
    @js.native
    def diagnose(input: ArrayBufferView, encoding: String): js.Promise[String] = js.native
  }
  
  @JSImport("cbor", "Encoder")
  @js.native
  class Encoder () extends Transform {
    def this(options: EncoderOptions) = this()
    
    def addSemanticType[T](
      `type`: Instantiable1[/* args (repeated) */ js.Any, T],
      encodeFunction: js.Function2[/* encoder */ this.type, /* t */ T, Boolean]
    ): js.Function2[/* encoder */ this.type, /* t */ T, Boolean | Null] = js.native
    
    def pushAny(input: js.Any): Boolean = js.native
    
    def removeLoopDetectors(obj: js.Any): Boolean = js.native
  }
  /* static members */
  object Encoder {
    
    @JSImport("cbor", "Encoder.encode")
    @js.native
    def encode(objs: js.Any*): Buffer | ArrayBufferView = js.native
    
    @JSImport("cbor", "Encoder.encodeAsync")
    @js.native
    def encodeAsync(obj: js.Any): js.Promise[Buffer | ArrayBufferView] = js.native
    @JSImport("cbor", "Encoder.encodeAsync")
    @js.native
    def encodeAsync(obj: js.Any, options: EncoderOptions): js.Promise[Buffer | ArrayBufferView] = js.native
    
    @JSImport("cbor", "Encoder.encodeCanonical")
    @js.native
    def encodeCanonical(objs: js.Any*): Buffer | ArrayBufferView = js.native
    
    @JSImport("cbor", "Encoder.encodeOne")
    @js.native
    def encodeOne(obj: js.Any): Buffer | ArrayBufferView = js.native
    @JSImport("cbor", "Encoder.encodeOne")
    @js.native
    def encodeOne(obj: js.Any, options: EncoderOptions): Buffer | ArrayBufferView = js.native
  }
  
  @JSImport("cbor", "Map")
  @js.native
  class Map protected () extends CborMap {
    def this(iterable: Iterable[js.Tuple2[_, _]]) = this()
  }
  
  @JSImport("cbor", "Simple")
  @js.native
  class Simple protected () extends StObject {
    def this(value: Double) = this()
    
    def encodeCBOR(gen: Encoder): Boolean = js.native
  }
  /* static members */
  object Simple {
    
    @JSImport("cbor", "Simple.decode")
    @js.native
    def decode(`val`: Double): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    @JSImport("cbor", "Simple.decode")
    @js.native
    def decode(`val`: Double, has_parent: js.UndefOr[scala.Nothing], parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    @JSImport("cbor", "Simple.decode")
    @js.native
    def decode(`val`: Double, has_parent: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    @JSImport("cbor", "Simple.decode")
    @js.native
    def decode(`val`: Double, has_parent: Boolean, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
    
    @JSImport("cbor", "Simple.isSimple")
    @js.native
    def isSimple(obj: js.Any): Boolean = js.native
  }
  
  @JSImport("cbor", "Tagged")
  @js.native
  class Tagged protected () extends StObject {
    def this(tag: Double) = this()
    def this(tag: Double, value: js.Any) = this()
    def this(tag: Double, value: js.UndefOr[scala.Nothing], err: Error) = this()
    def this(tag: Double, value: js.Any, err: Error) = this()
    
    def convert(): js.Any = js.native
    def convert(converters: NumberDictionary[js.Function1[/* val */ js.Any, _]]): js.Any = js.native
    
    def encodeCBOR(gen: Encoder): Boolean = js.native
  }
  
  @JSImport("cbor", "comment")
  @js.native
  val comment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Commented.comment */ js.Any = js.native
  
  @JSImport("cbor", "decode")
  @js.native
  val decode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Decoder.decodeFirstSync */ js.Any = js.native
  
  @JSImport("cbor", "decodeAll")
  @js.native
  val decodeAll: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Decoder.decodeAll */ js.Any = js.native
  
  @JSImport("cbor", "decodeAllSync")
  @js.native
  val decodeAllSync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Decoder.decodeAllSync */ js.Any = js.native
  
  @JSImport("cbor", "decodeFirst")
  @js.native
  val decodeFirst: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Decoder.decodeFirst */ js.Any = js.native
  
  @JSImport("cbor", "decodeFirstSync")
  @js.native
  val decodeFirstSync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Decoder.decodeFirstSync */ js.Any = js.native
  
  @JSImport("cbor", "encode")
  @js.native
  val encode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Encoder.encode */ js.Any = js.native
  
  @JSImport("cbor", "encodeAsync")
  @js.native
  val encodeAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Encoder.encodeAsync */ js.Any = js.native
  
  @JSImport("cbor", "encodeCanonical")
  @js.native
  val encodeCanonical: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Encoder.encodeCanonical */ js.Any = js.native
  
  @JSImport("cbor", "encodeOne")
  @js.native
  val encodeOne: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Encoder.encodeOne */ js.Any = js.native
  
  object leveldb {
    
    @JSImport("cbor", "leveldb.buffer")
    @js.native
    val buffer: `true` = js.native
    
    @JSImport("cbor", "leveldb.decode")
    @js.native
    val decode: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Decoder.decodeAllSync */ js.Any = js.native
    
    @JSImport("cbor", "leveldb.encode")
    @js.native
    val encode: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof Encoder.encode */ js.Any = js.native
    
    @JSImport("cbor", "leveldb.name")
    @js.native
    val name: typings.cbor.cborStrings.cbor = js.native
  }
  
  @js.native
  trait CborMap
    extends typings.std.Map[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for K */ js.Any, 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for V */ js.Any
        ] {
    
    def encodeCBOR(gen: Encoder): Boolean = js.native
  }
  
  @js.native
  trait CommentOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var max_depth: js.UndefOr[Double] = js.native
  }
  object CommentOptions {
    
    @scala.inline
    def apply(): CommentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentOptions]
    }
    
    @scala.inline
    implicit class CommentOptionsMutableBuilder[Self <: CommentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
    }
  }
  
  @js.native
  trait CommentedOptions extends TransformOptions {
    
    var max_depth: js.UndefOr[Double] = js.native
  }
  object CommentedOptions {
    
    @scala.inline
    def apply(): CommentedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentedOptions]
    }
    
    @scala.inline
    implicit class CommentedOptionsMutableBuilder[Self <: CommentedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
    }
  }
  
  @js.native
  trait DecodeOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
  }
  object DecodeOptions {
    
    @scala.inline
    def apply(): DecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptions]
    }
    
    @scala.inline
    implicit class DecodeOptionsMutableBuilder[Self <: DecodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  @js.native
  trait DecoderOptions extends TransformOptions {
    
    var bigint: js.UndefOr[Boolean] = js.native
    
    var max_depth: js.UndefOr[Double] = js.native
    
    var tags: js.UndefOr[NumberDictionary[js.Function1[/* v */ js.Any, _]]] = js.native
  }
  object DecoderOptions {
    
    @scala.inline
    def apply(): DecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecoderOptions]
    }
    
    @scala.inline
    implicit class DecoderOptionsMutableBuilder[Self <: DecoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setTags(value: NumberDictionary[js.Function1[/* v */ js.Any, _]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait DiagnoseOptions extends TransformOptions {
    
    var max_depth: js.UndefOr[Double] = js.native
    
    var separator: js.UndefOr[String] = js.native
    
    var stream_errors: js.UndefOr[Boolean] = js.native
  }
  object DiagnoseOptions {
    
    @scala.inline
    def apply(): DiagnoseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnoseOptions]
    }
    
    @scala.inline
    implicit class DiagnoseOptionsMutableBuilder[Self <: DiagnoseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStream_errors(value: Boolean): Self = StObject.set(x, "stream_errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream_errorsUndefined: Self = StObject.set(x, "stream_errors", js.undefined)
    }
  }
  
  @js.native
  trait EncoderOptions extends TransformOptions {
    
    var canonical: js.UndefOr[Boolean] = js.native
    
    var dateType: js.UndefOr[number | float | int | string] = js.native
    
    var detectLoops: js.UndefOr[Boolean | js.Symbol] = js.native
    
    var disallowUndefinedKeys: js.UndefOr[Boolean] = js.native
    
    var encodeUndefined: js.UndefOr[js.Any] = js.native
    
    var genTypes: js.UndefOr[js.Array[_]] = js.native
  }
  object EncoderOptions {
    
    @scala.inline
    def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    @scala.inline
    implicit class EncoderOptionsMutableBuilder[Self <: EncoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      @scala.inline
      def setDateType(value: number | float | int | string): Self = StObject.set(x, "dateType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTypeUndefined: Self = StObject.set(x, "dateType", js.undefined)
      
      @scala.inline
      def setDetectLoops(value: Boolean | js.Symbol): Self = StObject.set(x, "detectLoops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectLoopsUndefined: Self = StObject.set(x, "detectLoops", js.undefined)
      
      @scala.inline
      def setDisallowUndefinedKeys(value: Boolean): Self = StObject.set(x, "disallowUndefinedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowUndefinedKeysUndefined: Self = StObject.set(x, "disallowUndefinedKeys", js.undefined)
      
      @scala.inline
      def setEncodeUndefined(value: js.Any): Self = StObject.set(x, "encodeUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeUndefinedUndefined: Self = StObject.set(x, "encodeUndefined", js.undefined)
      
      @scala.inline
      def setGenTypes(value: js.Array[_]): Self = StObject.set(x, "genTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenTypesUndefined: Self = StObject.set(x, "genTypes", js.undefined)
      
      @scala.inline
      def setGenTypesVarargs(value: js.Any*): Self = StObject.set(x, "genTypes", js.Array(value :_*))
    }
  }
  
  type commentCallback = js.Function2[/* error */ js.UndefOr[Error], /* commented */ js.UndefOr[String], Unit]
  
  type decodeAllCallback = js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[js.Array[js.Any]], Unit]
  
  type decodeCallback = js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[js.Any], Unit]
  
  type diagnoseCallback = js.Function2[/* error */ js.UndefOr[Error], /* str */ js.UndefOr[String], Unit]
}
