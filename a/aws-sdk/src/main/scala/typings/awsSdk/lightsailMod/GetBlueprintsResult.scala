package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlueprintsResult extends js.Object {
  /**
    * An array of key-value pairs that contains information about the available blueprints.
    */
  var blueprints: js.UndefOr[BlueprintList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetBlueprints request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetBlueprintsResult {
  @scala.inline
  def apply(blueprints: BlueprintList = null, nextPageToken: String = null): GetBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    if (blueprints != null) __obj.updateDynamic("blueprints")(blueprints.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlueprintsResult]
  }
}

