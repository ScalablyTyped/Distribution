package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstancesResult extends StObject {
  
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
  implicit class DescribeInstancesResultMutableBuilder[Self <: DescribeInstancesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setReservations(value: ReservationList): Self = StObject.set(x, "Reservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationsUndefined: Self = StObject.set(x, "Reservations", js.undefined)
    
    @scala.inline
    def setReservationsVarargs(value: Reservation*): Self = StObject.set(x, "Reservations", js.Array(value :_*))
  }
}
