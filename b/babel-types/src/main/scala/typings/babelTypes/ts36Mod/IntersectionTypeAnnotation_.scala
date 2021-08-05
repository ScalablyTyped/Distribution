package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.IntersectionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_IntersectionTypeAnnotation_ : IntersectionTypeAnnotation
  
  var types: js.Array[FlowTypeAnnotation]
}
object IntersectionTypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, types: js.Array[FlowTypeAnnotation]): IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[IntersectionTypeAnnotation_]
  }
  
  extension [Self <: IntersectionTypeAnnotation_](x: Self) {
    
    inline def setType(value: IntersectionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[FlowTypeAnnotation]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: FlowTypeAnnotation*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
