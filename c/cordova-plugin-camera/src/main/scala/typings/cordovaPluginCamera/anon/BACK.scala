package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BACK extends js.Object {
  var BACK: Double = js.native
  var FRONT: Double = js.native
}

object BACK {
  @scala.inline
  def apply(BACK: Double, FRONT: Double): BACK = {
    val __obj = js.Dynamic.literal(BACK = BACK.asInstanceOf[js.Any], FRONT = FRONT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BACK]
  }
  @scala.inline
  implicit class BACKOps[Self <: BACK] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBACK(value: Double): Self = this.set("BACK", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRONT(value: Double): Self = this.set("FRONT", value.asInstanceOf[js.Any])
  }
  
}

