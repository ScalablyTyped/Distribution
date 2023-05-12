package typings.cucumberCucumber.anon

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@cucumber/cucumber.@cucumber/cucumber/lib/api/types.IRunEnvironment> */
trait RequiredIRunEnvironment extends StObject {
  
  var cwd: String
  
  var debug: Boolean
  
  var env: ProcessEnv
  
  var stderr: Writable
  
  var stdout: Writable
}
object RequiredIRunEnvironment {
  
  inline def apply(cwd: String, debug: Boolean, env: ProcessEnv, stderr: Writable, stdout: Writable): RequiredIRunEnvironment = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredIRunEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredIRunEnvironment] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setStderr(value: Writable): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStdout(value: Writable): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
  }
}
