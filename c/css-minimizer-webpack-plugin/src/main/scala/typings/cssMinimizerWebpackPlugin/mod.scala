package typings.cssMinimizerWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.cssnano.mod.CssNanoOptions
import typings.postcss.mod.SourceMapOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-minimizer-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends CssMinimizerPlugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait CacheKeys
    extends DefaultCacheKeys
       with /* key */ StringDictionary[String]
  object CacheKeys {
    
    @scala.inline
    def apply(
      `css-minimizer-webpack-plugin`: String,
      `css-minimizer-webpack-plugin-options`: String,
      cssMinimizer: String,
      hash: String,
      path: String
    ): CacheKeys = {
      val __obj = js.Dynamic.literal(cssMinimizer = cssMinimizer.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("css-minimizer-webpack-plugin")(`css-minimizer-webpack-plugin`.asInstanceOf[js.Any])
      __obj.updateDynamic("css-minimizer-webpack-plugin-options")(`css-minimizer-webpack-plugin-options`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKeys]
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ @js.native
  trait CssMinimizerPlugin extends StObject {
    
    /**
      * Apply the plugin
      */
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  object CssMinimizerPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): CssMinimizerPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[CssMinimizerPlugin]
    }
    
    @scala.inline
    implicit class CssMinimizerPluginMutableBuilder[Self <: CssMinimizerPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Default cache keys
    */
  @js.native
  trait DefaultCacheKeys extends StObject {
    
    var `css-minimizer-webpack-plugin`: String = js.native
    
    var `css-minimizer-webpack-plugin-options`: String = js.native
    
    var cssMinimizer: String = js.native
    
    var hash: String = js.native
    
    var path: String = js.native
  }
  object DefaultCacheKeys {
    
    @scala.inline
    def apply(
      `css-minimizer-webpack-plugin`: String,
      `css-minimizer-webpack-plugin-options`: String,
      cssMinimizer: String,
      hash: String,
      path: String
    ): DefaultCacheKeys = {
      val __obj = js.Dynamic.literal(cssMinimizer = cssMinimizer.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("css-minimizer-webpack-plugin")(`css-minimizer-webpack-plugin`.asInstanceOf[js.Any])
      __obj.updateDynamic("css-minimizer-webpack-plugin-options")(`css-minimizer-webpack-plugin-options`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultCacheKeys]
    }
    
    @scala.inline
    implicit class DefaultCacheKeysMutableBuilder[Self <: DefaultCacheKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setCss-minimizer-webpack-plugin`(value: String): Self = StObject.set(x, "css-minimizer-webpack-plugin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCss-minimizer-webpack-plugin-options`(value: String): Self = StObject.set(x, "css-minimizer-webpack-plugin-options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssMinimizer(value: String): Self = StObject.set(x, "cssMinimizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Enable file caching.
      * @default 'node_modules/.cache/css-minimizer-webpack-plugin'
      */
    var cache: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Allows you to override default cache keys.
      */
    var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ CacheKeys, /* file */ String, CacheKeys]] = js.native
    
    /**
      * Files to exclude.
      */
    var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    /**
      * Files to include
      */
    var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    /**
      * Allows you to override default minify function.
      * By default plugin uses cssnano package. Useful for using and testing unpublished versions or forks.
      */
    var minify: js.UndefOr[
        js.Function3[/* data */ js.Any, /* inputMap */ js.Any, /* minimizerOptions */ js.Any, _]
      ] = js.native
    
    var minimizerOptions: js.UndefOr[CssNanoOptions] = js.native
    
    /**
      * Use multi-process parallel running to improve the build speed.
      * Default number of concurrent runs: os.cpus().length - 1.
      */
    var parallel: js.UndefOr[Boolean | Double] = js.native
    
    /**
      * Enable (and configure) source map support.
      * Use PostCss SourceMap options.
      * Default configuration when enabled: { inline: false }.
      */
    var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.native
    
    /**
      * Test to match files against.
      */
    var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.native
    
    /**
      * Allow to filter css-minimizer warnings (By default cssnano).
      * Return true to keep the warning, a falsy value (false/null/undefined) otherwise.
      */
    var warningsFilter: js.UndefOr[
        js.Function3[
          /* warning */ String, 
          /* file */ String, 
          /* source */ String, 
          js.UndefOr[Boolean | Null]
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheKeys(value: (/* defaultCacheKeys */ CacheKeys, /* file */ String) => CacheKeys): Self = StObject.set(x, "cacheKeys", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCacheKeysUndefined: Self = StObject.set(x, "cacheKeys", js.undefined)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setMinify(value: (/* data */ js.Any, /* inputMap */ js.Any, /* minimizerOptions */ js.Any) => _): Self = StObject.set(x, "minify", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      @scala.inline
      def setMinimizerOptions(value: CssNanoOptions): Self = StObject.set(x, "minimizerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizerOptionsUndefined: Self = StObject.set(x, "minimizerOptions", js.undefined)
      
      @scala.inline
      def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean | SourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setTest(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      @scala.inline
      def setWarningsFilter(
        value: (/* warning */ String, /* file */ String, /* source */ String) => js.UndefOr[Boolean | Null]
      ): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
}
