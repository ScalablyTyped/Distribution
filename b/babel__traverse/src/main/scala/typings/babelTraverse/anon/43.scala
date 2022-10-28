package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullLiteralTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  var `type`: NullLiteralTypeAnnotation
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setType(value: NullLiteralTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
