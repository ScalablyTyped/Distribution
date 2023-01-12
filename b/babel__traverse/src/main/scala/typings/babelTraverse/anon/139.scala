package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InterfaceExtends
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139` extends StObject {
  
  var `type`: InterfaceExtends
}
object `139` {
  
  inline def apply(): `139` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[`139`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `139`] (val x: Self) extends AnyVal {
    
    inline def setType(value: InterfaceExtends): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
