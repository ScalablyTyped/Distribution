package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVehiclesResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.iotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of vehicles and information about them. 
    */
  var vehicleSummaries: js.UndefOr[typings.awsSdk.iotfleetwiseMod.vehicleSummaries] = js.undefined
}
object ListVehiclesResponse {
  
  inline def apply(): ListVehiclesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVehiclesResponse]
  }
  
  extension [Self <: ListVehiclesResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVehicleSummaries(value: vehicleSummaries): Self = StObject.set(x, "vehicleSummaries", value.asInstanceOf[js.Any])
    
    inline def setVehicleSummariesUndefined: Self = StObject.set(x, "vehicleSummaries", js.undefined)
    
    inline def setVehicleSummariesVarargs(value: VehicleSummary*): Self = StObject.set(x, "vehicleSummaries", js.Array(value*))
  }
}
