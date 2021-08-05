package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityZone extends StObject {
  
  /**
    * The state of the Availability Zone.
    */
  var state: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the Availability Zone. The format is us-east-2a (case-sensitive).
    */
  var zoneName: js.UndefOr[NonEmptyString] = js.undefined
}
object AvailabilityZone {
  
  inline def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  extension [Self <: AvailabilityZone](x: Self) {
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setZoneName(value: NonEmptyString): Self = StObject.set(x, "zoneName", value.asInstanceOf[js.Any])
    
    inline def setZoneNameUndefined: Self = StObject.set(x, "zoneName", js.undefined)
  }
}
