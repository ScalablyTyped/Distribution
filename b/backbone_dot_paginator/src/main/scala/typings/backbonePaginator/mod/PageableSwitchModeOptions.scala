package typings.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageableSwitchModeOptions extends js.Object {
  
  var fetch: js.UndefOr[Boolean] = js.native
  
  var resetState: js.UndefOr[Boolean] = js.native
}
object PageableSwitchModeOptions {
  
  @scala.inline
  def apply(): PageableSwitchModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableSwitchModeOptions]
  }
  
  @scala.inline
  implicit class PageableSwitchModeOptionsOps[Self <: PageableSwitchModeOptions] (val x: Self) extends AnyVal {
    
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
    def setFetch(value: Boolean): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    
    @scala.inline
    def setResetState(value: Boolean): Self = this.set("resetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetState: Self = this.set("resetState", js.undefined)
  }
}
