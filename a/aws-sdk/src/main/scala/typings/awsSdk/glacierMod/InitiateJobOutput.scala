package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateJobOutput extends js.Object {
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[String] = js.native
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[String] = js.native
}

object InitiateJobOutput {
  @scala.inline
  def apply(jobId: String = null, jobOutputPath: String = null, location: String = null): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobOutputPath != null) __obj.updateDynamic("jobOutputPath")(jobOutputPath.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateJobOutput]
  }
}

