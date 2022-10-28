package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSSatisfiesExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSSatisfiesExpression__
  extends StObject
     with BaseNode
     with Expression
     with LVal
     with Node
     with PatternLike
     with TypeScript {
  
  var expression: Expression
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSSatisfiesExpression__ : TSSatisfiesExpression
}
object TSSatisfiesExpression__ {
  
  inline def apply(expression: Expression, typeAnnotation: TSType): TSSatisfiesExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSSatisfiesExpression")
    __obj.asInstanceOf[TSSatisfiesExpression__]
  }
  
  extension [Self <: TSSatisfiesExpression__](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSSatisfiesExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
