package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabasesResult extends js.Object {
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabases request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * An object describing the result of your get relational databases request.
    */
  var relationalDatabases: js.UndefOr[RelationalDatabaseList] = js.native
}

object GetRelationalDatabasesResult {
  @scala.inline
  def apply(nextPageToken: String = null, relationalDatabases: RelationalDatabaseList = null): GetRelationalDatabasesResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (relationalDatabases != null) __obj.updateDynamic("relationalDatabases")(relationalDatabases.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabasesResult]
  }
}

