package typings.cypress.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failable extends js.Object {
  /**
    * Whether to fail on response codes other than 2xx and 3xx
    *
    * @default {true}
    */
  var failOnStatusCode: Boolean
  /**
    * Whether Cypress should automatically retry transient network errors under the hood
    *
    * @default {true}
    */
  var retryOnNetworkFailure: Boolean
  /**
    * Whether Cypress should automatically retry status code errors under the hood
    *
    * @default {false}
    */
  var retryOnStatusCodeFailure: Boolean
}

object Failable {
  @scala.inline
  def apply(failOnStatusCode: Boolean, retryOnNetworkFailure: Boolean, retryOnStatusCodeFailure: Boolean): Failable = {
    val __obj = js.Dynamic.literal(failOnStatusCode = failOnStatusCode.asInstanceOf[js.Any], retryOnNetworkFailure = retryOnNetworkFailure.asInstanceOf[js.Any], retryOnStatusCodeFailure = retryOnStatusCodeFailure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Failable]
  }
}

