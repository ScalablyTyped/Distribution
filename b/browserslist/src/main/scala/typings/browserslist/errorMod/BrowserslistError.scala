package typings.browserslist.errorMod

import typings.browserslist.browserslistBooleans.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserslistError extends Error {
  var browserslist: `true` = js.native
}

object BrowserslistError {
  @scala.inline
  def apply(browserslist: `true`, message: String, name: String): BrowserslistError = {
    val __obj = js.Dynamic.literal(browserslist = browserslist.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserslistError]
  }
  @scala.inline
  implicit class BrowserslistErrorOps[Self <: BrowserslistError] (val x: Self) extends AnyVal {
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
    def setBrowserslist(value: `true`): Self = this.set("browserslist", value.asInstanceOf[js.Any])
  }
  
}

