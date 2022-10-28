package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPattern_
  extends StObject
     with BaseNode
     with LVal
     with Node
     with Pattern
     with PatternLike
     with Standardized {
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSSatisfiesExpression__ | TSTypeAssertion__ | TSNonNullExpression__
  
  var right: Expression
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern
}
object AssignmentPattern_ {
  
  inline def apply(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSSatisfiesExpression__ | TSTypeAssertion__ | TSNonNullExpression__,
    right: Expression
  ): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[AssignmentPattern_]
  }
  
  extension [Self <: AssignmentPattern_](x: Self) {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setLeft(
      value: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSSatisfiesExpression__ | TSTypeAssertion__ | TSNonNullExpression__
    ): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation__ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
