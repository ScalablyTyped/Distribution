package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object to change the default behavior of cy.exec().
  */
trait ExecOptions
  extends Loggable
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
  @scala.inline
  def apply(env: js.Object, failOnNonZeroExit: Boolean, log: Boolean, timeout: Double): ExecOptions = {
    val __obj = js.Dynamic.literal(env = env, failOnNonZeroExit = failOnNonZeroExit, log = log, timeout = timeout)
  
    __obj.asInstanceOf[ExecOptions]
  }
}

