package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepDefinition. */
@js.native
trait IStepDefinition extends js.Object {
  
  /** StepDefinition id */
  var id: js.UndefOr[String | Null] = js.native
  
  /** StepDefinition pattern */
  var pattern: js.UndefOr[IStepDefinitionPattern | Null] = js.native
  
  /** StepDefinition sourceReference */
  var sourceReference: js.UndefOr[ISourceReference | Null] = js.native
}
object IStepDefinition {
  
  @scala.inline
  def apply(): IStepDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepDefinition]
  }
  
  @scala.inline
  implicit class IStepDefinitionOps[Self <: IStepDefinition] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: IStepDefinitionPattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPatternNull: Self = this.set("pattern", null)
    
    @scala.inline
    def setSourceReference(value: ISourceReference): Self = this.set("sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceReference: Self = this.set("sourceReference", js.undefined)
    
    @scala.inline
    def setSourceReferenceNull: Self = this.set("sourceReference", null)
  }
}
