package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.US
  - typings.braintree.braintreeStrings.International
*/
trait CustomerLocation extends js.Object

object CustomerLocation {
  @scala.inline
  def International: typings.braintree.braintreeStrings.International = this.cast("International")
  @scala.inline
  def US: typings.braintree.braintreeStrings.US = this.cast("US")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

