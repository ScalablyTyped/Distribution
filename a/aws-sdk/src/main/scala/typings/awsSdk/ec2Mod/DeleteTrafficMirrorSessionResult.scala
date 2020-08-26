package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorSessionResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror session.
    */
  var TrafficMirrorSessionId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorSessionResult {
  @scala.inline
  def apply(): DeleteTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorSessionResult]
  }
  @scala.inline
  implicit class DeleteTrafficMirrorSessionResultOps[Self <: DeleteTrafficMirrorSessionResult] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorSessionId(value: String): Self = this.set("TrafficMirrorSessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorSessionId: Self = this.set("TrafficMirrorSessionId", js.undefined)
  }
  
}

