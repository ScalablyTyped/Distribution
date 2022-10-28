package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ArrayTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var `type`: ArrayTypeAnnotation
}
object `86` {
  
  inline def apply(): `86` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setType(value: ArrayTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
