package typings
package cypressLib.CypressNs

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
  var failOnNonZeroExit: scala.Boolean
}

