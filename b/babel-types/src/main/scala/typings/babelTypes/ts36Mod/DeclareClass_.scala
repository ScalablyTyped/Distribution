package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DeclareClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareClass_
  extends StObject
     with Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  
  var body: ObjectTypeAnnotation_
  
  var `extends`: js.Array[InterfaceExtends_]
  
  var id: Identifier_
  
  var typeParameters: TypeParameterDeclaration_
  
  @JSName("type")
  var type_DeclareClass_ : DeclareClass
}
object DeclareClass_ {
  
  inline def apply(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[DeclareClass_]
  }
  
  extension [Self <: DeclareClass_](x: Self) {
    
    inline def setBody(value: ObjectTypeAnnotation_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setExtends(value: js.Array[InterfaceExtends_]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsVarargs(value: InterfaceExtends_ *): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    inline def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeclareClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
  }
}
