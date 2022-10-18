package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCase. */
trait ITestCase extends StObject {
  
  /** TestCase id */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** TestCase pickleId */
  var pickleId: js.UndefOr[String | Null] = js.undefined
  
  /** TestCase testSteps */
  var testSteps: js.UndefOr[js.Array[ITestStep] | Null] = js.undefined
}
object ITestCase {
  
  inline def apply(): ITestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCase]
  }
  
  extension [Self <: ITestCase](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    inline def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    inline def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
    
    inline def setTestSteps(value: js.Array[ITestStep]): Self = StObject.set(x, "testSteps", value.asInstanceOf[js.Any])
    
    inline def setTestStepsNull: Self = StObject.set(x, "testSteps", null)
    
    inline def setTestStepsUndefined: Self = StObject.set(x, "testSteps", js.undefined)
    
    inline def setTestStepsVarargs(value: ITestStep*): Self = StObject.set(x, "testSteps", js.Array(value*))
  }
}
