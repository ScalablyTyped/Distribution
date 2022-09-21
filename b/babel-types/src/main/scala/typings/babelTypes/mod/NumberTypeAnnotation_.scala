package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NumberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowBaseAnnotation
     with FlowTypeAnnotation {
  
  @JSName("type")
  var type_NumberTypeAnnotation_ : NumberTypeAnnotation
}
object NumberTypeAnnotation_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[NumberTypeAnnotation_]
  }
  
  extension [Self <: NumberTypeAnnotation_](x: Self) {
    
    inline def setType(value: NumberTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
