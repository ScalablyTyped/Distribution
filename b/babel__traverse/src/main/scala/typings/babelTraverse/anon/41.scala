package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.FunctionTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var `type`: FunctionTypeAnnotation
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[`41`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`] (val x: Self) extends AnyVal {
    
    inline def setType(value: FunctionTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
