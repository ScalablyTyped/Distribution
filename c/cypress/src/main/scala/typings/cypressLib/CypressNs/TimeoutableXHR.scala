package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Options that control how long the Test Runner waits for an XHR request and response to succeed
   */

trait TimeoutableXHR extends js.Object {
  /**
       * Time to wait for the request (ms)
       *
       * @default {@link Timeoutable#timeout}
       * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
       */
  var requestTimeout: scala.Double
  /**
       * Time to wait for the response (ms)
       *
       * @default {@link Timeoutable#timeout}
       * @see https://docs.cypress.io/guides/references/configuration.html#Timeouts
       */
  var responseTimeout: scala.Double
}

