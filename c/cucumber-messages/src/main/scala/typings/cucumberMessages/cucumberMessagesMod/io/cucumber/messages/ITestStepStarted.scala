package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestStepStarted. */
trait ITestStepStarted extends StObject {
  
  /** TestStepStarted testCaseStartedId */
  var testCaseStartedId: js.UndefOr[String | Null] = js.undefined
  
  /** TestStepStarted testStepId */
  var testStepId: js.UndefOr[String | Null] = js.undefined
  
  /** TestStepStarted timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITestStepStarted {
  
  @scala.inline
  def apply(): ITestStepStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestStepStarted]
  }
  
  @scala.inline
  implicit class ITestStepStartedMutableBuilder[Self <: ITestStepStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestCaseStartedId(value: String): Self = StObject.set(x, "testCaseStartedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseStartedIdNull: Self = StObject.set(x, "testCaseStartedId", null)
    
    @scala.inline
    def setTestCaseStartedIdUndefined: Self = StObject.set(x, "testCaseStartedId", js.undefined)
    
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
