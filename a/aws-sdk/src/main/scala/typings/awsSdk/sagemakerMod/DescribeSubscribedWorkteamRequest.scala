package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribedWorkteamRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the subscribed work team to describe.
    */
  var WorkteamArn: typings.awsSdk.sagemakerMod.WorkteamArn = js.native
}

object DescribeSubscribedWorkteamRequest {
  @scala.inline
  def apply(WorkteamArn: WorkteamArn): DescribeSubscribedWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribedWorkteamRequest]
  }
}

