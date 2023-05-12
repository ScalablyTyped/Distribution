package typings.cucumberCucumber

import typings.cucumberCucumber.anon.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliMod {
  
  @JSImport("@cucumber/cucumber/lib/cli", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cli {
    def this(param0: Argv) = this()
    
    /* private */ /* CompleteClass */
    override val argv: Any = js.native
    
    /* private */ /* CompleteClass */
    override val cwd: Any = js.native
    
    /* private */ /* CompleteClass */
    override val env: Any = js.native
    
    /* CompleteClass */
    override def run(): js.Promise[ICliRunResult] = js.native
    
    /* private */ /* CompleteClass */
    override val stderr: Any = js.native
    
    /* private */ /* CompleteClass */
    override val stdout: Any = js.native
  }
  
  trait Cli extends StObject {
    
    /* private */ val argv: Any
    
    /* private */ val cwd: Any
    
    /* private */ val env: Any
    
    def run(): js.Promise[ICliRunResult]
    
    /* private */ val stderr: Any
    
    /* private */ val stdout: Any
  }
  object Cli {
    
    inline def apply(argv: Any, cwd: Any, env: Any, run: () => js.Promise[ICliRunResult], stderr: Any, stdout: Any): Cli = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], run = js.Any.fromFunction0(run), stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cli]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cli] (val x: Self) extends AnyVal {
      
      inline def setArgv(value: Any): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: Any): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setRun(value: () => js.Promise[ICliRunResult]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      inline def setStderr(value: Any): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: Any): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICliRunResult extends StObject {
    
    var shouldAdvertisePublish: Boolean
    
    var shouldExitImmediately: Boolean
    
    var success: Boolean
  }
  object ICliRunResult {
    
    inline def apply(shouldAdvertisePublish: Boolean, shouldExitImmediately: Boolean, success: Boolean): ICliRunResult = {
      val __obj = js.Dynamic.literal(shouldAdvertisePublish = shouldAdvertisePublish.asInstanceOf[js.Any], shouldExitImmediately = shouldExitImmediately.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICliRunResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICliRunResult] (val x: Self) extends AnyVal {
      
      inline def setShouldAdvertisePublish(value: Boolean): Self = StObject.set(x, "shouldAdvertisePublish", value.asInstanceOf[js.Any])
      
      inline def setShouldExitImmediately(value: Boolean): Self = StObject.set(x, "shouldExitImmediately", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
