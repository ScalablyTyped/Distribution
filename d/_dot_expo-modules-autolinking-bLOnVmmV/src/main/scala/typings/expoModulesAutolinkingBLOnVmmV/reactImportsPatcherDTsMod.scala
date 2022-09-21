package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.PatchReactImportsOptions
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactImportsPatcherDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/ReactImportsPatcher.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def patchFileAsync(headerSet: Set[String], file: String, dryRun: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("patchFileAsync")(headerSet.asInstanceOf[js.Any], file.asInstanceOf[js.Any], dryRun.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def patchReactImportsAsync(dirs: js.Array[String], options: PatchReactImportsOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("patchReactImportsAsync")(dirs.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
