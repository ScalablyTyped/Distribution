package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TypeofTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var `type`: TypeofTypeAnnotation
}
object `149` {
  
  inline def apply(): `149` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setType(value: TypeofTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
