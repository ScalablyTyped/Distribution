package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var `type`: SwitchCase
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[`54`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `54`] (val x: Self) extends AnyVal {
    
    inline def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
