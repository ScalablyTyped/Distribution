package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.ModuleDescriptor
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.ResolveOptions
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveModulesDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/autolinking/resolveModules.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveModulesAsync(searchResults: SearchResults, options: ResolveOptions): js.Promise[js.Array[ModuleDescriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModulesAsync")(searchResults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ModuleDescriptor]]]
}
