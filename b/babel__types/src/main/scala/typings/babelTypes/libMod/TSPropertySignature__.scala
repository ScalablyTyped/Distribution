package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSPropertySignature__
  extends StObject
     with BaseNode {
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var initializer: js.UndefOr[Expression | Null] = js.undefined
  
  var key: Expression
  
  var kind: "get" | "set"
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var readonly: js.UndefOr[Boolean | Null] = js.undefined
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSPropertySignature__ : "TSPropertySignature"
}
object TSPropertySignature__ {
  
  inline def apply(key: Expression, kind: "get" | "set"): TSPropertySignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[TSPropertySignature__]
  }
  
  extension [Self <: TSPropertySignature__](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: "get" | "set"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setType(value: "TSPropertySignature"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation__): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
