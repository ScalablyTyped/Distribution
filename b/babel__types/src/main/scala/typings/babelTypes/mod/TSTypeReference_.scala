package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeReference_
  extends StObject
     with BaseNode
     with TSType {
  
  var typeName: TSEntityName
  
  var typeParameters: TSTypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSTypeReference_ : TSTypeReference
}
object TSTypeReference_ {
  
  @scala.inline
  def apply(typeName: TSEntityName): TSTypeReference_ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[TSTypeReference_]
  }
  
  @scala.inline
  implicit class TSTypeReference_MutableBuilder[Self <: TSTypeReference_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSTypeReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: TSEntityName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
