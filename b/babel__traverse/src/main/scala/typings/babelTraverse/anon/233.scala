package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.ObjectTypeInternalSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `233` extends StObject {
  
  var `type`: ObjectTypeInternalSlot
}
object `233` {
  
  inline def apply(): `233` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[`233`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `233`] (val x: Self) extends AnyVal {
    
    inline def setType(value: ObjectTypeInternalSlot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
