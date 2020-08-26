package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationInputProcessingConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The current application version ID.
    */
  var ApplicationVersionId: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
}

object DeleteApplicationInputProcessingConfigurationResponse {
  @scala.inline
  def apply(): DeleteApplicationInputProcessingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationInputProcessingConfigurationResponse]
  }
  @scala.inline
  implicit class DeleteApplicationInputProcessingConfigurationResponseOps[Self <: DeleteApplicationInputProcessingConfigurationResponse] (val x: Self) extends AnyVal {
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
    def deleteApplicationARN: Self = this.set("ApplicationARN", js.undefined)
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersionId: Self = this.set("ApplicationVersionId", js.undefined)
  }
  
}

