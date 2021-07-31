package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.DoExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait DoExpression_
  extends StObject
     with BaseNode
     with Expression {
  
  var body: BlockStatement_
  
  @JSName("type")
  var type_DoExpression_ : DoExpression
}
object DoExpression_ {
  
  @scala.inline
  def apply(body: BlockStatement_): DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[DoExpression_]
  }
  
  @scala.inline
  implicit class DoExpression_MutableBuilder[Self <: DoExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DoExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
