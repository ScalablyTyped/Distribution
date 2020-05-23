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
  def apply(
    detailedResultsLocation: string = null,
    jobArn: string = null,
    jobId: string = null,
    result: ClassificationResult = null
  ): ClassificationDetails = {
    val __obj = js.Dynamic.literal()
    if (detailedResultsLocation != null) __obj.updateDynamic("detailedResultsLocation")(detailedResultsLocation.asInstanceOf[js.Any])
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationDetails]
  }
}

