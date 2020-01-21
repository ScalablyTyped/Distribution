package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobResponse extends js.Object {
  /**
    * Each job converts an input file into an output file or files. For more information, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
    */
  var Job: js.UndefOr[typings.awsSdk.mediaconvertMod.Job] = js.native
}

object GetJobResponse {
  @scala.inline
  def apply(Job: Job = null): GetJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobResponse]
  }
}

