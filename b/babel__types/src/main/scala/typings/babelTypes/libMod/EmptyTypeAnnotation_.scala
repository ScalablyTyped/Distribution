package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.EmptyTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType
     with Node {
  
  @JSName("type")
  var type_EmptyTypeAnnotation_ : EmptyTypeAnnotation
}
object EmptyTypeAnnotation_ {
  
  inline def apply(): EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[EmptyTypeAnnotation_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setType(value: EmptyTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
