package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchDetails extends js.Object {
  /**
    * Latest time this application was launched successfully.
    */
  var latestLaunchTime: js.UndefOr[Timestamp] = js.native
  /**
    * Identifier of the latest stack launched for this application.
    */
  var stackId: js.UndefOr[StackId] = js.native
  /**
    * Name of the latest stack launched for this application.
    */
  var stackName: js.UndefOr[StackName] = js.native
}

object LaunchDetails {
  @scala.inline
  def apply(latestLaunchTime: Timestamp = null, stackId: StackId = null, stackName: StackName = null): LaunchDetails = {
    val __obj = js.Dynamic.literal()
    if (latestLaunchTime != null) __obj.updateDynamic("latestLaunchTime")(latestLaunchTime.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (stackName != null) __obj.updateDynamic("stackName")(stackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchDetails]
  }
}

