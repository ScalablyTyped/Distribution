package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary extends StObject {
  
  /**
    * The ARN of the health check used by the endpoint to determine whether failover is triggered.
    */
  var HealthCheck: typings.awsSdk.eventbridgeMod.HealthCheck
}
object Primary {
  
  inline def apply(HealthCheck: HealthCheck): Primary = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
  
  extension [Self <: Primary](x: Self) {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
  }
}
