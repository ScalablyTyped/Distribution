package typings.cbor

import typings.buffer.mod.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCommentedMod {
  
  /**
    * Generate the expanded format of RFC 8949, section 3.2.2.
    *
    * @extends stream.Transform
    */
  @JSImport("cbor/types/lib/commented", JSImport.Namespace)
  @js.native
  /**
    * Create a CBOR commenter.
    *
    * @param {CommentOptions} [options={}] Stream options.
    */
  open class ^ () extends Commented {
    def this(options: CommentOptions) = this()
  }
  @JSImport("cbor/types/lib/commented", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def comment(
    input: String | Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.DataView | Readable,
    options: js.UndefOr[CommentOptions | commentCallback | String | Double],
    cb: js.UndefOr[commentCallback]
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("comment")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait CommentOptions extends StObject {
    
    /**
      * Initial indentation depth.
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Encoding to use for input, if it
      * is a string.
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * How many times to indent
      * the dashes.
      */
    var max_depth: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, omit the summary
      * of the full bytes read at the end.
      */
    var no_summary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, prefer Uint8Arrays to
      * be generated instead of node Buffers.  This might turn on some more
      * changes in the future, so forward-compatibility is not guaranteed yet.
      */
    var preferWeb: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Mapping from tag number to function(v),
      * where v is the decoded value that comes after the tag, and where the
      * function returns the correctly-created value for that tag.
      */
    var tags: js.UndefOr[js.Object] = js.undefined
  }
  object CommentOptions {
    
    inline def apply(): CommentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentOptions]
    }
    
    extension [Self <: CommentOptions](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMax_depth(value: Double): Self = StObject.set(x, "max_depth", value.asInstanceOf[js.Any])
      
      inline def setMax_depthUndefined: Self = StObject.set(x, "max_depth", js.undefined)
      
      inline def setNo_summary(value: Boolean): Self = StObject.set(x, "no_summary", value.asInstanceOf[js.Any])
      
      inline def setNo_summaryUndefined: Self = StObject.set(x, "no_summary", js.undefined)
      
      inline def setPreferWeb(value: Boolean): Self = StObject.set(x, "preferWeb", value.asInstanceOf[js.Any])
      
      inline def setPreferWebUndefined: Self = StObject.set(x, "preferWeb", js.undefined)
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  /**
    * Generate the expanded format of RFC 8949, section 3.2.2.
    *
    * @extends stream.Transform
    */
  @js.native
  trait Commented extends Transform {
    
    /**
      * @ignore
      */
    def _on_data(): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_error(er: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_more(mt: Any, len: Any, parent_mt: Any, pos: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_read(buf: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_start(mt: Any, tag: Any, parent_mt: Any, pos: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_start_string(mt: Any, len: Any, parent_mt: Any, pos: Any): Unit = js.native
    
    /**
      * @ignore
      */
    def _on_stop(mt: Any): Unit = js.native
    
    /**
      * @private
      */
    /* private */ var _on_value: Any = js.native
    
    /**
      * @param {Buffer} v Descend into embedded CBOR.
      * @private
      */
    /* private */ var _tag_24: Any = js.native
    
    var all: typings.nofilter.mod.^ = js.native
    
    var depth: Double = js.native
    
    var max_depth: Double = js.native
    
    var parser: typings.cbor.typesLibDecoderMod.^ = js.native
  }
  
  type commentCallback = js.Function2[/* error */ js.UndefOr[js.Error], /* commented */ js.UndefOr[String], Unit]
}
