package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackCdYQfbEx.anon.AggregateTimeout
import typings.webpackCdYQfbEx.anon.Debug
import typings.webpackCdYQfbEx.webpackCdYQfbExBooleans.`false`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`async-node`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`electron-main`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`electron-preload`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`electron-renderer`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`errors-only`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`errors-warnings`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.`node-webkit`
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.detailed
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.development
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.minimal
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.node
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.none
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.normal
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.production
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.verbose
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.web
import typings.webpackCdYQfbEx.webpackCdYQfbExStrings.webworker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackOptions extends StObject {
  
  /**
  	 * Set the value of `require.amd` and `define.amd`. Or disable AMD support.
  	 */
  var amd: js.UndefOr[`false` | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Report the first error as a hard error instead of tolerating it.
  	 */
  var bail: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Cache generated modules and chunks to improve performance for multiple incremental builds.
  	 */
  var cache: js.UndefOr[Boolean | StringDictionary[Any]] = js.undefined
  
  /**
  	 * The base directory (absolute path!) for resolving the `entry` option. If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * References to other configurations to depend on.
  	 */
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Options for the webpack-dev-server
  	 */
  var devServer: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * A developer tool to enhance debugging.
  	 */
  var devtool: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The entry point(s) of the compilation.
  	 */
  var entry: js.UndefOr[Entry] = js.undefined
  
  /**
  	 * Specify dependencies that shouldn't be resolved by webpack, but should become dependencies of the resulting bundle. The kind of the dependency depends on `output.libraryTarget`.
  	 */
  var externals: js.UndefOr[Externals] = js.undefined
  
  /**
  	 * Options for infrastructure level logging
  	 */
  var infrastructureLogging: js.UndefOr[Debug] = js.undefined
  
  /**
  	 * Custom values available in the loader context.
  	 */
  var loader: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Enable production optimizations or development hints.
  	 */
  var mode: js.UndefOr[development | production | none] = js.undefined
  
  /**
  	 * Options affecting the normal modules (`NormalModuleFactory`).
  	 */
  var module: js.UndefOr[ModuleOptions] = js.undefined
  
  /**
  	 * Name of the configuration. Used when loading multiple configurations.
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * Include polyfills or mocks for various node stuff.
  	 */
  var node: js.UndefOr[`false` | NodeOptions] = js.undefined
  
  /**
  	 * Enables/Disables integrated optimizations
  	 */
  var optimization: js.UndefOr[OptimizationOptions] = js.undefined
  
  /**
  	 * Options affecting the output of the compilation. `output` options tell webpack how to write the compiled files to disk.
  	 */
  var output: js.UndefOr[OutputOptions] = js.undefined
  
  /**
  	 * The number of parallel processed modules in the compilation.
  	 */
  var parallelism: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Configuration for web performance recommendations.
  	 */
  var performance: js.UndefOr[`false` | PerformanceOptions] = js.undefined
  
  /**
  	 * Add additional plugins to the compiler.
  	 */
  var plugins: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.undefined
  
  /**
  	 * Capture timing information for each module.
  	 */
  var profile: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Store compiler state to a json file.
  	 */
  var recordsInputPath: js.UndefOr[String] = js.undefined
  
  /**
  	 * Load compiler state from a json file.
  	 */
  var recordsOutputPath: js.UndefOr[String] = js.undefined
  
  /**
  	 * Store/Load compiler state from/to a json file. This will result in persistent ids of modules and chunks. An absolute path is expected. `recordsPath` is used for `recordsInputPath` and `recordsOutputPath` if they left undefined.
  	 */
  var recordsPath: js.UndefOr[String] = js.undefined
  
  /**
  	 * Options for the resolver
  	 */
  var resolve: js.UndefOr[ResolveOptions] = js.undefined
  
  /**
  	 * Options for the resolver when resolving loaders
  	 */
  var resolveLoader: js.UndefOr[ResolveOptions] = js.undefined
  
  /**
  	 * Options for webpack-serve
  	 */
  var serve: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
  	 * Used by the webpack CLI program to pass stats options.
  	 */
  var stats: js.UndefOr[
    StatsOptions | Boolean | none | `errors-only` | minimal | normal | detailed | verbose | `errors-warnings`
  ] = js.undefined
  
  /**
  	 * Environment to build for
  	 */
  var target: js.UndefOr[
    web | webworker | node | `async-node` | `node-webkit` | `electron-main` | `electron-renderer` | `electron-preload` | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ Any, 
      Unit
    ])
  ] = js.undefined
  
  /**
  	 * Enter watch mode, which rebuilds on file change.
  	 */
  var watch: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Options for the watcher
  	 */
  var watchOptions: js.UndefOr[AggregateTimeout] = js.undefined
}
object WebpackOptions {
  
