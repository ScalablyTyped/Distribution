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
  def apply(): ApplicationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationState]
  }
  @scala.inline
  implicit class ApplicationStateOps[Self <: ApplicationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: ApplicationId): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = this.set("ApplicationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationStatus: Self = this.set("ApplicationStatus", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: UpdateDateTime): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
  }
  
}

