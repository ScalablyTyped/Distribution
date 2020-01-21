package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResult extends js.Object {
  /**
    * Information about a specific job, including shipping information, job status, and other important metadata.
    */
  var JobMetadata: js.UndefOr[typings.awsSdk.snowballMod.JobMetadata] = js.native
  /**
    * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
    */
  var SubJobMetadata: js.UndefOr[JobMetadataList] = js.native
}

object DescribeJobResult {
  @scala.inline
  def apply(JobMetadata: JobMetadata = null, SubJobMetadata: JobMetadataList = null): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    if (JobMetadata != null) __obj.updateDynamic("JobMetadata")(JobMetadata.asInstanceOf[js.Any])
    if (SubJobMetadata != null) __obj.updateDynamic("SubJobMetadata")(SubJobMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobResult]
  }
}

