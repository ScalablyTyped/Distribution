package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapacityAllocation extends StObject {
  
  /**
    * The usage type. used indicates that the instance capacity is in use by instances that are running in the Capacity Reservation.
    */
  var AllocationType: js.UndefOr[typings.awsSdk.ec2Mod.AllocationType] = js.undefined
  
  /**
    * The amount of instance capacity associated with the usage. For example a value of 4 indicates that instance capacity for 4 instances is currently in use.
    */
  var Count: js.UndefOr[Integer] = js.undefined
}
object CapacityAllocation {
  
  inline def apply(): CapacityAllocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityAllocation]
  }
  
  extension [Self <: CapacityAllocation](x: Self) {
    
    inline def setAllocationType(value: AllocationType): Self = StObject.set(x, "AllocationType", value.asInstanceOf[js.Any])
    
    inline def setAllocationTypeUndefined: Self = StObject.set(x, "AllocationType", js.undefined)
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
