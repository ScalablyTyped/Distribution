package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHealthCheckCountResponse extends StObject {
  
  /**
    * The number of health checks associated with the current AWS account.
    */
  var HealthCheckCount: typings.awsSdk.route53Mod.HealthCheckCount
}
object GetHealthCheckCountResponse {
  
  inline def apply(HealthCheckCount: HealthCheckCount): GetHealthCheckCountResponse = {
    val __obj = js.Dynamic.literal(HealthCheckCount = HealthCheckCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckCountResponse]
  }
  
  extension [Self <: GetHealthCheckCountResponse](x: Self) {
    
    inline def setHealthCheckCount(value: HealthCheckCount): Self = StObject.set(x, "HealthCheckCount", value.asInstanceOf[js.Any])
  }
}
