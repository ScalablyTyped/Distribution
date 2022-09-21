package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentCircuitBreaker extends StObject {
  
  /**
    * Determines whether to use the deployment circuit breaker logic for the service.
    */
  var enable: Boolean
  
  /**
    * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
    */
  var rollback: Boolean
}
object DeploymentCircuitBreaker {
  
  inline def apply(enable: Boolean, rollback: Boolean): DeploymentCircuitBreaker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentCircuitBreaker]
  }
  
  extension [Self <: DeploymentCircuitBreaker](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
  }
}
