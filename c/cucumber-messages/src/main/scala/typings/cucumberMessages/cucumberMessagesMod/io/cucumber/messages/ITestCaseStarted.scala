package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.IPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCaseStarted. */
trait ITestCaseStarted extends StObject {
  
  /**
    * The first attempt should have value 0, and for each retry the value
    * should increase by 1.
    */
  var attempt: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Because a `TestCase` can be run multiple times (in case of a retry),
    * we use this field to group messages relating to the same attempt.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** TestCaseStarted platform */
  var platform: js.UndefOr[IPlatform | Null] = js.undefined
  
  /** TestCaseStarted testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.undefined
  
  /** TestCaseStarted timestamp */
  var timestamp: js.UndefOr[ITimestamp | Null] = js.undefined
}
object ITestCaseStarted {
  
  @scala.inline
  def apply(): ITestCaseStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCaseStarted]
  }
  
  @scala.inline
  implicit class ITestCaseStartedMutableBuilder[Self <: ITestCaseStarted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptNull: Self = StObject.set(x, "attempt", null)
    
    @scala.inline
    def setAttemptUndefined: Self = StObject.set(x, "attempt", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPlatform(value: IPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    @scala.inline
    def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
    
    @scala.inline
    def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
