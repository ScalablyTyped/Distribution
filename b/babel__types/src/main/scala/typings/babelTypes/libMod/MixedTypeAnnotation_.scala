package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.MixedTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MixedTypeAnnotation_
  extends StObject
     with BaseNode
     with Flow
     with FlowBaseAnnotation
     with FlowType
     with Node {
  
  @JSName("type")
  var type_MixedTypeAnnotation_ : MixedTypeAnnotation
}
object MixedTypeAnnotation_ {
  
  inline def apply(): MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[MixedTypeAnnotation_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MixedTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setType(value: MixedTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
