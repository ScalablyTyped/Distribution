package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options object to change the default behavior of cy.exec().
  */
trait ExecOptions
  extends StObject
     with Loggable
     with Timeoutable {
  
  /**
    * Object of environment variables to set before the command executes
    * (e.g. {USERNAME: 'johndoe'}). Will be merged with existing
    * system environment variables
    *
    * @default {}
    */
  var env: js.Object
  
  /**
    * Whether to fail if the command exits with a non-zero code
    *
    * @default true
    */
  var failOnNonZeroExit: Boolean
}
object ExecOptions {
  
  inline def apply(env: js.Object, failOnNonZeroExit: Boolean, log: Boolean, timeout: Double): ExecOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], failOnNonZeroExit = failOnNonZeroExit.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecOptions]
  }
  
  extension [Self <: ExecOptions](x: Self) {
    
    inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setFailOnNonZeroExit(value: Boolean): Self = StObject.set(x, "failOnNonZeroExit", value.asInstanceOf[js.Any])
  }
}
