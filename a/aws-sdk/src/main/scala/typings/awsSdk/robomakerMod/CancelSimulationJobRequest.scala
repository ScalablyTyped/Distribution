package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSimulationJobRequest extends StObject {
  
  /**
    * The simulation job ARN to cancel.
    */
  var job: Arn
}
object CancelSimulationJobRequest {
  
  inline def apply(job: Arn): CancelSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSimulationJobRequest]
  }
  
  extension [Self <: CancelSimulationJobRequest](x: Self) {
    
    inline def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
