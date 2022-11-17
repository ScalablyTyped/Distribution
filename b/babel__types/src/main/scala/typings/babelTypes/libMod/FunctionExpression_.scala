package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionExpression_
  extends StObject
     with BaseNode {
  
  var async: Boolean
  
  var body: BlockStatement_
  
  var generator: Boolean
  
  var id: js.UndefOr[Identifier_ | Null] = js.undefined
  
  var params: js.Array[Identifier_ | Pattern | RestElement_]
  
  var predicate: js.UndefOr[DeclaredPredicate_ | InferredPredicate_ | Null] = js.undefined
  
  var returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation__ | Noop_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_FunctionExpression_ : "FunctionExpression"
}
object FunctionExpression_ {
  
  inline def apply(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[FunctionExpression_]
  }
  
  extension [Self <: FunctionExpression_](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPredicate(value: DeclaredPredicate_ | InferredPredicate_): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation__ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: "FunctionExpression"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
