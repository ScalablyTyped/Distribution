package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAlias_
  extends StObject
     with Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var id: Identifier_
  
  var right: FlowTypeAnnotation
  
  var typeParameters: TypeParameterDeclaration_
  
  @JSName("type")
  var type_TypeAlias_ : TypeAlias
}
object TypeAlias_ {
  
  @scala.inline
  def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[TypeAlias_]
  }
  
  @scala.inline
  implicit class TypeAlias_MutableBuilder[Self <: TypeAlias_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: FlowTypeAnnotation): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
