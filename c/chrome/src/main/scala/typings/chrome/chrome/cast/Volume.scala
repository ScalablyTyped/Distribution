package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  var level: Double | Null = js.native
  var muted: Boolean | Null = js.native
}

object Volume {
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevelNull: Self = this.set("level", null)
    @scala.inline
    def setMuted(value: Boolean): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutedNull: Self = this.set("muted", null)
  }
  
}

