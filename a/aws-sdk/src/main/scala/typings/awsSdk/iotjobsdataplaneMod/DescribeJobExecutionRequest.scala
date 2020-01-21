package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobExecutionRequest extends js.Object {
  /**
    * Optional. A number that identifies a particular job execution on a particular device. If not specified, the latest job execution is returned.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.native
  /**
    * Optional. When set to true, the response contains the job document. The default is false.
    */
  var includeJobDocument: js.UndefOr[IncludeJobDocument] = js.native
  /**
    * The unique identifier assigned to this job when it was created.
    */
  var jobId: DescribeJobExecutionJobId = js.native
  /**
    * The thing name associated with the device the job execution is running on.
    */
  var thingName: ThingName = js.native
}

object DescribeJobExecutionRequest {
  @scala.inline
  def apply(
    jobId: DescribeJobExecutionJobId,
    thingName: ThingName,
    executionNumber: Int | Double = null,
    includeJobDocument: js.UndefOr[Boolean] = js.undefined
  ): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    if (executionNumber != null) __obj.updateDynamic("executionNumber")(executionNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(includeJobDocument)) __obj.updateDynamic("includeJobDocument")(includeJobDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
}

