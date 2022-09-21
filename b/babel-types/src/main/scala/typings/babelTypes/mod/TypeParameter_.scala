package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParameter_
  extends StObject
     with Node {
  
  var default: Flow | Null
  
  var bound: TypeAnnotation_ | Null
  
  var name: String | Null
  
  @JSName("type")
  var type_TypeParameter_ : TypeParameterDeclaration
}
object TypeParameter_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): TypeParameter_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], bound = null, default = null, name = null)
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[TypeParameter_]
  }
  
  extension [Self <: TypeParameter_](x: Self) {
    
    inline def setBound(value: TypeAnnotation_): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    inline def setBoundNull: Self = StObject.set(x, "bound", null)
    
    inline def setDefault(value: Flow): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
