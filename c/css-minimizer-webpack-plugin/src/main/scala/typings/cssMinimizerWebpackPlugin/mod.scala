package typings.cssMinimizerWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.cssnano.mod.CssNanoOptions
import typings.postcss.mod.SourceMapOptions
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-minimizer-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with CssMinimizerPlugin {
    def this(options: Options) = this()
    
    /**
      * Apply the plugin
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  trait CacheKeys
    extends StObject
       with DefaultCacheKeys
       with /* key */ StringDictionary[String]
  object CacheKeys {
    
    inline def apply(
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
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ trait CssMinimizerPlugin extends StObject {
    
    /**
      * Apply the plugin
      */
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object CssMinimizerPlugin {
    
    inline def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): CssMinimizerPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[CssMinimizerPlugin]
    }
    
    extension [Self <: CssMinimizerPlugin](x: Self) {
      
      inline def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Default cache keys
    */
  trait DefaultCacheKeys extends StObject {
    
    var `css-minimizer-webpack-plugin`: String
    
    var `css-minimizer-webpack-plugin-options`: String
    
    var cssMinimizer: String
    
    var hash: String
    
    var path: String
  }
  object DefaultCacheKeys {
    
    inline def apply(
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
    
    extension [Self <: DefaultCacheKeys](x: Self) {
      
      inline def `setCss-minimizer-webpack-plugin`(value: String): Self = StObject.set(x, "css-minimizer-webpack-plugin", value.asInstanceOf[js.Any])
      
      inline def `setCss-minimizer-webpack-plugin-options`(value: String): Self = StObject.set(x, "css-minimizer-webpack-plugin-options", value.asInstanceOf[js.Any])
      
      inline def setCssMinimizer(value: String): Self = StObject.set(x, "cssMinimizer", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Enable file caching.
      * @default 'node_modules/.cache/css-minimizer-webpack-plugin'
      */
    var cache: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Allows you to override default cache keys.
      */
    var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ CacheKeys, /* file */ String, CacheKeys]] = js.undefined
    
    /**
      * Files to exclude.
      */
    var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Files to include
      */
    var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
    /**
      * Allows you to override default minify function.
      * By default plugin uses cssnano package. Useful for using and testing unpublished versions or forks.
      */
    var minify: js.UndefOr[
        js.Function3[/* data */ js.Any, /* inputMap */ js.Any, /* minimizerOptions */ js.Any, js.Any]
      ] = js.undefined
    
    var minimizerOptions: js.UndefOr[CssNanoOptions] = js.undefined
    
    /**
      * Use multi-process parallel running to improve the build speed.
      * Default number of concurrent runs: os.cpus().length - 1.
      */
    var parallel: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Enable (and configure) source map support.
      * Use PostCss SourceMap options.
      * Default configuration when enabled: { inline: false }.
      */
    var sourceMap: js.UndefOr[Boolean | SourceMapOptions] = js.undefined
    
    /**
      * Test to match files against.
      */
    var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
    
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
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: Boolean | String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheKeys(value: (/* defaultCacheKeys */ CacheKeys, /* file */ String) => CacheKeys): Self = StObject.set(x, "cacheKeys", js.Any.fromFunction2(value))
      
      inline def setCacheKeysUndefined: Self = StObject.set(x, "cacheKeys", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      inline def setMinify(value: (/* data */ js.Any, /* inputMap */ js.Any, /* minimizerOptions */ js.Any) => js.Any): Self = StObject.set(x, "minify", js.Any.fromFunction3(value))
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setMinimizerOptions(value: CssNanoOptions): Self = StObject.set(x, "minimizerOptions", value.asInstanceOf[js.Any])
      
      inline def setMinimizerOptionsUndefined: Self = StObject.set(x, "minimizerOptions", js.undefined)
      
      inline def setParallel(value: Boolean | Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setSourceMap(value: Boolean | SourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTest(value: String | RegExp | (js.Array[String | RegExp])): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: (String | RegExp)*): Self = StObject.set(x, "test", js.Array(value :_*))
      
      inline def setWarningsFilter(
        value: (/* warning */ String, /* file */ String, /* source */ String) => js.UndefOr[Boolean | Null]
      ): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction3(value))
      
      inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
}
