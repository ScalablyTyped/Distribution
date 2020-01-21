package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database blueprints request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBlueprintsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabaseBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsRequest]
  }
}

