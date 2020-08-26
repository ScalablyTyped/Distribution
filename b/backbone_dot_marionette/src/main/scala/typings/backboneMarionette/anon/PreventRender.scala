package typings.backboneMarionette.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreventRender extends js.Object {
  var preventRender: Boolean = js.native
}

object PreventRender {
  @scala.inline
  def apply(preventRender: Boolean): PreventRender = {
    val __obj = js.Dynamic.literal(preventRender = preventRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventRender]
  }
  @scala.inline
  implicit class PreventRenderOps[Self <: PreventRender] (val x: Self) extends AnyVal {
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
    def setPreventRender(value: Boolean): Self = this.set("preventRender", value.asInstanceOf[js.Any])
  }
  
}

