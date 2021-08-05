package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `128` extends StObject {
  
  var `type`: StringLiteral
}
object `128` {
  
  inline def apply(): `128` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[`128`]
  }
  
  extension [Self <: `128`](x: Self) {
    
    inline def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
