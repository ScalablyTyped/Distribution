package typings.crossSpawnWindowsExe

import typings.crossSpawnWindowsExe.wrapperMod.CrossSpawnExeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotnetMod {
  
  @JSImport("cross-spawn-windows-exe/dist/src/dotnet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def determineDotNetWrapper(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineDotNetWrapper")().asInstanceOf[String]
  inline def determineDotNetWrapper(customDotNetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineDotNetWrapper")(customDotNetPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dotNetDependencyInstallInstructions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dotNetDependencyInstallInstructions")().asInstanceOf[String]
  
  inline def spawnDotNet(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnDotNet")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawnDotNet(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnDotNet")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnDotNet(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any,
    options: CrossSpawnExeOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnDotNet")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnDotNet(cmd: String, args: Unit, options: CrossSpawnExeOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnDotNet")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
