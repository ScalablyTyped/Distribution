package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.braintree.braintreeStrings.application_incomplete
  - typings.braintree.braintreeStrings.avs
  - typings.braintree.braintreeStrings.avs_and_cvv
  - typings.braintree.braintreeStrings.cvv
  - typings.braintree.braintreeStrings.duplicate
  - typings.braintree.braintreeStrings.fraud
  - typings.braintree.braintreeStrings.risk_threshold
  - typings.braintree.braintreeStrings.three_d_secure
  - typings.braintree.braintreeStrings.token_issuance
*/
trait GatewayRejectionReason extends js.Object

object GatewayRejectionReason {
  @scala.inline
  def application_incomplete: typings.braintree.braintreeStrings.application_incomplete = this.cast("application_incomplete")
  @scala.inline
  def avs: typings.braintree.braintreeStrings.avs = this.cast("avs")
  @scala.inline
  def avs_and_cvv: typings.braintree.braintreeStrings.avs_and_cvv = this.cast("avs_and_cvv")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cvv: typings.braintree.braintreeStrings.cvv = this.cast("cvv")
  @scala.inline
  def duplicate: typings.braintree.braintreeStrings.duplicate = this.cast("duplicate")
  @scala.inline
  def fraud: typings.braintree.braintreeStrings.fraud = this.cast("fraud")
  @scala.inline
  def risk_threshold: typings.braintree.braintreeStrings.risk_threshold = this.cast("risk_threshold")
  @scala.inline
  def three_d_secure: typings.braintree.braintreeStrings.three_d_secure = this.cast("three_d_secure")
  @scala.inline
  def token_issuance: typings.braintree.braintreeStrings.token_issuance = this.cast("token_issuance")
}

