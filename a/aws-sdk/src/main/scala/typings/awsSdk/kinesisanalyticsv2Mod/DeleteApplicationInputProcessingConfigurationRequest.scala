package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationInputProcessingConfigurationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The application version. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned. 
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The ID of the input configuration from which to delete the input processing configuration. You can get a list of the input IDs for an application by using the DescribeApplication operation.
    */
  var InputId: Id = js.native
}

object DeleteApplicationInputProcessingConfigurationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, InputId: Id): DeleteApplicationInputProcessingConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationRequest]
  }
  @scala.inline
  implicit class DeleteApplicationInputProcessingConfigurationRequestOps[Self <: DeleteApplicationInputProcessingConfigurationRequest] (val x: Self) extends AnyVal {
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
    def setInputId(value: Id): Self = this.set("InputId", value.asInstanceOf[js.Any])
  }
  
}

