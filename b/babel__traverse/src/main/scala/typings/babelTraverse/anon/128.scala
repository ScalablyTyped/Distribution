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
  
  extension [Self <: `128`](x: Self) {
    
    inline def setType(value: TSMappedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
