package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Hook. */
trait IHook extends StObject {
  
  /** Hook id */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** Hook sourceReference */
  var sourceReference: js.UndefOr[ISourceReference | Null] = js.undefined
  
  /** Hook tagExpression */
  var tagExpression: js.UndefOr[String | Null] = js.undefined
}
object IHook {
  
  inline def apply(): IHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHook]
  }
  
  extension [Self <: IHook](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSourceReference(value: ISourceReference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    inline def setSourceReferenceNull: Self = StObject.set(x, "sourceReference", null)
    
    inline def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    inline def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
    
    inline def setTagExpressionNull: Self = StObject.set(x, "tagExpression", null)
    
    inline def setTagExpressionUndefined: Self = StObject.set(x, "tagExpression", js.undefined)
  }
}
