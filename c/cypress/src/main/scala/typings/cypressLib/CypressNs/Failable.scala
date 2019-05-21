package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failable extends js.Object {
  /**
    * Whether to fail on response codes other than 2xx and 3xx
    *
    * @default {true}
    */
  var failOnStatusCode: scala.Boolean
  /**
    * Whether Cypress should automatically retry transient network errors under the hood
    *
    * @default {true}
    */
  var retryOnNetworkFailure: scala.Boolean
  /**
    * Whether Cypress should automatically retry status code errors under the hood
    *
    * @default {false}
    */
  var retryOnStatusCodeFailure: scala.Boolean
}

object Failable {
  @scala.inline
  def apply(
    failOnStatusCode: scala.Boolean,
    retryOnNetworkFailure: scala.Boolean,
    retryOnStatusCodeFailure: scala.Boolean
  ): Failable = {
    val __obj = js.Dynamic.literal(failOnStatusCode = failOnStatusCode, retryOnNetworkFailure = retryOnNetworkFailure, retryOnStatusCodeFailure = retryOnStatusCodeFailure)
  
    __obj.asInstanceOf[Failable]
  }
}

