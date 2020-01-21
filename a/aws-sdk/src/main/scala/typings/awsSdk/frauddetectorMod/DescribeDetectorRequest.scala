package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDetectorRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The maximum number of results to return for the request.
    */
  var maxResults: js.UndefOr[DetectorVersionMaxResults] = js.native
  /**
    * The next token from the previous response.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeDetectorRequest {
  @scala.inline
  def apply(detectorId: identifier, maxResults: Int | Double = null, nextToken: String = null): DescribeDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDetectorRequest]
  }
}

