package typings.crossSpawnWindowsExe

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperMod {
  
  @JSImport("cross-spawn-windows-exe/dist/src/wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cross-spawn-windows-exe/dist/src/wrapper", "WrapperError")
  @js.native
  open class WrapperError protected ()
    extends StObject
       with Error {
    /**
      * @param wrapperCommand - The wrapper that tried to be executed
      * @param installInstructions - Instructions on how to install the wrapper
      */
    def this(wrapperCommand: String) = this()
    def this(wrapperCommand: String, installInstructions: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def canRunWindowsExeNatively(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canRunWindowsExeNatively")().asInstanceOf[Boolean]
  
  inline def spawnWrapper(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapper")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def spawnWrapper(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapper")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnWrapper(
    cmd: String,
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnArgs */ Any,
    options: CrossSpawnExeOptions
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapper")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def spawnWrapper(cmd: String, args: Unit, options: CrossSpawnExeOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("spawnWrapper")(cmd.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
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
  
  inline def wrapperCommandExists(wrapperCommand: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapperCommandExists")(wrapperCommand.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossSpawnOptions * / any */ trait CrossSpawnExeOptions extends StObject {
    
    /**
      * The path to a binary that wraps the called executable.
      *
      * Defaults to `wine64` or `wine`, depending on the host machine's architecture.
      */
    var wrapperCommand: js.UndefOr[String] = js.undefined
    
    /**
      * Instructions for installing the wrapper binary.
      */
    var wrapperInstructions: js.UndefOr[String] = js.undefined
  }
  object CrossSpawnExeOptions {
    
    inline def apply(): CrossSpawnExeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossSpawnExeOptions]
    }
    
    extension [Self <: CrossSpawnExeOptions](x: Self) {
      
      inline def setWrapperCommand(value: String): Self = StObject.set(x, "wrapperCommand", value.asInstanceOf[js.Any])
      
      inline def setWrapperCommandUndefined: Self = StObject.set(x, "wrapperCommand", js.undefined)
      
      inline def setWrapperInstructions(value: String): Self = StObject.set(x, "wrapperInstructions", value.asInstanceOf[js.Any])
      
      inline def setWrapperInstructionsUndefined: Self = StObject.set(x, "wrapperInstructions", js.undefined)
    }
  }
  
  type DetermineWrapperFunction = js.Function1[/* customPath */ js.UndefOr[String], String]
}
