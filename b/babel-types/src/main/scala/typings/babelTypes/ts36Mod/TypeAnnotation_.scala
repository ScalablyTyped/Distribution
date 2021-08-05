package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.TypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var typeAnnotation: FlowTypeAnnotation
  
  @JSName("type")
  var type_TypeAnnotation_ : TypeAnnotation
}
object TypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[TypeAnnotation_]
  }
  
  extension [Self <: TypeAnnotation_](x: Self) {
    
    inline def setType(value: TypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
