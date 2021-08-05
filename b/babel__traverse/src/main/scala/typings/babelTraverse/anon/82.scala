package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var `type`: ObjectTypeAnnotation
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
