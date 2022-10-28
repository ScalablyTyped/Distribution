package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeofTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  var `type`: TypeofTypeAnnotation
}
object `150` {
  
  inline def apply(): `150` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[`150`]
  }
  
  extension [Self <: `150`](x: Self) {
    
    inline def setType(value: TypeofTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
