package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditRequestCookie extends js.Object {
  var filter: RequestCookie = js.native
  var modification: RequestCookie = js.native
}

object EditRequestCookie {
  @scala.inline
  def apply(filter: RequestCookie, modification: RequestCookie): EditRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRequestCookie]
  }
  @scala.inline
  implicit class EditRequestCookieOps[Self <: EditRequestCookie] (val x: Self) extends AnyVal {
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
    def setFilter(value: RequestCookie): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setModification(value: RequestCookie): Self = this.set("modification", value.asInstanceOf[js.Any])
  }
  
}

