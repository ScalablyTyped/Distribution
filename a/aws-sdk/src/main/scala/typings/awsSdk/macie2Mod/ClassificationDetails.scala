package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationDetails extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file that contains the detailed record, including offsets, for the finding.
    */
  var detailedResultsLocation: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the classification job that produced the finding.
    */
  var jobArn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the classification job that produced the finding.
    */
  var jobId: js.UndefOr[string] = js.native
  /**
    * The status and detailed results of the finding.
    */
  var result: js.UndefOr[ClassificationResult] = js.native
}

object ClassificationDetails {
  @scala.inline
  def apply(): ClassificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationDetails]
  }
  @scala.inline
  implicit class ClassificationDetailsOps[Self <: ClassificationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetailedResultsLocation(value: string): Self = this.set("detailedResultsLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailedResultsLocation: Self = this.set("detailedResultsLocation", js.undefined)
    @scala.inline
    def setJobArn(value: string): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
    @scala.inline
    def setJobId(value: string): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setResult(value: ClassificationResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

