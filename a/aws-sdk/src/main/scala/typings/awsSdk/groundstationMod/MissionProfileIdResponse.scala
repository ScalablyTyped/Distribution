package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MissionProfileIdResponse extends js.Object {
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.native
}

object MissionProfileIdResponse {
  @scala.inline
  def apply(): MissionProfileIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MissionProfileIdResponse]
  }
  @scala.inline
  implicit class MissionProfileIdResponseOps[Self <: MissionProfileIdResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMissionProfileId(value: String): Self = this.set("missionProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissionProfileId: Self = this.set("missionProfileId", js.undefined)
  }
  
}

