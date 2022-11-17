package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassImplements_
  extends StObject
     with BaseNode {
  
  var id: Identifier_
  
  var typeParameters: TypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_ClassImplements_ : "ClassImplements"
}
object ClassImplements_ {
  
  inline def apply(id: Identifier_): ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[ClassImplements_]
  }
  
  extension [Self <: ClassImplements_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ClassImplements"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
