package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogSubscriptionRequest extends js.Object {
  /**
    * Identifier of the directory to which you want to subscribe and receive real-time logs to your specified CloudWatch log group.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The name of the CloudWatch log group where the real-time domain controller logs are forwarded.
    */
  var LogGroupName: typings.awsSdk.directoryserviceMod.LogGroupName = js.native
}

object CreateLogSubscriptionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, LogGroupName: LogGroupName): CreateLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], LogGroupName = LogGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogSubscriptionRequest]
  }
}

