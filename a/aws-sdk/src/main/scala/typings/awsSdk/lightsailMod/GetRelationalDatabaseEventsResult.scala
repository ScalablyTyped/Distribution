package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseEventsResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseEvents request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational database events request.
    */
  var relationalDatabaseEvents: js.UndefOr[RelationalDatabaseEventList] = js.native
}

object GetRelationalDatabaseEventsResult {
  @scala.inline
  def apply(nextPageToken: String = null, relationalDatabaseEvents: RelationalDatabaseEventList = null): GetRelationalDatabaseEventsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (relationalDatabaseEvents != null) __obj.updateDynamic("relationalDatabaseEvents")(relationalDatabaseEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseEventsResult]
  }
}

