package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorsResponse extends js.Object {
  /**
    * A list of summary information about the detectors (instances).
    */
  var detectorSummaries: js.UndefOr[DetectorSummaries] = js.native
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDetectorsResponse {
  @scala.inline
  def apply(detectorSummaries: DetectorSummaries = null, nextToken: NextToken = null): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorSummaries != null) __obj.updateDynamic("detectorSummaries")(detectorSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsResponse]
  }
}

