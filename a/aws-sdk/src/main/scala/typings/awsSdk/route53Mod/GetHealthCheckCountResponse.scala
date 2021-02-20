package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHealthCheckCountResponse extends StObject {
  
  /**
    * The number of health checks associated with the current AWS account.
    */
  var HealthCheckCount: typings.awsSdk.route53Mod.HealthCheckCount = js.native
}
object GetHealthCheckCountResponse {
  
  @scala.inline
  def apply(HealthCheckCount: HealthCheckCount): GetHealthCheckCountResponse = {
    val __obj = js.Dynamic.literal(HealthCheckCount = HealthCheckCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckCountResponse]
  }
  
  @scala.inline
  implicit class GetHealthCheckCountResponseMutableBuilder[Self <: GetHealthCheckCountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckCount(value: HealthCheckCount): Self = StObject.set(x, "HealthCheckCount", value.asInstanceOf[js.Any])
  }
}
