package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZone extends StObject {
  
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[NonEmptyString] = js.undefined
}
object AvailabilityZone {
  
  inline def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  extension [Self <: AvailabilityZone](x: Self) {
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setZoneName(value: NonEmptyString): Self = StObject.set(x, "ZoneName", value.asInstanceOf[js.Any])
    
    inline def setZoneNameUndefined: Self = StObject.set(x, "ZoneName", js.undefined)
  }
}
