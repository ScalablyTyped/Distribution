package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCaseFinished. */
@js.native
trait ITestCaseFinished extends StObject {
  
  /** TestCaseFinished testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.native
  
  /** TestCaseFinished testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.native
  
  /** TestCaseFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestCaseFinished {
  
  @scala.inline
  def apply(): ITestCaseFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCaseFinished]
  }
  
  @scala.inline
  implicit class ITestCaseFinishedMutableBuilder[Self <: ITestCaseFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseStartedIdNull: Self = StObject.set(x, "testCaseStartedId", null)
    
    @scala.inline
    def setTestCaseStartedIdUndefined: Self = StObject.set(x, "testCaseStartedId", js.undefined)
    
    @scala.inline
    def setTestResult(value: ITestResult): Self = StObject.set(x, "testResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResultNull: Self = StObject.set(x, "testResult", null)
    
    @scala.inline
    def setTestResultUndefined: Self = StObject.set(x, "testResult", js.undefined)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
