package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunTestStep. */
@js.native
trait ICommandRunTestStep extends js.Object {
  
  /** CommandRunTestStep actionId */
  var actionId: js.UndefOr[String | Null] = js.native
  
  /** CommandRunTestStep pickleStepArgument */
  var pickleStepArgument: js.UndefOr[IPickleStepArgument | Null] = js.native
  
  /** CommandRunTestStep stepDefinitionId */
  var stepDefinitionId: js.UndefOr[String | Null] = js.native
  
  /** CommandRunTestStep stepMatchArguments */
  var stepMatchArguments: js.UndefOr[js.Array[IStepMatchArgument] | Null] = js.native
  
  /** CommandRunTestStep testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.native
}
object ICommandRunTestStep {
  
  @scala.inline
  def apply(): ICommandRunTestStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunTestStep]
  }
  
  @scala.inline
  implicit class ICommandRunTestStepOps[Self <: ICommandRunTestStep] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: String): Self = this.set("actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionId: Self = this.set("actionId", js.undefined)
    
    @scala.inline
    def setActionIdNull: Self = this.set("actionId", null)
    
    @scala.inline
    def setPickleStepArgument(value: IPickleStepArgument): Self = this.set("pickleStepArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleStepArgument: Self = this.set("pickleStepArgument", js.undefined)
    
    @scala.inline
    def setPickleStepArgumentNull: Self = this.set("pickleStepArgument", null)
    
    @scala.inline
    def setStepDefinitionId(value: String): Self = this.set("stepDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepDefinitionId: Self = this.set("stepDefinitionId", js.undefined)
    
    @scala.inline
    def setStepDefinitionIdNull: Self = this.set("stepDefinitionId", null)
    
    @scala.inline
    def setStepMatchArgumentsVarargs(value: IStepMatchArgument*): Self = this.set("stepMatchArguments", js.Array(value :_*))
    
    @scala.inline
    def setStepMatchArguments(value: js.Array[IStepMatchArgument]): Self = this.set("stepMatchArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMatchArguments: Self = this.set("stepMatchArguments", js.undefined)
    
    @scala.inline
    def setStepMatchArgumentsNull: Self = this.set("stepMatchArguments", null)
    
    @scala.inline
    def setTestCaseId(value: String): Self = this.set("testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCaseId: Self = this.set("testCaseId", js.undefined)
    
    @scala.inline
    def setTestCaseIdNull: Self = this.set("testCaseId", null)
  }
}
