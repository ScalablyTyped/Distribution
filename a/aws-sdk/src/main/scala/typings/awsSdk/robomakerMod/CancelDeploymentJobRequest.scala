package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDeploymentJobRequest extends js.Object {
  /**
    * The deployment job ARN to cancel.
    */
  var job: Arn = js.native
}

object CancelDeploymentJobRequest {
  @scala.inline
  def apply(job: Arn): CancelDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDeploymentJobRequest]
  }
  @scala.inline
  implicit class CancelDeploymentJobRequestOps[Self <: CancelDeploymentJobRequest] (val x: Self) extends AnyVal {
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

