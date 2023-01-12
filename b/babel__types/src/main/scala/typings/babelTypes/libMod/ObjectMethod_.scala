package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ObjectMethod
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMethod_
  extends StObject
     with BaseNode
     with BlockParent
     with Function
     with FunctionParent
     with Method
     with Node
     with ObjectMember
     with Scopable
     with Standardized
     with UserWhitespacable {
  
  var async: Boolean
  
  var body: BlockStatement_
  
  var computed: Boolean
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var generator: Boolean
  
  var key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_
  
  var kind: method_ | get | set
  
  var params: js.Array[Identifier_ | Pattern | RestElement_]
  
  var returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation__ | Noop_ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_ObjectMethod_ : ObjectMethod
}
object ObjectMethod_ {
  
  inline def apply(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[ObjectMethod_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectMethod_] (val x: Self) extends AnyVal {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: method_ | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation__ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration__ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
