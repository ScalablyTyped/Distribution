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
  
  @scala.inline
  def apply(): IHook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHook]
  }
  
  @scala.inline
  implicit class IHookMutableBuilder[Self <: IHook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSourceReference(value: ISourceReference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceNull: Self = StObject.set(x, "sourceReference", null)
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    @scala.inline
    def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagExpressionNull: Self = StObject.set(x, "tagExpression", null)
    
    @scala.inline
    def setTagExpressionUndefined: Self = StObject.set(x, "tagExpression", js.undefined)
  }
}
