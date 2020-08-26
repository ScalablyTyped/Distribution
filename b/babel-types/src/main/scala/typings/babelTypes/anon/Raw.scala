package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Raw extends js.Object {
  var cooked: js.UndefOr[String] = js.native
  var raw: js.UndefOr[String] = js.native
}

object Raw {
  @scala.inline
  def apply(): Raw = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Raw]
  }
  @scala.inline
  implicit class RawOps[Self <: Raw] (val x: Self) extends AnyVal {
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
    def setCooked(value: String): Self = this.set("cooked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCooked: Self = this.set("cooked", js.undefined)
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

