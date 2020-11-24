package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestResult. */
@js.native
trait ITestResult extends js.Object {
  
  /** TestResult duration */
  var duration: js.UndefOr[IDuration | Null] = js.native
  
  /** TestResult message */
  var message: js.UndefOr[String | Null] = js.native
  
  /** TestResult status */
  var status: js.UndefOr[Status | Null] = js.native
  
  /** TestResult willBeRetried */
  var willBeRetried: js.UndefOr[Boolean | Null] = js.native
}
object ITestResult {
  
  @scala.inline
  def apply(): ITestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestResult]
  }
  
  @scala.inline
  implicit class ITestResultOps[Self <: ITestResult] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: IDuration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
    
    @scala.inline
    def setWillBeRetried(value: Boolean): Self = this.set("willBeRetried", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWillBeRetried: Self = this.set("willBeRetried", js.undefined)
    
    @scala.inline
    def setWillBeRetriedNull: Self = this.set("willBeRetried", null)
  }
}
