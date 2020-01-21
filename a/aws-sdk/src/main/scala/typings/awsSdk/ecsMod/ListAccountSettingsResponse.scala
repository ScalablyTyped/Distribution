package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountSettingsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListAccountSettings request. When the results of a ListAccountSettings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The account settings for the resource.
    */
  var settings: js.UndefOr[Settings] = js.native
}

object ListAccountSettingsResponse {
  @scala.inline
  def apply(nextToken: String = null, settings: Settings = null): ListAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountSettingsResponse]
  }
}

