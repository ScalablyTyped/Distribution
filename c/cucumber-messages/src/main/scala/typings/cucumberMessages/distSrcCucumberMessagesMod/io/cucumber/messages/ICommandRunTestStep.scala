package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandRunTestStep. */
trait ICommandRunTestStep extends StObject {
  
  /** CommandRunTestStep actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandRunTestStep pickleStepArgument */
  var pickleStepArgument: js.UndefOr[IPickleStepArgument | Null] = js.undefined
  
  /** CommandRunTestStep stepDefinitionId */
  var stepDefinitionId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandRunTestStep stepMatchArguments */
  var stepMatchArguments: js.UndefOr[js.Array[IStepMatchArgument] | Null] = js.undefined
  
  /** CommandRunTestStep testCaseId */
  var testCaseId: js.UndefOr[String | Null] = js.undefined
}
object ICommandRunTestStep {
  
  inline def apply(): ICommandRunTestStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandRunTestStep]
  }
  
  extension [Self <: ICommandRunTestStep](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setPickleStepArgument(value: IPickleStepArgument): Self = StObject.set(x, "pickleStepArgument", value.asInstanceOf[js.Any])
    
    inline def setPickleStepArgumentNull: Self = StObject.set(x, "pickleStepArgument", null)
    
    inline def setPickleStepArgumentUndefined: Self = StObject.set(x, "pickleStepArgument", js.undefined)
    
    inline def setStepDefinitionId(value: String): Self = StObject.set(x, "stepDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setStepDefinitionIdNull: Self = StObject.set(x, "stepDefinitionId", null)
    
    inline def setStepDefinitionIdUndefined: Self = StObject.set(x, "stepDefinitionId", js.undefined)
    
    inline def setStepMatchArguments(value: js.Array[IStepMatchArgument]): Self = StObject.set(x, "stepMatchArguments", value.asInstanceOf[js.Any])
    
    inline def setStepMatchArgumentsNull: Self = StObject.set(x, "stepMatchArguments", null)
    
    inline def setStepMatchArgumentsUndefined: Self = StObject.set(x, "stepMatchArguments", js.undefined)
    
    inline def setStepMatchArgumentsVarargs(value: IStepMatchArgument*): Self = StObject.set(x, "stepMatchArguments", js.Array(value*))
    
    inline def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    inline def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
  }
}
