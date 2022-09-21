package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetResult extends StObject {
  
  /**
    * Information about the instances that could not be launched by the fleet. Supported only for fleets of type instant.
    */
  var Errors: js.UndefOr[CreateFleetErrorsSet] = js.undefined
  
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.undefined
  
  /**
    * Information about the instances that were launched by the fleet. Supported only for fleets of type instant.
    */
  var Instances: js.UndefOr[CreateFleetInstancesSet] = js.undefined
}
object CreateFleetResult {
  
  inline def apply(): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResult]
  }
  
  extension [Self <: CreateFleetResult](x: Self) {
    
    inline def setErrors(value: CreateFleetErrorsSet): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: CreateFleetError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setInstances(value: CreateFleetInstancesSet): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: CreateFleetInstance*): Self = StObject.set(x, "Instances", js.Array(value*))
  }
}
