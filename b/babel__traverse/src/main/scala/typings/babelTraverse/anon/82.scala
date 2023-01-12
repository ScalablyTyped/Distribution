package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.Decorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var `type`: Decorator
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[`82`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `82`] (val x: Self) extends AnyVal {
    
    inline def setType(value: Decorator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
