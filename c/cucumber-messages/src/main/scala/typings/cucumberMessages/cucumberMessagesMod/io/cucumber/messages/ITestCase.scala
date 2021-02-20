package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCase. */
@js.native
trait ITestCase extends StObject {
  
  /** TestCase id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** TestCase pickleId */
  var pickleId: js.UndefOr[String | Null] = js.native
  
  /** TestCase testSteps */
  var testSteps: js.UndefOr[js.Array[ITestStep] | Null] = js.native
}
object ITestCase {
  
  @scala.inline
  def apply(): ITestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestCase]
  }
  
  @scala.inline
  implicit class ITestCaseMutableBuilder[Self <: ITestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPickleId(value: String): Self = StObject.set(x, "pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleIdNull: Self = StObject.set(x, "pickleId", null)
    
    @scala.inline
    def setPickleIdUndefined: Self = StObject.set(x, "pickleId", js.undefined)
    
    @scala.inline
    def setTestSteps(value: js.Array[ITestStep]): Self = StObject.set(x, "testSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStepsNull: Self = StObject.set(x, "testSteps", null)
    
    @scala.inline
    def setTestStepsUndefined: Self = StObject.set(x, "testSteps", js.undefined)
    
    @scala.inline
    def setTestStepsVarargs(value: ITestStep*): Self = StObject.set(x, "testSteps", js.Array(value :_*))
  }
}
