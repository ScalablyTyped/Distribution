package typings.braintreeDashWeb.braintreeDashWebMod

import typings.braintreeDashWeb.braintreeDashWebMod.BraintreeError.Types
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

@JSImport("braintree-web", "BraintreeError")
@js.native
object BraintreeError extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeDashWeb.braintreeDashWebStrings.CUSTOMER
    - typings.braintreeDashWeb.braintreeDashWebStrings.MERCHANT
    - typings.braintreeDashWeb.braintreeDashWebStrings.NETWORK
    - typings.braintreeDashWeb.braintreeDashWebStrings.INTERNAL
    - typings.braintreeDashWeb.braintreeDashWebStrings.UNKNOWN
  */
  trait Types extends js.Object
  
}

