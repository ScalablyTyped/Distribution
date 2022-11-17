package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareFunction_
  extends StObject
     with BaseNode {
  
  var async: Boolean
  
  var declare: Boolean | Null
  
  var generator: Boolean
  
  var id: Identifier_ | Null
  
  var params: js.Array[Identifier_ | Pattern | RestElement_]
  
  var returnType: TSTypeAnnotation_ | Noop_ | Null
  
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_TSDeclareFunction_ : "TSDeclareFunction"
}
object TSDeclareFunction_ {
  
  inline def apply(async: Boolean, generator: Boolean, params: js.Array[Identifier_ | Pattern | RestElement_]): TSDeclareFunction_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[TSDeclareFunction_]
  }
  
  extension [Self <: TSDeclareFunction_](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setType(value: "TSDeclareFunction"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
