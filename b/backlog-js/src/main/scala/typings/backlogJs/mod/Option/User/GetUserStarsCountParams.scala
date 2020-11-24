package typings.backlogJs.mod.Option.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserStarsCountParams extends js.Object {
  
  var since: js.UndefOr[String] = js.native
  
  var until: js.UndefOr[String] = js.native
}
object GetUserStarsCountParams {
  
  @scala.inline
  def apply(): GetUserStarsCountParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserStarsCountParams]
  }
  
  @scala.inline
  implicit class GetUserStarsCountParamsOps[Self <: GetUserStarsCountParams] (val x: Self) extends AnyVal {
    
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
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
    
    @scala.inline
    def setUntil(value: String): Self = this.set("until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
  }
}
