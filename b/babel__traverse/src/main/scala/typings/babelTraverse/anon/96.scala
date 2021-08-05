package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var `type`: NullableTypeAnnotation
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
