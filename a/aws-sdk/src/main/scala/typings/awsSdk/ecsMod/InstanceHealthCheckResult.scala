package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceHealthCheckResult extends StObject {
  
  /**
    * The Unix timestamp for when the container instance health status last changed.
    */
  var lastStatusChange: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix timestamp for when the container instance health status was last updated.
    */
  var lastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The container instance health status.
    */
  var status: js.UndefOr[InstanceHealthCheckState] = js.undefined
  
  /**
    * The type of container instance health status that was verified.
    */
  var `type`: js.UndefOr[InstanceHealthCheckType] = js.undefined
}
object InstanceHealthCheckResult {
  
  inline def apply(): InstanceHealthCheckResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHealthCheckResult]
  }
  
  extension [Self <: InstanceHealthCheckResult](x: Self) {
    
    inline def setLastStatusChange(value: js.Date): Self = StObject.set(x, "lastStatusChange", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeUndefined: Self = StObject.set(x, "lastStatusChange", js.undefined)
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setStatus(value: InstanceHealthCheckState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: InstanceHealthCheckType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
