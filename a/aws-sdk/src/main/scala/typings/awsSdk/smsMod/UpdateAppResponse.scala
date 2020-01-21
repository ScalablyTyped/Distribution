package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAppResponse extends js.Object {
  /**
    * Summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.native
  /**
    * List of updated server groups in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object UpdateAppResponse {
  @scala.inline
  def apply(appSummary: AppSummary = null, serverGroups: ServerGroups = null, tags: Tags = null): UpdateAppResponse = {
    val __obj = js.Dynamic.literal()
    if (appSummary != null) __obj.updateDynamic("appSummary")(appSummary.asInstanceOf[js.Any])
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppResponse]
  }
}

