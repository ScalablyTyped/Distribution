package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSMappedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var `type`: TSMappedType
}
object `128` {
  
  inline def apply(): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[`128`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `128`] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
