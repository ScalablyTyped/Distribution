package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCaseFinished. */
trait ITestCaseFinished extends StObject {
  
  /** TestCaseFinished testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.undefined
  
  /** TestCaseFinished testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.undefined
  
  /** TestCaseFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITestCaseFinished {
  
  inline def apply(): ITestCaseFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCaseFinished]
  }
  
  extension [Self <: ITestCaseFinished](x: Self) {
    
    inline def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseStartedIdNull: Self = StObject.set(x, "testCaseStartedId", null)
    
    inline def setTestCaseStartedIdUndefined: Self = StObject.set(x, "testCaseStartedId", js.undefined)
    
    inline def setTestResult(value: ITestResult): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultNull: Self = StObject.set(x, "testResult", null)
    
    inline def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    inline def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
