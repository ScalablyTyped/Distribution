package typings.awsSdk.iotsecuretunnelingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationConfig extends StObject {
  
  /**
    * A list of service names that identity the target application. The AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the destination application.
    */
  var services: ServiceList
  
  /**
    * The name of the IoT thing to which you want to connect.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object DestinationConfig {
  
  inline def apply(services: ServiceList): DestinationConfig = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationConfig]
  }
  
  extension [Self <: DestinationConfig](x: Self) {
    
    inline def setServices(value: ServiceList): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
