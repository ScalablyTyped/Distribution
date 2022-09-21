package typings.cbor

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnoseMod {
  
  /**
    * Output the diagnostic format from a stream of CBOR bytes.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor/types/lib/diagnose", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of Diagnose.
    *
    * @param {DiagnoseOptions} [options={}] Options for creation.
    */
  open class ^ () extends Diagnose_ {
    def this(options: DiagnoseOptions) = this()
  }
  @JSImport("cbor/types/lib/diagnose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def diagnose(input: BufferLike): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: String, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: Unit, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: DiagnoseOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: DiagnoseOptions, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def diagnose(input: BufferLike, options: diagnoseCallback, cb: diagnoseCallback): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("diagnose")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /**
    * Things that can act as inputs, from which a NoFilter can be created.
    */
  type BufferLike = String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable
  
  trait DiagnoseOptions extends StObject {
    
    /**
      * The encoding of input, ignored if
      * input is not string.
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
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
      * Output between detected objects.
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Put error info into the
      * output stream.
      */
    var stream_errors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mapping from tag number to function(v),
      * where v is the decoded value that comes after the tag, and where the
      * function returns the correctly-created value for that tag.
      */
    var tags: js.UndefOr[js.Object] = js.undefined
  }
  object DiagnoseOptions {
    
    inline def apply(): DiagnoseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiagnoseOptions]
    }
    
    extension [Self <: DiagnoseOptions](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setPreferWeb(value: Boolean): Self = StObject.set(x, "preferWeb", value.asInstanceOf[js.Any])
      
      inline def setPreferWebUndefined: Self = StObject.set(x, "preferWeb", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStream_errors(value: Boolean): Self = StObject.set(x, "stream_errors", value.asInstanceOf[js.Any])
      
      inline def setStream_errorsUndefined: Self = StObject.set(x, "stream_errors", js.undefined)
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /**
    * Output the diagnostic format from a stream of CBOR bytes.
    *
    * @extends stream.Transform
    */
  @js.native
  trait Diagnose_ extends Transform {
    
    /** @private */
    /* private */ var _fore: Any = js.native
    
    /** @private */
    /* private */ var _on_data: Any = js.native
    
    /**
      * @ignore
      */
    def _on_error(er: Any): Unit = js.native
    
    /** @private */
    /* private */ var _on_more: Any = js.native
    
    /** @private */
    /* private */ var _on_start: Any = js.native
    
    /** @private */
    /* private */ var _on_stop: Any = js.native
    
    /** @private */
    /* private */ var _on_value: Any = js.native
    
    var float_bytes: Double = js.native
    
    var parser: typings.cbor.decoderMod.^ = js.native
    
    var separator: String = js.native
    
    var stream_errors: Boolean = js.native
  }
  
  type diagnoseCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* value */ js.UndefOr[String], Unit]
}
