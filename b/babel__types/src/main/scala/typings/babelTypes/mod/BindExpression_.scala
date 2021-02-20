package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BindExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait BindExpression_
  extends Expression
     with BaseNode {
  
  var callee: Expression = js.native
  
  var `object`: Expression = js.native
  
  @JSName("type")
  var type_BindExpression_ : BindExpression = js.native
}
object BindExpression_ {
  
  @scala.inline
  def apply(callee: Expression, `object`: Expression, `type`: BindExpression): BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindExpression_]
  }
  
  @scala.inline
  implicit class BindExpression_MutableBuilder[Self <: BindExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallee(value: Expression): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BindExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
