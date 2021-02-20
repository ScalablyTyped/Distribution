package typings.csso

import org.scalablytyped.runtime.Shortcut
import typings.cssTree.mod.CssNode
import typings.csso.anon.Ast
import typings.csso.anon.Classes
import typings.csso.anon.Typeofcsstree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("csso", JSImport.Namespace)
  @js.native
  val ^ : Csso = js.native
  
  type AfterCompressFn = js.Function2[/* compressResult */ String, /* options */ CompressOptions, Unit]
  
  type BeforeCompressFn = js.Function2[/* ast */ js.Object, /* options */ CompressOptions, Unit]
  
  @js.native
  trait CompressOptions extends StObject {
    
    /**
      * Transform a copy of input AST if true. Useful in case of AST reuse.
      * @default false
      */
    @JSName("clone")
    var clone_FCompressOptions: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify what comments to leave:
      * - 'exclamation' or true – leave all exclamation comments
      * - 'first-exclamation' – remove every comment except first one
      * - false – remove all comments
      * @default true
      */
    var comments: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Enables merging of @media rules with the same media query by splitted by other rules.
      * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
      * @default false
      */
    var forceMediaMerge: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to track every step of transformation.
      */
    var logger: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Disable or enable a structure optimisations.
      * @default true
      */
    var restructure: js.UndefOr[Boolean] = js.native
    
    /**
      * Usage data for advanced optimisations.
      */
    var usage: js.UndefOr[Usage] = js.native
  }
  object CompressOptions {
    
    @scala.inline
    def apply(): CompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressOptions]
    }
    
    @scala.inline
    implicit class CompressOptionsMutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      @scala.inline
      def setComments(value: String | Boolean): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setForceMediaMerge(value: Boolean): Self = StObject.set(x, "forceMediaMerge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceMediaMergeUndefined: Self = StObject.set(x, "forceMediaMerge", js.undefined)
      
      @scala.inline
      def setLogger(value: () => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setRestructure(value: Boolean): Self = StObject.set(x, "restructure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestructureUndefined: Self = StObject.set(x, "restructure", js.undefined)
      
      @scala.inline
      def setUsage(value: Usage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  @js.native
  trait Csso extends StObject {
    
    /**
      * Does the main task – compress an AST.
      */
    def compress(ast: CssNode): Ast = js.native
    def compress(ast: CssNode, options: CompressOptions): Ast = js.native
    
    /**
      * Minify source CSS passed as String
      * @param source
      * @param options
      */
    def minify(source: String): Result = js.native
    def minify(source: String, options: MinifyOptions with CompressOptions): Result = js.native
    
    /**
      * The same as minify() but for list of declarations. Usually it's a style attribute value.
      * @param source
      * @param options
      */
    def minifyBlock(source: String): Result = js.native
    def minifyBlock(source: String, options: MinifyOptions with CompressOptions): Result = js.native
    
    var syntax: Typeofcsstree = js.native
  }
  
  @js.native
  trait MinifyOptions extends StObject {
    
    /**
      * Called right after compress() is run.
      */
    var afterCompress: js.UndefOr[AfterCompressFn | js.Array[AfterCompressFn]] = js.native
    
    /**
      * Called right after parse is run.
      */
    var beforeCompress: js.UndefOr[BeforeCompressFn | js.Array[BeforeCompressFn]] = js.native
    
    /**
      * Output debug information to stderr.
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Filename of input CSS, uses for source map generation.
      * @default '<unknown>'
      */
    var filename: js.UndefOr[String] = js.native
    
    var restructure: js.UndefOr[Boolean] = js.native
    
    /**
      * Generate a source map when true.
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean] = js.native
  }
  object MinifyOptions {
    
    @scala.inline
    def apply(): MinifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MinifyOptions]
    }
    
    @scala.inline
    implicit class MinifyOptionsMutableBuilder[Self <: MinifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterCompress(value: AfterCompressFn | js.Array[AfterCompressFn]): Self = StObject.set(x, "afterCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterCompressFunction2(value: (/* compressResult */ String, /* options */ CompressOptions) => Unit): Self = StObject.set(x, "afterCompress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterCompressUndefined: Self = StObject.set(x, "afterCompress", js.undefined)
      
      @scala.inline
      def setAfterCompressVarargs(value: AfterCompressFn*): Self = StObject.set(x, "afterCompress", js.Array(value :_*))
      
      @scala.inline
      def setBeforeCompress(value: BeforeCompressFn | js.Array[BeforeCompressFn]): Self = StObject.set(x, "beforeCompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeCompressFunction2(value: (/* ast */ js.Object, /* options */ CompressOptions) => Unit): Self = StObject.set(x, "beforeCompress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeCompressUndefined: Self = StObject.set(x, "beforeCompress", js.undefined)
      
      @scala.inline
      def setBeforeCompressVarargs(value: BeforeCompressFn*): Self = StObject.set(x, "beforeCompress", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setRestructure(value: Boolean): Self = StObject.set(x, "restructure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestructureUndefined: Self = StObject.set(x, "restructure", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /**
      * Resulting CSS.
      */
    var css: String = js.native
    
    /**
      * Instance of SourceMapGenerator or null.
      */
    var map: js.Object | Null = js.native
  }
  object Result {
    
    @scala.inline
    def apply(css: String): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapNull: Self = StObject.set(x, "map", null)
    }
  }
  
  @js.native
  trait Usage extends StObject {
    
    var blacklist: js.UndefOr[Classes] = js.native
    
    var classes: js.UndefOr[js.Array[String]] = js.native
    
    var ids: js.UndefOr[js.Array[String]] = js.native
    
    var scopes: js.UndefOr[js.Array[js.Array[String]]] = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
  }
  object Usage {
    
    @scala.inline
    def apply(): Usage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Usage]
    }
    
    @scala.inline
    implicit class UsageMutableBuilder[Self <: Usage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlacklist(value: Classes): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setScopes(value: js.Array[js.Array[String]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: js.Array[String]*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  type _To = Csso
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Csso = ^
}
