package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.AutoJoinPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastOptions extends js.Object {
  
  var autoJoinPolicy: AutoJoinPolicy = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var receiverApplicationId: js.UndefOr[String] = js.native
  
  var resumeSavedSession: js.UndefOr[Boolean] = js.native
}
object CastOptions {
  
  @scala.inline
  def apply(autoJoinPolicy: AutoJoinPolicy): CastOptions = {
    val __obj = js.Dynamic.literal(autoJoinPolicy = autoJoinPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastOptions]
  }
  
  @scala.inline
  implicit class CastOptionsOps[Self <: CastOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoJoinPolicy(value: AutoJoinPolicy): Self = this.set("autoJoinPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setReceiverApplicationId(value: String): Self = this.set("receiverApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiverApplicationId: Self = this.set("receiverApplicationId", js.undefined)
    
    @scala.inline
    def setResumeSavedSession(value: Boolean): Self = this.set("resumeSavedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeSavedSession: Self = this.set("resumeSavedSession", js.undefined)
  }
}
