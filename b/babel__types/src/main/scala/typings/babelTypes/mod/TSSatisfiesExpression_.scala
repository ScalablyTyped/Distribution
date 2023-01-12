package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSSatisfiesExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSSatisfiesExpression_
  extends StObject
     with BaseNode
     with Expression
     with LVal
     with PatternLike
     with TypeScript {
  
  var expression: Expression
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSSatisfiesExpression_ : TSSatisfiesExpression
}
object TSSatisfiesExpression_ {
  
  inline def apply(expression: Expression, typeAnnotation: TSType): TSSatisfiesExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSatisfiesExpression")
    __obj.asInstanceOf[TSSatisfiesExpression_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSSatisfiesExpression_] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSSatisfiesExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
