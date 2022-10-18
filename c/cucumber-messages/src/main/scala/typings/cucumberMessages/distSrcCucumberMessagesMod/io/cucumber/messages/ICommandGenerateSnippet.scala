package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommandGenerateSnippet. */
trait ICommandGenerateSnippet extends StObject {
  
  /** CommandGenerateSnippet actionId */
  var actionId: js.UndefOr[String | Null] = js.undefined
  
  /** CommandGenerateSnippet generatedExpressions */
  var generatedExpressions: js.UndefOr[js.Array[IGeneratedExpression] | Null] = js.undefined
  
  /** CommandGenerateSnippet pickleStepArgument */
  var pickleStepArgument: js.UndefOr[IPickleStepArgument | Null] = js.undefined
}
object ICommandGenerateSnippet {
  
  inline def apply(): ICommandGenerateSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommandGenerateSnippet]
  }
  
  extension [Self <: ICommandGenerateSnippet](x: Self) {
    
    inline def setActionId(value: String): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdNull: Self = StObject.set(x, "actionId", null)
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setGeneratedExpressions(value: js.Array[IGeneratedExpression]): Self = StObject.set(x, "generatedExpressions", value.asInstanceOf[js.Any])
    
    inline def setGeneratedExpressionsNull: Self = StObject.set(x, "generatedExpressions", null)
    
    inline def setGeneratedExpressionsUndefined: Self = StObject.set(x, "generatedExpressions", js.undefined)
    
    inline def setGeneratedExpressionsVarargs(value: IGeneratedExpression*): Self = StObject.set(x, "generatedExpressions", js.Array(value*))
    
    inline def setPickleStepArgument(value: IPickleStepArgument): Self = StObject.set(x, "pickleStepArgument", value.asInstanceOf[js.Any])
    
    inline def setPickleStepArgumentNull: Self = StObject.set(x, "pickleStepArgument", null)
    
    inline def setPickleStepArgumentUndefined: Self = StObject.set(x, "pickleStepArgument", js.undefined)
  }
}
