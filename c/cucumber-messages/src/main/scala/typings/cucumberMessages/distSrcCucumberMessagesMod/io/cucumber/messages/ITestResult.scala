package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestResult.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestResult. */
trait ITestResult extends StObject {
  
  /** TestResult duration */
  var duration: js.UndefOr[IDuration | Null] = js.undefined
  
  /** TestResult message */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /** TestResult status */
  var status: js.UndefOr[Status | Null] = js.undefined
  
  /** TestResult willBeRetried */
  var willBeRetried: js.UndefOr[Boolean | Null] = js.undefined
}
object ITestResult {
  
  inline def apply(): ITestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestResult]
  }
  
  extension [Self <: ITestResult](x: Self) {
    
    inline def setDuration(value: IDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWillBeRetried(value: Boolean): Self = StObject.set(x, "willBeRetried", value.asInstanceOf[js.Any])
    
    inline def setWillBeRetriedNull: Self = StObject.set(x, "willBeRetried", null)
    
    inline def setWillBeRetriedUndefined: Self = StObject.set(x, "willBeRetried", js.undefined)
  }
}
