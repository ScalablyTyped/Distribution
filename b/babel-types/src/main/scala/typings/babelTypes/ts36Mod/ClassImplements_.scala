package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ClassImplements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassImplements_
  extends Node
     with Flow {
  
  var id: Identifier_ = js.native
  
  var typeParameters: TypeParameterInstantiation_ = js.native
  
  @JSName("type")
  var type_ClassImplements_ : ClassImplements = js.native
}
object ClassImplements_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassImplements,
    typeParameters: TypeParameterInstantiation_
  ): ClassImplements_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
