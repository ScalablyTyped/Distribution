package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditResponseCookie extends js.Object {
  
  var filter: ResponseCookie = js.native
  
  var modification: ResponseCookie = js.native
}
object EditResponseCookie {
  
  @scala.inline
  def apply(filter: ResponseCookie, modification: ResponseCookie): EditResponseCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], modification = modification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditResponseCookie]
  }
  
  @scala.inline
  implicit class EditResponseCookieOps[Self <: EditResponseCookie] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: ResponseCookie): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModification(value: ResponseCookie): Self = this.set("modification", value.asInstanceOf[js.Any])
  }
}
