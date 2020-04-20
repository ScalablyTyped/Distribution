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
}

