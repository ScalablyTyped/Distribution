package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstancesResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the reservations.
    */
  var Reservations: js.UndefOr[ReservationList] = js.native
}

object DescribeInstancesResult {
  @scala.inline
  def apply(): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstancesResult]
  }
  @scala.inline
  implicit class DescribeInstancesResultOps[Self <: DescribeInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = this.set("Reservations", js.Array(value :_*))
    @scala.inline
    def setReservations(value: ReservationList): Self = this.set("Reservations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservations: Self = this.set("Reservations", js.undefined)
  }
  
}

