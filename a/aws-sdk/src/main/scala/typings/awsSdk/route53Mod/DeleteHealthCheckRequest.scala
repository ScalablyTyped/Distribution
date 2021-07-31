package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHealthCheckRequest extends StObject {
  
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typings.awsSdk.route53Mod.HealthCheckId
}
object DeleteHealthCheckRequest {
  
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
  
  @scala.inline
  implicit class DeleteHealthCheckRequestMutableBuilder[Self <: DeleteHealthCheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckId(value: HealthCheckId): Self = StObject.set(x, "HealthCheckId", value.asInstanceOf[js.Any])
  }
}
