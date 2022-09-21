package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reservation extends StObject {
  
  /**
    * [EC2-Classic only] The security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * The instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the requester that launched the instances on your behalf (for example, Amazon Web Services Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.undefined
}
object Reservation {
  
  inline def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  extension [Self <: Reservation](x: Self) {
    
    inline def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRequesterId(value: String): Self = StObject.set(x, "RequesterId", value.asInstanceOf[js.Any])
    
    inline def setRequesterIdUndefined: Self = StObject.set(x, "RequesterId", js.undefined)
    
    inline def setReservationId(value: String): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
    
    inline def setReservationIdUndefined: Self = StObject.set(x, "ReservationId", js.undefined)
  }
}
