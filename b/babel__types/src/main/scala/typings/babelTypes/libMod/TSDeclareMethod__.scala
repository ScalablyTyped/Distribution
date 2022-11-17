package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareMethod__
  extends StObject
     with BaseNode {
  
  var `abstract`: js.UndefOr[Boolean | Null] = js.undefined
  
  var access: js.UndefOr["public" | "private" | "protected" | Null] = js.undefined
  
  var accessibility: js.UndefOr["public" | "private" | "protected" | Null] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var decorators: js.UndefOr[js.Array[Decorator_] | Null] = js.undefined
  
  var generator: js.UndefOr[Boolean] = js.undefined
  
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression
  
  var kind: js.UndefOr["get" | "set" | "method" | "constructor"] = js.undefined
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__]
  
  var returnType: js.UndefOr[TSTypeAnnotation__ | Noop_ | Null] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration__ | Noop_ | Null] = js.undefined
  
  @JSName("type")
  var type_TSDeclareMethod__ : "TSDeclareMethod"
}
object TSDeclareMethod__ {
  
  inline def apply(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__]
  ): TSDeclareMethod__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[TSDeclareMethod__]
  }
  
  extension [Self <: TSDeclareMethod__](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setAccess(value: "public" | "private" | "protected"): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAccessibility(value: "public" | "private" | "protected"): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "get" | "set" | "method" | "constructor"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty__)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TSTypeAnnotation__ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setType(value: "TSDeclareMethod"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration__ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
