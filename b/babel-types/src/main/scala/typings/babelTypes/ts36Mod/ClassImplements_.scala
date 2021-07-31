package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassImplements_
  extends StObject
     with Node
     with Flow {
  
  var id: Identifier_
  
  var typeParameters: TypeParameterInstantiation_
  
  @JSName("type")
  var type_ClassImplements_ : ClassImplements
}
object ClassImplements_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterInstantiation_
  ): ClassImplements_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[ClassImplements_]
  }
  
  @scala.inline
  implicit class ClassImplements_MutableBuilder[Self <: ClassImplements_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassImplements): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
