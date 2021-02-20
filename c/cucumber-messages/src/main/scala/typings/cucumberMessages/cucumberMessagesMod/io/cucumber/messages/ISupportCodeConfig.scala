package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SupportCodeConfig. */
@js.native
trait ISupportCodeConfig extends StObject {
  
  /** SupportCodeConfig afterTestCaseHooks */
  var afterTestCaseHooks: js.UndefOr[js.Array[IHook] | Null] = js.native
  
  /** SupportCodeConfig beforeTestCaseHooks */
  var beforeTestCaseHooks: js.UndefOr[js.Array[IHook] | Null] = js.native
  
  /** SupportCodeConfig parameterTypes */
  var parameterTypes: js.UndefOr[js.Array[IParameterType] | Null] = js.native
  
  /** SupportCodeConfig stepDefinitions */
  var stepDefinitions: js.UndefOr[js.Array[IStepDefinition] | Null] = js.native
}
object ISupportCodeConfig {
  
  @scala.inline
  def apply(): ISupportCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISupportCodeConfig]
  }
  
  @scala.inline
  implicit class ISupportCodeConfigMutableBuilder[Self <: ISupportCodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTestCaseHooks(value: js.Array[IHook]): Self = StObject.set(x, "afterTestCaseHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTestCaseHooksNull: Self = StObject.set(x, "afterTestCaseHooks", null)
    
    @scala.inline
    def setAfterTestCaseHooksUndefined: Self = StObject.set(x, "afterTestCaseHooks", js.undefined)
    
    @scala.inline
    def setAfterTestCaseHooksVarargs(value: IHook*): Self = StObject.set(x, "afterTestCaseHooks", js.Array(value :_*))
    
    @scala.inline
    def setBeforeTestCaseHooks(value: js.Array[IHook]): Self = StObject.set(x, "beforeTestCaseHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeTestCaseHooksNull: Self = StObject.set(x, "beforeTestCaseHooks", null)
    
    @scala.inline
    def setBeforeTestCaseHooksUndefined: Self = StObject.set(x, "beforeTestCaseHooks", js.undefined)
    
    @scala.inline
    def setBeforeTestCaseHooksVarargs(value: IHook*): Self = StObject.set(x, "beforeTestCaseHooks", js.Array(value :_*))
    
    @scala.inline
    def setParameterTypes(value: js.Array[IParameterType]): Self = StObject.set(x, "parameterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypesNull: Self = StObject.set(x, "parameterTypes", null)
    
    @scala.inline
    def setParameterTypesUndefined: Self = StObject.set(x, "parameterTypes", js.undefined)
    
    @scala.inline
    def setParameterTypesVarargs(value: IParameterType*): Self = StObject.set(x, "parameterTypes", js.Array(value :_*))
    
    @scala.inline
    def setStepDefinitions(value: js.Array[IStepDefinition]): Self = StObject.set(x, "stepDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepDefinitionsNull: Self = StObject.set(x, "stepDefinitions", null)
    
    @scala.inline
    def setStepDefinitionsUndefined: Self = StObject.set(x, "stepDefinitions", js.undefined)
    
    @scala.inline
    def setStepDefinitionsVarargs(value: IStepDefinition*): Self = StObject.set(x, "stepDefinitions", js.Array(value :_*))
  }
}
