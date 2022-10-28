package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ExistsTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var `type`: ExistsTypeAnnotation
}
object `119` {
  
  inline def apply(): `119` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[`119`]
  }
  
  extension [Self <: `119`](x: Self) {
    
    inline def setType(value: ExistsTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
