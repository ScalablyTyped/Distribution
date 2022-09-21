package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.GenerateOptions
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.ModuleDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatePackageListDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/autolinking/generatePackageList.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptor], options: GenerateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
