package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReservationsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * List of reservations
    */
  var Reservations: js.UndefOr[listOfReservation] = js.native
}

object ListReservationsResponse {
  @scala.inline
  def apply(NextToken: string = null, Reservations: listOfReservation = null): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Reservations != null) __obj.updateDynamic("Reservations")(Reservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReservationsResponse]
  }
}

