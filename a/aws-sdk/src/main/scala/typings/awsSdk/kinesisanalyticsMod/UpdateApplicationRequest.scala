package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * Name of the Amazon Kinesis Analytics application to update.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Describes application updates.
    */
  var ApplicationUpdate: typings.awsSdk.kinesisanalyticsMod.ApplicationUpdate = js.native
  /**
    * The current application version ID. You can use the DescribeApplication operation to get this value.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    ApplicationUpdate: ApplicationUpdate,
    CurrentApplicationVersionId: ApplicationVersionId
  ): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationUpdate = ApplicationUpdate.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any])
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
    def setApplicationUpdate(value: ApplicationUpdate): Self = this.set("ApplicationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = this.set("CurrentApplicationVersionId", value.asInstanceOf[js.Any])
  }
  
}

