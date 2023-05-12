package typings.cucumberCucumber.libApiTypesMod

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRunEnvironment extends StObject {
  
  /**
    * Working directory for the project (defaults to `process.cwd()` if omitted).
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Whether debug logging is enabled.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Environment variables (defaults to `process.env` if omitted).
    */
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  /**
    * Writable stream where the test run's warning/error output is written (defaults to `process.stderr` if omitted).
    */
  var stderr: js.UndefOr[Writable] = js.undefined
  
  /**
    * Writable stream where the test run's main output is written (defaults to `process.stdout` if omitted).
    */
  var stdout: js.UndefOr[Writable] = js.undefined
}
object IRunEnvironment {
  
  inline def apply(): IRunEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRunEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRunEnvironment] (val x: Self) extends AnyVal {
    
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
