package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobExecutionRequest extends js.Object {
  /**
    * A string (consisting of the digits "0" through "9" which is used to specify a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * The name of the thing on which the job execution is running.
    */
  var thingName: ThingName = js.native
}

object DescribeJobExecutionRequest {
  @scala.inline
  def apply(jobId: JobId, thingName: ThingName): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
  @scala.inline
  implicit class DescribeJobExecutionRequestOps[Self <: DescribeJobExecutionRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionNumber(value: ExecutionNumber): Self = this.set("executionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionNumber: Self = this.set("executionNumber", js.undefined)
  }
  
}

