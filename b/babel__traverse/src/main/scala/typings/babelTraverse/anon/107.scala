package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.VoidTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  var `type`: VoidTypeAnnotation
}
object `107` {
  
  inline def apply(): `107` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[`107`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `107`] (val x: Self) extends AnyVal {
    
    inline def setType(value: VoidTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
