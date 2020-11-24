package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepMatchArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestStep. */
@js.native
trait ITestStep extends js.Object {
  
  /** TestStep hookId */
  var hookId: js.UndefOr[String | Null] = js.native
  
  /** TestStep id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** TestStep pickleStepId */
  var pickleStepId: js.UndefOr[String | Null] = js.native
  
  /** TestStep stepDefinitionIds */
  var stepDefinitionIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TestStep stepMatchArguments */
  var stepMatchArguments: js.UndefOr[js.Array[IStepMatchArgument] | Null] = js.native
}
object ITestStep {
  
  @scala.inline
  def apply(): ITestStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestStep]
  }
  
  @scala.inline
  implicit class ITestStepOps[Self <: ITestStep] (val x: Self) extends AnyVal {
    
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
    def setHookId(value: String): Self = this.set("hookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHookId: Self = this.set("hookId", js.undefined)
    
    @scala.inline
    def setHookIdNull: Self = this.set("hookId", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setPickleStepId(value: String): Self = this.set("pickleStepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleStepId: Self = this.set("pickleStepId", js.undefined)
    
    @scala.inline
    def setPickleStepIdNull: Self = this.set("pickleStepId", null)
    
    @scala.inline
    def setStepDefinitionIdsVarargs(value: String*): Self = this.set("stepDefinitionIds", js.Array(value :_*))
    
    @scala.inline
    def setStepDefinitionIds(value: js.Array[String]): Self = this.set("stepDefinitionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepDefinitionIds: Self = this.set("stepDefinitionIds", js.undefined)
    
    @scala.inline
    def setStepDefinitionIdsNull: Self = this.set("stepDefinitionIds", null)
    
    @scala.inline
    def setStepMatchArgumentsVarargs(value: IStepMatchArgument*): Self = this.set("stepMatchArguments", js.Array(value :_*))
    
    @scala.inline
    def setStepMatchArguments(value: js.Array[IStepMatchArgument]): Self = this.set("stepMatchArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepMatchArguments: Self = this.set("stepMatchArguments", js.undefined)
    
    @scala.inline
    def setStepMatchArgumentsNull: Self = this.set("stepMatchArguments", null)
  }
}
