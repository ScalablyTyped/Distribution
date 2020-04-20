package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FollowModeScheduleActionStartSettings extends js.Object {
  /**
    * Identifies whether this action starts relative to the start or relative to the end of the reference action.
    */
  var FollowPoint: typings.awsSdk.medialiveMod.FollowPoint = js.native
  /**
    * The action name of another action that this one refers to.
    */
  var ReferenceActionName: string = js.native
}

object FollowModeScheduleActionStartSettings {
  @scala.inline
  def apply(FollowPoint: FollowPoint, ReferenceActionName: string): FollowModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(FollowPoint = FollowPoint.asInstanceOf[js.Any], ReferenceActionName = ReferenceActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
  }
}

