package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SupportCodeConfig. */
trait ISupportCodeConfig extends StObject {
  
  /** SupportCodeConfig afterTestCaseHooks */
  var afterTestCaseHooks: js.UndefOr[js.Array[IHook] | Null] = js.undefined
  
  /** SupportCodeConfig beforeTestCaseHooks */
  var beforeTestCaseHooks: js.UndefOr[js.Array[IHook] | Null] = js.undefined
  
  /** SupportCodeConfig parameterTypes */
  var parameterTypes: js.UndefOr[js.Array[IParameterType] | Null] = js.undefined
  
  /** SupportCodeConfig stepDefinitions */
  var stepDefinitions: js.UndefOr[js.Array[IStepDefinition] | Null] = js.undefined
}
object ISupportCodeConfig {
  
  inline def apply(): ISupportCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupportCodeConfig]
  }
  
  extension [Self <: ISupportCodeConfig](x: Self) {
    
    inline def setAfterTestCaseHooks(value: js.Array[IHook]): Self = StObject.set(x, "afterTestCaseHooks", value.asInstanceOf[js.Any])
    
    inline def setAfterTestCaseHooksNull: Self = StObject.set(x, "afterTestCaseHooks", null)
    
    inline def setAfterTestCaseHooksUndefined: Self = StObject.set(x, "afterTestCaseHooks", js.undefined)
    
    inline def setAfterTestCaseHooksVarargs(value: IHook*): Self = StObject.set(x, "afterTestCaseHooks", js.Array(value :_*))
    
    inline def setBeforeTestCaseHooks(value: js.Array[IHook]): Self = StObject.set(x, "beforeTestCaseHooks", value.asInstanceOf[js.Any])
    
    inline def setBeforeTestCaseHooksNull: Self = StObject.set(x, "beforeTestCaseHooks", null)
    
    inline def setBeforeTestCaseHooksUndefined: Self = StObject.set(x, "beforeTestCaseHooks", js.undefined)
    
    inline def setBeforeTestCaseHooksVarargs(value: IHook*): Self = StObject.set(x, "beforeTestCaseHooks", js.Array(value :_*))
    
    inline def setParameterTypes(value: js.Array[IParameterType]): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    
    inline def setParameterTypesNull: Self = StObject.set(x, "parameterTypes", null)
    
    inline def setParameterTypesUndefined: Self = StObject.set(x, "parameterTypes", js.undefined)
    
    inline def setParameterTypesVarargs(value: IParameterType*): Self = StObject.set(x, "parameterTypes", js.Array(value :_*))
    
    inline def setStepDefinitions(value: js.Array[IStepDefinition]): Self = StObject.set(x, "stepDefinitions", value.asInstanceOf[js.Any])
    
    inline def setStepDefinitionsNull: Self = StObject.set(x, "stepDefinitions", null)
    
    inline def setStepDefinitionsUndefined: Self = StObject.set(x, "stepDefinitions", js.undefined)
    
    inline def setStepDefinitionsVarargs(value: IStepDefinition*): Self = StObject.set(x, "stepDefinitions", js.Array(value :_*))
  }
}
