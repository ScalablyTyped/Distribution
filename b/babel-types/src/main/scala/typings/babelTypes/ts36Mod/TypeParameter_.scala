package typings.babelTypes.ts36Mod

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
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double): TypeParameter_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], bound = null, default = null, name = null)
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[TypeParameter_]
  }
  
  @scala.inline
  implicit class TypeParameter_MutableBuilder[Self <: TypeParameter_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBound(value: TypeAnnotation_): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundNull: Self = StObject.set(x, "bound", null)
    
    @scala.inline
    def setDefault(value: Flow): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNull: Self = StObject.set(x, "default", null)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