  inline def apply(): WebpackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackOptions]
  }
  
  extension [Self <: WebpackOptions](x: Self) {
    
    inline def setAmd(value: `false` | StringDictionary[Any]): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setCache(value: Boolean | StringDictionary[Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDevServer(value: StringDictionary[Any]): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    inline def setDevtool(value: String | `false`): Self = StObject.set(x, "devtool", value.asInstanceOf[js.Any])
    
    inline def setDevtoolUndefined: Self = StObject.set(x, "devtool", js.undefined)
    
    inline def setEntry(value: Entry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryFunction0(value: () => EntryStatic | js.Promise[EntryStatic]): Self = StObject.set(x, "entry", js.Any.fromFunction0(value))
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExternals(value: Externals): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
    
    inline def setExternalsFunction3(
      value: (/* context */ String, /* request */ String, /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit]) => Unit
    ): Self = StObject.set(x, "externals", js.Any.fromFunction3(value))
    
    inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
    
    inline def setExternalsVarargs(
      value: ((js.Function3[
          /* context */ String, 
          /* request */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[String], Unit], 
          Unit
        ]) | ExternalItem)*
    ): Self = StObject.set(x, "externals", js.Array(value*))
    
    inline def setInfrastructureLogging(value: Debug): Self = StObject.set(x, "infrastructureLogging", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureLoggingUndefined: Self = StObject.set(x, "infrastructureLogging", js.undefined)
    
    inline def setLoader(value: StringDictionary[Any]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMode(value: development | production | none): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModule(value: ModuleOptions): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode(value: `false` | NodeOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOptimization(value: OptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    inline def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setPerformance(value: `false` | PerformanceOptions): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRecordsInputPath(value: String): Self = StObject.set(x, "recordsInputPath", value.asInstanceOf[js.Any])
    
    inline def setRecordsInputPathUndefined: Self = StObject.set(x, "recordsInputPath", js.undefined)
    
    inline def setRecordsOutputPath(value: String): Self = StObject.set(x, "recordsOutputPath", value.asInstanceOf[js.Any])
    
    inline def setRecordsOutputPathUndefined: Self = StObject.set(x, "recordsOutputPath", js.undefined)
    
    inline def setRecordsPath(value: String): Self = StObject.set(x, "recordsPath", value.asInstanceOf[js.Any])
    
    inline def setRecordsPathUndefined: Self = StObject.set(x, "recordsPath", js.undefined)
    
    inline def setResolve(value: ResolveOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveLoader(value: ResolveOptions): Self = StObject.set(x, "resolveLoader", value.asInstanceOf[js.Any])
    
    inline def setResolveLoaderUndefined: Self = StObject.set(x, "resolveLoader", js.undefined)
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setServe(value: StringDictionary[Any]): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
    
    inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
    
    inline def setStats(
      value: StatsOptions | Boolean | none | `errors-only` | minimal | normal | detailed | verbose | `errors-warnings`
    ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setTarget(
      value: web | webworker | node | `async-node` | `node-webkit` | `electron-main` | `electron-renderer` | `electron-preload` | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ Any, 
          Unit
        ])
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ Any => Unit
    ): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchOptions(value: AggregateTimeout): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
