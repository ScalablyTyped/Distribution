package typings.debounceFn.mod

import typings.debounceFn.debounceFnBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoBeforeNoAfterOptions extends Options {
  @JSName("after")
  val after_NoBeforeNoAfterOptions: `false` = js.native
  @JSName("before")
  val before_NoBeforeNoAfterOptions: js.UndefOr[`false`] = js.native
}

object NoBeforeNoAfterOptions {
  @scala.inline
  def apply(after: `false`): NoBeforeNoAfterOptions = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoBeforeNoAfterOptions]
  }
  @scala.inline
  implicit class NoBeforeNoAfterOptionsOps[Self <: NoBeforeNoAfterOptions] (val x: Self) extends AnyVal {
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
    def setAfter(value: `false`): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setBefore(value: `false`): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
  
}

