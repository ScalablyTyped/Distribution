package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullNameOptions extends js.Object {
  var middle: Boolean = js.native
  var middle_initial: Boolean = js.native
  var prefix: Boolean = js.native
  var suffix: Boolean = js.native
}

object FullNameOptions {
  @scala.inline
  def apply(middle: Boolean, middle_initial: Boolean, prefix: Boolean, suffix: Boolean): FullNameOptions = {
    val __obj = js.Dynamic.literal(middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullNameOptions]
  }
  @scala.inline
  implicit class FullNameOptionsOps[Self <: FullNameOptions] (val x: Self) extends AnyVal {
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
    def setMiddle(value: Boolean): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddle_initial(value: Boolean): Self = this.set("middle_initial", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: Boolean): Self = this.set("suffix", value.asInstanceOf[js.Any])
  }
  
}

