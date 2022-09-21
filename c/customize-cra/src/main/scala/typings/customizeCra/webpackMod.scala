package typings.customizeCra

import org.scalablytyped.runtime.StringDictionary
import typings.customizeCra.anon.RequiredRuleSetRule
import typings.customizeCra.coreMod.OverrideFunc
import typings.customizeCra.customizeCraBooleans.`false`
import typings.customizeCra.customizeCraStrings.`errors-only`
import typings.customizeCra.customizeCraStrings.`errors-warnings`
import typings.customizeCra.customizeCraStrings.detailed
import typings.customizeCra.customizeCraStrings.minimal
import typings.customizeCra.customizeCraStrings.none
import typings.customizeCra.customizeCraStrings.normal
import typings.customizeCra.customizeCraStrings.summary
import typings.customizeCra.customizeCraStrings.verbose
import typings.std.Record
import typings.webpack.mod.ExternalItem
import typings.webpack.mod.ExternalItemFunctionData
import typings.webpack.mod.ExternalItemObjectKnown
import typings.webpack.mod.ExternalItemObjectUnknown
import typings.webpack.mod.ExternalItemValue
import typings.webpack.mod.Plugin
import typings.webpack.mod.ResolveOptionsWebpackOptions
import typings.webpack.mod.RuleSetRule
import typings.webpack.mod.StatsOptions
import typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Options
import typings.workboxWebpackPlugin.mod.GenerateSWOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackMod {
  
  @JSImport("customize-cra/src/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBundleVisualizer(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addBundleVisualizer")().asInstanceOf[OverrideFunc]
  inline def addBundleVisualizer(options: Unit, behindFlag: Boolean): OverrideFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("addBundleVisualizer")(options.asInstanceOf[js.Any], behindFlag.asInstanceOf[js.Any])).asInstanceOf[OverrideFunc]
  inline def addBundleVisualizer(options: Options): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addBundleVisualizer")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addBundleVisualizer(options: Options, behindFlag: Boolean): OverrideFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("addBundleVisualizer")(options.asInstanceOf[js.Any], behindFlag.asInstanceOf[js.Any])).asInstanceOf[OverrideFunc]
  
  inline def addLessLoader(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addLessLoader")().asInstanceOf[OverrideFunc]
  inline def addLessLoader(loaderOptions: Any): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addLessLoader")(loaderOptions.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addLessLoader(loaderOptions: Any, customCssModules: Any): OverrideFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("addLessLoader")(loaderOptions.asInstanceOf[js.Any], customCssModules.asInstanceOf[js.Any])).asInstanceOf[OverrideFunc]
  inline def addLessLoader(loaderOptions: Unit, customCssModules: Any): OverrideFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("addLessLoader")(loaderOptions.asInstanceOf[js.Any], customCssModules.asInstanceOf[js.Any])).asInstanceOf[OverrideFunc]
  
  inline def addPostcssPlugins(x: js.Array[Any]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addPostcssPlugins")(x.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addTslintLoader(x: Any): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addTslintLoader")(x.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addWebpackAlias(aliases: Record[String, String]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackAlias")(aliases.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addWebpackExternals(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")().asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(options: ExternalItemObjectKnown & ExternalItemObjectUnknown): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(options: String): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(options: js.Array[ExternalItem]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(options: js.Function1[/* data */ ExternalItemFunctionData, js.Promise[ExternalItemValue]]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(
    options: js.Function2[
      /* data */ ExternalItemFunctionData, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[js.Error], 
        /* result */ js.UndefOr[String | Boolean | js.Array[String] | StringDictionary[Any]], 
        Unit
      ], 
      Unit
    ]
  ): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def addWebpackExternals(options: js.RegExp): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackExternals")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addWebpackModuleRule(rule: RuleSetRule): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackModuleRule")(rule.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addWebpackPlugin(plugin: Plugin): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addWebpackResolve(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackResolve")().asInstanceOf[OverrideFunc]
  inline def addWebpackResolve(resolve: ResolveOptionsWebpackOptions): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addWebpackResolve")(resolve.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def adjustStyleLoaders(callback: js.Function1[/* loader */ RequiredRuleSetRule, Unit]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustStyleLoaders")(callback.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def adjustWorkbox(func: js.Function1[/* swPluginOptions */ GenerateSWOptions, GenerateSWOptions]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("adjustWorkbox")(func.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def disableChunk(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("disableChunk")().asInstanceOf[OverrideFunc]
  
  inline def disableEsLint(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("disableEsLint")().asInstanceOf[OverrideFunc]
  
  inline def enableEslintTypescript(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("enableEslintTypescript")().asInstanceOf[OverrideFunc]
  
  inline def removeModuleScopePlugin(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("removeModuleScopePlugin")().asInstanceOf[OverrideFunc]
  
  inline def setWebpackOptimizationSplitChunks_splitChunks(
    splitChunks: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options.Optimization * / any['splitChunks'] */ js.Any
  ): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackOptimizationSplitChunks")(splitChunks.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def setWebpackPublicPath(path: String): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackPublicPath")(path.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def setWebpackStats(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackStats")().asInstanceOf[OverrideFunc]
  inline def setWebpackStats(stats: none | verbose | summary | `errors-only` | `errors-warnings` | minimal | normal | detailed): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackStats")(stats.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def setWebpackStats(stats: Boolean): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackStats")(stats.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def setWebpackStats(stats: StatsOptions): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackStats")(stats.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def setWebpackTarget(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackTarget")().asInstanceOf[OverrideFunc]
  inline def setWebpackTarget(target: String): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackTarget")(target.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def setWebpackTarget(target: js.Array[String]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackTarget")(target.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def setWebpackTarget_false(target: `false`): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebpackTarget")(target.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def useEslintRc(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("useEslintRc")().asInstanceOf[OverrideFunc]
  inline def useEslintRc(configFile: String): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("useEslintRc")(configFile.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def watchAll(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("watchAll")().asInstanceOf[OverrideFunc]
}
