package typings.browserfs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MAXLENGTH extends js.Object {
  var MAX_LENGTH: Double = js.native
  var MAX_STRING_LENGTH: Double = js.native
}

object MAXLENGTH {
  @scala.inline
  def apply(MAX_LENGTH: Double, MAX_STRING_LENGTH: Double): MAXLENGTH = {
    val __obj = js.Dynamic.literal(MAX_LENGTH = MAX_LENGTH.asInstanceOf[js.Any], MAX_STRING_LENGTH = MAX_STRING_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[MAXLENGTH]
  }
  @scala.inline
  implicit class MAXLENGTHOps[Self <: MAXLENGTH] (val x: Self) extends AnyVal {
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
    def setMAX_LENGTH(value: Double): Self = this.set("MAX_LENGTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setMAX_STRING_LENGTH(value: Double): Self = this.set("MAX_STRING_LENGTH", value.asInstanceOf[js.Any])
  }
  
}

