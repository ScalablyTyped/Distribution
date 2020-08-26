package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ch extends js.Object {
  var ch: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var track: js.UndefOr[js.Any] = js.native
}

object Ch {
  @scala.inline
  def apply(): Ch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ch]
  }
  @scala.inline
  implicit class ChOps[Self <: Ch] (val x: Self) extends AnyVal {
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
    def setCh(value: String): Self = this.set("ch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCh: Self = this.set("ch", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTrack(value: js.Any): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
  
}

