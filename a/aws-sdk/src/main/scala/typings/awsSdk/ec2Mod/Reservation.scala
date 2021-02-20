package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reservation extends StObject {
  
  /**
    * [EC2-Classic only] The security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * The instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  
  /**
    * The ID of the AWS account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.native
}
object Reservation {
  
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  
  @scala.inline
  implicit class ReservationMutableBuilder[Self <: Reservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setRequesterId(value: String): Self = StObject.set(x, "RequesterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterIdUndefined: Self = StObject.set(x, "RequesterId", js.undefined)
    
    @scala.inline
    def setReservationId(value: String): Self = StObject.set(x, "ReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationIdUndefined: Self = StObject.set(x, "ReservationId", js.undefined)
  }
}
