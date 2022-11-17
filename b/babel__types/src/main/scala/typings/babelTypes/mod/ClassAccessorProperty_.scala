package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassAccessorProperty_
  extends StObject
     with BaseNode {
  
  var `abstract`: Boolean | Null
  
  var accessibility: "public" | "private" | "protected" | Null
  
  var computed: Boolean
  
  var declare: Boolean | Null
  
  var decorators: js.Array[Decorator_] | Null
  
  var definite: Boolean | Null
  
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_
  
  var optional: Boolean | Null
  
  var `override`: Boolean
  
  var readonly: Boolean | Null
  
  var static: Boolean
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_ClassAccessorProperty_ : "ClassAccessorProperty"
  
  var value: Expression | Null
  
  var variance: Variance_ | Null
}
object ClassAccessorProperty_ {
  
  inline def apply(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
    `override`: Boolean,
    static: Boolean
  ): ClassAccessorProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = null, declare = null, decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null, variance = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[ClassAccessorProperty_]
  }
  
  extension [Self <: ClassAccessorProperty_](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    inline def setAccessibility(value: "public" | "private" | "protected"): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    inline def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ClassAccessorProperty"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
  }
}
