package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestStepFinished. */
@js.native
trait ITestStepFinished extends StObject {
  
  /** TestStepFinished testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.native
  
  /** TestStepFinished testResult */
  var testResult: js.UndefOr[ITestResult | Null] = js.native
  
  /** TestStepFinished testStepId */
  var testStepId: js.UndefOr[String | Null] = js.native
  
  /** TestStepFinished timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.native
}
object ITestStepFinished {
  
  @scala.inline
  def apply(): ITestStepFinished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestStepFinished]
  }
  
  @scala.inline
  implicit class ITestStepFinishedMutableBuilder[Self <: ITestStepFinished] (val x: Self) extends AnyVal {
    
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
    def setTestStepId(value: String): Self = StObject.set(x, "testStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStepIdNull: Self = StObject.set(x, "testStepId", null)
    
    @scala.inline
    def setTestStepIdUndefined: Self = StObject.set(x, "testStepId", js.undefined)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
