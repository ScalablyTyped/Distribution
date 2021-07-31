package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSMappedType_
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
  
  @scala.inline
  def apply(typeParameter: TSTypeParameter_): TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, nameType = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[TSMappedType_]
  }
  
  @scala.inline
  implicit class TSMappedType_MutableBuilder[Self <: TSMappedType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameType(value: TSType): Self = StObject.set(x, "nameType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameTypeNull: Self = StObject.set(x, "nameType", null)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameter(value: TSTypeParameter_): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
