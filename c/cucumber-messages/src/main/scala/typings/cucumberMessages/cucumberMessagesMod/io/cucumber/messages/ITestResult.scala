package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestResult. */
@js.native
trait ITestResult extends StObject {
  
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
  implicit class ITestResultMutableBuilder[Self <: ITestResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: IDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationNull: Self = StObject.set(x, "duration", null)
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setWillBeRetried(value: Boolean): Self = StObject.set(x, "willBeRetried", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillBeRetriedNull: Self = StObject.set(x, "willBeRetried", null)
    
    @scala.inline
    def setWillBeRetriedUndefined: Self = StObject.set(x, "willBeRetried", js.undefined)
  }
}
