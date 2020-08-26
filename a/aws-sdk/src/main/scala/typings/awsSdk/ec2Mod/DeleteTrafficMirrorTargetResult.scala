package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrafficMirrorTargetResult extends js.Object {
  /**
    * The ID of the deleted Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.native
}

object DeleteTrafficMirrorTargetResult {
  @scala.inline
  def apply(): DeleteTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorTargetResult]
  }
  @scala.inline
  implicit class DeleteTrafficMirrorTargetResultOps[Self <: DeleteTrafficMirrorTargetResult] (val x: Self) extends AnyVal {
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
    def setTrafficMirrorTargetId(value: String): Self = this.set("TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficMirrorTargetId: Self = this.set("TrafficMirrorTargetId", js.undefined)
  }
  
}

