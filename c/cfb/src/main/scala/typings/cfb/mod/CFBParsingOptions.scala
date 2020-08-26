package typings.cfb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBParsingOptions extends CFBCommonOptions {
  /** If true, include raw data in output */
  var raw: js.UndefOr[Boolean] = js.native
}

object CFBParsingOptions {
  @scala.inline
  def apply(): CFBParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CFBParsingOptions]
  }
  @scala.inline
  implicit class CFBParsingOptionsOps[Self <: CFBParsingOptions] (val x: Self) extends AnyVal {
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
  
}

