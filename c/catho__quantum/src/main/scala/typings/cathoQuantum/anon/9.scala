package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `9` extends js.Object {
  var baseFontSize: js.UndefOr[js.Object] = js.native
}

object `9` {
  @scala.inline
  def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  @scala.inline
  implicit class `9Ops`[Self <: `9`] (val x: Self) extends AnyVal {
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
    def setBaseFontSize(value: js.Object): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
  }
  
}

