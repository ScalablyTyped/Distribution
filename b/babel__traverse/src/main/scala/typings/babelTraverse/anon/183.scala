package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.BigIntLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  var `type`: BigIntLiteral
}
object `183` {
  
  inline def apply(): `183` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[`183`]
  }
  
  extension [Self <: `183`](x: Self) {
    
    inline def setType(value: BigIntLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
