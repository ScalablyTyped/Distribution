package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.SearchOptions
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findModulesDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/autolinking/findModules.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findModulesAsync(providedOptions: SearchOptions): js.Promise[SearchResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("findModulesAsync")(providedOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResults]]
}
