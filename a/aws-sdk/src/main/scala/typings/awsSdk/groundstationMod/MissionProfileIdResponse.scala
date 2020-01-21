package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissionProfileIdResponse extends js.Object {
  /**
    * ID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.native
}

object MissionProfileIdResponse {
  @scala.inline
  def apply(missionProfileId: String = null): MissionProfileIdResponse = {
    val __obj = js.Dynamic.literal()
    if (missionProfileId != null) __obj.updateDynamic("missionProfileId")(missionProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissionProfileIdResponse]
  }
}

