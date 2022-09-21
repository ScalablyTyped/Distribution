package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupsForCapacityReservationResult extends StObject {
  
  /**
    * Information about the resource groups to which the Capacity Reservation has been added.
    */
  var CapacityReservationGroups: js.UndefOr[CapacityReservationGroupSet] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetGroupsForCapacityReservationResult {
  
  inline def apply(): GetGroupsForCapacityReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupsForCapacityReservationResult]
  }
  
  extension [Self <: GetGroupsForCapacityReservationResult](x: Self) {
    
    inline def setCapacityReservationGroups(value: CapacityReservationGroupSet): Self = StObject.set(x, "CapacityReservationGroups", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationGroupsUndefined: Self = StObject.set(x, "CapacityReservationGroups", js.undefined)
    
    inline def setCapacityReservationGroupsVarargs(value: CapacityReservationGroup*): Self = StObject.set(x, "CapacityReservationGroups", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
