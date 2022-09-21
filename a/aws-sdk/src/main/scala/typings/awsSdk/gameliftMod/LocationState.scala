package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationState extends StObject {
  
  /**
    * The fleet location, expressed as an Amazon Web Services Region code such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * The life-cycle status of a fleet location. 
    */
  var Status: js.UndefOr[FleetStatus] = js.undefined
}
object LocationState {
  
  inline def apply(): LocationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationState]
  }
  
  extension [Self <: LocationState](x: Self) {
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setStatus(value: FleetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
