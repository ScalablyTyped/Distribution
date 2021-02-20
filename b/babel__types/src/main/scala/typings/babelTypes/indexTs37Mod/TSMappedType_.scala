package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSMappedType_
  extends TSType
     with BaseNode {
  
  var nameType: TSType | Null = js.native
  
  var optional: Boolean | Null = js.native
  
  var readonly: Boolean | Null = js.native
  
  var typeAnnotation: TSType | Null = js.native
  
  var typeParameter: TSTypeParameter_ = js.native
  
  @JSName("type")
  var type_TSMappedType_ : TSMappedType = js.native
}
object TSMappedType_ {
  
  @scala.inline
  def apply(`type`: TSMappedType, typeParameter: TSTypeParameter_): TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
