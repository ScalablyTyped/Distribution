package typings.cucumberCucumber.anon

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@cucumber/cucumber.@cucumber/cucumber/lib/api/types.IRunEnvironment> */
trait PartialIRunEnvironment extends StObject {
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var stderr: js.UndefOr[Writable] = js.undefined
  
  var stdout: js.UndefOr[Writable] = js.undefined
}
object PartialIRunEnvironment {
  
  inline def apply(): PartialIRunEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIRunEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIRunEnvironment] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setStderr(value: Writable): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
    
    inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
    
    inline def setStdout(value: Writable): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    
    inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
  }
}
