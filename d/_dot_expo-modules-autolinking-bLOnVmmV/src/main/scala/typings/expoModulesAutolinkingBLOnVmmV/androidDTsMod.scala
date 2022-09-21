package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.ModuleDescriptorAndroid
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.PackageRevision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/platforms/android.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPackageNameToProjectName(packageName: String, buildGradleFile: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPackageNameToProjectName")(packageName.asInstanceOf[js.Any], buildGradleFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generatePackageListAsync(modules: js.Array[ModuleDescriptorAndroid], targetPath: String, namespace: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePackageListAsync")(modules.asInstanceOf[js.Any], targetPath.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def resolveModuleAsync(packageName: String, revision: PackageRevision): js.Promise[ModuleDescriptorAndroid | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleAsync")(packageName.asInstanceOf[js.Any], revision.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ModuleDescriptorAndroid | Null]]
}
