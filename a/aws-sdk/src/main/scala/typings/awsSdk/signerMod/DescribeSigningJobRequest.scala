package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSigningJobRequest extends js.Object {
  /**
    * The ID of the signing job on input.
    */
  var jobId: JobId = js.native
}

object DescribeSigningJobRequest {
  @scala.inline
  def apply(jobId: JobId): DescribeSigningJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeSigningJobRequest]
  }
}

