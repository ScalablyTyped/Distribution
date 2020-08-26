package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object DescribeDominantLanguageDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
  }
  @scala.inline
  implicit class DescribeDominantLanguageDetectionJobRequestOps[Self <: DescribeDominantLanguageDetectionJobRequest] (val x: Self) extends AnyVal {
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

