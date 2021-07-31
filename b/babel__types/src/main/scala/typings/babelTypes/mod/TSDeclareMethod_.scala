package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSDeclareMethod
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.public
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareMethod_
  extends StObject
     with BaseNode
     with _Node {
  
  var `abstract`: Boolean | Null
  
  var access: public | `private` | `protected` | Null
  
  var accessibility: public | `private` | `protected` | Null
  
  var async: Boolean
  
  var computed: Boolean
  
  var decorators: js.Array[Decorator_] | Null
  
  var generator: Boolean
  
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression
  
  var kind: get | set | method | constructor
  
  var optional: Boolean | Null
  
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  
  var returnType: TSTypeAnnotation_ | Noop_ | Null
  
  var static: Boolean
  
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_TSDeclareMethod_ : TSDeclareMethod
}
object TSDeclareMethod_ {
  
  @scala.inline
  def apply(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    kind: get | set | method | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[TSDeclareMethod_]
  }
  
  @scala.inline
  implicit class TSDeclareMethod_MutableBuilder[Self <: TSDeclareMethod_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    @scala.inline
    def setAccess(value: public | `private` | `protected`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessNull: Self = StObject.set(x, "access", null)
    
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: get | set | method | constructor): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty_)*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSDeclareMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
