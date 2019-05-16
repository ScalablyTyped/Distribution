package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeStatusHistory extends js.Object {
  var disbursementDate: stdLib.Date
  var effectiveDate: stdLib.Date
  var status: DisputeStatus
  var timestamp: stdLib.Date
}

object DisputeStatusHistory {
  @scala.inline
  def apply(
    disbursementDate: stdLib.Date,
    effectiveDate: stdLib.Date,
    status: DisputeStatus,
    timestamp: stdLib.Date
  ): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate, effectiveDate = effectiveDate, status = status, timestamp = timestamp)
  
    __obj.asInstanceOf[DisputeStatusHistory]
  }
}

