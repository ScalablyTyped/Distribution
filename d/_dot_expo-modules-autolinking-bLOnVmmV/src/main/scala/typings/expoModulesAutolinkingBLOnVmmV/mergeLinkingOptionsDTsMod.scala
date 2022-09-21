package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeLinkingOptionsDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/autolinking/mergeLinkingOptions.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeLinkingOptionsAsync[OptionsType /* <: SearchOptions */](providedOptions: OptionsType): js.Promise[OptionsType] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeLinkingOptionsAsync")(providedOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OptionsType]]
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/autolinking/mergeLinkingOptions.d.ts", "projectPackageJsonPath")
  @js.native
  val projectPackageJsonPath: String = js.native
  
  inline def resolveSearchPathsAsync(searchPaths: js.Array[String], cwd: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSearchPathsAsync")(searchPaths.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolveSearchPathsAsync(searchPaths: Null, cwd: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSearchPathsAsync")(searchPaths.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
