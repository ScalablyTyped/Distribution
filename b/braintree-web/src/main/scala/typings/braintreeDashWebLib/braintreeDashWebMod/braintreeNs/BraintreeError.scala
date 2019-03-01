package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraintreeError extends js.Object {
  /**
    * @type {string}
    * @description A code that corresponds to specific errors.
    */
  var code: java.lang.String
  /**
    * @type {object=}
    * @description Additional information about the error, such as an underlying network error response.
    */
  var details: js.Any
  /**
    * @type {string}
    * @description A short description of the error.
    */
  var message: java.lang.String
  /**
    * @type {BraintreeError.types}
    * @description The type of error.
    */
  var `type`: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.BraintreeErrorNs.Types
}

object BraintreeError {
  @scala.inline
  def apply(
    code: java.lang.String,
    details: js.Any,
    message: java.lang.String,
    `type`: braintreeDashWebLib.braintreeDashWebMod.braintreeNs.BraintreeErrorNs.Types
  ): BraintreeError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("details")(details)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[BraintreeError]
  }
}

