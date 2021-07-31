package typings.babelify

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(filename: String): BabelifyObject = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[BabelifyObject]
  @scala.inline
  def apply(filename: String, opts: BabelifyOptions): BabelifyObject = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelifyObject]
  
  @JSImport("babelify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babelify", "BabelifyObject")
  @js.native
  class BabelifyObject () extends Transform {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    
    def _transform(buf: String, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    def _transform(buf: Buffer, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @scala.inline
  def configure(opts: BabelifyOptions): js.Function1[/* filename */ String, BabelifyObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* filename */ String, BabelifyObject]]
  
  type BabelifyConstructor = js.Function2[/* filename */ String, /* opts */ BabelifyOptions, BabelifyObject]
  
  trait BabelifyOptions
    extends StObject
       with typings.babelCore.mod.TransformOptions {
    
    /** These are passed to babel.util.canCompile() for each filename
      * default: null
      */
    var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
      * default: false
      */
    var sourceMapsAbsolute: js.UndefOr[Boolean] = js.undefined
  }
  object BabelifyOptions {
    
    @scala.inline
    def apply(): BabelifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelifyOptions]
    }
    
    @scala.inline
    implicit class BabelifyOptionsMutableBuilder[Self <: BabelifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: String | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setSourceMapsAbsolute(value: Boolean): Self = StObject.set(x, "sourceMapsAbsolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapsAbsoluteUndefined: Self = StObject.set(x, "sourceMapsAbsolute", js.undefined)
    }
  }
}
