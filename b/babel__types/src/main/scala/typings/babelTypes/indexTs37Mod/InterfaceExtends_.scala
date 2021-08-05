package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.InterfaceExtends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait InterfaceExtends_
  extends StObject
     with BaseNode
     with Flow {
  
  var id: Identifier_ | QualifiedTypeIdentifier_
  
  var typeParameters: TypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_InterfaceExtends_ : InterfaceExtends
}
object InterfaceExtends_ {
  
  inline def apply(id: Identifier_ | QualifiedTypeIdentifier_): InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[InterfaceExtends_]
  }
  
  extension [Self <: InterfaceExtends_](x: Self) {
    
    inline def setId(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: InterfaceExtends): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
