package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassPrivateProperty_
  extends StObject
     with BaseNode {
  
  var decorators: js.Array[Decorator_] | Null
  
  var definite: Boolean | Null
  
  var key: PrivateName_
  
  var readonly: Boolean | Null
  
  var static: Boolean
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_ClassPrivateProperty_ : "ClassPrivateProperty"
  
  var value: Expression | Null
  
  var variance: Variance_ | Null
}
object ClassPrivateProperty_ {
  
  inline def apply(key: PrivateName_, static: Boolean): ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null, variance = null)
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[ClassPrivateProperty_]
  }
  
  extension [Self <: ClassPrivateProperty_](x: Self) {
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    inline def setKey(value: PrivateName_): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ClassPrivateProperty"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVariance(value: Variance_): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceNull: Self = StObject.set(x, "variance", null)
  }
}
