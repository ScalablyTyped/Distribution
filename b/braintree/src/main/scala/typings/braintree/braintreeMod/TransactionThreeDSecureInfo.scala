package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionThreeDSecureInfo extends js.Object {
  var enrolled: String
  var liabilityShiftPossible: Boolean
  var liabilityShifted: Boolean
  var status: String
}

object TransactionThreeDSecureInfo {
  @scala.inline
  def apply(enrolled: String, liabilityShiftPossible: Boolean, liabilityShifted: Boolean, status: String): TransactionThreeDSecureInfo = {
    val __obj = js.Dynamic.literal(enrolled = enrolled, liabilityShiftPossible = liabilityShiftPossible, liabilityShifted = liabilityShifted, status = status)
  
    __obj.asInstanceOf[TransactionThreeDSecureInfo]
  }
}

