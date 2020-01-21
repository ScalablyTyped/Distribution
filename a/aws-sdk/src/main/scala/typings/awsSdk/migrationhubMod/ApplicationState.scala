package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationState extends js.Object {
  /**
    * The configurationId from the Application Discovery Service that uniquely identifies an application.
    */
  var ApplicationId: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationId] = js.native
  /**
    * The current status of an application.
    */
  var ApplicationStatus: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStatus] = js.native
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.native
}

object ApplicationState {
  @scala.inline
  def apply(
    ApplicationId: ApplicationId = null,
    ApplicationStatus: ApplicationStatus = null,
    LastUpdatedTime: UpdateDateTime = null
  ): ApplicationState = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (ApplicationStatus != null) __obj.updateDynamic("ApplicationStatus")(ApplicationStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationState]
  }
}

