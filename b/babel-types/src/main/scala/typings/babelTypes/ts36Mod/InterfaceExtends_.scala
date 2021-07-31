package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.InterfaceExtends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceExtends_
  extends StObject
     with Node
     with Flow {
  
  var id: Identifier_
  
  var typeParameters: TypeParameterInstantiation_
  
  @JSName("type")
  var type_InterfaceExtends_ : InterfaceExtends
}
object InterfaceExtends_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[InterfaceExtends_]
  }
  
  @scala.inline
  implicit class InterfaceExtends_MutableBuilder[Self <: InterfaceExtends_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InterfaceExtends): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
