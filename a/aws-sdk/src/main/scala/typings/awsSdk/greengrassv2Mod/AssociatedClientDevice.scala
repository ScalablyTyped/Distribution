package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedClientDevice extends StObject {
  
  /**
    * The time that the client device was associated, expressed in ISO 8601 format.
    */
  var associationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the IoT thing that represents the associated client device.
    */
  var thingName: js.UndefOr[IoTThingName] = js.undefined
}
object AssociatedClientDevice {
  
  inline def apply(): AssociatedClientDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedClientDevice]
  }
  
  extension [Self <: AssociatedClientDevice](x: Self) {
    
    inline def setAssociationTimestamp(value: js.Date): Self = StObject.set(x, "associationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAssociationTimestampUndefined: Self = StObject.set(x, "associationTimestamp", js.undefined)
    
    inline def setThingName(value: IoTThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
