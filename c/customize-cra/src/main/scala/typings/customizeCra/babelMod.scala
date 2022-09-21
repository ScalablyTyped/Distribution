package typings.customizeCra

import typings.babelCore.mod.MatchPattern
import typings.babelCore.mod.PluginItem
import typings.customizeCra.coreMod.OverrideFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelMod {
  
  @JSImport("customize-cra/src/babel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBabelPlugin(plugin: PluginItem): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addBabelPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addBabelPlugins(plugins: PluginItem*): js.Array[OverrideFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBabelPlugins")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[OverrideFunc]]
  
  inline def addBabelPreset(preset: PluginItem): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addBabelPreset")(preset.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addBabelPresets(plugins: PluginItem*): js.Array[OverrideFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("addBabelPresets")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[OverrideFunc]]
  
  inline def addDecoratorsLegacy(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addDecoratorsLegacy")().asInstanceOf[OverrideFunc]
  
  inline def addExternalBabelPlugin(plugin: PluginItem): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("addExternalBabelPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def addExternalBabelPlugins(plugins: String*): js.Array[OverrideFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("addExternalBabelPlugins")(plugins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[OverrideFunc]]
  
  inline def babelExclude(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelExclude")().asInstanceOf[OverrideFunc]
  inline def babelExclude(options: js.Array[MatchPattern]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelExclude")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def babelExclude(options: MatchPattern): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelExclude")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def babelInclude(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelInclude")().asInstanceOf[OverrideFunc]
  inline def babelInclude(options: js.Array[MatchPattern]): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelInclude")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  inline def babelInclude(options: MatchPattern): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("babelInclude")(options.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def fixBabelImports(libraryName: String, options: Any): OverrideFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("fixBabelImports")(libraryName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OverrideFunc]
  
  inline def removeInternalBabelPlugin(pluginName: String): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("removeInternalBabelPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[OverrideFunc]
  
  inline def useBabelRc(): OverrideFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("useBabelRc")().asInstanceOf[OverrideFunc]
}
