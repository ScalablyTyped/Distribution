package typings.crossSpawnWindowsExe

import typings.crossSpawnWindowsExe.wrapperMod.CrossSpawnExeOptions
import typings.crossSpawnWindowsExe.wrapperMod.DetermineWrapperFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cross-spawn-windows-exe/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cross-spawn-windows-exe/dist/src", "WrapperError")
  @js.native
  open class WrapperError protected ()
    extends typings.crossSpawnWindowsExe.wrapperMod.WrapperError {
    /**
      * @param wrapperCommand - The wrapper that tried to be executed
      * @param installInstructions - Instructions on how to install the wrapper
      */
    def this(wrapperCommand: String) = this()
    def this(wrapperCommand: String, installInstructions: String) = this()
  }
  
  inline def canRunWindowsExeNatively(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canRunWindowsExeNatively")().asInstanceOf[Boolean]
  
  inline def dotNetDependencyInstallInstructions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dotNetDependencyInstallInstructions")().asInstanceOf[String]
  
  inline def exeDependencyInstallInstructions(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exeDependencyInstallInstructions")().asInstanceOf[String]
  
  inline def is64BitArch(arch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is64BitArch")(arch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizePath(pathToNormalize: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(pathToNormalize.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def spawn(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawn(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any,
    options: CrossSpawnExeOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawn(cmd: String, args: Unit, options: CrossSpawnExeOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawn")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
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
  
  inline def spawnWrapperFromFunction(wrapperFunction: DetermineWrapperFunction, cmd: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapperFromFunction")(wrapperFunction.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnWrapperFromFunction(
    wrapperFunction: DetermineWrapperFunction,
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapperFromFunction")(wrapperFunction.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnWrapperFromFunction(
    wrapperFunction: DetermineWrapperFunction,
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any,
    options: CrossSpawnExeOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapperFromFunction")(wrapperFunction.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnWrapperFromFunction(wrapperFunction: DetermineWrapperFunction, cmd: String, args: Unit, options: CrossSpawnExeOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapperFromFunction")(wrapperFunction.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
