package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetOutput extends StObject {
  
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[typings.awsSdk.gameliftMod.FleetAttributes] = js.undefined
}
object CreateFleetOutput {
  
  inline def apply(): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetOutput]
  }
  
  extension [Self <: CreateFleetOutput](x: Self) {
    
    inline def setFleetAttributes(value: FleetAttributes): Self = StObject.set(x, "FleetAttributes", value.asInstanceOf[js.Any])
    
    inline def setFleetAttributesUndefined: Self = StObject.set(x, "FleetAttributes", js.undefined)
  }
}
