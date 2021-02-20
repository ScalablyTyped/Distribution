package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSNonNullExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSNonNullExpression_
  extends Expression
     with BaseNode {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_TSNonNullExpression_ : TSNonNullExpression = js.native
}
object TSNonNullExpression_ {
  
  @scala.inline
  def apply(expression: Expression, `type`: TSNonNullExpression): TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNonNullExpression_]
  }
  
  @scala.inline
  implicit class TSNonNullExpression_MutableBuilder[Self <: TSNonNullExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSNonNullExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
