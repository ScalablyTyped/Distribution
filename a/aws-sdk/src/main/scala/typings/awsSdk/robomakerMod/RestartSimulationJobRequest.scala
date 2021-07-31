package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestartSimulationJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var job: Arn
}
object RestartSimulationJobRequest {
  
  @scala.inline
  def apply(job: Arn): RestartSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartSimulationJobRequest]
  }
  
  @scala.inline
  implicit class RestartSimulationJobRequestMutableBuilder[Self <: RestartSimulationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Arn): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
  }
}
