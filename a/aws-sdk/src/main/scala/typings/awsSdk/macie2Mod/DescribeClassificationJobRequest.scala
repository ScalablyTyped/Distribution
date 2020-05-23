package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClassificationJobRequest extends js.Object {
  /**
    * The unique identifier for the classification job.
    */
  var jobId: string = js.native
}

object DescribeClassificationJobRequest {
  @scala.inline
  def apply(jobId: string): DescribeClassificationJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClassificationJobRequest]
  }
}

