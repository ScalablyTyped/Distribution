package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSummary extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationStatus = js.native
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typings.awsSdk.kinesisanalyticsv2Mod.RuntimeEnvironment = js.native
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  @scala.inline
  implicit class ApplicationSummaryOps[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
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
  }
  
}

