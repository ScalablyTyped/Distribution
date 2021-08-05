package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation
}
object MixedTypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  extension [Self <: MixedTypeAnnotation_](x: Self) {
    
    inline def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
