package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorModelsResponse extends js.Object {
  /**
    * Summary information about the detector models.
    */
  var detectorModelSummaries: js.UndefOr[DetectorModelSummaries] = js.native
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDetectorModelsResponse {
  @scala.inline
  def apply(detectorModelSummaries: DetectorModelSummaries = null, nextToken: NextToken = null): ListDetectorModelsResponse = {
    val __obj = js.Dynamic.literal()
    if (detectorModelSummaries != null) __obj.updateDynamic("detectorModelSummaries")(detectorModelSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorModelsResponse]
  }
}

