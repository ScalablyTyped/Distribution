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
  @scala.inline
  implicit class RestartSimulationJobRequestOps[Self <: RestartSimulationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJob(value: Arn): Self = this.set("job", value.asInstanceOf[js.Any])
  }
  
}

