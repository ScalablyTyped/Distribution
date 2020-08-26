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
  def apply(): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResult]
  }
  @scala.inline
  implicit class DescribeJobResultOps[Self <: DescribeJobResult] (val x: Self) extends AnyVal {
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
    def setJobMetadata(value: JobMetadata): Self = this.set("JobMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobMetadata: Self = this.set("JobMetadata", js.undefined)
    @scala.inline
    def setSubJobMetadataVarargs(value: JobMetadata*): Self = this.set("SubJobMetadata", js.Array(value :_*))
    @scala.inline
    def setSubJobMetadata(value: JobMetadataList): Self = this.set("SubJobMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubJobMetadata: Self = this.set("SubJobMetadata", js.undefined)
  }
  
}

