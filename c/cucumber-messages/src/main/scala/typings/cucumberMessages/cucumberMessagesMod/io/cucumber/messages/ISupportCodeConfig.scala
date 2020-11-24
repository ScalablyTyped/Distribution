package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SupportCodeConfig. */
@js.native
trait ISupportCodeConfig extends js.Object {
  
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
  implicit class ISupportCodeConfigOps[Self <: ISupportCodeConfig] (val x: Self) extends AnyVal {
    
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
    def setAfterTestCaseHooksVarargs(value: IHook*): Self = this.set("afterTestCaseHooks", js.Array(value :_*))
    
    @scala.inline
    def setAfterTestCaseHooks(value: js.Array[IHook]): Self = this.set("afterTestCaseHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterTestCaseHooks: Self = this.set("afterTestCaseHooks", js.undefined)
    
    @scala.inline
    def setAfterTestCaseHooksNull: Self = this.set("afterTestCaseHooks", null)
    
    @scala.inline
    def setBeforeTestCaseHooksVarargs(value: IHook*): Self = this.set("beforeTestCaseHooks", js.Array(value :_*))
    
    @scala.inline
    def setBeforeTestCaseHooks(value: js.Array[IHook]): Self = this.set("beforeTestCaseHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeforeTestCaseHooks: Self = this.set("beforeTestCaseHooks", js.undefined)
    
    @scala.inline
    def setBeforeTestCaseHooksNull: Self = this.set("beforeTestCaseHooks", null)
    
    @scala.inline
    def setParameterTypesVarargs(value: IParameterType*): Self = this.set("parameterTypes", js.Array(value :_*))
    
    @scala.inline
    def setParameterTypes(value: js.Array[IParameterType]): Self = this.set("parameterTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterTypes: Self = this.set("parameterTypes", js.undefined)
    
    @scala.inline
    def setParameterTypesNull: Self = this.set("parameterTypes", null)
    
    @scala.inline
    def setStepDefinitionsVarargs(value: IStepDefinition*): Self = this.set("stepDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setStepDefinitions(value: js.Array[IStepDefinition]): Self = this.set("stepDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepDefinitions: Self = this.set("stepDefinitions", js.undefined)
    
    @scala.inline
    def setStepDefinitionsNull: Self = this.set("stepDefinitions", null)
  }
}
