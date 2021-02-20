package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunTestStep. */
@js.native
trait ICommandRunTestStep extends StObject {
  
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
  implicit class ICommandRunTestStepMutableBuilder[Self <: ICommandRunTestStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setPickleStepArgument(value: IPickleStepArgument): Self = StObject.set(x, "pickleStepArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleStepArgumentNull: Self = StObject.set(x, "pickleStepArgument", null)
    
    @scala.inline
    def setPickleStepArgumentUndefined: Self = StObject.set(x, "pickleStepArgument", js.undefined)
    
    @scala.inline
    def setStepDefinitionId(value: String): Self = StObject.set(x, "stepDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDefinitionIdNull: Self = StObject.set(x, "stepDefinitionId", null)
    
    @scala.inline
    def setStepDefinitionIdUndefined: Self = StObject.set(x, "stepDefinitionId", js.undefined)
    
    @scala.inline
    def setStepMatchArguments(value: js.Array[IStepMatchArgument]): Self = StObject.set(x, "stepMatchArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepMatchArgumentsNull: Self = StObject.set(x, "stepMatchArguments", null)
    
    @scala.inline
    def setStepMatchArgumentsUndefined: Self = StObject.set(x, "stepMatchArguments", js.undefined)
    
    @scala.inline
    def setStepMatchArgumentsVarargs(value: IStepMatchArgument*): Self = StObject.set(x, "stepMatchArguments", js.Array(value :_*))
    
    @scala.inline
    def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    @scala.inline
    def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
  }
}
