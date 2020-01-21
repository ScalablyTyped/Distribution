package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorsRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[DetectorsMaxResults] = js.native
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetDetectorsRequest {
  @scala.inline
  def apply(detectorId: identifier = null, maxResults: Int | Double = null, nextToken: String = null): GetDetectorsRequest = {
    val __obj = js.Dynamic.literal()
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorsRequest]
  }
}

