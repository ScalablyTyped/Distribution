package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeReservationRequest extends js.Object {
  /**
    * Unique reservation ID, e.g. '1234567'
    */
  var ReservationId: string = js.native
}

object DescribeReservationRequest {
  @scala.inline
  def apply(ReservationId: string): DescribeReservationRequest = {
    val __obj = js.Dynamic.literal(ReservationId = ReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeReservationRequest]
  }
}

