package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: Arn
}
object DeleteFleetRequest {
  
  inline def apply(fleet: Arn): DeleteFleetRequest = {
    val __obj = js.Dynamic.literal(fleet = fleet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetRequest]
  }
  
  extension [Self <: DeleteFleetRequest](x: Self) {
    
    inline def setFleet(value: Arn): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
  }
}
