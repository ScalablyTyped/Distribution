package typings.cordovaPluginXSocialsharing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialSharingResult extends js.Object {
  
  var app: js.UndefOr[String] = js.native
  
  var completed: Boolean = js.native
}
object SocialSharingResult {
  
  @scala.inline
  def apply(completed: Boolean): SocialSharingResult = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialSharingResult]
  }
  
  @scala.inline
  implicit class SocialSharingResultOps[Self <: SocialSharingResult] (val x: Self) extends AnyVal {
    
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
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp: Self = this.set("app", js.undefined)
  }
}
