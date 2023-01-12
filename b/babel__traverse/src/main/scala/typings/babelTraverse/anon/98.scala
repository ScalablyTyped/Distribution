package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.NullableTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  var `type`: NullableTypeAnnotation
}
object `98` {
  
  inline def apply(): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[`98`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `98`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NullableTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
