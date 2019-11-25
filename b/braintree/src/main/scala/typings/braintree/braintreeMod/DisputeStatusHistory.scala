package typings.braintree.braintreeMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeStatusHistory extends js.Object {
  var disbursementDate: Date
  var effectiveDate: Date
  var status: DisputeStatus
  var timestamp: Date
}

object DisputeStatusHistory {
  @scala.inline
  def apply(disbursementDate: Date, effectiveDate: Date, status: DisputeStatus, timestamp: Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisputeStatusHistory]
  }
}

