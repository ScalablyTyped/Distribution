package typings.crossSpawnWindowsExe

import typings.crossSpawnWindowsExe.wrapperMod.CrossSpawnExeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exeMod {
  
  @JSImport("cross-spawn-windows-exe/dist/src/exe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def determineWineWrapper(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineWineWrapper")().asInstanceOf[String]
  inline def determineWineWrapper(customWinePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("determineWineWrapper")(customWinePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def exeDependencyInstallInstructions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exeDependencyInstallInstructions")().asInstanceOf[String]
  
  inline def spawnExe(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnExe")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawnExe(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnExe")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnExe(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any,
    options: CrossSpawnExeOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnExe")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnExe(cmd: String, args: Unit, options: CrossSpawnExeOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnExe")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
