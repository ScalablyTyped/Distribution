package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var typeAnnotation: FlowTypeAnnotation
  
  @JSName("type")
  var type_NullableTypeAnnotation_ : NullableTypeAnnotation
}
object NullableTypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, typeAnnotation: FlowTypeAnnotation): NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[NullableTypeAnnotation_]
  }
  
  extension [Self <: NullableTypeAnnotation_](x: Self) {
    
    inline def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: FlowTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
