package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorResult extends js.Object {
  /**
    * The detector ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The status and description for each detector version.
    */
  var detectorVersionSummaries: js.UndefOr[DetectorVersionSummaryList] = js.native
  /**
    * The next token to be used for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeDetectorResult {
  @scala.inline
  def apply(): DescribeDetectorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDetectorResult]
  }
  @scala.inline
  implicit class DescribeDetectorResultOps[Self <: DescribeDetectorResult] (val x: Self) extends AnyVal {
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
    def setArn(value: fraudDetectorArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    @scala.inline
    def setDetectorVersionSummariesVarargs(value: DetectorVersionSummary*): Self = this.set("detectorVersionSummaries", js.Array(value :_*))
    @scala.inline
    def setDetectorVersionSummaries(value: DetectorVersionSummaryList): Self = this.set("detectorVersionSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectorVersionSummaries: Self = this.set("detectorVersionSummaries", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

