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
  def apply(NextToken: String = null, Reservations: ReservationList = null): DescribeInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Reservations != null) __obj.updateDynamic("Reservations")(Reservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstancesResult]
  }
}

