package typings.compressionWebpackPlugin

import typings.std.Error
import typings.std.Plugin
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Prepare compressed versions of assets to serve them with Content-Encoding.
    */
  @JSImport("compression-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^[O] ()
    extends StObject
       with CompressionPlugin[O] {
    def this(options: Options[O]) = this()
  }
  @JSImport("compression-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def isWebpack4(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebpack4")().asInstanceOf[Boolean]
  
  type Algorithm[O] = js.Function3[/* source */ String, /* options */ O, /* callback */ AlgorithmCallback, Unit]
  
  type AlgorithmCallback = js.Function2[/* error */ Error | Null, /* result */ Uint8Array, Unit]
  
  trait BaseOptions extends StObject {
    
    /**
      * Enable file caching
      * ⚠ Ignored in webpack 5! Please use webpack.js.org/configuration/other-options/#cache.
      * @default true
      */
    var cache: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * @default false
      */
    var deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Exclude all assets matching any of these conditions
      */
    var exclude: js.UndefOr[Rules] = js.undefined
    
    /**
      * The target asset filename.
      * @default '[path].gz[query]'
      */
    var filename: js.UndefOr[String | FilenameFunction] = js.undefined
    
    /**
      * Include all assets matching any of these conditions
      */
    var include: js.UndefOr[Rules] = js.undefined
    
    /**
      * Only assets that compress better than this ratio are processed (minRatio = Compressed Size / Original Size)
      * @default 0.8
      */
    var minRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Include all assets that pass test assertion
      */
    var test: js.UndefOr[Rules] = js.undefined
    
    /**
      * Only assets bigger than this size are processed (in bytes)
      * @default 0
      */
    var threshold: js.UndefOr[Double] = js.undefined
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
  trait CompressionPlugin[O]
    extends StObject
       with Plugin {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait CustomOptions[O]
    extends StObject
       with BaseOptions
       with Options[O] {
    
    def algorithm(source: String, options: O, callback: AlgorithmCallback): Unit
    @JSName("algorithm")
    var algorithm_Original: Algorithm[O]
    
    var compressionOptions: js.UndefOr[O] = js.undefined
  }
  object CustomOptions {
    
    @scala.inline
    def apply[O](algorithm: (/* source */ String, O, /* callback */ AlgorithmCallback) => Unit): CustomOptions[O] = {
      val __obj = js.Dynamic.literal(algorithm = js.Any.fromFunction3(algorithm))
      __obj.asInstanceOf[CustomOptions[O]]
    }
    
    @scala.inline
    implicit class CustomOptionsMutableBuilder[Self <: CustomOptions[?], O] (val x: Self & CustomOptions[O]) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: (/* source */ String, O, /* callback */ AlgorithmCallback) => Unit): Self = StObject.set(x, "algorithm", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCompressionOptions(value: O): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
    }
  }
  
  trait FileInfo extends StObject {
    
    /** original asset filename */
    var file: String
    
    /** path of the original asset */
    var path: String
    
    /** query */
    var query: String
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
  object Options {
    
    @scala.inline
    def CustomOptions[O](algorithm: (/* source */ String, O, /* callback */ AlgorithmCallback) => Unit): typings.compressionWebpackPlugin.mod.CustomOptions[O] = {
      val __obj = js.Dynamic.literal(algorithm = js.Any.fromFunction3(algorithm))
      __obj.asInstanceOf[typings.compressionWebpackPlugin.mod.CustomOptions[O]]
    }
    
    @scala.inline
    def ZlibOptions(): typings.compressionWebpackPlugin.mod.ZlibOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.compressionWebpackPlugin.mod.ZlibOptions]
    }
  }
  
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
  
  trait ZlibOptions
    extends StObject
       with BaseOptions
       with Options[js.Any] {
    
    /**
      * The compression algorithm/function
      * @default 'gzip'
      */
    var algorithm: js.UndefOr[ZlibAlgorithm] = js.undefined
    
    /**
      * Compression options for algorithm
      * @default { level: 9 }
      */
    var compressionOptions: js.UndefOr[typings.node.zlibMod.ZlibOptions] = js.undefined
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
