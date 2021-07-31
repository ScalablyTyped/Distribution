package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSMappedType
  extends StObject
     with Node
     with TSType {
  
  var optional: Boolean | Null
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSType | Null
  
  var typeParameter: TypeParameter_
  
  @JSName("type")
  var type_TSMappedType: typings.babelTypes.babelTypesStrings.TSMappedType
}
object TSMappedType {
  
  @JSImport("babel-types/ts3.6", "TSMappedType")
  @js.native
  def apply(typeParameter: TypeParameter_): TSMappedType = js.native
  @JSImport("babel-types/ts3.6", "TSMappedType")
  @js.native
  def apply(typeParameter: TypeParameter_, typeAnnotation: TSType): TSMappedType = js.native
  
  @scala.inline
  implicit class TSMappedTypeMutableBuilder[Self <: TSMappedType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameter(value: TypeParameter_): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
