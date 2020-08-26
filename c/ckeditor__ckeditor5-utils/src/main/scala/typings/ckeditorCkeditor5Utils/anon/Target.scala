package typings.ckeditorCkeditor5Utils.anon

import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  var target: HTMLElement | Range = js.native
  var viewportOffset: js.UndefOr[Double] = js.native
}

object Target {
  @scala.inline
  def apply(target: HTMLElement | Range): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
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
    def setTarget(value: HTMLElement | Range): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewportOffset(value: Double): Self = this.set("viewportOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportOffset: Self = this.set("viewportOffset", js.undefined)
  }
  
}

