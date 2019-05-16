package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionThreeDSecureInfo extends js.Object {
  var enrolled: java.lang.String
  var liabilityShiftPossible: scala.Boolean
  var liabilityShifted: scala.Boolean
  var status: java.lang.String
}

object TransactionThreeDSecureInfo {
  @scala.inline
  def apply(
    enrolled: java.lang.String,
    liabilityShiftPossible: scala.Boolean,
    liabilityShifted: scala.Boolean,
    status: java.lang.String
  ): TransactionThreeDSecureInfo = {
    val __obj = js.Dynamic.literal(enrolled = enrolled, liabilityShiftPossible = liabilityShiftPossible, liabilityShifted = liabilityShifted, status = status)
  
    __obj.asInstanceOf[TransactionThreeDSecureInfo]
  }
}

