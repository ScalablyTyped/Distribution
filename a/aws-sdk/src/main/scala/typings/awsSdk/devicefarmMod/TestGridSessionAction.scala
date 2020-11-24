package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestGridSessionAction extends js.Object {
  
  /**
    * The action taken by the session.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * The time, in milliseconds, that the action took to complete in the browser.
    */
  var duration: js.UndefOr[Long] = js.native
  
  /**
    * HTTP method that the browser used to make the request.
    */
  var requestMethod: js.UndefOr[String] = js.native
  
  /**
    * The time that the session invoked the action.
    */
  var started: js.UndefOr[DateTime] = js.native
  
  /**
    * HTTP status code returned to the browser when the action was taken.
    */
  var statusCode: js.UndefOr[String] = js.native
}
object TestGridSessionAction {
  
  @scala.inline
  def apply(): TestGridSessionAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestGridSessionAction]
  }
  
  @scala.inline
  implicit class TestGridSessionActionOps[Self <: TestGridSessionAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setDuration(value: Long): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setRequestMethod(value: String): Self = this.set("requestMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMethod: Self = this.set("requestMethod", js.undefined)
    
    @scala.inline
    def setStarted(value: DateTime): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarted: Self = this.set("started", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
