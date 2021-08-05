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
  
  inline def apply(): ITestCaseStarted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCaseStarted]
  }
  
  extension [Self <: ITestCaseStarted](x: Self) {
    
    inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    inline def setAttemptNull: Self = StObject.set(x, "attempt", null)
    
    inline def setAttemptUndefined: Self = StObject.set(x, "attempt", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPlatform(value: IPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    inline def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
    
    inline def setTimestamp(value: ITimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
