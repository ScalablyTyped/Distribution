package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait AssignmentPattern_
  extends StObject
     with BaseNode
     with LVal
     with Pattern
     with PatternLike
     with Standardized {
  
  var decorators: js.Array[Decorator_] | Null
  
  var left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSSatisfiesExpression_ | TSTypeAssertion_ | TSNonNullExpression_
  
  var right: Expression
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern
}
object AssignmentPattern_ {
  
  inline def apply(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSSatisfiesExpression_ | TSTypeAssertion_ | TSNonNullExpression_,
    right: Expression
  ): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignmentPattern_] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setLeft(
      value: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSSatisfiesExpression_ | TSTypeAssertion_ | TSNonNullExpression_
    ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
