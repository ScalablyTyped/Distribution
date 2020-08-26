package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanOptions extends js.Object {
  var noAnimation: js.UndefOr[Boolean] = js.native
}

object PanOptions {
  @scala.inline
  def apply(): PanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanOptions]
  }
  @scala.inline
  implicit class PanOptionsOps[Self <: PanOptions] (val x: Self) extends AnyVal {
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
    def setNoAnimation(value: Boolean): Self = this.set("noAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAnimation: Self = this.set("noAnimation", js.undefined)
  }
  
}

