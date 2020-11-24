package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestCase. */
@js.native
trait ITestCase extends js.Object {
  
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
  implicit class ITestCaseOps[Self <: ITestCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setPickleId(value: String): Self = this.set("pickleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleId: Self = this.set("pickleId", js.undefined)
    
    @scala.inline
    def setPickleIdNull: Self = this.set("pickleId", null)
    
    @scala.inline
    def setTestStepsVarargs(value: ITestStep*): Self = this.set("testSteps", js.Array(value :_*))
    
    @scala.inline
    def setTestSteps(value: js.Array[ITestStep]): Self = this.set("testSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSteps: Self = this.set("testSteps", js.undefined)
    
    @scala.inline
    def setTestStepsNull: Self = this.set("testSteps", null)
  }
}
