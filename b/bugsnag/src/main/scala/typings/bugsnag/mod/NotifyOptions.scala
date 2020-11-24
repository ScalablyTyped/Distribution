package typings.bugsnag.mod

import org.scalablytyped.runtime.StringDictionary
import typings.bugsnag.bugsnagStrings.error
import typings.bugsnag.bugsnagStrings.info
import typings.bugsnag.bugsnagStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var apiKey: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var errorName: js.UndefOr[String] = js.native
  
  var groupingHash: js.UndefOr[String] = js.native
  
  var req: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var severity: js.UndefOr[error | warning | info] = js.native
  
  var user: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var userId: js.UndefOr[String | Double] = js.native
}
object NotifyOptions {
  
  @scala.inline
  def apply(): NotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyOptions]
  }
  
  @scala.inline
  implicit class NotifyOptionsOps[Self <: NotifyOptions] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKey: Self = this.set("apiKey", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setErrorName(value: String): Self = this.set("errorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorName: Self = this.set("errorName", js.undefined)
    
    @scala.inline
    def setGroupingHash(value: String): Self = this.set("groupingHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupingHash: Self = this.set("groupingHash", js.undefined)
    
    @scala.inline
    def setReq(value: StringDictionary[js.Any]): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
    
    @scala.inline
    def setSeverity(value: error | warning | info): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setUser(value: StringDictionary[js.Any]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setUserId(value: String | Double): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
