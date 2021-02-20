package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ExpressionStatement_
  extends ExpressionWrapper
     with BaseNode
     with Statement {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_ExpressionStatement_ : ExpressionStatement = js.native
}
object ExpressionStatement_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: ExpressionStatement): ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement_]
  }
  
  @scala.inline
  implicit class ExpressionStatement_MutableBuilder[Self <: ExpressionStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
