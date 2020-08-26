package typings.axiosCancel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxiosCancelOptions extends js.Object {
  /**
    * Enables logging
    * default: false
    */
  var debug: Boolean = js.native
}

object AxiosCancelOptions {
  @scala.inline
  def apply(debug: Boolean): AxiosCancelOptions = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxiosCancelOptions]
  }
  @scala.inline
  implicit class AxiosCancelOptionsOps[Self <: AxiosCancelOptions] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
  }
  
}

