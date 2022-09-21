package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ExistsTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistsTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowType
     with Node {
  
  @JSName("type")
  var type_ExistsTypeAnnotation_ : ExistsTypeAnnotation
}
object ExistsTypeAnnotation_ {
  
  inline def apply(): ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[ExistsTypeAnnotation_]
  }
  
  extension [Self <: ExistsTypeAnnotation_](x: Self) {
    
    inline def setType(value: ExistsTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
