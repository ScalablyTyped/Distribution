package typings.braintreeDashWeb.braintreeDashWebMod

import typings.braintreeDashWeb.braintreeDashWebMod.BraintreeError.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("BraintreeError")
trait BraintreeError_ extends js.Object {
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

object BraintreeError_ {
  @scala.inline
  def apply(code: String, details: js.Any, message: String, `type`: Types): BraintreeError_ = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BraintreeError_]
  }
}

