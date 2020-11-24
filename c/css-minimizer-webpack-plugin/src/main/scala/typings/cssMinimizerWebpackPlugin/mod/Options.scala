package typings.cssMinimizerWebpackPlugin.mod

import typings.cssnano.mod.CssNanoOptions
import typings.postcss.mod.SourceMapOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean | String): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheKeys(value: (/* defaultCacheKeys */ CacheKeys, /* file */ String) => CacheKeys): Self = this.set("cacheKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCacheKeys: Self = this.set("cacheKeys", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: (String | RegExp)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMinify(value: (/* data */ js.Any, /* inputMap */ js.Any, /* minimizerOptions */ js.Any) => _): Self = this.set("minify", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setMinimizerOptions(value: CssNanoOptions): Self = this.set("minimizerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimizerOptions: Self = this.set("minimizerOptions", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean | SourceMapOptions): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: (String | RegExp)*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: String | RegExp | (js.Array[String | RegExp])): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setWarningsFilter(
      value: (/* warning */ String, /* file */ String, /* source */ String) => js.UndefOr[Boolean | Null]
    ): Self = this.set("warningsFilter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
}
