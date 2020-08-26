package typings.c3.anon

import typings.c3.c3Strings.`step-after`
import typings.c3.c3Strings.`step-before`
import typings.c3.c3Strings.step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3` extends js.Object {
  /**
    * Change step type for step chart.
    * Defaults to `"step"`.
    */
  var `type`: step | `step-before` | `step-after` = js.native
}

object `3` {
  @scala.inline
  def apply(`type`: step | `step-before` | `step-after`): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
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
    def setType(value: step | `step-before` | `step-after`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

