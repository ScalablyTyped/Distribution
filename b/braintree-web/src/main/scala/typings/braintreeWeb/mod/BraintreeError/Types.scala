package typings.braintreeWeb.mod.BraintreeError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintreeWeb.braintreeWebStrings.CUSTOMER
  - typings.braintreeWeb.braintreeWebStrings.MERCHANT
  - typings.braintreeWeb.braintreeWebStrings.NETWORK
  - typings.braintreeWeb.braintreeWebStrings.INTERNAL
  - typings.braintreeWeb.braintreeWebStrings.UNKNOWN
*/
trait Types extends js.Object

object Types {
  @scala.inline
  def CUSTOMER: typings.braintreeWeb.braintreeWebStrings.CUSTOMER = this.cast("CUSTOMER")
  @scala.inline
  def INTERNAL: typings.braintreeWeb.braintreeWebStrings.INTERNAL = this.cast("INTERNAL")
  @scala.inline
  def MERCHANT: typings.braintreeWeb.braintreeWebStrings.MERCHANT = this.cast("MERCHANT")
  @scala.inline
  def NETWORK: typings.braintreeWeb.braintreeWebStrings.NETWORK = this.cast("NETWORK")
  @scala.inline
  def UNKNOWN: typings.braintreeWeb.braintreeWebStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

