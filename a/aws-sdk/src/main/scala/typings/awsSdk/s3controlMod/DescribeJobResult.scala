package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResult extends js.Object {
  /**
    * Contains the configuration parameters and status for the job specified in the Describe Job request.
    */
  var Job: js.UndefOr[JobDescriptor] = js.native
}

object DescribeJobResult {
  @scala.inline
  def apply(Job: JobDescriptor = null): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobResult]
  }
}

