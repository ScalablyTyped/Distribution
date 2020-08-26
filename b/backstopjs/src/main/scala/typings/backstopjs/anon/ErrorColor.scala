package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorColor extends js.Object {
  // See https://github.com/rsmbl/Resemble.js
  var errorColor: js.UndefOr[Blue] = js.native
  var errorType: js.UndefOr[String] = js.native
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
  var transparency: js.UndefOr[Double] = js.native
}

object ErrorColor {
  @scala.inline
  def apply(): ErrorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorColor]
  }
  @scala.inline
  implicit class ErrorColorOps[Self <: ErrorColor] (val x: Self) extends AnyVal {
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
    def setErrorColor(value: Blue): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorColor: Self = this.set("errorColor", js.undefined)
    @scala.inline
    def setErrorType(value: String): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
    @scala.inline
    def setIgnoreAntialiasing(value: Boolean): Self = this.set("ignoreAntialiasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreAntialiasing: Self = this.set("ignoreAntialiasing", js.undefined)
    @scala.inline
    def setTransparency(value: Double): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
  }
  
}

