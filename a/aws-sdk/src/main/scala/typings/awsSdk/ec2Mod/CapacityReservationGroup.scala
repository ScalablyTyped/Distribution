package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityReservationGroup extends StObject {
  
  /**
    * The ARN of the resource group.
    */
  var GroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS account that owns the resource group.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
}
object CapacityReservationGroup {
  
  inline def apply(): CapacityReservationGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservationGroup]
  }
  
  extension [Self <: CapacityReservationGroup](x: Self) {
    
    inline def setGroupArn(value: String): Self = StObject.set(x, "GroupArn", value.asInstanceOf[js.Any])
    
    inline def setGroupArnUndefined: Self = StObject.set(x, "GroupArn", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
