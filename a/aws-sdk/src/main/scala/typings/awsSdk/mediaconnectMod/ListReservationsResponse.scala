package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReservationsResponse extends js.Object {
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListReservations request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListReservations request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * A list of all reservations that have been purchased by this account in the current AWS Region.
    */
  var Reservations: js.UndefOr[listOfReservation] = js.native
}
object ListReservationsResponse {
  
  @scala.inline
  def apply(): ListReservationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsResponse]
  }
  
  @scala.inline
  implicit class ListReservationsResponseOps[Self <: ListReservationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = this.set("Reservations", js.Array(value :_*))
    
    @scala.inline
    def setReservations(value: listOfReservation): Self = this.set("Reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservations: Self = this.set("Reservations", js.undefined)
  }
}
