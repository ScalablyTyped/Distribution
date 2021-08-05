package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSMappedType_
  extends StObject
     with BaseNode
     with TSType {
  
  var nameType: TSType | Null
  
  var optional: Boolean | Null
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSType | Null
  
  var typeParameter: TSTypeParameter_
  
  @JSName("type")
  var type_TSMappedType_ : TSMappedType
}
object TSMappedType_ {
  
  inline def apply(typeParameter: TSTypeParameter_): TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, nameType = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[TSMappedType_]
  }
  
  extension [Self <: TSMappedType_](x: Self) {
    
    inline def setNameType(value: TSType): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    inline def setNameTypeNull: Self = StObject.set(x, "nameType", null)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameter(value: TSTypeParameter_): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
