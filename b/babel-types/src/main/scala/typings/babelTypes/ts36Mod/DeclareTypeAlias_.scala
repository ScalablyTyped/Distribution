package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareTypeAlias_
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
  var type_DeclareTypeAlias_ : DeclareTypeAlias
}
object DeclareTypeAlias_ {
  
  inline def apply(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[DeclareTypeAlias_]
  }
  
  extension [Self <: DeclareTypeAlias_](x: Self) {
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRight(value: FlowTypeAnnotation): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
