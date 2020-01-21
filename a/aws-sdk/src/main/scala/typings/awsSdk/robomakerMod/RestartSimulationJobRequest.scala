package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestartSimulationJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var job: Arn = js.native
}

object RestartSimulationJobRequest {
  @scala.inline
  def apply(job: Arn): RestartSimulationJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RestartSimulationJobRequest]
  }
}

