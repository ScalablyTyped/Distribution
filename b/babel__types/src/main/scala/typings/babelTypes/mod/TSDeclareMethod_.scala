package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareMethod_
  extends StObject
     with BaseNode {
  
  var `abstract`: Boolean | Null
  
  var access: "public" | "private" | "protected" | Null
  
  var accessibility: "public" | "private" | "protected" | Null
  
  var async: Boolean
  
  var computed: Boolean
  
  var decorators: js.Array[Decorator_] | Null
  
  var generator: Boolean
  
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression
  
  var kind: "get" | "set" | "method" | "constructor"
  
  var optional: Boolean | Null
  
  var `override`: Boolean
  
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  
  var returnType: TSTypeAnnotation_ | Noop_ | Null
  
  var static: Boolean
  
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_TSDeclareMethod_ : "TSDeclareMethod"
}
object TSDeclareMethod_ {
  
  inline def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: "get" | "set" | "method" | "constructor",
    `override`: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[TSDeclareMethod_]
  }
  
  extension [Self <: TSDeclareMethod_](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    inline def setAccess(value: "public" | "private" | "protected"): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessibility(value: "public" | "private" | "protected"): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "get" | "set" | "method" | "constructor"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty_)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: "TSDeclareMethod"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
