package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.ExecOptions> */
trait PartialExecOptions extends StObject {
  
  var env: js.UndefOr[js.Object] = js.undefined
  
  var failOnNonZeroExit: js.UndefOr[Boolean] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialExecOptions {
  
  inline def apply(): PartialExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialExecOptions]
  }
  
  extension [Self <: PartialExecOptions](x: Self) {
    
    inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setFailOnNonZeroExit(value: Boolean): Self = StObject.set(x, "failOnNonZeroExit", value.asInstanceOf[js.Any])
    
    inline def setFailOnNonZeroExitUndefined: Self = StObject.set(x, "failOnNonZeroExit", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
