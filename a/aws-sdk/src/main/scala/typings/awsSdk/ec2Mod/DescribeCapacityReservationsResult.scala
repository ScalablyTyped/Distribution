package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCapacityReservationsResult extends StObject {
  
  /**
    * Information about the Capacity Reservations.
    */
  var CapacityReservations: js.UndefOr[CapacityReservationSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeCapacityReservationsResult {
  
  @scala.inline
  def apply(): DescribeCapacityReservationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCapacityReservationsResult]
  }
  
  @scala.inline
  implicit class DescribeCapacityReservationsResultMutableBuilder[Self <: DescribeCapacityReservationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservations(value: CapacityReservationSet): Self = StObject.set(x, "CapacityReservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationsUndefined: Self = StObject.set(x, "CapacityReservations", js.undefined)
    
    @scala.inline
    def setCapacityReservationsVarargs(value: CapacityReservation*): Self = StObject.set(x, "CapacityReservations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
