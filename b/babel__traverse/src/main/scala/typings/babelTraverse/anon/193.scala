package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.EnumSymbolBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var `type`: EnumSymbolBody
}
object `193` {
  
  inline def apply(): `193` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[`193`]
  }
  
  extension [Self <: `193`](x: Self) {
    
    inline def setType(value: EnumSymbolBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
