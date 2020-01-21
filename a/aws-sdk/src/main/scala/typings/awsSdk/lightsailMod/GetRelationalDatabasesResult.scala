package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabasesResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get relational databases request.
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

