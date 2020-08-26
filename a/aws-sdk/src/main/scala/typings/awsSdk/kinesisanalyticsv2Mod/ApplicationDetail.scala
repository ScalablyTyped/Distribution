package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDetail extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * Provides details about the application's SQL or Java code and starting parameters.
    */
  var ApplicationConfigurationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationConfigurationDescription] = js.native
  /**
    * The description of the application.
    */
  var ApplicationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDescription] = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus = js.native
  /**
    * Provides the current application version. Kinesis Data Analytics updates the ApplicationVersionId each time you update the application.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * Describes the application Amazon CloudWatch logging options.
    */
  var CloudWatchLoggingOptionDescriptions: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CloudWatchLoggingOptionDescriptions] = js.native
  /**
    * The current timestamp when the application was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The current timestamp when the application was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typings.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
  /**
    * Specifies the IAM role that the application uses to access external resources.
    */
  var ServiceExecutionRole: js.UndefOr[RoleARN] = js.native
}

object ApplicationDetail {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationDetail = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDetail]
  }
  @scala.inline
  implicit class ApplicationDetailOps[Self <: ApplicationDetail] (val x: Self) extends AnyVal {
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
    def setApplicationARN(value: ResourceARN): Self = this.set("ApplicationARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationStatus(value: ApplicationStatus): Self = this.set("ApplicationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeEnvironment(value: RuntimeEnvironment): Self = this.set("RuntimeEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationConfigurationDescription(value: ApplicationConfigurationDescription): Self = this.set("ApplicationConfigurationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationConfigurationDescription: Self = this.set("ApplicationConfigurationDescription", js.undefined)
    @scala.inline
    def setApplicationDescription(value: ApplicationDescription): Self = this.set("ApplicationDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationDescription: Self = this.set("ApplicationDescription", js.undefined)
    @scala.inline
    def setCloudWatchLoggingOptionDescriptionsVarargs(value: CloudWatchLoggingOptionDescription*): Self = this.set("CloudWatchLoggingOptionDescriptions", js.Array(value :_*))
    @scala.inline
    def setCloudWatchLoggingOptionDescriptions(value: CloudWatchLoggingOptionDescriptions): Self = this.set("CloudWatchLoggingOptionDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudWatchLoggingOptionDescriptions: Self = this.set("CloudWatchLoggingOptionDescriptions", js.undefined)
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    @scala.inline
    def setLastUpdateTimestamp(value: Timestamp): Self = this.set("LastUpdateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTimestamp: Self = this.set("LastUpdateTimestamp", js.undefined)
    @scala.inline
    def setServiceExecutionRole(value: RoleARN): Self = this.set("ServiceExecutionRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceExecutionRole: Self = this.set("ServiceExecutionRole", js.undefined)
  }
  
}

