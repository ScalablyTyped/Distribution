package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import typings.webpackCdYQfbEx.anon.Bold
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.error
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.info
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.log
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.none
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.verbose
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsOptions extends StObject {
  
  /**
  	 * fallback value for stats options when an option is not defined (has precedence over local webpack defaults)
  	 */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add assets information
  	 */
  var assets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the assets by that field
  	 */
  var assetsSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * add built at time information
  	 */
  var builtAt: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add also information about cached (not built) modules
  	 */
  var cached: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Show cached assets (setting this to `false` only shows emitted files)
  	 */
  var cachedAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add children information
  	 */
  var children: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display all chunk groups with the corresponding bundles
  	 */
  var chunkGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add built modules information to chunk information
  	 */
  var chunkModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add the origins of chunks and chunk merging info
  	 */
  var chunkOrigins: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add chunk information
  	 */
  var chunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the chunks by that field
  	 */
  var chunksSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * Enables/Disables colorful output
  	 */
  var colors: js.UndefOr[Boolean | Bold] = js.undefined
  
  /**
  	 * context directory for request shortening
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * add module depth in module graph
  	 */
  var depth: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display the entry points with the corresponding bundles
  	 */
  var entrypoints: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add --env information
  	 */
  var env: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add details to errors (like resolving log)
  	 */
  var errorDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add errors
  	 */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Please use excludeModules instead.
  	 */
  var exclude: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * Suppress assets that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var excludeAssets: js.UndefOr[FilterTypes] = js.undefined
  
  /**
  	 * Suppress modules that match the specified filters. Filters can be Strings, RegExps, Booleans or Functions
  	 */
  var excludeModules: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * add the hash of the compilation
  	 */
  var hash: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add logging output
  	 */
  var logging: js.UndefOr[Boolean | none | error | warn | info | log | verbose] = js.undefined
  
  /**
  	 * Include debug logging of specified loggers (i. e. for plugins or loaders). Filters can be Strings, RegExps or Functions
  	 */
  var loggingDebug: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * add stack traces to logging output
  	 */
  var loggingTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the maximum number of modules to be shown
  	 */
  var maxModules: js.UndefOr[Double] = js.undefined
  
  /**
  	 * add information about assets inside modules
  	 */
  var moduleAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add dependencies and origin of warnings/errors
  	 */
  var moduleTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add built modules information
  	 */
  var modules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the modules by that field
  	 */
  var modulesSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * add information about modules nested in other modules (like with module concatenation)
  	 */
  var nestedModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show reasons why optimization bailed out for modules
  	 */
  var optimizationBailout: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add output path information
  	 */
  var outputPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add performance hint flags
  	 */
  var performance: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show exports provided by modules
  	 */
  var providedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add public path information
  	 */
  var publicPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add information about the reasons why modules are included
  	 */
  var reasons: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add the source code of modules
  	 */
  var source: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add timing information
  	 */
  var timings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show exports used by modules
  	 */
  var usedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add webpack version information
  	 */
  var version: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add warnings
  	 */
  var warnings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Suppress warnings that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var warningsFilter: js.UndefOr[FilterTypes] = js.undefined
}
object StatsOptions {
  
  inline def apply(): StatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsOptions]
  }
  
  extension [Self <: StatsOptions](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsSort(value: String): Self = StObject.set(x, "assetsSort", value.asInstanceOf[js.Any])
    
    inline def setAssetsSortUndefined: Self = StObject.set(x, "assetsSort", js.undefined)
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setBuiltAt(value: Boolean): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
    
    inline def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setCachedAssets(value: Boolean): Self = StObject.set(x, "cachedAssets", value.asInstanceOf[js.Any])
    
    inline def setCachedAssetsUndefined: Self = StObject.set(x, "cachedAssets", js.undefined)
    
    inline def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
    
    inline def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChunkGroups(value: Boolean): Self = StObject.set(x, "chunkGroups", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupsUndefined: Self = StObject.set(x, "chunkGroups", js.undefined)
    
    inline def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
    
    inline def setChunkOrigins(value: Boolean): Self = StObject.set(x, "chunkOrigins", value.asInstanceOf[js.Any])
    
    inline def setChunkOriginsUndefined: Self = StObject.set(x, "chunkOrigins", js.undefined)
    
    inline def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksSort(value: String): Self = StObject.set(x, "chunksSort", value.asInstanceOf[js.Any])
    
    inline def setChunksSortUndefined: Self = StObject.set(x, "chunksSort", js.undefined)
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setColors(value: Boolean | Bold): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
    
    inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setErrorDetails(value: Boolean): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setExclude(value: FilterTypes | Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssets(value: FilterTypes): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssetsFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction1(value))
    
    inline def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
    
    inline def setExcludeAssetsVarargs(value: FilterItemTypes*): Self = StObject.set(x, "excludeAssets", js.Array(value*))
    
    inline def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    inline def setExcludeModules(value: FilterTypes | Boolean): Self = StObject.set(x, "excludeModules", value.asInstanceOf[js.Any])
    
    inline def setExcludeModulesFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "excludeModules", js.Any.fromFunction1(value))
    
    inline def setExcludeModulesUndefined: Self = StObject.set(x, "excludeModules", js.undefined)
    
    inline def setExcludeModulesVarargs(value: FilterItemTypes*): Self = StObject.set(x, "excludeModules", js.Array(value*))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: FilterItemTypes*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setLogging(value: Boolean | none | error | warn | info | log | verbose): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebug(value: FilterTypes | Boolean): Self = StObject.set(x, "loggingDebug", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "loggingDebug", js.Any.fromFunction1(value))
    
    inline def setLoggingDebugUndefined: Self = StObject.set(x, "loggingDebug", js.undefined)
    
    inline def setLoggingDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "loggingDebug", js.Array(value*))
    
    inline def setLoggingTrace(value: Boolean): Self = StObject.set(x, "loggingTrace", value.asInstanceOf[js.Any])
    
    inline def setLoggingTraceUndefined: Self = StObject.set(x, "loggingTrace", js.undefined)
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setMaxModules(value: Double): Self = StObject.set(x, "maxModules", value.asInstanceOf[js.Any])
    
    inline def setMaxModulesUndefined: Self = StObject.set(x, "maxModules", js.undefined)
    
    inline def setModuleAssets(value: Boolean): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
    
    inline def setModuleAssetsUndefined: Self = StObject.set(x, "moduleAssets", js.undefined)
    
    inline def setModuleTrace(value: Boolean): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
    
    inline def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
    
    inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesSort(value: String): Self = StObject.set(x, "modulesSort", value.asInstanceOf[js.Any])
    
    inline def setModulesSortUndefined: Self = StObject.set(x, "modulesSort", js.undefined)
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    
    inline def setOptimizationBailout(value: Boolean): Self = StObject.set(x, "optimizationBailout", value.asInstanceOf[js.Any])
    
    inline def setOptimizationBailoutUndefined: Self = StObject.set(x, "optimizationBailout", js.undefined)
    
    inline def setOutputPath(value: Boolean): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    inline def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    inline def setPublicPath(value: Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setReasons(value: Boolean): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    
    inline def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
    
    inline def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsFilter(value: FilterTypes): Self = StObject.set(x, "warningsFilter", value.asInstanceOf[js.Any])
    
    inline def setWarningsFilterFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction1(value))
    
    inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    
    inline def setWarningsFilterVarargs(value: FilterItemTypes*): Self = StObject.set(x, "warningsFilter", js.Array(value*))
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
