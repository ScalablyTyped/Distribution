package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribeEntitiesDetectionV2Job operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StartEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(): StartEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEntitiesDetectionV2JobResponse]
  }
  @scala.inline
  implicit class StartEntitiesDetectionV2JobResponseOps[Self <: StartEntitiesDetectionV2JobResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
  
}

