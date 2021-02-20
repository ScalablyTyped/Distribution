package typings.compressionWebpackPlugin

import typings.std.Error
import typings.std.Plugin
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Prepare compressed versions of assets to serve them with Content-Encoding.
    */
  @JSImport("compression-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^[O] () extends CompressionPlugin[O] {
    def this(options: Options[O]) = this()
  }
  
  /* static member */
  @JSImport("compression-webpack-plugin", "isWebpack4")
  @js.native
  def isWebpack4(): Boolean = js.native
  
  type Algorithm[O] = js.Function3[/* source */ String, /* options */ O, /* callback */ AlgorithmCallback, Unit]
  
  type AlgorithmCallback = js.Function2[/* error */ Error | Null, /* result */ Uint8Array, Unit]
  
  @js.native
  trait BaseOptions extends StObject {
    
    /**
      * Enable file caching
      * ⚠ Ignored in webpack 5! Please use webpack.js.org/configuration/other-options/#cache.
      * @default true
      */
    var cache: js.UndefOr[Boolean | String] = js.native
    
    /**
      * @default false
      */
    var deleteOriginalAssets: js.UndefOr[Boolean] = js.native
    
    /**
      * Exclude all assets matching any of these conditions
      */
    var exclude: js.UndefOr[Rules] = js.native
    
    /**
      * The target asset filename.
      * @default '[path].gz[query]'
      */
    var filename: js.UndefOr[String | FilenameFunction] = js.native
    
    /**
      * Include all assets matching any of these conditions
      */
    var include: js.UndefOr[Rules] = js.native
    
    /**
      * Only assets that compress better than this ratio are processed (minRatio = Compressed Size / Original Size)
      * @default 0.8
      */
    var minRatio: js.UndefOr[Double] = js.native
    
    /**
      * Include all assets that pass test assertion
      */
    var test: js.UndefOr[Rules] = js.native
    
    /**
      * Only assets bigger than this size are processed (in bytes)
      * @default 0
      */
    var threshold: js.UndefOr[Double] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setDeleteOriginalAssets(value: Boolean): Self = StObject.set(x, "deleteOriginalAssets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteOriginalAssetsUndefined: Self = StObject.set(x, "deleteOriginalAssets", js.undefined)
      
      @scala.inline
      def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFilename(value: String | FilenameFunction): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameFunction1(value: /* info */ FileInfo => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
      
      @scala.inline
      def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  /**
    * Prepare compressed versions of assets to serve them with Content-Encoding.
    */
  @js.native
  trait CompressionPlugin[O] extends Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait CustomOptions[O]
    extends BaseOptions
       with Options[O] {
    
    def algorithm(source: String, options: O, callback: AlgorithmCallback): Unit = js.native
    @JSName("algorithm")
    var algorithm_Original: Algorithm[O] = js.native
    
    var compressionOptions: js.UndefOr[O] = js.native
  }
  
  @js.native
  trait FileInfo extends StObject {
    
    /** original asset filename */
    var file: String = js.native
    
    /** path of the original asset */
    var path: String = js.native
    
    /** query */
    var query: String = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(file: String, path: String, query: String): FileInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  type FilenameFunction = js.Function1[/* info */ FileInfo, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.compressionWebpackPlugin.mod.ZlibOptions
    - typings.compressionWebpackPlugin.mod.CustomOptions[O]
  */
  trait Options[O] extends StObject
  
  /** Filtering rule as regex or string */
  type Rule = String | RegExp
  
  /** Filtering rules. */
  type Rules = Rule | js.Array[Rule]
  
  // NOTE: These are the async compression algorithms on the zlib object.
  /* Rewritten from type alias, can be one of: 
    - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate
    - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw
    - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip
    - typings.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress
  */
  trait ZlibAlgorithm extends StObject
  object ZlibAlgorithm {
    
    @scala.inline
    def brotliCompress: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress = "brotliCompress".asInstanceOf[typings.compressionWebpackPlugin.compressionWebpackPluginStrings.brotliCompress]
    
    @scala.inline
    def deflate: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate = "deflate".asInstanceOf[typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflate]
    
    @scala.inline
    def deflateRaw: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw = "deflateRaw".asInstanceOf[typings.compressionWebpackPlugin.compressionWebpackPluginStrings.deflateRaw]
    
    @scala.inline
    def gzip: typings.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip = "gzip".asInstanceOf[typings.compressionWebpackPlugin.compressionWebpackPluginStrings.gzip]
  }
  
  @js.native
  trait ZlibOptions
    extends BaseOptions
       with Options[js.Any] {
    
    /**
      * The compression algorithm/function
      * @default 'gzip'
      */
    var algorithm: js.UndefOr[ZlibAlgorithm] = js.native
    
    /**
      * Compression options for algorithm
      * @default { level: 9 }
      */
    var compressionOptions: js.UndefOr[typings.node.zlibMod.ZlibOptions] = js.native
  }
  object ZlibOptions {
    
    @scala.inline
    def apply(): ZlibOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZlibOptions]
    }
    
    @scala.inline
    implicit class ZlibOptionsMutableBuilder[Self <: ZlibOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: ZlibAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      @scala.inline
      def setCompressionOptions(value: typings.node.zlibMod.ZlibOptions): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    }
  }
}
