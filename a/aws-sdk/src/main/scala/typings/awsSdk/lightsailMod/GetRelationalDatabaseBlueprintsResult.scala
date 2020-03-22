package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBlueprintsResult extends js.Object {
  /**
    * An object describing the result of your get relational database blueprints request.
    */
  var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetRelationalDatabaseBlueprints request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBlueprintsResult {
  @scala.inline
  def apply(blueprints: RelationalDatabaseBlueprintList = null, nextPageToken: String = null): GetRelationalDatabaseBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    if (blueprints != null) __obj.updateDynamic("blueprints")(blueprints.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
  }
}

