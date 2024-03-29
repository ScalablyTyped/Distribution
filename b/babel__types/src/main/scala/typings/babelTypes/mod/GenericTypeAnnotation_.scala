package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait GenericTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType {
  
  var id: Identifier_ | QualifiedTypeIdentifier_
  
  var typeParameters: TypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_GenericTypeAnnotation_ : GenericTypeAnnotation
}
object GenericTypeAnnotation_ {
  
  inline def apply(id: Identifier_ | QualifiedTypeIdentifier_): GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[GenericTypeAnnotation_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setId(value: Identifier_ | QualifiedTypeIdentifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: GenericTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
