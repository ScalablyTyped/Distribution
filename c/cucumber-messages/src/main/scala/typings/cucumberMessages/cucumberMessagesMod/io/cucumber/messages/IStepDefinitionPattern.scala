package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinitionPattern. */
@js.native
trait IStepDefinitionPattern extends js.Object {
  
  /** StepDefinitionPattern source */
  var source: js.UndefOr[String | Null] = js.native
  
  /** StepDefinitionPattern type */
  var `type`: js.UndefOr[StepDefinitionPatternType | Null] = js.native
}
object IStepDefinitionPattern {
  
  @scala.inline
  def apply(): IStepDefinitionPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinitionPattern]
  }
  
  @scala.inline
  implicit class IStepDefinitionPatternOps[Self <: IStepDefinitionPattern] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceNull: Self = this.set("source", null)
    
    @scala.inline
    def setType(value: StepDefinitionPatternType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
