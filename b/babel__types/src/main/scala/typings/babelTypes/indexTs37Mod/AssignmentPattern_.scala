package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait AssignmentPattern_
  extends StObject
     with BaseNode
     with LVal
     with Pattern
     with PatternLike {
  
  var decorators: js.Array[Decorator_] | Null
  
  var left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_
  
  var right: Expression
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern
}
object AssignmentPattern_ {
  
  @scala.inline
  def apply(left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_, right: Expression): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern_]
  }
  
  @scala.inline
  implicit class AssignmentPattern_MutableBuilder[Self <: AssignmentPattern_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
