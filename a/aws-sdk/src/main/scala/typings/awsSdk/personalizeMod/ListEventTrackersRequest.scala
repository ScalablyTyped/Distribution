package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTrackersRequest extends js.Object {
  /**
    * The ARN of a dataset group used to filter the response.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The maximum number of event trackers to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token returned from the previous call to ListEventTrackers for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListEventTrackersRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn = null, maxResults: Int | Double = null, nextToken: NextToken = null): ListEventTrackersRequest = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventTrackersRequest]
  }
}

