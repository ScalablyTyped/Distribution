package typings.betterScroll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.PullUpOption> */
@js.native
trait PartialPullUpOption extends js.Object {
  var threshold: js.UndefOr[Double] = js.native
}

object PartialPullUpOption {
  @scala.inline
  def apply(): PartialPullUpOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPullUpOption]
  }
  @scala.inline
  implicit class PartialPullUpOptionOps[Self <: PartialPullUpOption] (val x: Self) extends AnyVal {
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
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

