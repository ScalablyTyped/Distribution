package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowFunctionExpression_
  extends StObject
     with BaseNode
     with BlockParent
     with Expression
     with Function
     with FunctionParent
     with Node
     with Pureish
     with Scopable
     with Standardized {
  
  var async: Boolean
  
  var body: BlockStatement_ | Expression
  
  var expression: Boolean
  
  var generator: js.UndefOr[Boolean] = js.undefined
  
  var params: js.Array[Identifier_ | Pattern | RestElement_]
  
  var predicate: js.UndefOr[DeclaredPredicate_ | InferredPredicate_ | Null] = js.undefined
  
  var returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | TSTypeParameterDeclaration | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_ArrowFunctionExpression_ : ArrowFunctionExpression
}
object ArrowFunctionExpression_ {
  
  inline def apply(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[ArrowFunctionExpression_]
  }
  
  extension [Self <: ArrowFunctionExpression_](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_ | Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPredicate(value: DeclaredPredicate_ | InferredPredicate_): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
