package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuffixOptions extends js.Object {
  var full: Boolean = js.native
}

object SuffixOptions {
  @scala.inline
  def apply(full: Boolean): SuffixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuffixOptions]
  }
  @scala.inline
  implicit class SuffixOptionsOps[Self <: SuffixOptions] (val x: Self) extends AnyVal {
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
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
  }
  
}

