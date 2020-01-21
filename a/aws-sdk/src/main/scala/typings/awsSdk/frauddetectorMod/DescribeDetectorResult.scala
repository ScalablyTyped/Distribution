package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorResult extends js.Object {
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
  def apply(
    detectorId: identifier = null,
    detectorVersionSummaries: DetectorVersionSummaryList = null,
    nextToken: String = null
  ): DescribeDetectorResult = {
    val __obj = js.Dynamic.literal()
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (detectorVersionSummaries != null) __obj.updateDynamic("detectorVersionSummaries")(detectorVersionSummaries.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorResult]
  }
}

