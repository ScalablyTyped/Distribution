package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubnetCidrReservationsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the IPv4 subnet CIDR reservations.
    */
  var SubnetIpv4CidrReservations: js.UndefOr[SubnetCidrReservationList] = js.undefined
  
  /**
    * Information about the IPv6 subnet CIDR reservations.
    */
  var SubnetIpv6CidrReservations: js.UndefOr[SubnetCidrReservationList] = js.undefined
}
object GetSubnetCidrReservationsResult {
  
  inline def apply(): GetSubnetCidrReservationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubnetCidrReservationsResult]
  }
  
  extension [Self <: GetSubnetCidrReservationsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSubnetIpv4CidrReservations(value: SubnetCidrReservationList): Self = StObject.set(x, "SubnetIpv4CidrReservations", value.asInstanceOf[js.Any])
    
    inline def setSubnetIpv4CidrReservationsUndefined: Self = StObject.set(x, "SubnetIpv4CidrReservations", js.undefined)
    
    inline def setSubnetIpv4CidrReservationsVarargs(value: SubnetCidrReservation*): Self = StObject.set(x, "SubnetIpv4CidrReservations", js.Array(value*))
    
    inline def setSubnetIpv6CidrReservations(value: SubnetCidrReservationList): Self = StObject.set(x, "SubnetIpv6CidrReservations", value.asInstanceOf[js.Any])
    
    inline def setSubnetIpv6CidrReservationsUndefined: Self = StObject.set(x, "SubnetIpv6CidrReservations", js.undefined)
    
    inline def setSubnetIpv6CidrReservationsVarargs(value: SubnetCidrReservation*): Self = StObject.set(x, "SubnetIpv6CidrReservations", js.Array(value*))
  }
}
