package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomAvailabilityZoneMessage extends StObject {
  
  /**
    * The custom AZ identifier.
    */
  var CustomAvailabilityZoneId: String
}
object DeleteCustomAvailabilityZoneMessage {
  
  inline def apply(CustomAvailabilityZoneId: String): DeleteCustomAvailabilityZoneMessage = {
    val __obj = js.Dynamic.literal(CustomAvailabilityZoneId = CustomAvailabilityZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomAvailabilityZoneMessage]
  }
  
  extension [Self <: DeleteCustomAvailabilityZoneMessage](x: Self) {
    
    inline def setCustomAvailabilityZoneId(value: String): Self = StObject.set(x, "CustomAvailabilityZoneId", value.asInstanceOf[js.Any])
  }
}
