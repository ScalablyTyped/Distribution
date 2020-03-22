package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActiveNamesResult extends js.Object {
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetActiveNames request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetActiveNamesResult {
  @scala.inline
  def apply(activeNames: StringList = null, nextPageToken: String = null): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    if (activeNames != null) __obj.updateDynamic("activeNames")(activeNames.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActiveNamesResult]
  }
}

