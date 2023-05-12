package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libFormatterMod.IFormatterStream
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argv extends StObject {
  
  var argv: js.Array[String]
  
  var cwd: String
  
  var env: ProcessEnv
  
  var stderr: js.UndefOr[IFormatterStream] = js.undefined
  
  var stdout: IFormatterStream
}
object Argv {
  
  inline def apply(argv: js.Array[String], cwd: String, env: ProcessEnv, stdout: IFormatterStream): Argv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
    
    inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
    
    inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: IFormatterStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdout(value: IFormatterStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
