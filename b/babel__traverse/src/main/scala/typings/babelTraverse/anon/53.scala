package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var `type`: SwitchCase
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
