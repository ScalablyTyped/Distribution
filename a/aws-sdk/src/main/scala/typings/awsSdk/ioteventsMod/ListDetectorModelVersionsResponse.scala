package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorModelVersionsResponse extends js.Object {
  /**
    * Summary information about the detector model versions.
    */
  var detectorModelVersionSummaries: js.UndefOr[DetectorModelVersionSummaries] = js.native
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDetectorModelVersionsResponse {
  @scala.inline
  def apply(detectorModelVersionSummaries: DetectorModelVersionSummaries = null, nextToken: NextToken = null): ListDetectorModelVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelVersionSummaries != null) __obj.updateDynamic("detectorModelVersionSummaries")(detectorModelVersionSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorModelVersionsResponse]
  }
}

