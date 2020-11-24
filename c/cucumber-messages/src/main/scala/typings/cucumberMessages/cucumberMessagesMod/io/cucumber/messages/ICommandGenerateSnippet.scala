package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandGenerateSnippet. */
@js.native
trait ICommandGenerateSnippet extends js.Object {
  
  /** CommandGenerateSnippet actionId */
  var actionId: js.UndefOr[String | Null] = js.native
  
  /** CommandGenerateSnippet generatedExpressions */
  var generatedExpressions: js.UndefOr[js.Array[IGeneratedExpression] | Null] = js.native
  
  /** CommandGenerateSnippet pickleStepArgument */
  var pickleStepArgument: js.UndefOr[IPickleStepArgument | Null] = js.native
}
object ICommandGenerateSnippet {
  
  @scala.inline
  def apply(): ICommandGenerateSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandGenerateSnippet]
  }
  
  @scala.inline
  implicit class ICommandGenerateSnippetOps[Self <: ICommandGenerateSnippet] (val x: Self) extends AnyVal {
    
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
    def setGeneratedExpressionsVarargs(value: IGeneratedExpression*): Self = this.set("generatedExpressions", js.Array(value :_*))
    
    @scala.inline
    def setGeneratedExpressions(value: js.Array[IGeneratedExpression]): Self = this.set("generatedExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedExpressions: Self = this.set("generatedExpressions", js.undefined)
    
    @scala.inline
    def setGeneratedExpressionsNull: Self = this.set("generatedExpressions", null)
    
    @scala.inline
    def setPickleStepArgument(value: IPickleStepArgument): Self = this.set("pickleStepArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickleStepArgument: Self = this.set("pickleStepArgument", js.undefined)
    
    @scala.inline
    def setPickleStepArgumentNull: Self = this.set("pickleStepArgument", null)
  }
}
