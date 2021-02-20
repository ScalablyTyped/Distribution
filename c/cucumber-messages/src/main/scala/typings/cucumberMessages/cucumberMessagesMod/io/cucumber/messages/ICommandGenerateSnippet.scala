package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandGenerateSnippet. */
@js.native
trait ICommandGenerateSnippet extends StObject {
  
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
  implicit class ICommandGenerateSnippetMutableBuilder[Self <: ICommandGenerateSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    @scala.inline
    def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    @scala.inline
    def setGeneratedExpressions(value: js.Array[IGeneratedExpression]): Self = StObject.set(x, "generatedExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratedExpressionsNull: Self = StObject.set(x, "generatedExpressions", null)
    
    @scala.inline
    def setGeneratedExpressionsUndefined: Self = StObject.set(x, "generatedExpressions", js.undefined)
    
    @scala.inline
    def setGeneratedExpressionsVarargs(value: IGeneratedExpression*): Self = StObject.set(x, "generatedExpressions", js.Array(value :_*))
    
    @scala.inline
    def setPickleStepArgument(value: IPickleStepArgument): Self = StObject.set(x, "pickleStepArgument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickleStepArgumentNull: Self = StObject.set(x, "pickleStepArgument", null)
    
    @scala.inline
    def setPickleStepArgumentUndefined: Self = StObject.set(x, "pickleStepArgument", js.undefined)
  }
}
