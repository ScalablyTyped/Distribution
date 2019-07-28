package typings.braintreeDashWeb.braintreeDashWebMod

import typings.braintreeDashWeb.braintreeDashWebMod.BraintreeErrorNs.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraintreeError extends js.Object {
  /**
    * @type {string}
    * @description A code that corresponds to specific errors.
    */
  var code: String
  /**
    * @type {object=}
    * @description Additional information about the error, such as an underlying network error response.
    */
  var details: js.Any
  /**
    * @type {string}
    * @description A short description of the error.
    */
  var message: String
  /**
    * @type {BraintreeError.types}
    * @description The type of error.
    */
  var `type`: Types
}

object BraintreeError {
  @scala.inline
  def apply(code: String, details: js.Any, message: String, `type`: Types): BraintreeError = {
    val __obj = js.Dynamic.literal(code = code, details = details, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BraintreeError]
  }
}

