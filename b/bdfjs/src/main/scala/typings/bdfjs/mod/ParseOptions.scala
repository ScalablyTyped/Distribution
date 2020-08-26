package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var allprops: js.UndefOr[Boolean] = js.native
  var onlymeta: js.UndefOr[Boolean] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setAllprops(value: Boolean): Self = this.set("allprops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllprops: Self = this.set("allprops", js.undefined)
    @scala.inline
    def setOnlymeta(value: Boolean): Self = this.set("onlymeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlymeta: Self = this.set("onlymeta", js.undefined)
  }
  
}

