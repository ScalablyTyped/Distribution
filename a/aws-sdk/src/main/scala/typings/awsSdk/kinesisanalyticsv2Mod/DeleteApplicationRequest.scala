package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationRequest extends js.Object {
  /**
    * The name of the application to delete.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * Use the DescribeApplication operation to get this value.
    */
  var CreateTimestamp: Timestamp = js.native
}

object DeleteApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CreateTimestamp: Timestamp): DeleteApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CreateTimestamp = CreateTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationRequest]
  }
}

