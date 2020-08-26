package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * Describes application configuration updates.
    */
  var ApplicationConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationUpdate] = js.native
  /**
    * The name of the application to update.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Describes application Amazon CloudWatch logging option updates. You can only update existing CloudWatch logging options with this action. To add a new CloudWatch logging option, use AddApplicationCloudWatchLoggingOption.
    */
  var CloudWatchLoggingOptionUpdates: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionUpdates] = js.native
  /**
    * The current application version ID. You can retrieve the application version ID using DescribeApplication.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * Describes updates to the application's starting parameters.
    */
  var RunConfigurationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RunConfigurationUpdate] = js.native
  /**
    * Describes updates to the service execution role.
    */
  var ServiceExecutionRoleUpdate: js.UndefOr[RoleARN] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  @scala.inline
  implicit class UpdateApplicationRequestOps[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationConfigurationUpdate(value: ApplicationConfigurationUpdate): Self = this.set("ApplicationConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationConfigurationUpdate: Self = this.set("ApplicationConfigurationUpdate", js.undefined)
    @scala.inline
    def setCloudWatchLoggingOptionUpdatesVarargs(value: CloudWatchLoggingOptionUpdate*): Self = this.set("CloudWatchLoggingOptionUpdates", js.Array(value :_*))
    @scala.inline
    def setCloudWatchLoggingOptionUpdates(value: CloudWatchLoggingOptionUpdates): Self = this.set("CloudWatchLoggingOptionUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptionUpdates: Self = this.set("CloudWatchLoggingOptionUpdates", js.undefined)
    @scala.inline
    def setRunConfigurationUpdate(value: RunConfigurationUpdate): Self = this.set("RunConfigurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunConfigurationUpdate: Self = this.set("RunConfigurationUpdate", js.undefined)
    @scala.inline
    def setServiceExecutionRoleUpdate(value: RoleARN): Self = this.set("ServiceExecutionRoleUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceExecutionRoleUpdate: Self = this.set("ServiceExecutionRoleUpdate", js.undefined)
  }
  
}

