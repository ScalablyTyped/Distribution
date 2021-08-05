package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_VoidTypeAnnotation_ : VoidTypeAnnotation
}
object VoidTypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[VoidTypeAnnotation_]
  }
  
  extension [Self <: VoidTypeAnnotation_](x: Self) {
    
    inline def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
