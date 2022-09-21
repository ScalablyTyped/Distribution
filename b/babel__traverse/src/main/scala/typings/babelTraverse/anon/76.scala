package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSDeclareMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var `type`: TSDeclareMethod
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[`76`]
  }
  
  extension [Self <: `76`](x: Self) {
    
    inline def setType(value: TSDeclareMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
