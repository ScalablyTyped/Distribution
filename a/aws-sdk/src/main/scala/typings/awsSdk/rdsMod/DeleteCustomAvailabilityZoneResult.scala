package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomAvailabilityZoneResult extends StObject {
  
  var CustomAvailabilityZone: js.UndefOr[typings.awsSdk.rdsMod.CustomAvailabilityZone] = js.undefined
}
object DeleteCustomAvailabilityZoneResult {
  
  inline def apply(): DeleteCustomAvailabilityZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneResult]
  }
  
  extension [Self <: DeleteCustomAvailabilityZoneResult](x: Self) {
    
    inline def setCustomAvailabilityZone(value: CustomAvailabilityZone): Self = StObject.set(x, "CustomAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setCustomAvailabilityZoneUndefined: Self = StObject.set(x, "CustomAvailabilityZone", js.undefined)
  }
}
