package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionV2JobRequest extends js.Object {
  /**
    * The identifier of the medical entities job to stop.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}

object StopEntitiesDetectionV2JobRequest {
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionV2JobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionV2JobRequest]
  }
  @scala.inline
  implicit class StopEntitiesDetectionV2JobRequestOps[Self <: StopEntitiesDetectionV2JobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
  }
  
}

