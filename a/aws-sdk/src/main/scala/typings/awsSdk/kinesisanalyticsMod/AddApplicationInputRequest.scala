package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddApplicationInputRequest extends js.Object {
  /**
    * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  /**
    * Current version of your Amazon Kinesis Analytics application. You can use the DescribeApplication operation to find the current application version.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  /**
    * The Input to add.
    */
  var Input: typings.awsSdk.kinesisanalyticsMod.Input = js.native
}

object AddApplicationInputRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, CurrentApplicationVersionId: ApplicationVersionId, Input: Input): AddApplicationInputRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApplicationInputRequest]
  }
}

