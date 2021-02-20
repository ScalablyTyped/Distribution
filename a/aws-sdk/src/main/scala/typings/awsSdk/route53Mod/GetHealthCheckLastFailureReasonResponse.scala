package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHealthCheckLastFailureReasonResponse extends StObject {
  
  /**
    * A list that contains one Observation element for each Amazon Route 53 health checker that is reporting a last failure reason. 
    */
  var HealthCheckObservations: typings.awsSdk.route53Mod.HealthCheckObservations = js.native
}
object GetHealthCheckLastFailureReasonResponse {
  
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckLastFailureReasonResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHealthCheckLastFailureReasonResponse]
  }
  
  @scala.inline
  implicit class GetHealthCheckLastFailureReasonResponseMutableBuilder[Self <: GetHealthCheckLastFailureReasonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckObservations(value: HealthCheckObservations): Self = StObject.set(x, "HealthCheckObservations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckObservationsVarargs(value: HealthCheckObservation*): Self = StObject.set(x, "HealthCheckObservations", js.Array(value :_*))
  }
}
