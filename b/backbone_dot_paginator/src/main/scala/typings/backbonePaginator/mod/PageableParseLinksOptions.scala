package typings.backbonePaginator.mod

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageableParseLinksOptions extends js.Object {
  
  var xhr: js.UndefOr[JQueryXHR] = js.native
}
object PageableParseLinksOptions {
  
  @scala.inline
  def apply(): PageableParseLinksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableParseLinksOptions]
  }
  
  @scala.inline
  implicit class PageableParseLinksOptionsOps[Self <: PageableParseLinksOptions] (val x: Self) extends AnyVal {
    
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
    def setXhr(value: JQueryXHR): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
}
