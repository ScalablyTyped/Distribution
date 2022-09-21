package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectMethod
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectMethod_
  extends StObject
     with BaseNode
     with BlockParent
     with Function
     with FunctionParent
     with Method
     with ObjectMember
     with Scopable
     with Standardized
     with UserWhitespacable {
  
  var async: Boolean
  
  var body: BlockStatement_
  
  var computed: Boolean
  
  var decorators: js.Array[Decorator_] | Null
  
  var generator: Boolean
  
  var key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_
  
  var kind: method_ | get | set
  
  var params: js.Array[Identifier_ | Pattern | RestElement_]
  
  var returnType: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null
  
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
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[ObjectMethod_]
  }
  
  extension [Self <: ObjectMethod_](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: method_ | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setType(value: ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
